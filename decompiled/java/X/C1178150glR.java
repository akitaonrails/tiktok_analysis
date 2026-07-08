package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0glR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178150glR {
    public final boolean LIZ;
    public final Bitmap LIZIZ;

    public /* synthetic */ C1178150glR() {
        this(null, false);
    }

    public C1178150glR(Bitmap bitmap, boolean z) {
        this.LIZ = z;
        this.LIZIZ = bitmap;
    }

    public static C1178150glR LIZ(C1178150glR c1178150glR, boolean z, Bitmap bitmap, int i) {
        if ((i & 1) != 0) {
            z = c1178150glR.LIZ;
        }
        if ((i & 2) != 0) {
            bitmap = c1178150glR.LIZIZ;
        }
        c1178150glR.getClass();
        return new C1178150glR(bitmap, z);
    }
}
