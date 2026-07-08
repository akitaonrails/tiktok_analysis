package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderListener;

/* JADX INFO: renamed from: X.1BbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207921BbC extends AbstractVideoUploader {
    public final BDVideoUploader LIZ;

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZ() {
        this.LIZ.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJII() {
        this.LIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LIZLLL(String str) {
        this.LIZ.setBusinessTag(str);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJ(final InterfaceC2208111BbV interfaceC2208111BbV) {
        this.LIZ.setListener(new BDVideoUploaderListener() { // from class: X.1BbT
            @Override // com.ss.bduploader.BDVideoUploaderListener
            public final String getStringFromExtern(int i) {
                interfaceC2208111BbV.LIZIZ();
                return null;
            }

            @Override // com.ss.bduploader.BDVideoUploaderListener
            public final void onUploadVideoStage(int i, long j) {
                interfaceC2208111BbV.LIZJ();
            }

            @Override // com.ss.bduploader.BDVideoUploaderListener
            public final int videoUploadCheckNetState(int i, int i2) {
                return interfaceC2208111BbV.LJ();
            }

            @Override // com.ss.bduploader.BDVideoUploaderListener
            public final void onLog(int i, int i2, String str) {
                interfaceC2208111BbV.LIZ();
            }

            @Override // com.ss.bduploader.BDVideoUploaderListener
            public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
                String str;
                long j2;
                String str2;
                InterfaceC2208111BbV interfaceC2208111BbV2 = interfaceC2208111BbV;
                String str3 = null;
                if (bDVideoInfo != null) {
                    str3 = bDVideoInfo.mTosKey;
                    str = bDVideoInfo.mVideoId;
                    j2 = bDVideoInfo.mErrorCode;
                    str2 = bDVideoInfo.mErrorMsg;
                } else {
                    str = null;
                    j2 = 0;
                    str2 = null;
                }
                interfaceC2208111BbV2.LIZLLL(i, j, new AbstractVideoUploader.VideoUploadInfo(str3, str, j2, str2));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJFF(String str) {
        this.LIZ.setPathName(str);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader
    public final void LJI(String str) {
        this.LIZ.setUserReference(str);
    }

    public C2207921BbC(UploadVideoConfig uploadVideoConfig, EnumC19551211eQ enumC19551211eQ) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        this.LIZ = bDVideoUploader;
        int i = C19551311eR.LIZ[enumC19551211eQ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                STSAuthConfig sTSAuthConfig = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig != null) {
                    str7 = sTSAuthConfig.accessKeyId;
                } else {
                    str7 = null;
                }
                bDVideoUploader.setTopAccessKey(str7);
                STSAuthConfig sTSAuthConfig2 = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig2 != null) {
                    str8 = sTSAuthConfig2.secretAccessKey;
                } else {
                    str8 = null;
                }
                bDVideoUploader.setTopSecretKey(str8);
                STSAuthConfig sTSAuthConfig3 = uploadVideoConfig.authorizationV2;
                if (sTSAuthConfig3 != null) {
                    str9 = sTSAuthConfig3.sessionToken;
                } else {
                    str9 = null;
                }
                bDVideoUploader.setTopSessionToken(str9);
                STSAuthConfig sTSAuthConfig4 = uploadVideoConfig.authorizationV2;
                bDVideoUploader.setSpaceName(sTSAuthConfig4 != null ? sTSAuthConfig4.spaceName : null);
            } else {
                STSAuthConfig sTSAuthConfig5 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig5 != null) {
                    str4 = sTSAuthConfig5.accessKeyId;
                } else {
                    str4 = null;
                }
                bDVideoUploader.setTopAccessKey(str4);
                STSAuthConfig sTSAuthConfig6 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig6 != null) {
                    str5 = sTSAuthConfig6.secretAccessKey;
                } else {
                    str5 = null;
                }
                bDVideoUploader.setTopSecretKey(str5);
                STSAuthConfig sTSAuthConfig7 = uploadVideoConfig.testSpeedAuthorization2;
                if (sTSAuthConfig7 != null) {
                    str6 = sTSAuthConfig7.sessionToken;
                } else {
                    str6 = null;
                }
                bDVideoUploader.setTopSessionToken(str6);
                STSAuthConfig sTSAuthConfig8 = uploadVideoConfig.testSpeedAuthorization2;
                bDVideoUploader.setSpaceName(sTSAuthConfig8 != null ? sTSAuthConfig8.spaceName : null);
            }
        } else {
            STSAuthConfig sTSAuthConfig9 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig9 != null) {
                str = sTSAuthConfig9.accessKeyId;
            } else {
                str = null;
            }
            bDVideoUploader.setTopAccessKey(str);
            STSAuthConfig sTSAuthConfig10 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig10 != null) {
                str2 = sTSAuthConfig10.secretAccessKey;
            } else {
                str2 = null;
            }
            bDVideoUploader.setTopSecretKey(str2);
            STSAuthConfig sTSAuthConfig11 = uploadVideoConfig.captionAuthorization2;
            if (sTSAuthConfig11 != null) {
                str3 = sTSAuthConfig11.sessionToken;
            } else {
                str3 = null;
            }
            bDVideoUploader.setTopSessionToken(str3);
            STSAuthConfig sTSAuthConfig12 = uploadVideoConfig.captionAuthorization2;
            bDVideoUploader.setSpaceName(sTSAuthConfig12 != null ? sTSAuthConfig12.spaceName : null);
        }
        bDVideoUploader.setUploadDomain(uploadVideoConfig.videoHostName);
        bDVideoUploader.setNetworkType(403, C541470LLl.LIZ());
        bDVideoUploader.setNetworkType(404, C2207881Bb8.LIZ());
        bDVideoUploader.setMaxFailTime(uploadVideoConfig.maxFailTime);
        bDVideoUploader.setEnableLogCallBack(uploadVideoConfig.enableTTUploaderLogCallback);
        bDVideoUploader.setSliceSize(uploadVideoConfig.sliceSize);
        bDVideoUploader.setEnableHttps(uploadVideoConfig.enableHttps);
        bDVideoUploader.setFileRetryCount(1);
        C2208411Bbz c2208411Bbz = new C2208411Bbz();
        c2208411Bbz.LIZ(uploadVideoConfig);
        bDVideoUploader.setServerParameter(c2208411Bbz.LIZLLL());
    }
}
