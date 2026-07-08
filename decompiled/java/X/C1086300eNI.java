package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.0eNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086300eNI {
    public static boolean LIZ;
    public static final LinkedList<Object> LIZIZ = new LinkedList<>();

    public static void LIZIZ() {
        LIZ = false;
        LinkedList<Object> linkedList = LIZIZ;
        if (linkedList.isEmpty()) {
            return;
        }
        LIZ = true;
        C784440Upu.LIZ().LIZIZ(linkedList.poll());
    }

    public static void LIZ(Object obj) {
        LinkedList<Object> linkedList = LIZIZ;
        linkedList.offer(obj);
        if (!LIZ && !linkedList.isEmpty()) {
            LIZ = true;
            C784440Upu.LIZ().LIZIZ(linkedList.poll());
        }
    }
}
