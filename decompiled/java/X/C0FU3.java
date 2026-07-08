package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FU3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FU3 {
    public final List<C0FU6> LIZ;
    public final boolean LIZIZ;
    public final PointF LIZJ;
    public final boolean LIZLLL;

    public C0FU3() {
        this(0);
    }

    public /* synthetic */ C0FU3(int i) {
        this(new ArrayList(), false, new PointF(), true);
    }

    public C0FU3(List<C0FU6> list, boolean z, PointF pointF, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = pointF;
        this.LIZLLL = z2;
    }

    public static C0FU3 LIZ(C0FU3 c0fu3, List list, boolean z, PointF pointF, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = c0fu3.LIZ;
        }
        if ((i & 2) != 0) {
            z = c0fu3.LIZIZ;
        }
        if ((i & 4) != 0) {
            pointF = c0fu3.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c0fu3.LIZLLL;
        }
        c0fu3.getClass();
        return new C0FU3(list, z, pointF, z2);
    }
}
