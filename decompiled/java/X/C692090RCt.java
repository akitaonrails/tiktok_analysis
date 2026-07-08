package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692090RCt {
    public Pair<? extends Map<String, String>, ? extends Map<String, String>> LIZIZ;
    public List<String> LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(283));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(282));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(281));
    public String LJFF = "";
    public String LJI = "";

    public final void LIZIZ(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (C692100RCu.LIZIZ.contains(key)) {
                ((C0RD3) this.LIZLLL.getValue()).LIZ().put(key, value);
            } else {
                ((C0RD3) this.LJ.getValue()).LIZ().put(key, value);
            }
        }
    }

    public final void LIZ(String str, String str2) {
        if (C692100RCu.LIZIZ.contains(str)) {
            ((C0RD3) this.LIZLLL.getValue()).LIZ().put(str, str2);
        } else {
            ((C0RD3) this.LJ.getValue()).LIZ().put(str, str2);
        }
    }
}
