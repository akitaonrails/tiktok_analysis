package X;

import android.graphics.RectF;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21637019m4 {
    public final boolean LIZ;
    public final float LIZIZ;
    public final RectF LIZJ;
    public final List<Integer> LIZLLL;
    public final float LJ;

    public C21637019m4() {
        this(null, 0.0f, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21637019m4)) {
            return false;
        }
        C21637019m4 c21637019m4 = (C21637019m4) obj;
        return this.LIZ == c21637019m4.LIZ && Float.compare(this.LIZIZ, c21637019m4.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c21637019m4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c21637019m4.LIZLLL) && Float.compare(this.LJ, c21637019m4.LJ) == 0;
    }

    public C21637019m4(List list, float f, int i) {
        float f2;
        RectF rectF;
        float f3 = f;
        List list2 = list;
        if ((i & 2) != 0) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            rectF = new RectF();
        } else {
            rectF = null;
        }
        this(false, f2, rectF, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? 2.0f : f3);
    }

    public C21637019m4(boolean z, float f, RectF rectF, List<Integer> list, float f2) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = rectF;
        this.LIZLLL = list;
        this.LJ = f2;
    }

    public static C21637019m4 LIZ(C21637019m4 c21637019m4, boolean z, float f, RectF rectF, List list, int i) {
        float f2;
        List list2 = list;
        RectF rectF2 = rectF;
        float f3 = f;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c21637019m4.LIZ;
        }
        if ((i & 2) != 0) {
            f3 = c21637019m4.LIZIZ;
        }
        if ((i & 4) != 0) {
            rectF2 = c21637019m4.LIZJ;
        }
        if ((i & 8) != 0) {
            list2 = c21637019m4.LIZLLL;
        }
        if ((i & 16) != 0) {
            f2 = c21637019m4.LJ;
        } else {
            f2 = 0.0f;
        }
        c21637019m4.getClass();
        return new C21637019m4(z2, f3, rectF2, list2, f2);
    }
}
