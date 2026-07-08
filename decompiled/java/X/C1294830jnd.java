package X;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294830jnd extends C1294810jnb<PointF> {
    public Path LJIILLIIL;
    public final C1294810jnb<PointF> LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        T t;
        T t2;
        T t3 = this.LIZJ;
        boolean z = (t3 == 0 || (t2 = this.LIZIZ) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.LIZIZ;
        if (t4 == 0 || (t = this.LIZJ) == 0 || z) {
            return;
        }
        PointF pointF = (PointF) t4;
        PointF pointF2 = (PointF) t;
        C1294810jnb<PointF> c1294810jnb = this.LJIIZILJ;
        PointF pointF3 = c1294810jnb.LJIILJJIL;
        PointF pointF4 = c1294810jnb.LJIILL;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.LJIILLIIL = path;
    }

    public C1294830jnd(C1294720jnS c1294720jnS, C1294810jnb<PointF> c1294810jnb) {
        super(c1294720jnS, c1294810jnb.LIZIZ, c1294810jnb.LIZJ, c1294810jnb.LIZLLL, c1294810jnb.LJ, c1294810jnb.LJFF, c1294810jnb.LJI, c1294810jnb.LJII);
        this.LJIIZILJ = c1294810jnb;
        LIZLLL();
    }
}
