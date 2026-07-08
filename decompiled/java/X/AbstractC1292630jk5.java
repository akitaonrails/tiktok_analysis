package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jk5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1292630jk5 implements InterfaceC1292580jk0, InterfaceC1293690jln, InterfaceC1291570jiN {
    public final Paint LIZLLL;
    public final Paint LJ;
    public final Paint LJFF;
    public final Paint LJI;
    public final C1291430ji9 LJIIL;
    public final C1292540jjw LJIILIIL;
    public final C1292700jkC LJIILJJIL;
    public C1293040jkk LJIILL;
    public AbstractC1292630jk5 LJIILLIIL;
    public AbstractC1292630jk5 LJIIZILJ;
    public List<AbstractC1292630jk5> LJIJ;
    public final C1292730jkF LJIJJ;
    public boolean LJIJJLI;
    public final Path LIZ = new Path();
    public final Matrix LIZIZ = new Matrix();
    public final RectF LJII = new RectF();
    public final RectF LJIIIIZZ = new RectF();
    public final RectF LJIIIZ = new RectF();
    public final RectF LJIIJ = new RectF();
    public final Matrix LJIIJJI = new Matrix();
    public final List<AbstractC1293310jlB<?, ?>> LJIJI = new ArrayList();
    public final Paint LIZJ = new Paint(1);

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
    }

    public abstract void LJIIJ(Canvas canvas, Matrix matrix, int i);

    public void LJIILIIL(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
    }

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJIIL.invalidateSelf();
    }

    public final void LJIIIIZZ() {
        if (this.LJIJ != null) {
            return;
        }
        if (this.LJIIZILJ == null) {
            this.LJIJ = Collections.emptyList();
            return;
        }
        this.LJIJ = new ArrayList();
        for (AbstractC1292630jk5 abstractC1292630jk5 = this.LJIIZILJ; abstractC1292630jk5 != null; abstractC1292630jk5 = abstractC1292630jk5.LJIIZILJ) {
            this.LJIJ.add(abstractC1292630jk5);
        }
    }

    public final boolean LJIIJJI() {
        C1292700jkC c1292700jkC = this.LJIILJJIL;
        return (c1292700jkC == null || ((ArrayList) c1292700jkC.LIZ).isEmpty()) ? false : true;
    }

    public final void LJIIL() {
        C1291010jhT c1291010jhT = this.LJIIL.LLILLJJLI.LIZ;
        String str = this.LJIILIIL.LIZJ;
        boolean z = c1291010jhT.LIZIZ;
        if (z || c1291010jhT.LIZ) {
            if (!c1291010jhT.LIZ || z) {
                C1292720jkE c1292720jkE = (C1292720jkE) ((HashMap) c1291010jhT.LIZLLL).get(str);
                if (c1292720jkE == null) {
                    c1292720jkE = new C1292720jkE();
                    ((HashMap) c1291010jhT.LIZLLL).put(str, c1292720jkE);
                }
                int i = c1292720jkE.LIZ + 1;
                c1292720jkE.LIZ = i;
                if (i == Integer.MAX_VALUE) {
                    c1292720jkE.LIZ = 1073741823;
                }
            }
            if (str.equals("__container")) {
                C835410Wpv c835410Wpv = c1291010jhT.LIZJ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    ((InterfaceC1290980jhQ) c835430Wpx.next()).LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LJIILIIL.LIZJ;
    }

    public final void LIZIZ(AbstractC1293310jlB<?, ?> abstractC1293310jlB) {
        if (abstractC1293310jlB == null) {
            return;
        }
        this.LJIJI.add(abstractC1293310jlB);
    }

    public final void LJIIIZ(Canvas canvas) {
        RectF rectF = this.LJII;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.LJI);
        C1291650jiV.LIZ();
    }

    public void LJIILJJIL(float f) {
        C1292730jkF c1292730jkF = this.LJIJJ;
        c1292730jkF.LIZIZ.LJII(f);
        c1292730jkF.LIZJ.LJII(f);
        c1292730jkF.LIZLLL.LJII(f);
        c1292730jkF.LJ.LJII(f);
        c1292730jkF.LJFF.LJII(f);
        C1293040jkk c1293040jkk = c1292730jkF.LJI;
        if (c1293040jkk != null) {
            c1293040jkk.LJII(f);
        }
        C1293040jkk c1293040jkk2 = c1292730jkF.LJII;
        if (c1293040jkk2 != null) {
            c1293040jkk2.LJII(f);
        }
        if (this.LJIILJJIL != null) {
            for (int i = 0; i < ((ArrayList) this.LJIILJJIL.LIZ).size(); i++) {
                ((AbstractC1293310jlB) ListProtector.get(this.LJIILJJIL.LIZ, i)).LJII(f);
            }
        }
        float f2 = this.LJIILIIL.LJIIL;
        if (f2 != 0.0f) {
            f /= f2;
        }
        AbstractC1292630jk5 abstractC1292630jk5 = this.LJIILLIIL;
        if (abstractC1292630jk5 != null) {
            abstractC1292630jk5.LJIILJJIL(abstractC1292630jk5.LJIILIIL.LJIIL * f);
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LJIJI).size(); i2++) {
            ((AbstractC1293310jlB) ListProtector.get(this.LJIJI, i2)).LJII(f);
        }
    }

    public AbstractC1292630jk5(C1291430ji9 c1291430ji9, C1292540jjw c1292540jjw) {
        this.LJIJJLI = true;
        Paint paint = new Paint(1);
        this.LIZLLL = paint;
        Paint paint2 = new Paint(1);
        this.LJ = paint2;
        Paint paint3 = new Paint(1);
        this.LJFF = paint3;
        Paint paint4 = new Paint();
        this.LJI = paint4;
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LJIIL = c1291430ji9;
        this.LJIILIIL = c1292540jjw;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1292540jjw.LIZJ);
        sbLIZ.append("#draw");
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1292540jjw.LJIJJ == EnumC1292530jjv.Invert) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1292750jkH c1292750jkH = c1292540jjw.LJIIIIZZ;
        c1292750jkH.getClass();
        C1292730jkF c1292730jkF = new C1292730jkF(c1292750jkH);
        this.LJIJJ = c1292730jkF;
        c1292730jkF.LIZIZ(this);
        List<C1292710jkD> list = c1292540jjw.LJII;
        if (list != null && !list.isEmpty()) {
            C1292700jkC c1292700jkC = new C1292700jkC(c1292540jjw.LJII);
            this.LJIILJJIL = c1292700jkC;
            Iterator it2 = ((ArrayList) c1292700jkC.LIZ).iterator();
            while (it2.hasNext()) {
                ((AbstractC1293310jlB) it2.next()).LIZ(this);
            }
            for (AbstractC1293310jlB<?, ?> abstractC1293310jlB : (ArrayList) this.LJIILJJIL.LIZIZ) {
                LIZIZ(abstractC1293310jlB);
                abstractC1293310jlB.LIZ(this);
            }
        }
        if (!this.LJIILIIL.LJIJI.isEmpty()) {
            C1293040jkk c1293040jkk = new C1293040jkk(this.LJIILIIL.LJIJI);
            this.LJIILL = c1293040jkk;
            c1293040jkk.LIZIZ = true;
            c1293040jkk.LIZ(new InterfaceC1293690jln() { // from class: X.0jk7
                @Override // X.InterfaceC1293690jln
                public final void LIZJ() {
                    AbstractC1292630jk5 abstractC1292630jk5 = this.LIZ;
                    boolean z = abstractC1292630jk5.LJIILL.LJ().floatValue() == 1.0f;
                    if (z != abstractC1292630jk5.LJIJJLI) {
                        abstractC1292630jk5.LJIJJLI = z;
                        abstractC1292630jk5.LJIIL.invalidateSelf();
                    }
                }
            });
            boolean z = this.LJIILL.LJ().floatValue() == 1.0f;
            if (z != this.LJIJJLI) {
                this.LJIJJLI = z;
                this.LJIIL.invalidateSelf();
            }
            LIZIZ(this.LJIILL);
            return;
        }
        if (true == this.LJIJJLI) {
            return;
        }
        this.LJIJJLI = true;
        this.LJIIL.invalidateSelf();
    }

    @Override // X.InterfaceC1292580jk0
    public void LJ(RectF rectF, Matrix matrix) {
        this.LJIIJJI.set(matrix);
        this.LJIIJJI.preConcat(this.LJIJJ.LIZLLL());
    }

    public <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        this.LJIJJ.LIZJ(t, c1292420jjk);
    }

    @Override // X.InterfaceC1292580jk0
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        if (!this.LJIJJLI) {
            C1291650jiV.LIZ();
            return;
        }
        LJIIIIZZ();
        this.LIZIZ.reset();
        this.LIZIZ.set(matrix);
        int i2 = 1;
        for (int size = this.LJIJ.size() - 1; size >= 0; size--) {
            this.LIZIZ.preConcat(((AbstractC1292630jk5) ListProtector.get(this.LJIJ, size)).LJIJJ.LIZLLL());
        }
        C1291650jiV.LIZ();
        int iIntValue = (int) ((((i / 255.0f) * LJ().intValue()) / 100.0f) * 255.0f);
        if (this.LJIILLIIL == null && !LJIIJJI()) {
            this.LIZIZ.preConcat(this.LJIJJ.LIZLLL());
            LJIIJ(canvas, this.LIZIZ, iIntValue);
            C1291650jiV.LIZ();
            C1291650jiV.LIZ();
            LJIIL();
            return;
        }
        this.LJII.set(0.0f, 0.0f, 0.0f, 0.0f);
        LJ(this.LJII, this.LIZIZ);
        RectF rectF = this.LJII;
        Matrix matrix2 = this.LIZIZ;
        AbstractC1292630jk5 abstractC1292630jk5 = this.LJIILLIIL;
        if (abstractC1292630jk5 != null && this.LJIILIIL.LJIJJ != EnumC1292530jjv.Invert) {
            abstractC1292630jk5.LJ(this.LJIIIZ, matrix2);
            rectF.set(Math.max(rectF.left, this.LJIIIZ.left), Math.max(rectF.top, this.LJIIIZ.top), Math.min(rectF.right, this.LJIIIZ.right), Math.min(rectF.bottom, this.LJIIIZ.bottom));
        }
        this.LIZIZ.preConcat(this.LJIJJ.LIZLLL());
        RectF rectF2 = this.LJII;
        Matrix matrix3 = this.LIZIZ;
        this.LJIIIIZZ.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (LJIIJJI()) {
            int size2 = this.LJIILJJIL.LIZJ.size();
            int i3 = 0;
            while (true) {
                if (i3 < size2) {
                    C1292710jkD c1292710jkD = (C1292710jkD) ListProtector.get(this.LJIILJJIL.LIZJ, i3);
                    this.LIZ.set((Path) ((AbstractC1293310jlB) ListProtector.get(this.LJIILJJIL.LIZ, i3)).LJ());
                    this.LIZ.transform(matrix3);
                    int i4 = C1292670jk9.LIZIZ[c1292710jkD.LIZ.ordinal()];
                    if (i4 == i2 || i4 == 2) {
                        break;
                    }
                    this.LIZ.computeBounds(this.LJIIJ, false);
                    if (i3 == 0) {
                        this.LJIIIIZZ.set(this.LJIIJ);
                    } else {
                        RectF rectF3 = this.LJIIIIZZ;
                        rectF3.set(Math.min(rectF3.left, this.LJIIJ.left), Math.min(this.LJIIIIZZ.top, this.LJIIJ.top), Math.max(this.LJIIIIZZ.right, this.LJIIJ.right), Math.max(this.LJIIIIZZ.bottom, this.LJIIJ.bottom));
                    }
                    i3++;
                    i2 = 1;
                } else {
                    rectF2.set(Math.max(rectF2.left, this.LJIIIIZZ.left), Math.max(rectF2.top, this.LJIIIIZZ.top), Math.min(rectF2.right, this.LJIIIIZZ.right), Math.min(rectF2.bottom, this.LJIIIIZZ.bottom));
                    break;
                }
            }
        }
        this.LJII.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        C1291650jiV.LIZ();
        canvas.saveLayer(this.LJII, this.LIZJ);
        C1291650jiV.LIZ();
        LJIIIZ(canvas);
        LJIIJ(canvas, this.LIZIZ, iIntValue);
        C1291650jiV.LIZ();
        if (LJIIJJI()) {
            Matrix matrix4 = this.LIZIZ;
            LJII(canvas, matrix4, EnumC1292660jk8.MaskModeAdd);
            LJII(canvas, matrix4, EnumC1292660jk8.MaskModeIntersect);
            LJII(canvas, matrix4, EnumC1292660jk8.MaskModeSubtract);
        }
        if (this.LJIILLIIL != null) {
            canvas.saveLayer(this.LJII, this.LJFF);
            C1291650jiV.LIZ();
            LJIIIZ(canvas);
            this.LJIILLIIL.LIZ(canvas, matrix, iIntValue);
            canvas.restore();
            C1291650jiV.LIZ();
            C1291650jiV.LIZ();
        }
        canvas.restore();
        C1291650jiV.LIZ();
        C1291650jiV.LIZ();
        LJIIL();
    }

    public final void LJII(Canvas canvas, Matrix matrix, EnumC1292660jk8 enumC1292660jk8) {
        Paint paint;
        if (C1292670jk9.LIZIZ[enumC1292660jk8.ordinal()] != 1) {
            paint = this.LIZLLL;
        } else {
            paint = this.LJ;
        }
        int size = this.LJIILJJIL.LIZJ.size();
        for (int i = 0; i < size; i++) {
            if (((C1292710jkD) ListProtector.get(this.LJIILJJIL.LIZJ, i)).LIZ == enumC1292660jk8) {
                canvas.saveLayer(this.LJII, paint);
                C1291650jiV.LIZ();
                LJIIIZ(canvas);
                for (int i2 = 0; i2 < size; i2++) {
                    if (((C1292710jkD) ListProtector.get(this.LJIILJJIL.LIZJ, i2)).LIZ == enumC1292660jk8) {
                        this.LIZ.set((Path) ((AbstractC1293310jlB) ListProtector.get(this.LJIILJJIL.LIZ, i2)).LJ());
                        this.LIZ.transform(matrix);
                        AbstractC1293310jlB abstractC1293310jlB = (AbstractC1293310jlB) ListProtector.get(this.LJIILJJIL.LIZIZ, i2);
                        int alpha = this.LIZJ.getAlpha();
                        this.LIZJ.setAlpha((int) (((Integer) abstractC1293310jlB.LJ()).intValue() * 2.55f));
                        canvas.drawPath(this.LIZ, this.LIZJ);
                        this.LIZJ.setAlpha(alpha);
                    }
                }
                canvas.restore();
                C1291650jiV.LIZ();
                C1291650jiV.LIZ();
                return;
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        if (!c1291740jie.LIZJ(i, this.LJIILIIL.LIZJ)) {
            return;
        }
        if (!"__container".equals(this.LJIILIIL.LIZJ)) {
            String str = this.LJIILIIL.LIZJ;
            c1291740jie2.getClass();
            C1291740jie c1291740jie3 = new C1291740jie(c1291740jie2);
            c1291740jie3.LIZ.add(str);
            if (c1291740jie.LIZ(i, this.LJIILIIL.LIZJ)) {
                C1291740jie c1291740jie4 = new C1291740jie(c1291740jie3);
                c1291740jie4.LIZIZ = this;
                ((ArrayList) list).add(c1291740jie4);
            }
            c1291740jie2 = c1291740jie3;
        }
        if (c1291740jie.LIZLLL(i, this.LJIILIIL.LIZJ)) {
            LJIILIIL(c1291740jie, i + c1291740jie.LIZIZ(i, this.LJIILIIL.LIZJ), list, c1291740jie2);
        }
    }
}
