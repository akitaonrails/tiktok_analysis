package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293070jkn extends AbstractC1293220jl2<C1293350jlF, Path> {
    @Override // X.InterfaceC1293620jlg
    public final AbstractC1293310jlB<C1293350jlF, Path> LIZ() {
        final List<C1293200jl0<V>> list = this.LIZ;
        return new AbstractC1293310jlB<C1293350jlF, Path>(list) { // from class: X.0jlA
            public final C1293350jlF LJI = new C1293350jlF();
            public final Path LJII = new Path();

            @Override // X.AbstractC1293310jlB
            public final Path LJFF(C1293200jl0<C1293350jlF> c1293200jl0, float f) {
                boolean z;
                C1293350jlF c1293350jlF = c1293200jl0.LIZIZ;
                C1293350jlF c1293350jlF2 = c1293200jl0.LIZJ;
                C1293350jlF c1293350jlF3 = this.LJI;
                if (c1293350jlF3.LIZIZ == null) {
                    c1293350jlF3.LIZIZ = new PointF();
                }
                if (!c1293350jlF.LIZJ && !c1293350jlF2.LIZJ) {
                    z = false;
                } else {
                    z = true;
                }
                c1293350jlF3.LIZJ = z;
                if (((ArrayList) c1293350jlF.LIZ).size() != ((ArrayList) c1293350jlF2.LIZ).size()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Curves must have the same number of control points. Shape 1: ");
                    sbLIZ.append(((ArrayList) c1293350jlF.LIZ).size());
                    sbLIZ.append("\tShape 2: ");
                    sbLIZ.append(((ArrayList) c1293350jlF2.LIZ).size());
                    C1291650jiV.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (((ArrayList) c1293350jlF3.LIZ).isEmpty()) {
                    int iMin = Math.min(((ArrayList) c1293350jlF.LIZ).size(), ((ArrayList) c1293350jlF2.LIZ).size());
                    for (int i = 0; i < iMin; i++) {
                        ((ArrayList) c1293350jlF3.LIZ).add(new C1293660jlk());
                    }
                }
                PointF pointF = c1293350jlF.LIZIZ;
                PointF pointF2 = c1293350jlF2.LIZIZ;
                float f2 = pointF.x;
                float f3 = f2 + ((pointF2.x - f2) * f);
                float f4 = pointF.y;
                float f5 = f4 + ((pointF2.y - f4) * f);
                if (c1293350jlF3.LIZIZ == null) {
                    c1293350jlF3.LIZIZ = new PointF();
                }
                c1293350jlF3.LIZIZ.set(f3, f5);
                for (int size = ((ArrayList) c1293350jlF3.LIZ).size() - 1; size >= 0; size--) {
                    C1293660jlk c1293660jlk = (C1293660jlk) ListProtector.get(c1293350jlF.LIZ, size);
                    C1293660jlk c1293660jlk2 = (C1293660jlk) ListProtector.get(c1293350jlF2.LIZ, size);
                    PointF pointF3 = c1293660jlk.LIZ;
                    PointF pointF4 = c1293660jlk.LIZIZ;
                    PointF pointF5 = c1293660jlk.LIZJ;
                    PointF pointF6 = c1293660jlk2.LIZ;
                    PointF pointF7 = c1293660jlk2.LIZIZ;
                    PointF pointF8 = c1293660jlk2.LIZJ;
                    C1293660jlk c1293660jlk3 = (C1293660jlk) ListProtector.get(c1293350jlF3.LIZ, size);
                    float f6 = pointF3.x;
                    float f7 = f6 + ((pointF6.x - f6) * f);
                    float f8 = pointF3.y;
                    c1293660jlk3.LIZ.set(f7, f8 + ((pointF6.y - f8) * f));
                    C1293660jlk c1293660jlk4 = (C1293660jlk) ListProtector.get(c1293350jlF3.LIZ, size);
                    float f9 = pointF4.x;
                    float f10 = f9 + ((pointF7.x - f9) * f);
                    float f11 = pointF4.y;
                    c1293660jlk4.LIZIZ.set(f10, f11 + ((pointF7.y - f11) * f));
                    C1293660jlk c1293660jlk5 = (C1293660jlk) ListProtector.get(c1293350jlF3.LIZ, size);
                    float f12 = pointF5.x;
                    float f13 = f12 + ((pointF8.x - f12) * f);
                    float f14 = pointF5.y;
                    c1293660jlk5.LIZJ.set(f13, f14 + ((pointF8.y - f14) * f));
                }
                C1293350jlF c1293350jlF4 = this.LJI;
                Path path = this.LJII;
                path.reset();
                PointF pointF9 = c1293350jlF4.LIZIZ;
                path.moveTo(pointF9.x, pointF9.y);
                PointF pointF10 = new PointF(pointF9.x, pointF9.y);
                for (int i2 = 0; i2 < ((ArrayList) c1293350jlF4.LIZ).size(); i2++) {
                    C1293660jlk c1293660jlk6 = (C1293660jlk) ListProtector.get(c1293350jlF4.LIZ, i2);
                    PointF pointF11 = c1293660jlk6.LIZ;
                    PointF pointF12 = c1293660jlk6.LIZIZ;
                    PointF pointF13 = c1293660jlk6.LIZJ;
                    if (pointF11.equals(pointF10) && pointF12.equals(pointF13)) {
                        path.lineTo(pointF13.x, pointF13.y);
                    } else {
                        path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
                    }
                    pointF10.set(pointF13.x, pointF13.y);
                }
                if (c1293350jlF4.LIZJ) {
                    path.close();
                }
                return this.LJII;
            }
        };
    }

    public C1293070jkn(List<C1293200jl0<C1293350jlF>> list) {
        super((List) list);
    }
}
