package X;

import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.bduploader.BDImageXUploader;

/* JADX INFO: renamed from: X.1Bb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207801Bb0 {
    public static final /* synthetic */ int LIZJ = 0;
    public boolean LIZ;
    public final BDImageXUploader LIZIZ;

    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZIZ.close();
        this.LIZ = true;
        C1344030l4z.LIZJ("CommentImageUploader", "close");
    }

    public C2207801Bb0(CommentImageUploadAuth commentImageUploadAuth) {
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(commentImageUploadAuth.getUploadDomain());
        bDImageXUploader.setTopAccessKey(commentImageUploadAuth.getAccessKey());
        bDImageXUploader.setTopSecretKey(commentImageUploadAuth.getSecretKey());
        bDImageXUploader.setTopSessionToken(commentImageUploadAuth.getSessionToken());
        bDImageXUploader.setServiceID(commentImageUploadAuth.getServiceId());
        if (C0BJO.LIZIZ) {
            bDImageXUploader.setServerParameter(C0W8J.LIZ());
            bDImageXUploader.setPreheatUploader(3);
        }
        if (C0A8A.LIZIZ) {
            bDImageXUploader.setEnableCommitUpload(0);
        }
        CommentImagePublishOptExp.CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = CommentImagePublishOptExp.LIZLLL();
        CommentImagePublishOptExp.UploadSdkConfig uploadSdkConfig = (commentImagePublishOptConfigLIZLLL == null || (uploadSdkConfig = commentImagePublishOptConfigLIZLLL.uploadSdkConfig) == null) ? new CommentImagePublishOptExp.UploadSdkConfig(-1, -1, -1) : uploadSdkConfig;
        int i = uploadSdkConfig.fileRetryCount;
        if (i >= 0) {
            bDImageXUploader.setFileRetryCount(i);
        }
        int i2 = uploadSdkConfig.rwTimeout;
        if (i2 >= 0) {
            bDImageXUploader.setRWTimeout(i2);
        }
        int i3 = uploadSdkConfig.maxFailTime;
        if (i3 >= 0) {
            bDImageXUploader.setMaxFailTime(i3);
        }
        this.LIZIZ = bDImageXUploader;
    }
}
