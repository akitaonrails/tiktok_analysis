package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0jPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279710jPF {
    public static final C1279710jPF LIZ = new C1279710jPF();
    public static volatile EnumC1284930jXf LIZIZ;

    public final synchronized void LIZ(EnumC1284930jXf enumC1284930jXf) {
        SystemClock.elapsedRealtime();
        if (enumC1284930jXf != EnumC1284930jXf.PAGE_ENTERED && LIZIZ != null) {
            EnumC1284930jXf enumC1284930jXf2 = LIZIZ;
            if (enumC1284930jXf2 != null) {
                enumC1284930jXf2.getTag();
            }
            enumC1284930jXf.getTag();
            LIZIZ = enumC1284930jXf;
            return;
        }
        LIZIZ = enumC1284930jXf;
    }
}
