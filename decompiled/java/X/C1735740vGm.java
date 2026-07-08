package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735740vGm {
    public static final C1735740vGm LIZ = new C1735740vGm();

    public static Object LIZ(C1735750vGn c1735750vGn, String str, final C1381420m3I c1381420m3I, InterfaceC1364105Vn interfaceC1364105Vn) {
        final BDImageXUploader bDImageXUploader;
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZ.getClass();
        try {
            bDImageXUploader = new BDImageXUploader();
            bDImageXUploader.setUploadDomain(c1735750vGn.LJ);
            bDImageXUploader.setTopAccessKey(c1735750vGn.LIZ);
            bDImageXUploader.setTopSecretKey(c1735750vGn.LIZIZ);
            bDImageXUploader.setTopSessionToken(c1735750vGn.LIZJ);
            bDImageXUploader.setServiceID(c1735750vGn.LIZLLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildUploader failed: ");
            sbLIZ.append(e.getMessage());
            C1720106oR.LIZ("minis-ImageXUploadHelper", C2188811AlT.LIZIZ(sbLIZ));
            bDImageXUploader = null;
        }
        if (bDImageXUploader == null) {
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("Failed to create BDImageXUploader"));
            C189200o6.m2constructorimpl(c098200Yq);
            c23260099m.resumeWith(c098200Yq);
        } else {
            bDImageXUploader.setFilePath(1, new String[]{str});
            bDImageXUploader.setEnableHttps(1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('.');
            sbLIZ2.append(C08QA.LJIJ(new C0VSJ(str)));
            bDImageXUploader.setFileExtension(C2188811AlT.LIZIZ(sbLIZ2));
            bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0mQF
                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final int imageXUploadCheckNetState(int i2, int i3) {
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    try {
                        return C036E.LIZ.LIZIZ() ? 1 : 0;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return 0;
                    }
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onLog(int i2, int i3, String str2) {
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onLog: p0: ");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(", p1: ");
                    sbLIZ3.append(i3);
                    sbLIZ3.append(", p2: ");
                    sbLIZ3.append(str2);
                    C1720106oR.LIZ("minis-ImageXUploadHelper", C2188811AlT.LIZIZ(sbLIZ3));
                }

                @Override // com.ss.bduploader.BDImageXUploaderListener
                public final void onNotify(int i2, long j, BDImageXInfo bDImageXInfo) throws JSONException {
                    Long lValueOf;
                    Integer numValueOf;
                    Integer numValueOf2;
                    String str2;
                    String str3 = "upload response tos key is null";
                    String str4 = null;
                    try {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 6) {
                                    if (i2 != 7) {
                                        return;
                                    }
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("upload onComplete: ");
                                    if (bDImageXInfo == null) {
                                        str2 = null;
                                    } else {
                                        str2 = bDImageXInfo.mImageTosKey;
                                    }
                                    sbLIZ3.append(str2);
                                    C1720106oR.LJI("minis-ImageXUploadHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                    bDImageXUploader.close();
                                    if (bDImageXInfo != null) {
                                        C1381420m3I c1381420m3I2 = c1381420m3I;
                                        if (c1381420m3I2 != null) {
                                            c1381420m3I2.LIZ(EnumC1395590mQ9.UPLOAD_IMAGE, EnumC1381400m3G.SUCCESS, null, null);
                                        }
                                        InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                                        String str5 = bDImageXInfo.mImageTosKey;
                                        C189200o6.m2constructorimpl(str5);
                                        interfaceC1364105Vn2.resumeWith(str5);
                                        return;
                                    }
                                    C1381420m3I c1381420m3I3 = c1381420m3I;
                                    if (c1381420m3I3 != null) {
                                        c1381420m3I3.LIZ(EnumC1395590mQ9.UPLOAD_IMAGE, EnumC1381400m3G.FAIL, null, "upload response tos key is null");
                                    }
                                    InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                                    C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("upload response tos key is null"));
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                    interfaceC1364105Vn3.resumeWith(c098200Yq2);
                                    return;
                                }
                            } else {
                                bDImageXUploader.close();
                                C1381420m3I c1381420m3I4 = c1381420m3I;
                                if (c1381420m3I4 != null) {
                                    EnumC1395590mQ9 enumC1395590mQ9 = EnumC1395590mQ9.UPLOAD_IMAGE;
                                    EnumC1381400m3G enumC1381400m3G = EnumC1381400m3G.FAIL;
                                    if (bDImageXInfo != null) {
                                        numValueOf2 = Integer.valueOf((int) bDImageXInfo.mErrorCode);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    c1381420m3I4.LIZ(enumC1395590mQ9, enumC1381400m3G, numValueOf2, "upload canceled");
                                }
                                InterfaceC1364105Vn<String> interfaceC1364105Vn4 = c23260099m;
                                C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException("minis-ImageXUploadHelper upload canceled"));
                                C189200o6.m2constructorimpl(c098200Yq3);
                                interfaceC1364105Vn4.resumeWith(c098200Yq3);
                                return;
                            }
                        }
                        bDImageXUploader.close();
                        C1381420m3I c1381420m3I5 = c1381420m3I;
                        if (c1381420m3I5 != null) {
                            EnumC1395590mQ9 enumC1395590mQ92 = EnumC1395590mQ9.UPLOAD_IMAGE;
                            EnumC1381400m3G enumC1381400m3G2 = EnumC1381400m3G.FAIL;
                            if (bDImageXInfo != null) {
                                numValueOf = Integer.valueOf((int) bDImageXInfo.mErrorCode);
                                String str6 = bDImageXInfo.mMetaInfo;
                                if (str6 != null) {
                                    str3 = str6;
                                }
                            } else {
                                numValueOf = null;
                            }
                            c1381420m3I5.LIZ(enumC1395590mQ92, enumC1381400m3G2, numValueOf, str3);
                        }
                        InterfaceC1364105Vn<String> interfaceC1364105Vn5 = c23260099m;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("minis-ImageXUploadHelper upload failed error: ");
                        if (bDImageXInfo == null) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(bDImageXInfo.mErrorCode);
                        }
                        sbLIZ4.append(lValueOf);
                        C098200Yq c098200Yq4 = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4)));
                        C189200o6.m2constructorimpl(c098200Yq4);
                        interfaceC1364105Vn5.resumeWith(c098200Yq4);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bDImageXUploader.close();
                        C1381420m3I c1381420m3I6 = c1381420m3I;
                        if (c1381420m3I6 != null) {
                            EnumC1395590mQ9 enumC1395590mQ93 = EnumC1395590mQ9.UPLOAD_IMAGE;
                            EnumC1381400m3G enumC1381400m3G3 = EnumC1381400m3G.FAIL;
                            Integer numValueOf3 = Integer.valueOf(C2252408s6.LIZIZ(th));
                            String message = th.getMessage();
                            if (message == null) {
                                if (bDImageXInfo != null) {
                                    str4 = bDImageXInfo.mMetaInfo;
                                }
                            } else {
                                str4 = message;
                            }
                            c1381420m3I6.LIZ(enumC1395590mQ93, enumC1381400m3G3, numValueOf3, str4);
                        }
                        InterfaceC1364105Vn<String> interfaceC1364105Vn6 = c23260099m;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Upload screenshot to ImageX failed: ");
                        sbLIZ5.append(th.getMessage());
                        C098200Yq c098200Yq5 = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5)));
                        C189200o6.m2constructorimpl(c098200Yq5);
                        interfaceC1364105Vn6.resumeWith(c098200Yq5);
                    }
                }
            });
            bDImageXUploader.start();
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
