package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198161B1i extends AbstractC2198081B1a {
    public BDImageXUploader LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        BDImageXUploader bDImageXUploader = this.LLILLL;
        if (bDImageXUploader != null) {
            bDImageXUploader.close();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        final String strLIZIZ;
        ArrayList arrayListLIZIZ;
        IHostContextDepend iHostContextDepend;
        Boolean enableSkipMeta;
        Boolean enableCommitUpload;
        Number sliceSize;
        Activity activityLIZLLL;
        InterfaceC2198101B1c interfaceC2198101B1c = (InterfaceC2198101B1c) xBaseParamModel;
        InterfaceC2198171B1j uploadConfig = interfaceC2198101B1c.getUploadConfig();
        if (uploadConfig == null || (strLIZIZ = uploadConfig.getTraceId()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bridge_");
            sbLIZ.append(UUID.randomUUID());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Number socketNum = null;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            arrayListLIZIZ = C09N6.LIZIZ(activityLIZLLL, interfaceC2198101B1c.getFilePaths());
        } else {
            arrayListLIZIZ = null;
        }
        if (arrayListLIZIZ != null && arrayListLIZIZ.size() != 0) {
            final BDImageXUploader bDImageXUploader = new BDImageXUploader();
            bDImageXUploader.setFilePath(arrayListLIZIZ.size(), (String[]) arrayListLIZIZ.toArray(new String[0]));
            bDImageXUploader.setUploadDomain(interfaceC2198101B1c.getAuthConfig().getHostName());
            bDImageXUploader.setTopAccessKey(interfaceC2198101B1c.getAuthConfig().getAccessKeyId());
            bDImageXUploader.setTopSecretKey(interfaceC2198101B1c.getAuthConfig().getSecretAccessKey());
            bDImageXUploader.setTopSessionToken(interfaceC2198101B1c.getAuthConfig().getSessionToken());
            bDImageXUploader.setServiceID(interfaceC2198101B1c.getAuthConfig().getServiceId());
            InterfaceC2198171B1j uploadConfig2 = interfaceC2198101B1c.getUploadConfig();
            if (uploadConfig2 != null && uploadConfig2.getSliceSize() != null) {
                InterfaceC2198171B1j uploadConfig3 = interfaceC2198101B1c.getUploadConfig();
                if (uploadConfig3 != null) {
                    sliceSize = uploadConfig3.getSliceSize();
                } else {
                    sliceSize = null;
                }
                bDImageXUploader.setSliceSize(sliceSize.intValue());
            } else {
                bDImageXUploader.setSliceSize(524288);
            }
            InterfaceC2198171B1j uploadConfig4 = interfaceC2198101B1c.getUploadConfig();
            if (uploadConfig4 != null && uploadConfig4.getSocketNum() != null) {
                InterfaceC2198171B1j uploadConfig5 = interfaceC2198101B1c.getUploadConfig();
                if (uploadConfig5 != null) {
                    socketNum = uploadConfig5.getSocketNum();
                }
                bDImageXUploader.setSocketNum(socketNum.intValue());
            } else {
                bDImageXUploader.setSocketNum(2);
            }
            InterfaceC2198171B1j uploadConfig6 = interfaceC2198101B1c.getUploadConfig();
            if (uploadConfig6 != null && (enableCommitUpload = uploadConfig6.getEnableCommitUpload()) != null) {
                bDImageXUploader.setEnableCommitUpload(enableCommitUpload.booleanValue());
            }
            InterfaceC2198171B1j uploadConfig7 = interfaceC2198101B1c.getUploadConfig();
            if (uploadConfig7 != null && (enableSkipMeta = uploadConfig7.getEnableSkipMeta()) != null) {
                bDImageXUploader.setEnableSkipMeta(enableSkipMeta.booleanValue());
            }
            bDImageXUploader.setSliceRetryCount(3);
            bDImageXUploader.setFileRetryCount(3);
            bDImageXUploader.setTraceId(strLIZIZ);
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null) {
                bDImageXUploader.setOpenBoe(iHostContextDepend.isBoeEnable());
            }
            this.LLILLL = bDImageXUploader;
            final InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            bDImageXUploader.setListener(new BDImageXUploaderListener(completionBlock, bDImageXUploader, strLIZIZ, interfaceC634840OvC2) { // from class: X.1B1e
                public final CompletionBlock<C1B1Z> LIZ;
                public final BDImageXUploader LIZIZ;
                public final String LIZJ;
                public final InterfaceC634840OvC LIZLLL;
                public final ArrayList<C1B1P> LJ = new ArrayList<>();

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i, int i2) {
                    return 0;
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i, int i2, String str) {
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                    String str;
                    Long lValueOf;
                    Integer numValueOf;
                    Long lValueOf2;
                    String str2;
                    Long lValueOf3;
                    String str3;
                    String str4;
                    Map<String, ? extends Object> mapLIZIZ;
                    Integer numValueOf2;
                    String str5;
                    Object objLIZIZ;
                    String str6;
                    String str7;
                    String str8 = null;
                    try {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 6) {
                                            if (i != 7) {
                                                return;
                                            }
                                        } else {
                                            ArrayList<C1B1P> arrayList = this.LJ;
                                            XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1P.class));
                                            C1B1P c1b1p = (C1B1P) xBaseModelLIZLLL;
                                            if (bDImageXInfo != null) {
                                                str4 = bDImageXInfo.mImageTosKey;
                                            } else {
                                                str4 = null;
                                            }
                                            c1b1p.setUri(str4);
                                            if (bDImageXInfo == null || bDImageXInfo.mMetaInfo == null) {
                                                mapLIZIZ = null;
                                            } else {
                                                Gson gson = C2348609Ie.LIZ;
                                                if (bDImageXInfo != null) {
                                                    str7 = bDImageXInfo.mMetaInfo;
                                                } else {
                                                    str7 = null;
                                                }
                                                mapLIZIZ = C2348609Ie.LIZIZ(new JSONObject(str7));
                                            }
                                            c1b1p.setMetaInfo(mapLIZIZ);
                                            arrayList.add((C1B1P) xBaseModelLIZLLL);
                                            InterfaceC634840OvC interfaceC634840OvC3 = this.LIZLLL;
                                            if (interfaceC634840OvC3 == null) {
                                                return;
                                            }
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("traceID", this.LIZJ);
                                            if (bDImageXInfo == null) {
                                                numValueOf2 = null;
                                            } else {
                                                numValueOf2 = Integer.valueOf(bDImageXInfo.mFileIndex);
                                            }
                                            jSONObject.put("fileIndex", numValueOf2);
                                            if (bDImageXInfo != null) {
                                                str5 = bDImageXInfo.mImageTosKey;
                                            } else {
                                                str5 = null;
                                            }
                                            jSONObject.put("uri", str5);
                                            if (bDImageXInfo != null && bDImageXInfo.mMetaInfo != null) {
                                                Gson gson2 = C2348609Ie.LIZ;
                                                if (bDImageXInfo != null) {
                                                    str6 = bDImageXInfo.mMetaInfo;
                                                } else {
                                                    str6 = null;
                                                }
                                                objLIZIZ = C2348609Ie.LIZIZ(new JSONObject(str6));
                                            } else {
                                                objLIZIZ = "";
                                            }
                                            jSONObject.put("metaInfo", objLIZIZ);
                                            interfaceC634840OvC3.sendEvent("uploadImagesToImageXSingleImageComplete", jSONObject);
                                            return;
                                        }
                                    } else {
                                        CompletionBlock<C1B1Z> completionBlock2 = this.LIZ;
                                        XBaseModel xBaseModelLIZLLL2 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1Z.class));
                                        C1B1Z c1b1z = (C1B1Z) xBaseModelLIZLLL2;
                                        c1b1z.setTraceId(this.LIZJ);
                                        XBaseModel xBaseModelLIZLLL3 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1T.class));
                                        C1B1T c1b1t = (C1B1T) xBaseModelLIZLLL3;
                                        if (bDImageXInfo != null) {
                                            lValueOf3 = Long.valueOf(bDImageXInfo.mErrorCode);
                                        } else {
                                            lValueOf3 = null;
                                        }
                                        c1b1t.setErrorCode(lValueOf3);
                                        if (bDImageXInfo == null) {
                                            str3 = null;
                                        } else {
                                            str3 = bDImageXInfo.mMetaInfo;
                                        }
                                        c1b1t.setErrorMessage(str3);
                                        c1b1z.setErrorInfo((C1B1T) xBaseModelLIZLLL3);
                                        completionBlock2.onFailure(-7, "upload cancelled", (XBaseResultModel) xBaseModelLIZLLL2);
                                        BDImageXUploader bDImageXUploader2 = this.LIZIZ;
                                        if (bDImageXUploader2 == null) {
                                            return;
                                        }
                                        bDImageXUploader2.close();
                                        return;
                                    }
                                }
                                CompletionBlock<C1B1Z> completionBlock3 = this.LIZ;
                                XBaseModel xBaseModelLIZLLL4 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1Z.class));
                                C1B1Z c1b1z2 = (C1B1Z) xBaseModelLIZLLL4;
                                c1b1z2.setTraceId(this.LIZJ);
                                XBaseModel xBaseModelLIZLLL5 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1T.class));
                                C1B1T c1b1t2 = (C1B1T) xBaseModelLIZLLL5;
                                if (bDImageXInfo != null) {
                                    lValueOf2 = Long.valueOf(bDImageXInfo.mErrorCode);
                                } else {
                                    lValueOf2 = null;
                                }
                                c1b1t2.setErrorCode(lValueOf2);
                                if (bDImageXInfo == null) {
                                    str2 = null;
                                } else {
                                    str2 = bDImageXInfo.mMetaInfo;
                                }
                                c1b1t2.setErrorMessage(str2);
                                c1b1z2.setErrorInfo((C1B1T) xBaseModelLIZLLL5);
                                completionBlock3.onFailure(0, "upload failed", (XBaseResultModel) xBaseModelLIZLLL4);
                                BDImageXUploader bDImageXUploader3 = this.LIZIZ;
                                if (bDImageXUploader3 == null) {
                                    return;
                                }
                                bDImageXUploader3.close();
                                return;
                            }
                            InterfaceC634840OvC interfaceC634840OvC4 = this.LIZLLL;
                            if (interfaceC634840OvC4 == null) {
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("traceID", this.LIZJ);
                            if (bDImageXInfo == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(bDImageXInfo.mFileIndex);
                            }
                            jSONObject2.put("fileIndex", numValueOf);
                            jSONObject2.put("progress", Float.valueOf(j / 100));
                            interfaceC634840OvC4.sendEvent("uploadImagesToImageXProgress", jSONObject2);
                            return;
                        }
                        CompletionBlock<C1B1Z> completionBlock4 = this.LIZ;
                        XBaseModel xBaseModelLIZLLL6 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1Z.class));
                        C1B1Z c1b1z3 = (C1B1Z) xBaseModelLIZLLL6;
                        c1b1z3.setTraceId(this.LIZJ);
                        c1b1z3.setImageInfos(this.LJ);
                        completionBlock4.onSuccess((XBaseResultModel) xBaseModelLIZLLL6, "");
                        BDImageXUploader bDImageXUploader4 = this.LIZIZ;
                        if (bDImageXUploader4 == null) {
                            return;
                        }
                        bDImageXUploader4.close();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CompletionBlock<C1B1Z> completionBlock5 = this.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("some exception happened: ");
                        sbLIZ2.append(e.getMessage());
                        sbLIZ2.append("; metaInfo : ");
                        if (bDImageXInfo != null) {
                            str = bDImageXInfo.mMetaInfo;
                        } else {
                            str = null;
                        }
                        sbLIZ2.append(str);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        XBaseModel xBaseModelLIZLLL7 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1Z.class));
                        C1B1Z c1b1z4 = (C1B1Z) xBaseModelLIZLLL7;
                        c1b1z4.setTraceId(this.LIZJ);
                        C1B1T c1b1t3 = (C1B1T) C1549500qQO.LIZLLL(C13LE.LIZ(C1B1T.class));
                        if (bDImageXInfo != null) {
                            lValueOf = Long.valueOf(bDImageXInfo.mErrorCode);
                        } else {
                            lValueOf = null;
                        }
                        c1b1t3.setErrorCode(lValueOf);
                        if (bDImageXInfo != null) {
                            str8 = bDImageXInfo.mMetaInfo;
                        }
                        c1b1t3.setErrorMessage(str8);
                        c1b1z4.setErrorInfo(c1b1t3);
                        completionBlock5.onFailure(0, strLIZIZ2, (XBaseResultModel) xBaseModelLIZLLL7);
                        BDImageXUploader bDImageXUploader5 = this.LIZIZ;
                        if (bDImageXUploader5 == null) {
                            return;
                        }
                        bDImageXUploader5.close();
                    }
                }

                {
                    this.LIZ = completionBlock;
                    this.LIZIZ = bDImageXUploader;
                    this.LIZJ = strLIZIZ;
                    this.LIZLLL = interfaceC634840OvC2;
                }
            });
            BDImageXUploader bDImageXUploader2 = this.LLILLL;
            if (bDImageXUploader2 != null) {
                bDImageXUploader2.start();
                return;
            }
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "get filePaths failed, please check it", null, 4);
    }
}
