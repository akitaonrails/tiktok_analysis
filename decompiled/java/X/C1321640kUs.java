package X;

import android.os.Trace;

/* JADX INFO: renamed from: X.0kUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321640kUs {
    public static boolean LIZ;

    public static void LIZIZ() {
        if (LIZ) {
            Trace.endSection();
        }
    }

    public static void LIZ(String str) {
        if (!LIZ) {
            return;
        }
        Trace.beginSection(str);
    }
}
