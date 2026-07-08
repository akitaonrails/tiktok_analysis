package X;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: X.0jkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293110jkr extends AbstractC1293590jld<PointF> {
    public final PointF LJI;

    public C1293110jkr(List<C1293200jl0<PointF>> list) {
        super(list);
        this.LJI = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1293310jlB
    public final Object LJFF(C1293200jl0 c1293200jl0, float f) {
        T t;
        T t2 = c1293200jl0.LIZIZ;
        if (t2 != 0 && (t = c1293200jl0.LIZJ) != 0) {
            PointF pointF = (PointF) t2;
            PointF pointF2 = (PointF) t;
            C1292420jjk<A> c1292420jjk = this.LJ;
            if (c1292420jjk != 0) {
                c1293200jl0.LJFF.floatValue();
                LIZLLL();
                return c1292420jjk.LIZ(pointF, pointF2);
            }
            PointF pointF3 = this.LJI;
            float f2 = pointF.x;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            pointF3.set(f3, f4 + (f * (pointF2.y - f4)));
            return this.LJI;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
