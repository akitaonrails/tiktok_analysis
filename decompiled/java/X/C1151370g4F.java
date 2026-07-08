package X;

import Y.AfS186S0100000_17;
import Y.AfS4S0300100_17;
import android.os.SystemClock;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0g4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.util.wallet.RechargeUtilKt$queryDiamondList$2", f = "RechargeUtil.kt", l = {166}, m = "invokeSuspend")
public final class C1151370g4F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1804840x4E>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelInputParams LLILLJJLI;
    public final /* synthetic */ EnumC1803160x1W LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151370g4F(EnumC1803160x1W enumC1803160x1W, RechargePanelInputParams rechargePanelInputParams, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelInputParams;
        this.LLILLL = enumC1803160x1W;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1151370g4F(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("RechargeUtilKt@d250.queryDiamondList$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            final C099F c099fLIZIZ = C090F.LIZIZ();
            final HashMap map = new HashMap();
            map.put("charge_source", "campaign_recharge_panel");
            C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            map.put("campaign_type", C2286608xc.LJ(c1134860fdc.LIZ()));
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final InterfaceC1804390x3V interfaceC1804390x3VInitializeRechargeApiStateTracking = C1148670fzt.LIZ().initializeRechargeApiStateTracking();
            if (C1149560g1K.LIZLLL(this.LLILLJJLI)) {
                i = 1;
            } else {
                i = 2;
            }
            C11JN c11jnLJJIIZI = C1148670fzt.LIZ().getRechargeService().LJ(i, 0L, 0L, null, this.LLILLL, c1134860fdc.LIZ(), interfaceC1804390x3VInitializeRechargeApiStateTracking, false).LJIILIIL(new C0UO0()).LJJIJIL(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 159)).LJJIIZI(new AfS186S0100000_17(interfaceC1804390x3VInitializeRechargeApiStateTracking, 160));
            final EnumC1803160x1W enumC1803160x1W = this.LLILLL;
            final RechargePanelInputParams rechargePanelInputParams = this.LLILLJJLI;
            final Map<String, String> map2 = this.LLILZ;
            c11jnLJJIIZI.LJJLL(new C09JN() { // from class: X.0g4G
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    Map<String, Long> mapLJIIIIZZ;
                    C1C7U.LIZ("RechargeUtilKt@d250.queryDiamondList$2$3");
                    C1804840x4E c1804840x4E = (C1804840x4E) obj2;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    map.put("cost", Long.valueOf(jElapsedRealtime2));
                    map.put("hit_cache", Integer.valueOf(c1804840x4E.LJ ? 1 : 0));
                    map.put("cache_policy", enumC1803160x1W.toString());
                    InterfaceC1804390x3V interfaceC1804390x3V = interfaceC1804390x3VInitializeRechargeApiStateTracking;
                    if (interfaceC1804390x3V != null && (mapLJIIIIZZ = interfaceC1804390x3V.LJIIIIZZ()) != null) {
                        map.putAll(mapLJIIIIZZ);
                    }
                    C1151190g3x.LJII(true, c1804840x4E.LJ, jElapsedRealtime2, rechargePanelInputParams, map2, null);
                    c099fLIZIZ.LJIIZILJ(c1804840x4E);
                    C1C7U.LIZIZ("RechargeUtilKt@d250.queryDiamondList$2$3");
                }
            }, new AfS4S0300100_17(jElapsedRealtime, rechargePanelInputParams, map2, c099fLIZIZ, 4));
            this.LL = 1;
            objLJLIIIL = c099fLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("RechargeUtilKt@d250.queryDiamondList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RechargeUtilKt@d250.queryDiamondList$2");
        return objLJLIIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1804840x4E> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
