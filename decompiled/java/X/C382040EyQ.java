package X;

import Y.AgS98S1100000_5;

/* JADX INFO: renamed from: X.0EyQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.handler.BaseAIGCHandler$observeTaskStatus$1$2", f = "BaseAIGCHandler.kt", l = {101}, m = "emit")
public final class C382040EyQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS98S1100000_5<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C382040EyQ(AgS98S1100000_5<? super T> agS98S1100000_5, InterfaceC1364105Vn<? super C382040EyQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS98S1100000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseAIGCHandler@c43d.observeTaskStatus$1$2$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$4 = this.LLILLJJLI.LIZ$4(null, this);
        C1C7U.LIZIZ("BaseAIGCHandler@c43d.observeTaskStatus$1$2$emit$1");
        return objLIZ$4;
    }
}
