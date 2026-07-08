package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0gt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.quiz.request.PoiQuizRepository$operator$1", f = "PoiQuizRepository.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "fetchPoiList")
public final class C1182840gt0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1182830gsz LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182840gt0(C1182830gsz c1182830gsz, InterfaceC1364105Vn<? super C1182840gt0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1182830gsz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiQuizRepository@bb82.operator$1$fetchPoiList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLLJLLL = this.LLILLJJLI.LLJLLL(null, this);
        C1C7U.LIZIZ("PoiQuizRepository@bb82.operator$1$fetchPoiList$1");
        return objLLJLLL;
    }
}
