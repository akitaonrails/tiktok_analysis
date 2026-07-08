package X;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WTS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTS<T> implements Comparator {
    public static final C0WTS<T> LL = new C0WTS<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0WTR c0wtr;
        Runnable runnable = (Runnable) obj;
        Runnable runnable2 = (Runnable) obj2;
        C0WTR c0wtr2 = null;
        if (runnable instanceof C0WTR) {
            c0wtr = (C0WTR) runnable;
        } else {
            c0wtr = null;
        }
        if (runnable2 instanceof C0WTR) {
            c0wtr2 = (C0WTR) runnable2;
        }
        if (c0wtr != null) {
            if (c0wtr2 != null) {
                int iLJI = Intrinsics.LJI(c0wtr.LL.getValue(), c0wtr2.LL.getValue());
                if (iLJI == 0) {
                    return Intrinsics.LJII(c0wtr.LLILLL, c0wtr2.LLILLL);
                }
                return iLJI;
            }
            return -1;
        }
        if (c0wtr2 != null) {
            return 1;
        }
        return 0;
    }
}
