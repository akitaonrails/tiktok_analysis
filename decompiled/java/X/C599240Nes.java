package X;

import Y.AgS167S0300000_9;

/* JADX INFO: renamed from: X.0Nes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$subscribeEvent$job$1$2", f = "PdpEventCenter.kt", l = {108}, m = "emit")
public final class C599240Nes extends AbstractC23140094w {
    public InterfaceC599270Nev LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS167S0300000_9<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C599240Nes(AgS167S0300000_9<? super T> agS167S0300000_9, InterfaceC1364105Vn<? super C599240Nes> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS167S0300000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpEventCenter@c50e.subscribeEvent$job$1$2$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$1 = this.LLILLL.LIZ$1(null, this);
        C1C7U.LIZIZ("PdpEventCenter@c50e.subscribeEvent$job$1$2$emit$1");
        return objLIZ$1;
    }
}
