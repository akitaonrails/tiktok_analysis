package X;

import Y.AgS286S0100000_5;

/* JADX INFO: renamed from: X.0Eyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$observeTaskStatus$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "BaseAIGCHandler.kt", l = {225}, m = "emit")
public final class C382340Eyu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS286S0100000_5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382340Eyu(AgS286S0100000_5 agS286S0100000_5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS286S0100000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIGCHandler@c43d.observeTaskStatus$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("BaseAIGCHandler@c43d.observeTaskStatus$1$invokeSuspend$$inlined$mapNotNull$1$2$1");
        return objEmit;
    }
}
