package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0y22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841920y22 {
    public static void LIZ(String str, boolean z) {
        Function2<String, Boolean, Unit> andSet = C1841890y1z.LLILLL.getAndSet(null);
        if (andSet == null) {
            return;
        }
        Runnable andSet2 = C1841890y1z.LLILZ.getAndSet(null);
        if (andSet2 != null) {
            C1841890y1z.LLILZIL.removeCallbacks(andSet2);
        }
        andSet.invoke(str, Boolean.valueOf(z));
    }
}
