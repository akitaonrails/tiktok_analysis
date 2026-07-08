package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NOG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel$sendPitayaTriggerResultToLynx$1", f = "EcMixMallDiversionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0NOG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EcMixMallDiversionViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NOG(int i, EcMixMallDiversionViewModel ecMixMallDiversionViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = ecMixMallDiversionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        JSONObject jSONObject = this.LL;
        return new C0NOG(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn, jSONObject);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallDiversionViewModel@a14a.sendPitayaTriggerResultToLynx$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = this.LL;
        int i = this.LLILLJJLI;
        String str = this.LLILLL;
        EcMixMallDiversionViewModel ecMixMallDiversionViewModel = this.LLILZ;
        if (C7879035x.LIZLLL()) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action_id", "real_time_voucher"), new Pair("algorithm_params", jSONObject), new Pair(Scene.SCENE_SERVICE, C2286608xc.LJ(i)), new Pair("event_type", str));
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcUgPitaya sending to lynx ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(jSONObject);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            C0NOE.LIZIZ(ecMixMallDiversionViewModel.LLILLJJLI, "ec_mix_mall_pitaya_trigger_message", mapLJIIJ, true);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("action_id", "real_time_voucher"), new Pair("algorithm_params", jSONObject), new Pair(Scene.SCENE_SERVICE, C2286608xc.LJ(i)), new Pair("event_type", str));
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EcUgPitaya sending to lynx ");
                sbLIZ2.append(i);
                sbLIZ2.append(", ");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(jSONObject);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh2.getClass();
                C2341109Fh.LIZ(strLIZIZ2);
                C0NOE.LIZIZ(ecMixMallDiversionViewModel.LLILLJJLI, "ec_mix_mall_pitaya_trigger_message", mapLJIIJ2, true);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMixMallDiversionViewModel@a14a.sendPitayaTriggerResultToLynx$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
