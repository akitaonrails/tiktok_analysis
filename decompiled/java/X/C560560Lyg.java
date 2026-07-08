package X;

import Y.AgS76S1200000_8;

/* JADX INFO: renamed from: X.0Lyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundLoadingComponent$observeTaskStatus$1$1", f = "AIPlaygroundLoadingComponent.kt", l = {194}, m = "emit")
public final class C560560Lyg extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS76S1200000_8<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C560560Lyg(AgS76S1200000_8<? super T> agS76S1200000_8, InterfaceC1364105Vn<? super C560560Lyg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS76S1200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1$1$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLJJLI.LIZ$0(null, this);
        C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1$1$emit$1");
        return objLIZ$0;
    }
}
