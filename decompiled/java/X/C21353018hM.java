package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$preload$1", f = "ECLiveVideoReplayPreloadManager.kt", l = {}, m = "invokeSuspend")
public final class C21353018hM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1568780qvU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21353018hM(C1568780qvU c1568780qvU, InterfaceC1364105Vn<? super C21353018hM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1568780qvU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21353018hM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1568800qvW c1568800qvW;
        boolean z;
        C1568780qvU c1568780qvU;
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1568780qvU c1568780qvU2 = this.LL;
        if (c1568780qvU2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1");
            return unit;
        }
        C21353118hN c21353118hN = C21353118hN.LL;
        boolean zLJFF = C21353118hN.LJFF();
        boolean zLJIIJJI = C21353118hN.LJIIJJI();
        C21353418hQ c21353418hQ = C21353118hN.LLILLL;
        if (c21353418hQ != null) {
            c1568800qvW = new C1568800qvW(c21353418hQ.LIZ, c21353418hQ.LIZLLL, c21353418hQ.LJFF, c21353418hQ.LJII);
        } else {
            c1568800qvW = null;
        }
        boolean z2 = false;
        if (zLJFF && (c1568800qvW == null || !c1568800qvW.LIZ.LIZ(c1568780qvU2) || c1568800qvW.LIZIZ == EnumC1569640qws.INVALID)) {
            z = true;
        } else {
            z = false;
        }
        Map mapLIZJ = C21353118hN.LIZJ(c1568780qvU2);
        mapLIZJ.put("enable_replay_preload", Boolean.valueOf(zLJFF));
        mapLIZJ.put("preload_enabled", Boolean.valueOf(zLJFF));
        mapLIZJ.put("reuse_enabled", Boolean.valueOf(zLJIIJJI));
        mapLIZJ.put("trigger_preload", Boolean.valueOf(z));
        C1018703yb.LIZIZ("rd_tiktokec_replay_preload", mapLIZJ);
        if (!zLJFF) {
            C21353118hN.LJ();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1");
            return unit2;
        }
        if (!z) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1");
            return unit3;
        }
        if (c21353418hQ != null) {
            c1568780qvU = c21353418hQ.LIZ;
            z2 = true;
        } else {
            c1568780qvU = null;
        }
        C21353118hN.LJIILIIL(c1568780qvU, z2, "preload");
        C21353118hN.LJ();
        C844470XAv.LIZ.getClass();
        C1488750oqP c1488750oqP = new C1488750oqP(C844470XAv.LIZ(), null, 6);
        c1488750oqP.setTag("gec_live_replay");
        c1488750oqP.setUseTextureViewDirectly(true);
        c1488750oqP.setVodSceneTag("gec_order_detail");
        String str = c1568780qvU2.LIZLLL;
        if (str != null) {
            c1488750oqP.setEnterFrom(str);
        }
        c1488750oqP.setLoop(true);
        c1488750oqP.setMuted(true);
        C21353418hQ c21353418hQ2 = new C21353418hQ(c1568780qvU2, c1488750oqP);
        C21353118hN.LLILLL = c21353418hQ2;
        c1488750oqP.setStatusChangeListener(new C21354218hY(c21353418hQ2));
        c21353418hQ2.LJIJJ = C23250099c.LIZLLL(C21353118hN.LLILLJJLI, null, null, new C21353318hP(c21353418hQ2, c1568780qvU2, null), 3);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
