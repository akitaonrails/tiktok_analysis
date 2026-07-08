package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import com.ss.bduploader.BDUploadUtil;

/* JADX INFO: renamed from: X.1Bb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207821Bb2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final BDImageXUploader LIZ;

    public final void LIZ() {
        this.LIZ.close();
    }

    public final void LIZLLL() {
        this.LIZ.start();
    }

    public C2207821Bb2(AIGCAvatarAuthConfig aIGCAvatarAuthConfig) {
        BDUploadUtil.setEnableNativeLog(Boolean.TRUE);
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(aIGCAvatarAuthConfig.uploadHost);
        bDImageXUploader.setTopAccessKey(aIGCAvatarAuthConfig.accessKeyId);
        bDImageXUploader.setTopSecretKey(aIGCAvatarAuthConfig.secretAccessKey);
        bDImageXUploader.setTopSessionToken(aIGCAvatarAuthConfig.sessionToken);
        bDImageXUploader.setServiceID(aIGCAvatarAuthConfig.serviceId);
        bDImageXUploader.setNetworkType(403, C541470LLl.LIZ());
        bDImageXUploader.setNetworkType(404, C2207881Bb8.LIZ());
        this.LIZ = bDImageXUploader;
    }

    public final void LIZJ(final InterfaceC2207871Bb7 interfaceC2207871Bb7) {
        this.LIZ.setListener(new BDImageXUploaderListener() { // from class: X.1Bb4
            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final int imageXUploadCheckNetState(int i, int i2) {
                try {
                    return C036E.LIZ.LIZIZ() ? 1 : 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return 0;
                }
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onLog(int i, int i2, String str) {
                interfaceC2207871Bb7.onLog(i, i2, str);
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                AbstractImageUploader.ImageUploadInfo imageUploadInfo;
                InterfaceC2207871Bb7 interfaceC2207871Bb72 = interfaceC2207871Bb7;
                if (bDImageXInfo != null) {
                    imageUploadInfo = new AbstractImageUploader.ImageUploadInfo(bDImageXInfo.mFileIndex, bDImageXInfo.mImageTosKey, bDImageXInfo.mErrorCode, null, bDImageXInfo.mEncryptionMeta, bDImageXInfo.mProgress, bDImageXInfo.mMetaInfo, bDImageXInfo.mErrorMsg);
                } else {
                    imageUploadInfo = null;
                }
                interfaceC2207871Bb72.LIZ(i, j, imageUploadInfo);
            }
        });
    }

    public final void LIZIZ(int i, String[] strArr) {
        this.LIZ.setFilePath(i, strArr);
    }
}
