package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143170fr1 {
    public static C1143180fr2 LIZJ;
    public static boolean LIZLLL;
    public static final C1143170fr1 LIZ = new C1143170fr1();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC1131990fYz LJ = RunnableC1131990fYz.LL;

    public static void LIZIZ() {
        C1143180fr2 c1143180fr2 = LIZJ;
        if (c1143180fr2 != null) {
            C1128760fTm.LJIIJ.LJJIJIL(Boolean.valueOf(LIZLLL), c1143180fr2.LJII, c1143180fr2.LJIIJ ? "convenient_gift" : "normal_gift", c1143180fr2.LIZ, c1143180fr2.LJIIIIZZ, c1143180fr2.LJI, c1143180fr2.LJIIIZ, c1143180fr2.LJIIJJI, c1143180fr2.LJIIL, c1143180fr2.LJIILIIL, c1143180fr2.LJIILJJIL, c1143180fr2.LIZIZ, c1143180fr2.LJIILL, c1143180fr2.LJIILLIIL, c1143180fr2.LJIIZILJ, c1143180fr2.LJIJ, c1143180fr2.LJIJI, c1143180fr2.LJIJJ, c1143180fr2.LJIJJLI, c1143180fr2.LJIL, c1143180fr2.LJJ, c1143180fr2.LJJI, c1143180fr2.LJJIFFI, c1143180fr2.LJJII, c1143180fr2.LJJIII, c1143180fr2.LJJIIJ, c1143180fr2.LJJIIJZLJL, c1143180fr2.LJJIIZ, c1143180fr2.LJJIIZI, c1143180fr2.LJJIJ, c1143180fr2.LJJIJIIJI, c1143180fr2.LJJIJIIJIL, c1143180fr2.LJJIJIL, c1143180fr2.LJJIJL, c1143180fr2.LJJIJLIJ, c1143180fr2.LJJIL, c1143180fr2.LJJIZ, c1143180fr2.LJJJ, c1143180fr2.LIZJ, c1143180fr2.LIZLLL, c1143180fr2.LJFF, c1143180fr2.LJJJI, c1143180fr2.LJJJIL, c1143180fr2.LJJJJ, c1143180fr2.LJJJJI, c1143180fr2.LJJJJIZL, c1143180fr2.LJJJJJ, c1143180fr2.LJJJJJL, c1143180fr2.LJJJJL, c1143180fr2.LJJJJLI, c1143180fr2.LJJJJLL, c1143180fr2.LJJJJZ, c1143180fr2.LJJJJZI, c1143180fr2.LJJJLIIL, c1143180fr2.LJJJLL, c1143180fr2.LJJJLZIJ, c1143180fr2.LJJJZ, c1143180fr2.LJJL, c1143180fr2.LJJLI, c1143180fr2.LJJLIIIIJ, c1143180fr2.LJJLIIIJ, c1143180fr2.LJJLIIIJILLIZJL, c1143180fr2.LJJLIIIJJI);
        }
        LIZJ = null;
        LIZLLL = false;
    }

    public static boolean LIZ(C1143180fr2 c1143180fr2, C1143180fr2 c1143180fr22) {
        int size;
        int size2;
        int i;
        if (c1143180fr2 == null || (!C500260Jjc.LJJIJIIJI(c1143180fr2.LJJII) && !C500260Jjc.LJJIJIIJI(c1143180fr22.LJJII))) {
            return true;
        }
        List<String> list = c1143180fr22.LJJII;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        List<String> list2 = c1143180fr2.LJJII;
        if (list2 != null) {
            size2 = list2.size();
        } else {
            size2 = 0;
        }
        if (size != size2) {
            return false;
        }
        List<String> list3 = c1143180fr22.LJJII;
        if (list3 != null) {
            i = 0;
            for (String str : list3) {
                List<String> list4 = c1143180fr2.LJJII;
                if (list4 != null) {
                    Iterator<String> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), str)) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        List<String> list5 = c1143180fr22.LJJII;
        if (list5 != null && i == list5.size()) {
            return true;
        }
        return false;
    }
}
