package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18hV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$discard$1", f = "ECLiveVideoReplayPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C21353918hV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21354518hb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21353918hV(C21354518hb c21354518hb, InterfaceC1364105Vn<? super C21353918hV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21354518hb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21353918hV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.discard$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21353418hQ c21353418hQ = this.LL.LIZ;
        c21353418hQ.LJII = false;
        if (C21353118hN.LLILLL == c21353418hQ) {
            C21353118hN.LLILLL = null;
        }
        C21353118hN.LL.getClass();
        C21353118hN.LIZLLL(c21353418hQ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.discard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
