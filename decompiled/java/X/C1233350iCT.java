package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233350iCT {
    public static void LIZ(Function0 function0, boolean z) {
        long j;
        if (z) {
            j = C1233330iCR.LLJJIII;
        } else {
            j = C1233330iCR.LLJJIJI;
        }
        if (System.currentTimeMillis() - j > 500) {
            function0.invoke();
        }
        if (z) {
            C1233330iCR.LLJJIII = System.currentTimeMillis();
        } else {
            C1233330iCR.LLJJIJI = System.currentTimeMillis();
        }
    }
}
