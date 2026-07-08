package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$release$2", f = "ECLiveVideoReplayPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C1568790qvV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1568780qvU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568790qvV(C1568780qvU c1568780qvU, InterfaceC1364105Vn<? super C1568790qvV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1568780qvU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568790qvV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.release$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21353118hN c21353118hN = C21353118hN.LL;
        C1568780qvU c1568780qvU = this.LL;
        c21353118hN.getClass();
        C21353118hN.LJIILJJIL(c1568780qvU, false, "no_cache");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.release$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
