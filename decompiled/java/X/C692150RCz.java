package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692150RCz {
    public static final C0RD2<C692090RCt> LJ = new C0RD2<>(30, AFwS198S0000000_11.get$arr$(274));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(278));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(275));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(277));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(276));

    public final void LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(((C0RD3) this.LIZIZ.getValue()).LIZ());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(((C0RD3) ((C692140RCy) this.LIZIZ.getValue()).LIZIZ.getValue()).LIZ());
        for (C692090RCt c692090RCt : ((Map) this.LIZJ.getValue()).values()) {
            if (c692090RCt.LIZIZ == null) {
                c692090RCt.LIZIZ = new Pair<>(linkedHashMap, linkedHashMap2);
            }
        }
        for (C692090RCt c692090RCt2 : (List) this.LIZLLL.getValue()) {
            if (c692090RCt2.LIZIZ == null) {
                c692090RCt2.LIZIZ = new Pair<>(linkedHashMap, linkedHashMap2);
            }
        }
    }
}
