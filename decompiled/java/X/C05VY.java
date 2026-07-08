package X;

import Y.AgS193S0200000_2;

/* JADX INFO: renamed from: X.05VY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$ChatList$2$1$1$invokeSuspend$$inlined$map$1$2", f = "TakoAIVideoInputAssem.kt", l = {223}, m = "emit")
public final class C05VY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS193S0200000_2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VY(AgS193S0200000_2 agS193S0200000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS193S0200000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
