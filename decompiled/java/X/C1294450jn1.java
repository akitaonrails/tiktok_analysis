package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294450jn1 extends AbstractC1295190joD<C1293780jlw, Path> {
    public final C1293780jlw LJIIIIZZ;
    public final Path LJIIIZ;
    public List<InterfaceC1294480jn4> LJIIJ;

    public C1294450jn1(List<C1294810jnb<C1293780jlw>> list) {
        super(list);
        this.LJIIIIZZ = new C1293780jlw();
        this.LJIIIZ = new Path();
    }

    @Override // X.AbstractC1295190joD
    public final Path LJI(C1294810jnb<C1293780jlw> c1294810jnb, float f) {
        boolean z;
        C1293780jlw c1293780jlw = c1294810jnb.LIZIZ;
        C1293780jlw c1293780jlw2 = c1294810jnb.LIZJ;
        C1293780jlw c1293780jlw3 = this.LJIIIIZZ;
        if (c1293780jlw3.LIZIZ == null) {
            c1293780jlw3.LIZIZ = new PointF();
        }
        if (!c1293780jlw.LIZJ && !c1293780jlw2.LIZJ) {
            z = false;
        } else {
            z = true;
        }
        c1293780jlw3.LIZJ = z;
        if (((ArrayList) c1293780jlw.LIZ).size() != ((ArrayList) c1293780jlw2.LIZ).size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Curves must have the same number of control points. Shape 1: ");
            sbLIZ.append(((ArrayList) c1293780jlw.LIZ).size());
            sbLIZ.append("\tShape 2: ");
            sbLIZ.append(((ArrayList) c1293780jlw2.LIZ).size());
            C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        int iMin = Math.min(((ArrayList) c1293780jlw.LIZ).size(), ((ArrayList) c1293780jlw2.LIZ).size());
        if (((ArrayList) c1293780jlw3.LIZ).size() < iMin) {
            for (int size = ((ArrayList) c1293780jlw3.LIZ).size(); size < iMin; size++) {
                ((ArrayList) c1293780jlw3.LIZ).add(new C1294460jn2());
            }
        } else if (((ArrayList) c1293780jlw3.LIZ).size() > iMin) {
            for (int size2 = ((ArrayList) c1293780jlw3.LIZ).size() - 1; size2 >= iMin; size2--) {
                List<C1294460jn2> list = c1293780jlw3.LIZ;
                ListProtector.remove(list, ((ArrayList) list).size() - 1);
            }
        }
        PointF pointF = c1293780jlw.LIZIZ;
        PointF pointF2 = c1293780jlw2.LIZIZ;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = C1295100jo4.LIZ;
        float f4 = f2 + ((f3 - f2) * f);
        float f5 = pointF.y;
        c1293780jlw3.LIZ(f4, f5 + ((pointF2.y - f5) * f));
        for (int size3 = ((ArrayList) c1293780jlw3.LIZ).size() - 1; size3 >= 0; size3--) {
            C1294460jn2 c1294460jn2 = (C1294460jn2) ListProtector.get(c1293780jlw.LIZ, size3);
            C1294460jn2 c1294460jn22 = (C1294460jn2) ListProtector.get(c1293780jlw2.LIZ, size3);
            PointF pointF4 = c1294460jn2.LIZ;
            PointF pointF5 = c1294460jn2.LIZIZ;
            PointF pointF6 = c1294460jn2.LIZJ;
            PointF pointF7 = c1294460jn22.LIZ;
            PointF pointF8 = c1294460jn22.LIZIZ;
            PointF pointF9 = c1294460jn22.LIZJ;
            C1294460jn2 c1294460jn23 = (C1294460jn2) ListProtector.get(c1293780jlw3.LIZ, size3);
            float f6 = pointF4.x;
            float f7 = f6 + ((pointF7.x - f6) * f);
            float f8 = pointF4.y;
            c1294460jn23.LIZ.set(f7, f8 + ((pointF7.y - f8) * f));
            C1294460jn2 c1294460jn24 = (C1294460jn2) ListProtector.get(c1293780jlw3.LIZ, size3);
            float f9 = pointF5.x;
            float f10 = f9 + ((pointF8.x - f9) * f);
            float f11 = pointF5.y;
            c1294460jn24.LIZIZ.set(f10, f11 + ((pointF8.y - f11) * f));
            C1294460jn2 c1294460jn25 = (C1294460jn2) ListProtector.get(c1293780jlw3.LIZ, size3);
            float f12 = pointF6.x;
            float f13 = f12 + ((pointF9.x - f12) * f);
            float f14 = pointF6.y;
            c1294460jn25.LIZJ.set(f13, f14 + ((pointF9.y - f14) * f));
        }
        C1293780jlw c1293780jlwLJFF = this.LJIIIIZZ;
        List<InterfaceC1294480jn4> list2 = this.LJIIJ;
        if (list2 != null) {
            for (int size4 = list2.size() - 1; size4 >= 0; size4--) {
                c1293780jlwLJFF = ((InterfaceC1294480jn4) ListProtector.get(this.LJIIJ, size4)).LJFF(c1293780jlwLJFF);
            }
        }
        Path path = this.LJIIIZ;
        path.reset();
        PointF pointF10 = c1293780jlwLJFF.LIZIZ;
        path.moveTo(pointF10.x, pointF10.y);
        C1295100jo4.LIZ.set(pointF10.x, pointF10.y);
        for (int i = 0; i < ((ArrayList) c1293780jlwLJFF.LIZ).size(); i++) {
            C1294460jn2 c1294460jn26 = (C1294460jn2) ListProtector.get(c1293780jlwLJFF.LIZ, i);
            PointF pointF11 = c1294460jn26.LIZ;
            PointF pointF12 = c1294460jn26.LIZIZ;
            PointF pointF13 = c1294460jn26.LIZJ;
            PointF pointF14 = C1295100jo4.LIZ;
            if (pointF11.equals(pointF14) && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF14.set(pointF13.x, pointF13.y);
        }
        if (c1293780jlwLJFF.LIZJ) {
            path.close();
        }
        return this.LJIIIZ;
    }
}
