package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.08NB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NB {
    public static LinkedBlockingQueue<C1887307aJ> LIZ = new LinkedBlockingQueue<>(10);

    public static String LIZ(C1887307aJ c1887307aJ) {
        LinkedBlockingQueue<C1887307aJ> linkedBlockingQueue = LIZ;
        if (linkedBlockingQueue != null && !linkedBlockingQueue.isEmpty()) {
            StringBuilder sb = new StringBuilder(c1887307aJ.LL);
            ArrayList arrayList = new ArrayList();
            for (C1887307aJ c1887307aJ2 : LIZ) {
                if (c1887307aJ2 != null) {
                    arrayList.add(c1887307aJ2);
                }
            }
            Collections.sort(arrayList);
            int iMin = Math.min(3, arrayList.size());
            for (int i = 0; i < iMin - 1; i++) {
                if (ListProtector.get(arrayList, i) != null) {
                    sb.append("\n");
                    sb.append(((C1887307aJ) ListProtector.get(arrayList, i)).LL);
                }
            }
            return sb.toString();
        }
        return c1887307aJ.LL;
    }
}
