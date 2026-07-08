package X;

import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21636919m3 {
    public final boolean LIZ;
    public final float LIZIZ;
    public final RectF LIZJ;
    public final List<Integer> LIZLLL;
    public final float LJ;
    public final float LJFF;

    public C21636919m3() {
        this(null, null, 0.0f, 0.0f, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21636919m3)) {
            return false;
        }
        C21636919m3 c21636919m3 = (C21636919m3) obj;
        return this.LIZ == c21636919m3.LIZ && Float.compare(this.LIZIZ, c21636919m3.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c21636919m3.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21636919m3.LIZLLL) && Float.compare(this.LJ, c21636919m3.LJ) == 0 && Float.compare(this.LJFF, c21636919m3.LJFF) == 0;
    }

    public static C21636919m3 LIZ(C21636919m3 c21636919m3) {
        float f = c21636919m3.LIZIZ;
        RectF rectF = c21636919m3.LIZJ;
        List<Integer> list = c21636919m3.LIZLLL;
        float f2 = c21636919m3.LJ;
        float f3 = c21636919m3.LJFF;
        c21636919m3.getClass();
        return new C21636919m3(false, f, rectF, list, f2, f3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21636919m3(RectF rectF, List list, float f, float f2, int i) {
        float f3;
        float f4 = f2;
        float f5 = f;
        List list2 = list;
        RectF rectF2 = rectF;
        if ((i & 2) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        this(false, f3, (i & 4) != 0 ? new RectF() : rectF2, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? 2.0f : f5, (i & 32) != 0 ? 5.0f : f4);
    }

    public C21636919m3(boolean z, float f, RectF rectF, List<Integer> list, float f2, float f3) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = rectF;
        this.LIZLLL = list;
        this.LJ = f2;
        this.LJFF = f3;
    }
}
