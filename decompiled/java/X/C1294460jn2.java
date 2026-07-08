package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294460jn2 {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;

    public final String toString() {
        return C786410Ut5.j4("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(this.LIZJ.x), Float.valueOf(this.LIZJ.y), Float.valueOf(this.LIZ.x), Float.valueOf(this.LIZ.y), Float.valueOf(this.LIZIZ.x), Float.valueOf(this.LIZIZ.y)});
    }

    public C1294460jn2() {
        this.LIZ = new PointF();
        this.LIZIZ = new PointF();
        this.LIZJ = new PointF();
    }

    public C1294460jn2(PointF pointF, PointF pointF2, PointF pointF3) {
        this.LIZ = pointF;
        this.LIZIZ = pointF2;
        this.LIZJ = pointF3;
    }
}
