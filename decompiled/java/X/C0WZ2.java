package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0WZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZ2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, C0WZ4 c0wz4) {
        CopyOnWriteArrayList<C0WZ9> copyOnWriteArrayList;
        C0WZ7 c0wz7 = C0WZ7.LIZLLL;
        c0wz7.getClass();
        int i = C0WZ3.LIZ[c0wz4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c0wz7.LIZ.addAll(list);
                    copyOnWriteArrayList = c0wz7.LIZIZ;
                } else {
                    return;
                }
            } else {
                copyOnWriteArrayList = c0wz7.LIZIZ;
            }
        } else {
            copyOnWriteArrayList = c0wz7.LIZ;
        }
        copyOnWriteArrayList.addAll(list);
    }
}
