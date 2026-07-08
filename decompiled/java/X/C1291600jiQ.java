package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291600jiQ {
    public Map<String, List<C1292540jjw>> LIZJ;
    public Map<String, C1290800jh8> LIZLLL;
    public Map<String, C1292900jkW> LJ;
    public C1119470fEn<C1292880jkU> LJFF;
    public C20066713fN<C1292540jjw> LJI;
    public List<C1292540jjw> LJII;
    public Rect LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final C1291010jhT LIZ = new C1291010jhT();
    public final HashSet<String> LIZIZ = new HashSet<>();
    public String LJIILJJIL = "";

    public final float LIZIZ() {
        return (long) (((this.LJIIJ - this.LJIIIZ) / this.LJIIJJI) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C1292540jjw> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().LIZ("\t"));
        }
        return sb.toString();
    }

    public final void LIZ(String str) {
        this.LIZIZ.add(str);
    }
}
