package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.List;

/* JADX INFO: renamed from: X.0jlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293480jlS implements InterfaceC1292590jk1 {
    public final String LIZ;
    public final C1292960jkc LIZIZ;
    public final List<C1292960jkc> LIZJ;
    public final C1293050jkl LIZLLL;
    public final C1292990jkf LJ;
    public final C1292960jkc LJFF;
    public final EnumC1293710jlp LJI;
    public final EnumC1293720jlq LJII;
    public final float LJIIIIZZ;

    @Override // X.InterfaceC1292590jk1
    public final InterfaceC1291780jii LIZ(final C1291430ji9 c1291430ji9, final AbstractC1292630jk5 abstractC1292630jk5) {
        return new AbstractC1293430jlN(c1291430ji9, abstractC1292630jk5, this) { // from class: X.0jlQ
            public final AbstractC1292630jk5 LJIILJJIL;
            public final String LJIILL;
            public final C1293060jkm LJIILLIIL;
            public C1293360jlG LJIIZILJ;

            @Override // X.InterfaceC1291780jii
            public final String getName() {
                return this.LJIILL;
            }

            @Override // X.AbstractC1293430jlN, X.InterfaceC1291570jiN
            public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
                super.LJI(t, c1292420jjk);
                if (t == InterfaceC1292740jkG.LIZIZ) {
                    LJIIIIZZ(c1292420jjk);
                    return;
                }
                if (t != InterfaceC1292740jkG.LJJ) {
                    return;
                }
                if (c1292420jjk == null) {
                    this.LJIIZILJ = null;
                    return;
                }
                C1293360jlG c1293360jlG = new C1293360jlG(c1292420jjk);
                this.LJIIZILJ = c1293360jlG;
                c1293360jlG.LIZ(this);
                this.LJIILJJIL.LIZIZ(this.LJIILLIIL);
            }

            {
                Paint.Cap paintCap = this.LJI.toPaintCap();
                Paint.Join paintJoin = this.LJII.toPaintJoin();
                float f = this.LJIIIIZZ;
                C1292990jkf c1292990jkf = this.LJ;
                C1292960jkc c1292960jkc = this.LJFF;
                List<C1292960jkc> list = this.LIZJ;
                C1292960jkc c1292960jkc2 = this.LIZIZ;
                this.LJIILJJIL = abstractC1292630jk5;
                this.LJIILL = this.LIZ;
                AbstractC1293310jlB<Integer, Integer> abstractC1293310jlBLIZ = this.LIZLLL.LIZ();
                this.LJIILLIIL = (C1293060jkm) abstractC1293310jlBLIZ;
                abstractC1293310jlBLIZ.LIZ(this);
                abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1293430jlN, X.InterfaceC1292580jk0
            public final void LIZ(Canvas canvas, Matrix matrix, int i) {
                this.LJIIIIZZ.setColor(LJ().intValue());
                C1293360jlG c1293360jlG = this.LJIIZILJ;
                if (c1293360jlG != null) {
                    this.LJIIIIZZ.setColorFilter((ColorFilter) c1293360jlG.LJ());
                }
                super.LIZ(canvas, matrix, i);
            }
        };
    }

    public C1293480jlS(String str, C1292960jkc c1292960jkc, List<C1292960jkc> list, C1293050jkl c1293050jkl, C1292990jkf c1292990jkf, C1292960jkc c1292960jkc2, EnumC1293710jlp enumC1293710jlp, EnumC1293720jlq enumC1293720jlq, float f) {
        this.LIZ = str;
        this.LIZIZ = c1292960jkc;
        this.LIZJ = list;
        this.LIZLLL = c1293050jkl;
        this.LJ = c1292990jkf;
        this.LJFF = c1292960jkc2;
        this.LJI = enumC1293710jlp;
        this.LJII = enumC1293720jlq;
        this.LJIIIIZZ = f;
    }
}
