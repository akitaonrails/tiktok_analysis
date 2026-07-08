package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293190jkz extends C1293200jl0<PointF> {
    public Path LJIIJ;
    public final C1293200jl0<PointF> LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        T t;
        T t2 = this.LIZJ;
        boolean z = (t2 == 0 || (t = this.LIZIZ) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.LIZJ;
        if (t3 == 0 || z) {
            return;
        }
        PointF pointF = (PointF) this.LIZIZ;
        PointF pointF2 = (PointF) t3;
        C1293200jl0<PointF> c1293200jl0 = this.LJIIJJI;
        PointF pointF3 = c1293200jl0.LJIIIIZZ;
        PointF pointF4 = c1293200jl0.LJIIIZ;
        PathMeasure pathMeasure = C1293420jlM.LIZ;
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
        this.LJIIJ = path;
    }

    public C1293190jkz(C1291600jiQ c1291600jiQ, C1293200jl0<PointF> c1293200jl0) {
        super(c1291600jiQ, c1293200jl0.LIZIZ, c1293200jl0.LIZJ, c1293200jl0.LIZLLL, c1293200jl0.LJ, c1293200jl0.LJFF);
        this.LJIIJJI = c1293200jl0;
        LIZLLL();
    }
}
