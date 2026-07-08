package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECAbsViewHolder$handleExtraStorage$1", f = "ECAbsViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1773190wFB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1773210wFD LL;
    public final /* synthetic */ AbstractC1773460wFc<AbstractC1773210wFD> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773190wFB(AbstractC1773210wFD abstractC1773210wFD, AbstractC1773460wFc<AbstractC1773210wFD> abstractC1773460wFc, InterfaceC1364105Vn<? super C1773190wFB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1773210wFD;
        this.LLILLJJLI = abstractC1773460wFc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1773190wFB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("ECAbsViewHolder@3b89.handleExtraStorage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        h hVar = this.LL.LJIILJJIL;
        if (hVar != null) {
            for (k kVar : hVar) {
                kVar.getClass();
                if (kVar instanceof n) {
                    try {
                        JSONObject jSONObject = new JSONObject(kVar.LJIILIIL().toString());
                        String strOptString = jSONObject.optString("key");
                        String strOptString2 = jSONObject.optString("value");
                        String strOptString3 = jSONObject.optString(Scene.SCENE_SERVICE);
                        C212391189t.LIZ.getClass();
                        C212391189t.LIZIZ(strOptString3, strOptString, strOptString2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("webcast_lru_cache_list, parse json, ");
                        sbLIZ.append(th.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ);
                        c599820Nfo.getClass();
                        C599820Nfo.LIZIZ();
                    }
                }
            }
        }
        List<? extends Map<String, ? extends Object>> list = this.LL.LJIILL;
        if (list != null) {
            for (Map<String, ? extends Object> map : list) {
                IHybridDataService iHybridDataService = (IHybridDataService) ServiceManager.get().getService(IHybridDataService.class);
                Object obj2 = map.get("key");
                if (obj2 != null) {
                    string = obj2.toString();
                } else {
                    string = null;
                }
                iHybridDataService.LJI(map.get("value"), string);
            }
        }
        if (C1773900wGK.LIZ() && C1773900wGK.LIZLLL().getEnableMallCache()) {
            AbstractC1773210wFD abstractC1773210wFD = this.LL;
            abstractC1773210wFD.LJIILJJIL = null;
            abstractC1773210wFD.LJIILL = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAbsViewHolder@3b89.handleExtraStorage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
