package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageInfo;
import com.ss.bduploader.BDImageUploader;
import com.ss.bduploader.BDImageUploaderListener;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.1Bb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207811Bb1 extends AbstractImageUploader {
    public final BDImageUploader LIZJ;

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZJ() {
        this.LIZJ.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final String LJIIIIZZ() {
        return this.LIZJ.getUploadContextSnapshot();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIILIIL() {
        this.LIZJ.start();
    }

    public C2207811Bb1(UploadImageConfig uploadImageConfig) {
        BDImageUploader bDImageUploader = new BDImageUploader();
        this.LIZJ = bDImageUploader;
        bDImageUploader.setUploadDomain(uploadImageConfig.imageHostName);
        bDImageUploader.setNetworkType(403, C541470LLl.LIZ());
        bDImageUploader.setNetworkType(404, C2207881Bb8.LIZ());
        bDImageUploader.setSliceSize(uploadImageConfig.sliceSize);
        bDImageUploader.setFileRetryCount(uploadImageConfig.fileRetryCount);
        bDImageUploader.setEnableHttps(uploadImageConfig.enableHttps);
        STSAuthConfig sTSAuthConfig = uploadImageConfig.authorizationV2;
        if (sTSAuthConfig != null) {
            bDImageUploader.setTopAccessKey(sTSAuthConfig.accessKeyId);
            bDImageUploader.setTopSecretKey(uploadImageConfig.authorizationV2.secretAccessKey);
            bDImageUploader.setTopSessionToken(uploadImageConfig.authorizationV2.sessionToken);
            bDImageUploader.setSpaceName(uploadImageConfig.authorizationV2.spaceName);
        } else {
            C201955140j.LJ("ImageUploader Config no authorizationV2");
        }
        TreeMap<String, Object> treeMap = new TreeMap<>();
        INetworkDebugService iNetworkDebugService = (INetworkDebugService) ServiceManager.get().getService(INetworkDebugService.class);
        if (iNetworkDebugService != null) {
            iNetworkDebugService.LIZIZ();
        }
        bDImageUploader.setCustomHttpHeaders(treeMap);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJ(final InterfaceC2207871Bb7 interfaceC2207871Bb7) {
        this.LIZJ.setListener(new BDImageUploaderListener() { // from class: X.1Bb5
            @Override // com.ss.bduploader.BDImageUploaderListener
            public final int imageUploadCheckNetState(int i, int i2) {
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIMusic BDImageUploaderListener imageUploadCheckNetState errorCode: ");
                sbLIZ.append(i);
                sbLIZ.append(", tryCount: ");
                sbLIZ.append(i2);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
                try {
                    return C036E.LIZ.LIZIZ() ? 1 : 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return 0;
                }
            }

            @Override // com.ss.bduploader.BDImageUploaderListener
            public final void onLog(int i, int i2, String str) {
                interfaceC2207871Bb7.onLog(i, i2, str);
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIMusic BDImageUploaderListener onLog what: ");
                sbLIZ.append(i);
                sbLIZ.append(", code: ");
                sbLIZ.append(i2);
                sbLIZ.append(", info: ");
                sbLIZ.append(str);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.bduploader.BDImageUploaderListener
            public final void onNotify(int i, long j, BDImageInfo bDImageInfo) {
                int i2;
                String str;
                long j2;
                String str2;
                String str3;
                long j3;
                String str4;
                String str5;
                InterfaceC2207871Bb7 interfaceC2207871Bb72 = interfaceC2207871Bb7;
                if (bDImageInfo != null) {
                    i2 = bDImageInfo.mFileIndex;
                } else {
                    i2 = -1;
                }
                if (bDImageInfo != null) {
                    str = bDImageInfo.mImageTosKey;
                    j2 = bDImageInfo.mErrorCode;
                    str2 = bDImageInfo.mErrorMsg;
                    str3 = bDImageInfo.mEncryptionMeta;
                    j3 = bDImageInfo.mProgress;
                    str4 = bDImageInfo.mMetaInfo;
                    str5 = bDImageInfo.mErrorMsg;
                } else {
                    str = null;
                    j2 = -237;
                    str2 = null;
                    str3 = null;
                    j3 = 0;
                    str4 = null;
                    str5 = null;
                }
                interfaceC2207871Bb72.LIZ(i, j, new AbstractImageUploader.ImageUploadInfo(i2, str, j2, str2, str3, j3, str4, str5));
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AIMusic BDImageUploaderListener onNotify what: ");
                sbLIZ.append(i);
                sbLIZ.append(", parameter: ");
                sbLIZ.append(j);
                sbLIZ.append(", info: ");
                sbLIZ.append(bDImageInfo);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJJI(boolean z) {
        this.LIZJ.setOpenBoe(z);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIL(String str) {
        this.LIZJ.setServerParameter(str);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIIZ(int i, String[] strArr) {
        this.LIZJ.setFilePath(1, strArr);
    }
}
