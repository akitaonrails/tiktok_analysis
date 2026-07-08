package X;

import Y.AgS199S0200000_8;

/* JADX INFO: renamed from: X.0Lvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveTaskHandler$initObserver$1$invokeSuspend$$inlined$map$1$2", f = "AILiveTaskHandler.kt", l = {223}, m = "emit")
public final class C558730Lvj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS199S0200000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558730Lvj(AgS199S0200000_8 agS199S0200000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS199S0200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveTaskHandler@e060.initObserver$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AILiveTaskHandler@e060.initObserver$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
