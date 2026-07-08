package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0tM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662190tM9 {
    public final boolean LIZ;
    public final Rect LIZIZ;
    public final boolean LIZJ;

    public C1662190tM9() {
        this(0);
    }

    public /* synthetic */ C1662190tM9(int i) {
        this(true, null, true);
    }

    public C1662190tM9(boolean z, Rect rect, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = rect;
        this.LIZJ = z2;
    }

    public static C1662190tM9 LIZ(C1662190tM9 c1662190tM9, boolean z, Rect rect, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c1662190tM9.LIZ;
        }
        if ((i & 2) != 0) {
            rect = c1662190tM9.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c1662190tM9.LIZJ;
        }
        c1662190tM9.getClass();
        return new C1662190tM9(z, rect, z2);
    }
}
