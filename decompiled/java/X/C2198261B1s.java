package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198261B1s extends AbstractC2198231B1p {
    public BDVideoUploader LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        BDVideoUploader bDVideoUploader = this.LLILLL;
        if (bDVideoUploader != null) {
            bDVideoUploader.close();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final String strLIZIZ;
        Activity activityLIZLLL;
        String strLIZ;
        IHostContextDepend iHostContextDepend;
        Number sliceSize;
        InterfaceC2198251B1r interfaceC2198251B1r = (InterfaceC2198251B1r) xBaseParamModel;
        InterfaceC2198271B1t uploadConfig = interfaceC2198251B1r.getUploadConfig();
        if (uploadConfig == null || (strLIZIZ = uploadConfig.getTraceId()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bridge_");
            sbLIZ.append(UUID.randomUUID());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Number socketNum = null;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null && (strLIZ = C09N6.LIZ(activityLIZLLL, interfaceC2198251B1r.getFilePath())) != null) {
            final BDVideoUploader bDVideoUploader = new BDVideoUploader();
            bDVideoUploader.setPathName(strLIZ);
            bDVideoUploader.setUploadDomain(interfaceC2198251B1r.getAuthConfig().getHostName());
            bDVideoUploader.setTopAccessKey(interfaceC2198251B1r.getAuthConfig().getAccessKeyId());
            bDVideoUploader.setTopSecretKey(interfaceC2198251B1r.getAuthConfig().getSecretAccessKey());
            bDVideoUploader.setTopSessionToken(interfaceC2198251B1r.getAuthConfig().getSessionToken());
            bDVideoUploader.setSpaceName(interfaceC2198251B1r.getAuthConfig().getSpaceName());
            bDVideoUploader.setBusinessTag("bridge_spark");
            InterfaceC2198271B1t uploadConfig2 = interfaceC2198251B1r.getUploadConfig();
            if (uploadConfig2 != null && uploadConfig2.getSliceSize() != null) {
                InterfaceC2198271B1t uploadConfig3 = interfaceC2198251B1r.getUploadConfig();
                if (uploadConfig3 != null) {
                    sliceSize = uploadConfig3.getSliceSize();
                } else {
                    sliceSize = null;
                }
                bDVideoUploader.setSliceSize(sliceSize.intValue());
            } else {
                bDVideoUploader.setSliceSize(524288);
            }
            InterfaceC2198271B1t uploadConfig4 = interfaceC2198251B1r.getUploadConfig();
            if (uploadConfig4 != null && uploadConfig4.getSocketNum() != null) {
                InterfaceC2198271B1t uploadConfig5 = interfaceC2198251B1r.getUploadConfig();
                if (uploadConfig5 != null) {
                    socketNum = uploadConfig5.getSocketNum();
                }
                bDVideoUploader.setSocketNum(socketNum.intValue());
            } else {
                bDVideoUploader.setSocketNum(2);
            }
            bDVideoUploader.setSliceReTryCount(3);
            bDVideoUploader.setFileRetryCount(3);
            bDVideoUploader.setTraceId(strLIZIZ);
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null) {
                bDVideoUploader.setOpenBoe(iHostContextDepend.isBoeEnable());
            }
            this.LLILLL = bDVideoUploader;
            final InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            bDVideoUploader.setListener(new BDVideoUploaderListener(completionBlock, bDVideoUploader, strLIZIZ, interfaceC634840OvC2) { // from class: X.1B1o
                public final CompletionBlock<InterfaceC2198241B1q> LIZ;
                public final BDVideoUploader LIZIZ;
                public final String LIZJ;
                public final InterfaceC634840OvC LIZLLL;

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final String getStringFromExtern(int i) {
                    return "";
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onLog(int i, int i2, String str) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onUploadVideoStage(int i, long j) {
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final int videoUploadCheckNetState(int i, int i2) {
                    return 0;
                }

                @Override // com.ss.bduploader.BDVideoUploaderListener
                public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
                    String str;
                    String str2;
                    String str3;
                    Long lValueOf;
                    String str4;
                    String str5;
                    String str6;
                    Long lValueOf2;
                    String str7;
                    Long lValueOf3;
                    String str8;
                    String str9 = null;
                    try {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        CompletionBlock<InterfaceC2198241B1q> completionBlock2 = this.LIZ;
                                        XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC2198241B1q.class));
                                        InterfaceC2198241B1q interfaceC2198241B1q = (InterfaceC2198241B1q) xBaseModelLIZLLL;
                                        interfaceC2198241B1q.setTraceId(this.LIZJ);
                                        XBaseModel xBaseModelLIZLLL2 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1V.class));
                                        C1B1V c1b1v = (C1B1V) xBaseModelLIZLLL2;
                                        if (bDVideoInfo != null) {
                                            lValueOf3 = Long.valueOf(bDVideoInfo.mErrorCode);
                                        } else {
                                            lValueOf3 = null;
                                        }
                                        c1b1v.setErrorCode(lValueOf3);
                                        if (bDVideoInfo == null) {
                                            str8 = null;
                                        } else {
                                            str8 = bDVideoInfo.mErrorMsg;
                                        }
                                        c1b1v.setErrorMessage(str8);
                                        interfaceC2198241B1q.setErrorInfo((C1B1V) xBaseModelLIZLLL2);
                                        completionBlock2.onFailure(-7, "upload cancel", (XBaseResultModel) xBaseModelLIZLLL);
                                        BDVideoUploader bDVideoUploader2 = this.LIZIZ;
                                        if (bDVideoUploader2 != null) {
                                            bDVideoUploader2.close();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                CompletionBlock<InterfaceC2198241B1q> completionBlock3 = this.LIZ;
                                XBaseModel xBaseModelLIZLLL3 = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC2198241B1q.class));
                                InterfaceC2198241B1q interfaceC2198241B1q2 = (InterfaceC2198241B1q) xBaseModelLIZLLL3;
                                interfaceC2198241B1q2.setTraceId(this.LIZJ);
                                XBaseModel xBaseModelLIZLLL4 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1V.class));
                                C1B1V c1b1v2 = (C1B1V) xBaseModelLIZLLL4;
                                if (bDVideoInfo != null) {
                                    lValueOf2 = Long.valueOf(bDVideoInfo.mErrorCode);
                                } else {
                                    lValueOf2 = null;
                                }
                                c1b1v2.setErrorCode(lValueOf2);
                                if (bDVideoInfo == null) {
                                    str7 = null;
                                } else {
                                    str7 = bDVideoInfo.mErrorMsg;
                                }
                                c1b1v2.setErrorMessage(str7);
                                interfaceC2198241B1q2.setErrorInfo((C1B1V) xBaseModelLIZLLL4);
                                completionBlock3.onFailure(0, "upload failed", (XBaseResultModel) xBaseModelLIZLLL3);
                                BDVideoUploader bDVideoUploader3 = this.LIZIZ;
                                if (bDVideoUploader3 != null) {
                                    bDVideoUploader3.close();
                                    return;
                                }
                                return;
                            }
                            InterfaceC634840OvC interfaceC634840OvC3 = this.LIZLLL;
                            if (interfaceC634840OvC3 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("traceID", this.LIZJ);
                                jSONObject.put("progress", Float.valueOf(j / 100));
                                interfaceC634840OvC3.sendEvent("uploadVideoToVODProgress", jSONObject);
                                return;
                            }
                            return;
                        }
                        CompletionBlock<InterfaceC2198241B1q> completionBlock4 = this.LIZ;
                        XBaseModel xBaseModelLIZLLL5 = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC2198241B1q.class));
                        InterfaceC2198241B1q interfaceC2198241B1q3 = (InterfaceC2198241B1q) xBaseModelLIZLLL5;
                        interfaceC2198241B1q3.setTraceId(this.LIZJ);
                        XBaseModel xBaseModelLIZLLL6 = C1549500qQO.LIZLLL(C13LE.LIZ(C1B1W.class));
                        C1B1W c1b1w = (C1B1W) xBaseModelLIZLLL6;
                        if (bDVideoInfo != null) {
                            str4 = bDVideoInfo.mVideoId;
                        } else {
                            str4 = null;
                        }
                        c1b1w.setVid(str4);
                        if (bDVideoInfo == null) {
                            str5 = null;
                        } else {
                            str5 = bDVideoInfo.mCoverUri;
                        }
                        c1b1w.setCoverUri(str5);
                        Gson gson = C2348609Ie.LIZ;
                        if (bDVideoInfo != null) {
                            str6 = bDVideoInfo.mVideoMediaInfo;
                        } else {
                            str6 = null;
                        }
                        c1b1w.setMetaInfo(C2348609Ie.LIZIZ(new JSONObject(str6)));
                        interfaceC2198241B1q3.setVideoInfo((C1B1W) xBaseModelLIZLLL6);
                        completionBlock4.onSuccess((XBaseResultModel) xBaseModelLIZLLL5, "");
                        BDVideoUploader bDVideoUploader4 = this.LIZIZ;
                        if (bDVideoUploader4 != null) {
                            bDVideoUploader4.close();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CompletionBlock<InterfaceC2198241B1q> completionBlock5 = this.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("some exception happened : ");
                        sbLIZ2.append(e.getMessage());
                        sbLIZ2.append("; metaInfo = ");
                        if (bDVideoInfo != null) {
                            str = bDVideoInfo.mVideoMediaInfo;
                        } else {
                            str = null;
                        }
                        sbLIZ2.append(str);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        XBaseModel xBaseModelLIZLLL7 = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC2198241B1q.class));
                        InterfaceC2198241B1q interfaceC2198241B1q4 = (InterfaceC2198241B1q) xBaseModelLIZLLL7;
                        interfaceC2198241B1q4.setTraceId(this.LIZJ);
                        C1B1W c1b1w2 = (C1B1W) C1549500qQO.LIZLLL(C13LE.LIZ(C1B1W.class));
                        if (bDVideoInfo != null) {
                            str2 = bDVideoInfo.mVideoId;
                        } else {
                            str2 = null;
                        }
                        c1b1w2.setVid(str2);
                        if (bDVideoInfo != null) {
                            str3 = bDVideoInfo.mCoverUri;
                        } else {
                            str3 = null;
                        }
                        c1b1w2.setCoverUri(str3);
                        interfaceC2198241B1q4.setVideoInfo(c1b1w2);
                        C1B1V c1b1v3 = (C1B1V) C1549500qQO.LIZLLL(C13LE.LIZ(C1B1V.class));
                        if (bDVideoInfo != null) {
                            lValueOf = Long.valueOf(bDVideoInfo.mErrorCode);
                        } else {
                            lValueOf = null;
                        }
                        c1b1v3.setErrorCode(lValueOf);
                        if (bDVideoInfo != null) {
                            str9 = bDVideoInfo.mErrorMsg;
                        }
                        c1b1v3.setErrorMessage(str9);
                        interfaceC2198241B1q4.setErrorInfo(c1b1v3);
                        completionBlock5.onFailure(0, strLIZIZ2, (XBaseResultModel) xBaseModelLIZLLL7);
                    }
                }

                {
                    this.LIZ = completionBlock;
                    this.LIZIZ = bDVideoUploader;
                    this.LIZJ = strLIZIZ;
                    this.LIZLLL = interfaceC634840OvC2;
                }
            });
            BDVideoUploader bDVideoUploader2 = this.LLILLL;
            if (bDVideoUploader2 != null) {
                bDVideoUploader2.start();
                return;
            }
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "get filePaths failed, please check it", null, 4);
    }
}
