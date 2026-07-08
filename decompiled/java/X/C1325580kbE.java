package X;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.0kbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325580kbE extends ArrayDeque<Runnable> {
    @Override // java.util.ArrayDeque, java.util.Deque
    public final Object pop() {
        Runnable runnable = (Runnable) super.pop();
        if (runnable instanceof AbstractC1327310ke1) {
            AbstractC1327310ke1 abstractC1327310ke1 = (AbstractC1327310ke1) runnable;
            if (abstractC1327310ke1.LLILZLL > 0) {
                abstractC1327310ke1.LLIZ = SystemClock.elapsedRealtime() - abstractC1327310ke1.LLILZLL;
            }
        }
        return runnable;
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        Runnable runnable = (Runnable) obj;
        if (runnable instanceof AbstractC1327310ke1) {
            AbstractC1327310ke1 abstractC1327310ke1 = (AbstractC1327310ke1) runnable;
            abstractC1327310ke1.getClass();
            abstractC1327310ke1.LLILZLL = SystemClock.elapsedRealtime();
        }
        return super.add(runnable);
    }
}
