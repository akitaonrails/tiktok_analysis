package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.0jk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292640jk6 implements InterfaceC1292580jk0, InterfaceC1292610jk3, InterfaceC1292600jk2, InterfaceC1293690jln, InterfaceC1291770jih {
    public final Matrix LIZ = new Matrix();
    public final Path LIZIZ = new Path();
    public final C1291430ji9 LIZJ;
    public final AbstractC1292630jk5 LIZLLL;
    public final String LJ;
    public final C1293040jkk LJFF;
    public final C1293040jkk LJI;
    public final C1292730jkF LJII;
    public C1292570jjz LJIIIIZZ;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        Path path = this.LJIIIIZZ.getPath();
        this.LIZIZ.reset();
        float fFloatValue = this.LJFF.LJ().floatValue();
        float fFloatValue2 = this.LJI.LJ().floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.LIZIZ;
            }
            this.LIZ.set(this.LJII.LJ(i + fFloatValue2));
            this.LIZIZ.addPath(path, this.LIZ);
        }
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC1292600jk2
    public final void LIZIZ(ListIterator<InterfaceC1291780jii> listIterator) {
        if (this.LJIIIIZZ != null) {
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
        this.LJIIIIZZ = new C1292570jjz(this.LIZJ, this.LIZLLL, "Repeater", arrayList, null);
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        this.LJIIIIZZ.LIZLLL(list, list2);
    }

    @Override // X.InterfaceC1292580jk0
    public final void LJ(RectF rectF, Matrix matrix) {
        this.LJIIIIZZ.LJ(rectF, matrix);
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        if (this.LJII.LIZJ(t, c1292420jjk)) {
            return;
        }
        if (t == InterfaceC1292740jkG.LJIIL) {
            this.LJFF.LJIIIIZZ(c1292420jjk);
        } else {
            if (t != InterfaceC1292740jkG.LJIILIIL) {
                return;
            }
            this.LJI.LJIIIIZZ(c1292420jjk);
        }
    }

    public C1292640jk6(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1292690jkB c1292690jkB) {
        this.LIZJ = c1291430ji9;
        this.LIZLLL = abstractC1292630jk5;
        this.LJ = c1292690jkB.LIZ;
        AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ = c1292690jkB.LIZIZ.LIZ();
        this.LJFF = (C1293040jkk) abstractC1293310jlBLIZ;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1293310jlBLIZ.LIZ(this);
        AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ2 = c1292690jkB.LIZJ.LIZ();
        this.LJI = (C1293040jkk) abstractC1293310jlBLIZ2;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        abstractC1293310jlBLIZ2.LIZ(this);
        C1292750jkH c1292750jkH = c1292690jkB.LIZLLL;
        c1292750jkH.getClass();
        C1292730jkF c1292730jkF = new C1292730jkF(c1292750jkH);
        this.LJII = c1292730jkF;
        c1292730jkF.LIZ(abstractC1292630jk5);
        c1292730jkF.LIZIZ(this);
    }

    @Override // X.InterfaceC1292580jk0
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.LJFF.LJ().floatValue();
        float fFloatValue2 = this.LJI.LJ().floatValue();
        float fFloatValue3 = this.LJII.LJI.LJ().floatValue() / 100.0f;
        float fFloatValue4 = this.LJII.LJII.LJ().floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.LIZ.set(matrix);
                float f = i2;
                this.LIZ.preConcat(this.LJII.LJ(f + fFloatValue2));
                this.LJIIIIZZ.LIZ(canvas, this.LIZ, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
