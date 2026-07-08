package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0yD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848720yD0 {
    public final HashMap<String, C1848730yD1> LIZ = new HashMap<>();
    public final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();
    public int LIZJ;

    public final List<C443120HZe<String, String, String>> LIZ() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C1848730yD1> entry : this.LIZ.entrySet()) {
            String key = entry.getKey();
            C1848730yD1 value = entry.getValue();
            if (value.LIZLLL) {
                arrayList.add(new C443120HZe(key, value.LIZ, value.LIZIZ));
                value.LIZLLL = false;
            }
        }
        return arrayList;
    }

    public final List<C443120HZe<String, String, String>> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.LIZJ <= 262144 && this.LIZ.size() <= 64) {
                return arrayList;
            }
            Object objLJJJJZ = C13LP.LJJJJZ(this.LIZIZ);
            this.LIZIZ.remove(objLJJJJZ);
            C1848730yD1 c1848730yD1Remove = this.LIZ.remove(objLJJJJZ);
            if (c1848730yD1Remove != null) {
                this.LIZJ -= c1848730yD1Remove.LIZJ;
                if (c1848730yD1Remove.LIZLLL) {
                    arrayList.add(new C443120HZe(objLJJJJZ, c1848730yD1Remove.LIZ, c1848730yD1Remove.LIZIZ));
                }
            }
        }
    }

    public static void LIZJ(C1848720yD0 c1848720yD0, String str, String str2, String str3) {
        c1848720yD0.getClass();
        int length = str2.getBytes(Charsets.UTF_8).length;
        C1848730yD1 c1848730yD1 = c1848720yD0.LIZ.get(str);
        if (c1848730yD1 != null) {
            c1848720yD0.LIZJ += length - c1848730yD1.LIZJ;
            c1848730yD1.LIZ = str2;
            c1848730yD1.LIZIZ = str3;
            c1848730yD1.LIZJ = length;
            c1848730yD1.LIZLLL = true;
            c1848720yD0.LIZIZ.remove(str);
            c1848720yD0.LIZIZ.add(str);
            return;
        }
        c1848720yD0.LIZ.put(str, new C1848730yD1(length, str2, str3));
        c1848720yD0.LIZJ += length;
        c1848720yD0.LIZIZ.add(str);
    }
}
