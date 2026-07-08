package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1D6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250571D6x {
    public static final CopyOnWriteArrayList<InterfaceC2250581D6y> LIZ = new CopyOnWriteArrayList<>();
    public static volatile boolean LIZIZ;

    public static void LIZ(boolean z) {
        if (LIZIZ == z) {
            return;
        }
        LIZIZ = z;
        Iterator<InterfaceC2250581D6y> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(z);
        }
    }
}
