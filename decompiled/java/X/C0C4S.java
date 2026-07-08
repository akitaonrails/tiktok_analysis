package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0C4S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4S {
    public static List<String> LIZIZ() {
        Map<String, ?> all = C0C4X.LIZJ.LIZ.getAll();
        if (all == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (key != null && key.endsWith("_vid_suffix")) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public static void LIZ(String str) {
        C0C4X c0c4x = C0C4X.LIZJ;
        c0c4x.getClass();
        InterfaceC292790Bdl interfaceC292790Bdl = C0C5A.LIZJ().LJ;
        if (interfaceC292790Bdl != null && interfaceC292790Bdl.LIZLLL()) {
            if (c0c4x.LIZ.contains(str)) {
                c0c4x.LIZ.LIZ(str);
                return;
            }
            return;
        }
        c0c4x.LIZ.LIZ(str);
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_vid_suffix");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
