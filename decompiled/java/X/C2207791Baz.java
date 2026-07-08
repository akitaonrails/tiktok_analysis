package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDImageXUploaderListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Baz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.util.CommentImagePreheatUploader$preheatUploader$1", f = "CommentImagePreheatUploader.kt", l = {}, m = "invokeSuspend")
public final class C2207791Baz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentImageUploadAuth LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2207791Baz(CommentImageUploadAuth commentImageUploadAuth, InterfaceC1364105Vn<? super C2207791Baz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentImageUploadAuth;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2207791Baz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uploadDomain;
        String accessKey;
        String secretKey;
        String sessionToken;
        CommentImagePublishOptExp.UploadSdkConfig uploadSdkConfig;
        C1C7U.LIZ("CommentImagePreheatUploader@c881.preheatUploader$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1462550oA9.LIZ();
        final BDImageXUploader bDImageXUploader = new BDImageXUploader();
        CommentImageUploadAuth commentImageUploadAuth = this.LL;
        String serviceId = null;
        if (commentImageUploadAuth != null) {
            uploadDomain = commentImageUploadAuth.getUploadDomain();
        } else {
            uploadDomain = null;
        }
        bDImageXUploader.setUploadDomain(uploadDomain);
        CommentImageUploadAuth commentImageUploadAuth2 = this.LL;
        if (commentImageUploadAuth2 != null) {
            accessKey = commentImageUploadAuth2.getAccessKey();
        } else {
            accessKey = null;
        }
        bDImageXUploader.setTopAccessKey(accessKey);
        CommentImageUploadAuth commentImageUploadAuth3 = this.LL;
        if (commentImageUploadAuth3 != null) {
            secretKey = commentImageUploadAuth3.getSecretKey();
        } else {
            secretKey = null;
        }
        bDImageXUploader.setTopSecretKey(secretKey);
        CommentImageUploadAuth commentImageUploadAuth4 = this.LL;
        if (commentImageUploadAuth4 != null) {
            sessionToken = commentImageUploadAuth4.getSessionToken();
        } else {
            sessionToken = null;
        }
        bDImageXUploader.setTopSessionToken(sessionToken);
        CommentImageUploadAuth commentImageUploadAuth5 = this.LL;
        if (commentImageUploadAuth5 != null) {
            serviceId = commentImageUploadAuth5.getServiceId();
        }
        bDImageXUploader.setServiceID(serviceId);
        bDImageXUploader.setServerParameter(C0W8J.LIZ());
        bDImageXUploader.setFileNum(1, 0);
        bDImageXUploader.setPreheatUploader(2);
        bDImageXUploader.setListener(new BDImageXUploaderListener() { // from class: X.0mQI
            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onLog(int i, int i2, String str) {
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final int imageXUploadCheckNetState(int i, int i2) {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                try {
                    return C036E.LIZ.LIZIZ() ? 1 : 0;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return 0;
                }
            }

            @Override // com.ss.bduploader.BDImageXUploaderListener
            public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
                if (i == 123) {
                    if (((int) j) == 0) {
                        C1344030l4z.LIZJ("CommentImagePreheatUploader", "Preheat complete");
                    } else {
                        C1344030l4z.LIZJ("CommentImagePreheatUploader", "Preheat not complete");
                    }
                    bDImageXUploader.close();
                }
            }
        });
        CommentImagePublishOptExp.CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = CommentImagePublishOptExp.LIZLLL();
        if (commentImagePublishOptConfigLIZLLL == null || (uploadSdkConfig = commentImagePublishOptConfigLIZLLL.uploadSdkConfig) == null) {
            uploadSdkConfig = new CommentImagePublishOptExp.UploadSdkConfig(-1, -1, -1);
        }
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
        bDImageXUploader.startPreHeat();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImagePreheatUploader@c881.preheatUploader$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
