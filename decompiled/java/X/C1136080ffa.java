package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136080ffa {
    public static final C1136090ffb LIZ = new C1136090ffb(true);
    public static final C1136090ffb LIZIZ = new C1136090ffb(false);

    public static Map LIZIZ() {
        HashMap map = new HashMap();
        C1136090ffb c1136090ffb = LIZ;
        int i = c1136090ffb.LIZIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        map.put("queue_size", String.valueOf(i + c1136090ffb2.LIZIZ));
        map.put("self_queue_size", String.valueOf(c1136090ffb.LIZIZ));
        map.put("others_queue_size", String.valueOf(c1136090ffb2.LIZIZ));
        map.put("queue_node_count", String.valueOf(c1136090ffb.LIZJ + c1136090ffb2.LIZJ));
        map.put("self_queue_node_count", String.valueOf(c1136090ffb.LIZJ));
        map.put("others_queue_node_count", String.valueOf(c1136090ffb2.LIZJ));
        map.put("small_gift_node_count", String.valueOf(c1136090ffb.LIZLLL + c1136090ffb2.LIZLLL));
        map.put("71_5200_node_count", String.valueOf(c1136090ffb.LJ + c1136090ffb2.LJ));
        map.put("5201_30000_node_count", String.valueOf(c1136090ffb.LJFF + c1136090ffb2.LJFF));
        map.put("more_than_30000_node_count", String.valueOf(c1136090ffb.LJI + c1136090ffb2.LJI));
        map.put("sticker_gift_count", String.valueOf(c1136090ffb.LJII + c1136090ffb2.LJII));
        return map;
    }

    public static void LJII() {
        Map<String, Object> map = C1338270kvh.LIZ;
        LIZ(true);
        LIZ(false);
    }

    public static void LIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dump\n");
        C1136090ffb c1136090ffb = LIZ;
        Map<String, Object> map = C1338270kvh.LIZ;
        sbLIZ.append("");
        sbLIZ.append('\n');
        C1136090ffb c1136090ffb2 = LIZIZ;
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            c1136090ffb.LIZIZ = 0;
            c1136090ffb.LIZJ = 0;
            c1136090ffb.LIZLLL = 0;
            c1136090ffb.LJ = 0;
            c1136090ffb.LJFF = 0;
            c1136090ffb.LJI = 0;
            c1136090ffb.LJII = 0;
            return;
        }
        c1136090ffb2.LIZIZ = 0;
        c1136090ffb2.LIZJ = 0;
        c1136090ffb2.LIZLLL = 0;
        c1136090ffb2.LJ = 0;
        c1136090ffb2.LJFF = 0;
        c1136090ffb2.LJI = 0;
        c1136090ffb2.LJII = 0;
    }

    public static void LIZJ(JSONObject jSONObject) {
        C1136090ffb c1136090ffb = LIZ;
        int i = c1136090ffb.LIZIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        jSONObject.put("queue_size", i + c1136090ffb2.LIZIZ);
        jSONObject.put("self_queue_size", c1136090ffb.LIZIZ);
        jSONObject.put("others_queue_size", c1136090ffb2.LIZIZ);
        jSONObject.put("queue_node_count", c1136090ffb.LIZJ + c1136090ffb2.LIZJ);
        jSONObject.put("self_queue_node_count", c1136090ffb.LIZJ);
        jSONObject.put("others_queue_node_count", c1136090ffb2.LIZJ);
        jSONObject.put("small_gift_node_count", c1136090ffb.LIZLLL + c1136090ffb2.LIZLLL);
        jSONObject.put("70_5200_node_count", c1136090ffb.LJ + c1136090ffb2.LJ);
        jSONObject.put("5200_30000_node_count", c1136090ffb.LJFF + c1136090ffb2.LJFF);
        jSONObject.put("more_than_30000_node_count", c1136090ffb.LJI + c1136090ffb2.LJI);
        jSONObject.put("sticker_gift_count", c1136090ffb.LJII + c1136090ffb2.LJII);
    }

    public static void LIZLLL(InterfaceC1136020ffU interfaceC1136020ffU, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C1136090ffb c1136090ffb = LIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        if (z) {
            c1136090ffb.LIZ(interfaceC1136020ffU);
        } else {
            c1136090ffb2.LIZ(interfaceC1136020ffU);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dump\n");
        sbLIZ.append("");
        sbLIZ.append('\n');
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(C1135810ff9 c1135810ff9, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C1136090ffb c1136090ffb = LIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        if (z) {
            c1136090ffb.LIZIZ(c1135810ff9);
        } else {
            c1136090ffb2.LIZIZ(c1135810ff9);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dump\n");
        sbLIZ.append("");
        sbLIZ.append('\n');
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(InterfaceC1136020ffU interfaceC1136020ffU, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C1136090ffb c1136090ffb = LIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        if (z) {
            c1136090ffb.LIZJ(interfaceC1136020ffU);
        } else {
            c1136090ffb2.LIZJ(interfaceC1136020ffU);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dump\n");
        sbLIZ.append("");
        sbLIZ.append('\n');
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJI(C1135810ff9 c1135810ff9, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C1136090ffb c1136090ffb = LIZ;
        C1136090ffb c1136090ffb2 = LIZIZ;
        if (z) {
            c1136090ffb.LIZLLL(c1135810ff9);
        } else {
            c1136090ffb2.LIZLLL(c1135810ff9);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dump\n");
        sbLIZ.append("");
        sbLIZ.append('\n');
        sbLIZ.append("");
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
