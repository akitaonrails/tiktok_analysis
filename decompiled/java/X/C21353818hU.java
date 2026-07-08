package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$onLowMemory$1", f = "ECLiveVideoReplayPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C21353818hU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C21353818hU(InterfaceC1364105Vn<? super C21353818hU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21353818hU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1568780qvU c1568780qvU;
        boolean z;
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.onLowMemory$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21353418hQ c21353418hQ = C21353118hN.LLILLL;
        C21353118hN c21353118hN = C21353118hN.LL;
        if (C21353118hN.LJFF()) {
            if (c21353418hQ != null) {
                c1568780qvU = c21353418hQ.LIZ;
                z = true;
            } else {
                c1568780qvU = null;
                z = false;
            }
            C21353118hN.LJIILIIL(c1568780qvU, z, "oom");
        }
        C21353118hN.LJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.onLowMemory$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C21353818hU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
