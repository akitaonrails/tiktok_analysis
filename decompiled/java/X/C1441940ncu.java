package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDObjectInfo;
import com.ss.bduploader.BDObjectUploader;
import com.ss.bduploader.BDObjectUploaderListener;

/* JADX INFO: renamed from: X.0ncu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441940ncu {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(java.lang.String r5, com.ss.android.ugc.aweme.publish.model.UploadImageConfig r6, X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof X.C1407380mjA
            if (r0 == 0) goto L33
            r4 = r7
            X.0mjA r4 = (X.C1407380mjA) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLJJLI
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L39
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0tNT r3 = (X.C1663010tNT) r3
            java.lang.String r0 = r3.LIZIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLJJLI = r0
            java.lang.Object r3 = LIZIZ(r5, r6, r4)
            if (r3 != r2) goto L22
            return r2
        L33:
            X.0mjA r4 = new X.0mjA
            r4.<init>(r7)
            goto L12
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441940ncu.LIZ(java.lang.String, com.ss.android.ugc.aweme.publish.model.UploadImageConfig, X.05Vn):java.lang.Object");
    }

    public static final Object LIZIZ(String str, UploadImageConfig uploadImageConfig, InterfaceC1364105Vn<? super C1663010tNT> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C2207831Bb3 c2207831Bb3 = new C2207831Bb3(uploadImageConfig);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iconPath=");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
        c2207831Bb3.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.0nOX
            @Override // X.InterfaceC2207871Bb7
            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                int i2;
                String str2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("what=");
                sbLIZ2.append(i);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                c2207831Bb3.getClass();
                if (i == 6) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("upload succesful image key: ");
                    String str3 = null;
                    if (imageUploadInfo != null) {
                        str2 = imageUploadInfo.mImageToskey;
                    } else {
                        str2 = null;
                    }
                    sbLIZ3.append(str2);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ3));
                    c2207831Bb3.LIZJ();
                    if (imageUploadInfo != null) {
                        str3 = imageUploadInfo.mImageToskey;
                    }
                    C1663010tNT c1663010tNT = new C1663010tNT(0, System.currentTimeMillis() - jCurrentTimeMillis, str3, true, 4);
                    InterfaceC20236714Gf<C1663010tNT> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(c1663010tNT);
                    interfaceC20236714Gf.resumeWith(c1663010tNT);
                    return;
                }
                c2207831Bb3.getClass();
                if (i == 7) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "upload failed");
                    c2207831Bb3.LIZJ();
                    if (imageUploadInfo != null) {
                        i2 = (int) imageUploadInfo.mErrorCode;
                    } else {
                        i2 = -1;
                    }
                    C1663010tNT c1663010tNT2 = new C1663010tNT(i2, System.currentTimeMillis() - jCurrentTimeMillis, null, false, 2);
                    InterfaceC20236714Gf<C1663010tNT> interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(c1663010tNT2);
                    interfaceC20236714Gf2.resumeWith(c1663010tNT2);
                    return;
                }
                c2207831Bb3.getClass();
                if (i != 1 || c2252611DEt.isActive()) {
                    return;
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "cancel if isActive == false");
                c2207831Bb3.LIZIZ();
            }

            @Override // X.InterfaceC2207871Bb7
            public final void onLog(int i, int i2, String str2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("upload onLog what=");
                sbLIZ2.append(i);
                sbLIZ2.append(", code=");
                sbLIZ2.append(i2);
                sbLIZ2.append(", info=");
                sbLIZ2.append(str2);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
            }
        });
        c2207831Bb3.LJIIIZ(1, new String[]{str});
        C2208411Bbz c2208411Bbz = new C2208411Bbz();
        c2208411Bbz.LIZJ(uploadImageConfig);
        c2207831Bb3.LJIIL(c2208411Bbz.LIZLLL());
        C0CHQ.LIZ().getApplicationService();
        c2207831Bb3.LJIIJJI(C19221910Hx.LJFF());
        c2207831Bb3.LJIILIIL();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final Object LIZJ(String str, UploadImageConfig uploadImageConfig, InterfaceC1364105Vn<? super C1663010tNT> interfaceC1364105Vn) {
        String str2;
        String str3;
        String str4;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploading zip, zipPath=");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final BDObjectUploader bDObjectUploader = new BDObjectUploader();
        bDObjectUploader.setFilePath(1, new String[]{str});
        STSAuthConfig sTSAuthConfig = uploadImageConfig.authorizationV2;
        String str5 = null;
        if (sTSAuthConfig != null) {
            str2 = sTSAuthConfig.accessKeyId;
        } else {
            str2 = null;
        }
        bDObjectUploader.setTopAccessKey(str2);
        STSAuthConfig sTSAuthConfig2 = uploadImageConfig.authorizationV2;
        if (sTSAuthConfig2 != null) {
            str3 = sTSAuthConfig2.secretAccessKey;
        } else {
            str3 = null;
        }
        bDObjectUploader.setTopSecretKey(str3);
        STSAuthConfig sTSAuthConfig3 = uploadImageConfig.authorizationV2;
        if (sTSAuthConfig3 != null) {
            str4 = sTSAuthConfig3.sessionToken;
        } else {
            str4 = null;
        }
        bDObjectUploader.setTopSessionToken(str4);
        STSAuthConfig sTSAuthConfig4 = uploadImageConfig.authorizationV2;
        if (sTSAuthConfig4 != null) {
            str5 = sTSAuthConfig4.spaceName;
        }
        bDObjectUploader.setSpaceName(str5);
        bDObjectUploader.setUploadDomain(uploadImageConfig.imageHostName);
        bDObjectUploader.setSliceSize(uploadImageConfig.sliceSize);
        bDObjectUploader.setSocketNum(1);
        bDObjectUploader.setSliceRetryCount(1);
        bDObjectUploader.setFileRetryCount(1);
        bDObjectUploader.setNetworkType(403, C541470LLl.LIZ());
        bDObjectUploader.setNetworkType(404, C541470LLl.LIZ());
        bDObjectUploader.setEnableCommitUpload(true);
        bDObjectUploader.setListener(new BDObjectUploaderListener() { // from class: X.0ncv
            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final int objectUploadCheckNetState(int i, int i2) {
                return 0;
            }

            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final void onLog(int i, int i2, String str6) {
            }

            @Override // com.ss.bduploader.BDObjectUploaderListener
            public final void onNotify(int i, long j, BDObjectInfo bDObjectInfo) {
                if (i != 1) {
                    if (i != 6) {
                        if (i == 7) {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "upload zip failed");
                            bDObjectUploader.close();
                            C1663010tNT c1663010tNT = new C1663010tNT((int) bDObjectInfo.mErrorCode, System.currentTimeMillis() - jCurrentTimeMillis, null, false, 2);
                            InterfaceC20236714Gf<C1663010tNT> interfaceC20236714Gf = c2252611DEt;
                            C189200o6.m2constructorimpl(c1663010tNT);
                            interfaceC20236714Gf.resumeWith(c1663010tNT);
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("upload zip complete, tosKey=");
                    sbLIZ2.append(bDObjectInfo.mImageTosKey);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                    bDObjectUploader.close();
                    C1663010tNT c1663010tNT2 = new C1663010tNT(0, System.currentTimeMillis() - jCurrentTimeMillis, bDObjectInfo.mImageTosKey, true, 4);
                    InterfaceC20236714Gf<C1663010tNT> interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(c1663010tNT2);
                    interfaceC20236714Gf2.resumeWith(c1663010tNT2);
                    return;
                }
                if (c2252611DEt.isActive()) {
                    return;
                }
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", "close if isActive == false");
                bDObjectUploader.close();
            }
        });
        bDObjectUploader.start();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
