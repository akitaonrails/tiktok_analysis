package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CJI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5544));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5546));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5547));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5545));
    public static final Map<Integer, String> LJ = new LinkedHashMap();

    public static void LIZ() {
        if (((Boolean) LIZLLL.getValue()).booleanValue()) {
            Iterator it2 = ((LinkedHashMap) LJ).keySet().iterator();
            while (it2.hasNext()) {
                C20673215v0.LJIIIIZZ(((Number) it2.next()).intValue());
            }
        }
    }

    public static final boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }
}
