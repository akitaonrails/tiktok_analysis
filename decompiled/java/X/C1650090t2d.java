package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650090t2d {
    public static final C830490Whz<String, C1653210t7f> LIZIZ;
    public final C830490Whz<String, Boolean> LIZ = new C830490Whz<>();

    static {
        new C1653260t7k();
        LIZIZ = new C830490Whz<>();
    }

    public final void LIZ(int i, long j, String str, boolean z) {
        if (z && Intrinsics.LJFF(this.LIZ.get(str), Boolean.TRUE)) {
            return;
        }
        this.LIZ.put(str, Boolean.TRUE);
        C1653260t7k.LIZLLL(null, j, i, str);
    }
}
