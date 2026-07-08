package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335900DEu extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ FailedReviewActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335900DEu(FailedReviewActivity failedReviewActivity) {
        super(0);
        this.LL = failedReviewActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
        /*
            r6 = this;
            X.0Cyh r5 = new X.0Cyh
            com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity r4 = r6.LL
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "failed_review_page_init_data"
            r2 = 0
            if (r1 < r0) goto L1f
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L46
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L46
            goto L3e
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L46
        L1f:
            android.content.Intent r0 = r4.getIntent()
            if (r0 == 0) goto L30
            android.os.Bundle r0 = r0.getExtras()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L30
            goto L32
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L30:
            r1 = r2
            goto L38
        L32:
            android.os.Parcelable r1 = r0.getParcelable(r3)
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r1 = (com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData) r1
        L38:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData
            if (r0 == 0) goto L46
            r2 = r1
            goto L46
        L3e:
            java.lang.Class<com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData> r0 = com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData.class
            java.lang.Object r2 = r1.getParcelable(r3, r0)
            com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData r2 = (com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData) r2
        L46:
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335900DEu.invoke():java.lang.Object");
    }
}
