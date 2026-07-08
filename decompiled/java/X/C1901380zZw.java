package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0zZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901380zZw {
    public static final C1901380zZw LIZ = new C1901380zZw();
    public static boolean LIZIZ = true;
    public static volatile AtomicInteger LIZJ = new AtomicInteger(0);

    public static boolean LIZ() {
        return LIZJ.get() == 1;
    }

    public static void LIZIZ() {
        for (EnumC1901370zZv enumC1901370zZv : EnumC1901370zZv.values()) {
            synchronized (enumC1901370zZv) {
                enumC1901370zZv.LLILLL.LIZ = 0L;
                enumC1901370zZv.LLILLL.LIZIZ = 0L;
                enumC1901370zZv.LLILZ.LIZ = -1;
            }
        }
        LIZJ.set(0);
    }
}
