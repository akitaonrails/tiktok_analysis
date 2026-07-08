package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0jo0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295060jo0 implements InterfaceC1295800jpC, InterfaceC1295830jpF, InterfaceC1295820jpE, InterfaceC1294590jnF, InterfaceC1295880jpK {
    public final Matrix LIZ = new Matrix();
    public final Path LIZIZ = new Path();
    public final C1295950jpR LIZJ;
    public final AbstractC1295030jnx LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final C1295230joH LJI;
    public final C1295230joH LJII;
    public final C1295050jnz LJIIIIZZ;
    public C1295040jny LJIIIZ;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        Path path = this.LJIIIZ.getPath();
        this.LIZIZ.reset();
        float fFloatValue = this.LJI.LJFF().floatValue();
        float fFloatValue2 = this.LJII.LJFF().floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.LIZIZ;
            }
            this.LIZ.set(this.LJIIIIZZ.LJ(i + fFloatValue2));
            this.LIZIZ.addPath(path, this.LIZ);
        }
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC1295820jpE
    public final void LIZIZ(ListIterator<InterfaceC1295810jpD> listIterator) {
        if (this.LJIIIZ != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.LJIIIZ = new C1295040jny(this.LIZJ, this.LIZLLL, "Repeater", this.LJFF, arrayList, null);
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        this.LJIIIZ.LIZLLL(list, list2);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        if (this.LJIIIIZZ.LIZJ(c1295400joY, obj)) {
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIJJ) {
            this.LJI.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJIJJLI) {
                return;
            }
            this.LJII.LJIIJ(c1295400joY);
        }
    }

    public C1295060jo0(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1295430job c1295430job) {
        this.LIZJ = c1295950jpR;
        this.LIZLLL = abstractC1295030jnx;
        this.LJ = c1295430job.LIZ;
        this.LJFF = c1295430job.LJ;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = c1295430job.LIZIZ.LIZ();
        this.LJI = (C1295230joH) abstractC1295190joDLIZ;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295190joDLIZ.LIZ(this);
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ2 = c1295430job.LIZJ.LIZ();
        this.LJII = (C1295230joH) abstractC1295190joDLIZ2;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        abstractC1295190joDLIZ2.LIZ(this);
        C1295320joQ c1295320joQ = c1295430job.LIZLLL;
        c1295320joQ.getClass();
        C1295050jnz c1295050jnz = new C1295050jnz(c1295320joQ);
        this.LJIIIIZZ = c1295050jnz;
        c1295050jnz.LIZ(abstractC1295030jnx);
        c1295050jnz.LIZIZ(this);
    }

    @Override // X.InterfaceC1295800jpC
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.LJI.LJFF().floatValue();
        float fFloatValue2 = this.LJII.LJFF().floatValue();
        float fFloatValue3 = this.LJIIIIZZ.LJIIL.LJFF().floatValue() / 100.0f;
        float fFloatValue4 = this.LJIIIIZZ.LJIILIIL.LJFF().floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.LIZ.set(matrix);
                float f = i2;
                this.LIZ.preConcat(this.LJIIIIZZ.LJ(f + fFloatValue2));
                PointF pointF = C1295100jo4.LIZ;
                this.LJIIIZ.LIZ(canvas, this.LIZ, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LJIIIZ.LJI(rectF, matrix, z);
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
        for (int i2 = 0; i2 < this.LJIIIZ.LJII.size(); i2++) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(this.LJIIIZ.LJII, i2);
            if (interfaceC1295810jpD instanceof InterfaceC1295880jpK) {
                C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, (InterfaceC1295880jpK) interfaceC1295810jpD);
            }
        }
    }
}
