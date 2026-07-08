package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;

/* JADX INFO: renamed from: X.0Ca1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel", f = "FailedReviewViewModel.kt", l = {298, 299, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 301, 302, 303}, m = "onInit")
public final class C315950Ca1 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C1683930tvD LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ FailedReviewViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315950Ca1(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C315950Ca1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = failedReviewViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FailedReviewViewModel@9b63.onInit$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLIZ.vQ2(this);
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.onInit$1");
        return objVQ2;
    }
}
