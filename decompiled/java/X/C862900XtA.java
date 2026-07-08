package X;

import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl;

/* JADX INFO: renamed from: X.0XtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl", f = "TakoRTCAbilityImpl.kt", l = {104}, m = "retryInitClient")
public final class C862900XtA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoRTCAbilityImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862900XtA(TakoRTCAbilityImpl takoRTCAbilityImpl, InterfaceC1364105Vn<? super C862900XtA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoRTCAbilityImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoRTCAbilityImpl@571a.retryInitClient$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIIZI = this.LLILLJJLI.LJJIIZI(null, null, this);
        C1C7U.LIZIZ("TakoRTCAbilityImpl@571a.retryInitClient$1");
        return objLJJIIZI;
    }
}
