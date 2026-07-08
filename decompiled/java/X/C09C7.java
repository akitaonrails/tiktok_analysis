package X;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: X.09C7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09C7 {
    public static final Queue<StringBuilder> LIZ = new ArrayBlockingQueue(((Number) C306890C1f.LIZIZ.getValue()).intValue());
    public static final long LIZIZ = (((long) ((Number) C306890C1f.LIZJ.getValue()).intValue()) * 1024) / 2;

    public static StringBuilder LIZ() {
        StringBuilder sb = (StringBuilder) ((ArrayBlockingQueue) LIZ).poll();
        return sb != null ? sb : new StringBuilder(((Number) C306890C1f.LIZLLL.getValue()).intValue());
    }
}
