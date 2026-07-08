package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS390S0200000_24;
import njp.a;

/* JADX INFO: renamed from: X.0qrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.instantfeed.RecommendInstantFeedManager$onSignalReceived$1$1", f = "RecommendInstantFeedManager.kt", l = {}, m = "invokeSuspend")
public final class C1566450qrj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1566580qrw LL;
    public final /* synthetic */ AbstractC1566610qrz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566450qrj(C1566580qrw c1566580qrw, AbstractC1566610qrz abstractC1566610qrz, InterfaceC1364105Vn<? super C1566450qrj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1566580qrw;
        this.LLILLJJLI = abstractC1566610qrz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566450qrj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendInstantFeedManager@6e14.onSignalReceived$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1566580qrw c1566580qrw = this.LL;
        InterfaceC1566460qrk interfaceC1566460qrk = c1566580qrw.LJ;
        if (interfaceC1566460qrk != null) {
            AbstractC1566610qrz abstractC1566610qrz = this.LLILLJJLI;
            interfaceC1566460qrk.LIZ(abstractC1566610qrz, new AwS390S0200000_24(abstractC1566610qrz, c1566580qrw, 103));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendInstantFeedManager@6e14.onSignalReceived$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
