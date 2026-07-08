package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0yBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848060yBw {
    public static C1848070yBx LIZ(C1847770yBT c1847770yBT, C1847740yBQ c1847740yBQ, View view, boolean z) {
        C1848070yBx c1848070yBxRemoveFirst;
        LinkedList<C1848070yBx> linkedList = C1848070yBx.LJ;
        if (linkedList.size() <= 0) {
            c1848070yBxRemoveFirst = new C1848070yBx(c1847770yBT);
        } else {
            c1848070yBxRemoveFirst = linkedList.removeFirst();
        }
        c1848070yBxRemoveFirst.LIZ = c1847770yBT;
        c1848070yBxRemoveFirst.LIZIZ = c1847740yBQ;
        c1848070yBxRemoveFirst.LIZJ = new WeakReference<>(view);
        c1848070yBxRemoveFirst.LIZLLL = z;
        return c1848070yBxRemoveFirst;
    }
}
