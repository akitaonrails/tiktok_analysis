package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385620mA4 implements InterfaceC1367540lgu {
    public final Map<String, Object> LIZ;

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> LIZIZ() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("matcher_type", "prefix"));
        Map<String, Object> map = this.LIZ;
        if (map != null) {
            mapLJIIJ.put("event_tracking", map);
        }
        return mapLJIIJ;
    }

    public final String toString() {
        return "prefix";
    }

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> getEventTracking() {
        return this.LIZ;
    }

    public C1385620mA4(Map<String, ? extends Object> map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC1367540lgu
    public final C1369340ljo LIZ(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str2.length() != 0) {
            if (u.LJJIIJZLJL(str2, str, true)) {
                return new C1369340ljo(1.0d, Collections.singletonList(new IntRange(0, str.length() - 1)));
            }
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        return new C1369340ljo(0.0d, C13BV.INSTANCE);
    }
}
