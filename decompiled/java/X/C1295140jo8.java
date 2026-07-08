package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0jo8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295140jo8 extends AbstractC1295190joD<PointF, PointF> {
    public final PointF LJIIIIZZ;
    public final PointF LJIIIZ;
    public final AbstractC1295190joD<Float, Float> LJIIJ;
    public final AbstractC1295190joD<Float, Float> LJIIJJI;
    public C1295400joY<Float> LJIIL;
    public C1295400joY<Float> LJIILIIL;

    @Override // X.AbstractC1295190joD
    public final PointF LJFF() {
        return LJIIJJI(0.0f);
    }

    @Override // X.AbstractC1295190joD
    public final void LJIIIZ(float f) {
        this.LJIIJ.LJIIIZ(f);
        this.LJIIJJI.LJIIIZ(f);
        this.LJIIIIZZ.set(this.LJIIJ.LJFF().floatValue(), this.LJIIJJI.LJFF().floatValue());
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC1294590jnF) ListProtector.get(this.LIZ, i)).LIZJ();
        }
    }

    public final PointF LJIIJJI(float f) {
        Float fLIZIZ;
        C1294810jnb<Float> c1294810jnbLIZIZ;
        float fFloatValue;
        C1294810jnb<Float> c1294810jnbLIZIZ2;
        float fFloatValue2;
        Float fLIZIZ2 = null;
        if (this.LJIIL != null && (c1294810jnbLIZIZ2 = this.LJIIJ.LIZIZ()) != null) {
            float fLIZLLL = this.LJIIJ.LIZLLL();
            Float f2 = c1294810jnbLIZIZ2.LJII;
            C1295400joY<Float> c1295400joY = this.LJIIL;
            float f3 = c1294810jnbLIZIZ2.LJI;
            if (f2 == null) {
                fFloatValue2 = f3;
            } else {
                fFloatValue2 = f2.floatValue();
            }
            fLIZIZ = c1295400joY.LIZIZ(f3, fFloatValue2, c1294810jnbLIZIZ2.LIZIZ, c1294810jnbLIZIZ2.LIZJ, f, f, fLIZLLL);
        } else {
            fLIZIZ = null;
        }
        if (this.LJIILIIL != null && (c1294810jnbLIZIZ = this.LJIIJJI.LIZIZ()) != null) {
            float fLIZLLL2 = this.LJIIJJI.LIZLLL();
            Float f4 = c1294810jnbLIZIZ.LJII;
            C1295400joY<Float> c1295400joY2 = this.LJIILIIL;
            float f5 = c1294810jnbLIZIZ.LJI;
            if (f4 == null) {
                fFloatValue = f5;
            } else {
                fFloatValue = f4.floatValue();
            }
            fLIZIZ2 = c1295400joY2.LIZIZ(f5, fFloatValue, c1294810jnbLIZIZ.LIZIZ, c1294810jnbLIZIZ.LIZJ, f, f, fLIZLLL2);
        }
        if (fLIZIZ == null) {
            this.LJIIIZ.set(this.LJIIIIZZ.x, 0.0f);
        } else {
            this.LJIIIZ.set(fLIZIZ.floatValue(), 0.0f);
        }
        if (fLIZIZ2 == null) {
            PointF pointF = this.LJIIIZ;
            pointF.set(pointF.x, this.LJIIIIZZ.y);
        } else {
            PointF pointF2 = this.LJIIIZ;
            pointF2.set(pointF2.x, fLIZIZ2.floatValue());
        }
        return this.LJIIIZ;
    }

    public C1295140jo8(C1295230joH c1295230joH, C1295230joH c1295230joH2) {
        super(Collections.emptyList());
        this.LJIIIIZZ = new PointF();
        this.LJIIIZ = new PointF();
        this.LJIIJ = c1295230joH;
        this.LJIIJJI = c1295230joH2;
        LJIIIZ(this.LIZLLL);
    }

    @Override // X.AbstractC1295190joD
    public final /* bridge */ /* synthetic */ PointF LJI(C1294810jnb<PointF> c1294810jnb, float f) {
        return LJIIJJI(f);
    }
}
