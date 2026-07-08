package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel$publishDiversionConfigUpdate$1", f = "EcMixMallDiversionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1741120vPS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ReachCfgDataForMall LL;
    public final /* synthetic */ EcMixMallDiversionViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741120vPS(ReachCfgDataForMall reachCfgDataForMall, EcMixMallDiversionViewModel ecMixMallDiversionViewModel, boolean z, String str, InterfaceC1364105Vn<? super C1741120vPS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = reachCfgDataForMall;
        this.LLILLJJLI = ecMixMallDiversionViewModel;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741120vPS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("EcMixMallDiversionViewModel@a14a.publishDiversionConfigUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ReachCfgDataForMall reachCfgDataForMall = this.LL;
        EcMixMallDiversionViewModel ecMixMallDiversionViewModel = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str5 = this.LLILZ;
        String str6 = "{}";
        Long lLJFF = null;
        if (C7879035x.LIZLLL()) {
            if (reachCfgDataForMall != null) {
                str3 = reachCfgDataForMall.reachCfgDataStr;
            } else {
                str3 = null;
            }
            Pair[] pairArr = new Pair[1];
            if (C123100dR.LIZ(str3)) {
                str6 = str3;
            }
            pairArr[0] = new Pair("diversion_config", str6);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (reachCfgDataForMall != null) {
                lLJFF = C2286608xc.LJFF(reachCfgDataForMall.createTime);
            }
            C1008603wy.LIZIZ(mapLJIIJ, "diversion_config_create_time", lLJFF);
            if (C1841707Jf.LIZ) {
                C1008603wy.LIZIZ(mapLJIIJ, "diversion_config_send_time", C2286608xc.LJFF(System.currentTimeMillis()));
                C603200NlG.LIZ(mapLJIIJ, ecMixMallDiversionViewModel.LL.bS().globalContext);
            }
            C0NOE.LIZIZ(ecMixMallDiversionViewModel.LLILLJJLI, "ec_mix_mall_diversion_config_update", mapLJIIJ, true);
            if (str3 != null) {
                ReachCfgData reachCfgData = reachCfgDataForMall.reachCfgData;
                if (reachCfgData == null || (str4 = reachCfgData.diversionId) == null) {
                    str4 = "";
                }
                C1741530vQ7.LIZ("diversion_config", "update", 0L, C2097608Jq.LJIIJ(new Pair("diversion_id", str4), new Pair("diversion_config_create_time", C2286608xc.LJFF(reachCfgDataForMall.createTime))), 4).LIZ("update_success", true, null, null, null, null);
                if (z) {
                    C1557000qcU.LIZ("diversion_config", "multiple_create", C2097608Jq.LJIIJ(new Pair("diversion_id", str4), new Pair("diversion_config_create_time", C2286608xc.LJFF(reachCfgDataForMall.createTime))));
                }
                C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - reachCfgDataForMall.createTime;
                c1767950w6j.getClass();
                C1767950w6j.LJJII(jCurrentTimeMillis, str4, str5);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            if (reachCfgDataForMall == null) {
                str = null;
            } else {
                try {
                    str = reachCfgDataForMall.reachCfgDataStr;
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            Pair[] pairArr2 = new Pair[1];
            if (C123100dR.LIZ(str)) {
                str6 = str;
            }
            pairArr2[0] = new Pair("diversion_config", str6);
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
            if (reachCfgDataForMall != null) {
                lLJFF = C2286608xc.LJFF(reachCfgDataForMall.createTime);
            }
            C1008603wy.LIZIZ(mapLJIIJ2, "diversion_config_create_time", lLJFF);
            if (C1841707Jf.LIZ) {
                C1008603wy.LIZIZ(mapLJIIJ2, "diversion_config_send_time", C2286608xc.LJFF(System.currentTimeMillis()));
                C603200NlG.LIZ(mapLJIIJ2, ecMixMallDiversionViewModel.LL.bS().globalContext);
            }
            C0NOE.LIZIZ(ecMixMallDiversionViewModel.LLILLJJLI, "ec_mix_mall_diversion_config_update", mapLJIIJ2, true);
            if (str != null) {
                ReachCfgData reachCfgData2 = reachCfgDataForMall.reachCfgData;
                if (reachCfgData2 == null || (str2 = reachCfgData2.diversionId) == null) {
                    str2 = "";
                }
                C1741530vQ7.LIZ("diversion_config", "update", 0L, C2097608Jq.LJIIJ(new Pair("diversion_id", str2), new Pair("diversion_config_create_time", C2286608xc.LJFF(reachCfgDataForMall.createTime))), 4).LIZ("update_success", true, null, null, null, null);
                if (z) {
                    C1557000qcU.LIZ("diversion_config", "multiple_create", C2097608Jq.LJIIJ(new Pair("diversion_id", str2), new Pair("diversion_config_create_time", C2286608xc.LJFF(reachCfgDataForMall.createTime))));
                }
                C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - reachCfgDataForMall.createTime;
                c1767950w6j2.getClass();
                C1767950w6j.LJJII(jCurrentTimeMillis2, str2, str5);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallDiversionViewModel@a14a.publishDiversionConfigUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
