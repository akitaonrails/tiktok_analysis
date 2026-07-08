package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0ifO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251280ifO {
    public static final C1251280ifO LIZ = new C1251280ifO();

    public static final void LIZ(String str, Map<String, String> map) {
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event=");
        sbLIZ.append(str);
        sbLIZ.append(", params: ");
        if (map == null || (string = map.toString()) == null) {
            string = "null";
        }
        sbLIZ.append(string);
        C1248210iaR.LJ("EventTracker", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.ET, "track");
        C20684815ws.LJIILLIIL(str, map);
    }
}
