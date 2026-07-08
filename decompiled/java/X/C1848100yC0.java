package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0yC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848100yC0 {
    public static void LIZ(C1847770yBT c1847770yBT, boolean z, int i, InterfaceC1848370yCR interfaceC1848370yCR) {
        View viewLJFF = c1847770yBT.LJFF();
        if ((viewLJFF == null && !c1847770yBT.LIZJ) || interfaceC1848370yCR.LIZIZ(c1847770yBT, i)) {
            if (z) {
                Iterator it2 = ((ArrayList) c1847770yBT.LJI).iterator();
                while (it2.hasNext()) {
                    LIZ((C1847770yBT) it2.next(), z, i + 1, interfaceC1848370yCR);
                }
            } else {
                for (int size = ((ArrayList) c1847770yBT.LJI).size() - 1; -1 < size; size--) {
                    LIZ((C1847770yBT) ListProtector.get(c1847770yBT.LJI, size), z, i + 1, interfaceC1848370yCR);
                }
            }
        }
        if (viewLJFF != null || c1847770yBT.LIZJ) {
            interfaceC1848370yCR.LIZ(c1847770yBT);
        }
    }
}
