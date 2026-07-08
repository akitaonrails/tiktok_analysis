package X;

import Y.AgS101S1100000_9;

/* JADX INFO: renamed from: X.0Neu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2", f = "PdpEventCenter.kt", l = {223}, m = "emit")
public final class C599260Neu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS101S1100000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599260Neu(AgS101S1100000_9 agS101S1100000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS101S1100000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpEventCenter@c50e.subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PdpEventCenter@c50e.subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
