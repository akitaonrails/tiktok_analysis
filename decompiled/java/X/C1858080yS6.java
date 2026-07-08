package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858080yS6 {
    public static final C1858080yS6 LIZ = new C1858080yS6();
    public static volatile String LIZIZ;

    public final synchronized void LIZ(String str) {
        if (str != null) {
            if (!a0.LJJJIL(str) && LIZIZ == null) {
                LIZIZ = str;
            }
        }
    }
}
