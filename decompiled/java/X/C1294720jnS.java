package X;

import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294720jnS {
    public Map<String, List<C1294730jnT>> LIZJ;
    public Map<String, C1294320jmo> LIZLLL;
    public Map<String, C1294400jmw> LJ;
    public List<C1295850jpH> LJFF;
    public C1119470fEn<C1295700jp2> LJI;
    public C20066713fN<C1294730jnT> LJII;
    public List<C1294730jnT> LJIIIIZZ;
    public Rect LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public boolean LJIILIIL;
    public final C1295560joo LIZ = new C1295560joo();
    public final HashSet<String> LIZIZ = new HashSet<>();
    public int LJIILJJIL = 0;

    public final float LIZIZ() {
        return (long) (((this.LJIIJJI - this.LJIIJ) / this.LJIIL) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C1294730jnT> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().LIZ("\t"));
        }
        return sb.toString();
    }

    public final void LIZ(String str) {
        C1292050jj9.LIZIZ(str);
        this.LIZIZ.add(str);
    }

    public final C1295850jpH LIZJ(String str) {
        int size = this.LJFF.size();
        for (int i = 0; i < size; i++) {
            C1295850jpH c1295850jpH = (C1295850jpH) ListProtector.get(this.LJFF, i);
            if (!c1295850jpH.LIZ.equalsIgnoreCase(str)) {
                if (c1295850jpH.LIZ.endsWith("\r")) {
                    String str2 = c1295850jpH.LIZ;
                    if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                    }
                }
            }
            return c1295850jpH;
        }
        return null;
    }
}
