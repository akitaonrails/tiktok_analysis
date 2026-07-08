package X;

import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl;

/* JADX INFO: renamed from: X.0Xt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl", f = "TakoRTCAbilityImpl.kt", l = {90}, m = "initClient")
public final class C862890Xt9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoRTCAbilityImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862890Xt9(TakoRTCAbilityImpl takoRTCAbilityImpl, InterfaceC1364105Vn<? super C862890Xt9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoRTCAbilityImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoRTCAbilityImpl@571a.initClient$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIJIIJIL = this.LLILLJJLI.LJJIJIIJIL(null, null, this);
        C1C7U.LIZIZ("TakoRTCAbilityImpl@571a.initClient$1");
        return objLJJIJIIJIL;
    }
}
