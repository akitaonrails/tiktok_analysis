package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910420zoW implements InterfaceC1848620yCq {
    public static final C1910420zoW LL = new C1910420zoW();
    public static C1910410zoV LLILLJJLI;

    @Override // X.InterfaceC1848620yCq
    public final String getEventName() {
        return "perf_explore_page_monitor";
    }

    public static final void LIZ() {
        C1910410zoV c1910410zoV = LLILLJJLI;
        if (c1910410zoV != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("page_build_time", Long.valueOf(c1910410zoV.LIZIZ));
            for (Map.Entry entry : ((HashMap) c1910410zoV.LIZJ).entrySet()) {
                String value = ((EnumC1910400zoU) entry.getKey()).getValue();
                C1910430zoX c1910430zoX = (C1910430zoX) entry.getValue();
                jSONObject.putOpt(value, Long.valueOf(c1910430zoX.LIZIZ - c1910430zoX.LIZ));
            }
            C1910420zoW c1910420zoW = LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("perf_explore_page_monitor");
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            C1848630yCr.LIZIZ(c1910420zoW, C2188811AlT.LIZIZ(sbLIZ));
            C1848630yCr.LIZ(c1910420zoW, jSONObject);
            if (((HashMap) c1910410zoV.LIZJ).get(EnumC1910400zoU.ON_DESTROY) != null) {
                LLILLJJLI = null;
            }
        }
    }

    public static final void LIZJ() {
        if (LLILLJJLI != null) {
            return;
        }
        C1910410zoV c1910410zoV = new C1910410zoV();
        LLILLJJLI = c1910410zoV;
        c1910410zoV.LIZ = System.currentTimeMillis();
    }

    public static final void LIZIZ(EnumC1910400zoU enumC1910400zoU) {
        C1910430zoX c1910430zoX;
        C1910430zoX c1910430zoX2;
        C1910410zoV c1910410zoV = LLILLJJLI;
        if (c1910410zoV != null && (c1910430zoX = (C1910430zoX) ((HashMap) c1910410zoV.LIZJ).get(enumC1910400zoU)) != null && c1910430zoX.LIZIZ == 0) {
            C1910410zoV c1910410zoV2 = LLILLJJLI;
            if (c1910410zoV2 != null && (c1910430zoX2 = (C1910430zoX) ((HashMap) c1910410zoV2.LIZJ).get(enumC1910400zoU)) != null && c1910430zoX2.LIZIZ == 0) {
                c1910430zoX2.LIZIZ = System.currentTimeMillis();
            }
            C1910410zoV c1910410zoV3 = LLILLJJLI;
            if (c1910410zoV3 != null && enumC1910400zoU == EnumC1910400zoU.ON_VIEW_CREATED) {
                c1910410zoV3.LIZIZ = System.currentTimeMillis() - c1910410zoV3.LIZ;
            }
        }
    }

    public static final void LIZLLL(EnumC1910400zoU enumC1910400zoU) {
        C1910410zoV c1910410zoV;
        Map<EnumC1910400zoU, C1910430zoX> map;
        C1910410zoV c1910410zoV2 = LLILLJJLI;
        if ((c1910410zoV2 == null || (map = c1910410zoV2.LIZJ) == null || !((HashMap) map).containsKey(enumC1910400zoU)) && (c1910410zoV = LLILLJJLI) != null) {
            ((HashMap) c1910410zoV.LIZJ).put(enumC1910400zoU, new C1910430zoX());
        }
    }
}
