package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.configuration.models.NUJFlow;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import defpackage.f9;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10OL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10OL {
    public static final C10OL LIZ = new C10OL();
    public static long LIZIZ;

    public static NUJFlow LIZIZ(C19EG c19eg) {
        InputStreamReader inputStreamReader = new InputStreamReader(c19eg.getResources().getAssets().open("strategy/nuj_flow.json"));
        C1911410zq7.LIZ("config_track", "New engine using default config");
        LIZIZ = 10000000000L;
        return (NUJFlow) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (Reader) inputStreamReader, NUJFlow.class);
    }

    public static List LIZ(C10PP c10pp, boolean z) {
        Long lValueOf;
        long jLongValue;
        NUJFlow nUJFlowLIZIZ;
        C19EG c19egLIZIZ = c10pp.context().LIZ.LIZIZ();
        C19233810Mm.LIZ.getClass();
        if (C19233810Mm.LIZIZ()) {
            nUJFlowLIZIZ = LIZIZ(c19egLIZIZ);
        } else {
            f9.LIZ.getClass();
            String strLIZIZ = f9.LIZIZ(101);
            IPluginService.NUStrategy nUStrategyLJ = f9.LJ(101);
            if (nUStrategyLJ != null) {
                lValueOf = Long.valueOf(nUStrategyLJ.strategyId);
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            LIZIZ = jLongValue;
            if (C123100dR.LIZ(strLIZIZ)) {
                try {
                    nUJFlowLIZIZ = (NUJFlow) C7740030o.LIZ().getGson().LJII(strLIZIZ, NUJFlow.class);
                    if (!(!nUJFlowLIZIZ.flow.isEmpty())) {
                        C19240010Ow.LIZ.getClass();
                        C19240010Ow.LIZIZ("config_incorrect");
                        nUJFlowLIZIZ = LIZIZ(c19egLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C19240010Ow.LIZ.getClass();
                    C19240010Ow.LIZIZ("syntax");
                    nUJFlowLIZIZ = LIZIZ(c19egLIZIZ);
                }
            } else {
                C19240010Ow.LIZ.getClass();
                C19240010Ow.LIZIZ("empty");
                nUJFlowLIZIZ = LIZIZ(c19egLIZIZ);
            }
        }
        if (z) {
            C10MP.LIZ.getClass();
            boolean zBooleanValue = ((Boolean) C277340Atw.LIZ.getValue()).booleanValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record nuj list exp:");
            sbLIZ.append(zBooleanValue);
            C1911410zq7.LIZ("NUJ_Extend_Helper", C2188811AlT.LIZIZ(sbLIZ));
            C19241310Pj.LIZ.getClass();
            Keva.getRepo("nuj_extend").storeInt("push_time", C19241310Pj.LIZ().getValue());
            C1227904rF.LIZ.getClass();
            Keva.getRepo("nuj_extend").storeString("component_list", C1227904rF.LJI(nUJFlowLIZIZ));
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<NUAbilityNode> it2 = nUJFlowLIZIZ.flow.iterator();
        while (it2.hasNext()) {
            for (FilterAbilityModel filterAbilityModel : it2.next().filters) {
                String str = filterAbilityModel.name;
                C1878007Xe.LIZ.getClass();
                if (Intrinsics.LJFF(str, "applog_event_happen")) {
                    Iterator it3 = ((ArrayList) C07UJ.LIZ(filterAbilityModel.value)).iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((Pair) it3.next()).getFirst());
                    }
                }
            }
        }
        InterfaceC20685415wy interfaceC20685415wy = new InterfaceC20685415wy() { // from class: X.07UK
            @Override // X.InterfaceC20685415wy
            public void onEvent(String str2) {
                if (C13LP.LJJJJ(str2, arrayList)) {
                    ((ArrayList) C07UJ.LIZIZ).add(new C07UL(str2, null));
                }
            }

            @Override // X.InterfaceC20685415wy
            public final void LIZ(String str2, Map<String, String> map) {
                if (C13LP.LJJJJ(str2, arrayList)) {
                    ((ArrayList) C07UJ.LIZIZ).add(new C07UL(str2, map));
                }
            }

            @Override // X.InterfaceC20685415wy
            public final void onEvent(String str2, JSONObject jSONObject) {
                if (C13LP.LJJJJ(str2, arrayList)) {
                    ((ArrayList) C07UJ.LIZIZ).add(new C07UL(str2, null));
                }
            }
        };
        ((ArrayList) C07UJ.LIZ).add(interfaceC20685415wy);
        C20684815ws.LIZ(interfaceC20685415wy);
        return C10NV.LIZ(c10pp.context(), nUJFlowLIZIZ);
    }
}
