package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385640mA6 implements InterfaceC1367540lgu {
    public final char LIZ;
    public final Map<String, Object> LIZIZ;

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> LIZIZ() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("matcher_type", "post_delimiter"), new Pair("delimiter", Character.valueOf(this.LIZ)));
        Map<String, Object> map = this.LIZIZ;
        if (map != null) {
            mapLJIIJ.put("event_tracking", map);
        }
        return mapLJIIJ;
    }

    public final String toString() {
        return "post_delimiter";
    }

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> getEventTracking() {
        return this.LIZIZ;
    }

    public C1385640mA6(char c, Map<String, ? extends Object> map) {
        this.LIZ = c;
        this.LIZIZ = map;
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
            char c = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c);
            sbLIZ.append(str);
            int iLJJJ = a0.LJJJ(str2, C2188811AlT.LIZIZ(sbLIZ), 0, true, 2);
            if (iLJJJ != -1) {
                int i = iLJJJ + 1;
                return new C1369340ljo(1.0d, Collections.singletonList(new IntRange(i, (str.length() + i) - 1)));
            }
            return new C1369340ljo(0.0d, C13BV.INSTANCE);
        }
        return new C1369340ljo(0.0d, C13BV.INSTANCE);
    }
}
