package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1295030jnx implements InterfaceC1295800jpC, InterfaceC1294590jnF, InterfaceC1295760jp8 {
    public final Path LIZ = new Path();
    public final Matrix LIZIZ = new Matrix();
    public final Matrix LIZJ = new Matrix();
    public final C1294440jn0 LIZLLL = new C1294440jn0(1);
    public final C1294440jn0 LJ = new C1294440jn0(PorterDuff.Mode.DST_IN, 0);
    public final C1294440jn0 LJFF = new C1294440jn0(PorterDuff.Mode.DST_OUT, 0);
    public final C1294440jn0 LJI;
    public final C1294440jn0 LJII;
    public final RectF LJIIIIZZ;
    public final RectF LJIIIZ;
    public final RectF LJIIJ;
    public final RectF LJIIJJI;
    public final RectF LJIIL;
    public final Matrix LJIILIIL;
    public final C1295950jpR LJIILJJIL;
    public final C1294730jnT LJIILL;
    public final C1294880jni LJIILLIIL;
    public C1295230joH LJIIZILJ;
    public AbstractC1295030jnx LJIJ;
    public AbstractC1295030jnx LJIJI;
    public List<AbstractC1295030jnx> LJIJJ;
    public final List<AbstractC1295190joD<?, ?>> LJIJJLI;
    public final C1295050jnz LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public C1294440jn0 LJJIFFI;
    public float LJJII;
    public BlurMaskFilter LJJIII;

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
    }

    public abstract void LJIIJ(Canvas canvas, Matrix matrix, int i);

    public void LJIILLIIL(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
    }

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIILJJIL.invalidateSelf();
    }

    public final void LJIIIIZZ() {
        if (this.LJIJJ != null) {
            return;
        }
        if (this.LJIJI == null) {
            this.LJIJJ = Collections.emptyList();
            return;
        }
        this.LJIJJ = new ArrayList();
        for (AbstractC1295030jnx abstractC1295030jnx = this.LJIJI; abstractC1295030jnx != null; abstractC1295030jnx = abstractC1295030jnx.LJIJI) {
            this.LJIJJ.add(abstractC1295030jnx);
        }
    }

    public C1295860jpI LJIIJJI() {
        return this.LJIILL.LJIL;
    }

    public C1295720jp4 LJIIL() {
        return this.LJIILL.LJJ;
    }

    public final boolean LJIILIIL() {
        C1294880jni c1294880jni = this.LJIILLIIL;
        return (c1294880jni == null || ((ArrayList) c1294880jni.LIZ).isEmpty()) ? false : true;
    }

    public final void LJIILJJIL() {
        C1295560joo c1295560joo = this.LJIILJJIL.LL.LIZ;
        String str = this.LJIILL.LIZJ;
        if (c1295560joo.LIZ) {
            C1295890jpL c1295890jpL = (C1295890jpL) ((HashMap) c1295560joo.LIZJ).get(str);
            if (c1295890jpL == null) {
                c1295890jpL = new C1295890jpL();
                ((HashMap) c1295560joo.LIZJ).put(str, c1295890jpL);
            }
            int i = c1295890jpL.LIZ + 1;
            c1295890jpL.LIZ = i;
            if (i == Integer.MAX_VALUE) {
                c1295890jpL.LIZ = 1073741823;
            }
            if (str.equals("__container")) {
                C835410Wpv c835410Wpv = c1295560joo.LIZIZ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    ((InterfaceC1295840jpG) c835430Wpx.next()).LIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LJIILL.LIZJ;
    }

    public final void LIZIZ(AbstractC1295190joD<?, ?> abstractC1295190joD) {
        if (abstractC1295190joD == null) {
            return;
        }
        this.LJIJJLI.add(abstractC1295190joD);
    }

    public final void LJIIIZ(Canvas canvas) {
        RectF rectF = this.LJIIIIZZ;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.LJII);
    }

    public final void LJIILL(AbstractC1295190joD<?, ?> abstractC1295190joD) {
        ((ArrayList) this.LJIJJLI).remove(abstractC1295190joD);
    }

    public void LJIIZILJ(boolean z) {
        if (z && this.LJJIFFI == null) {
            this.LJJIFFI = new C1294440jn0();
        }
        this.LJJI = z;
    }

    public void LJIJ(float f) {
        C1295050jnz c1295050jnz = this.LJIL;
        AbstractC1295190joD<Integer, Integer> abstractC1295190joD = c1295050jnz.LJIIIZ;
        if (abstractC1295190joD != null) {
            abstractC1295190joD.LJIIIZ(f);
        }
        AbstractC1295190joD<?, Float> abstractC1295190joD2 = c1295050jnz.LJIIL;
        if (abstractC1295190joD2 != null) {
            abstractC1295190joD2.LJIIIZ(f);
        }
        AbstractC1295190joD<?, Float> abstractC1295190joD3 = c1295050jnz.LJIILIIL;
        if (abstractC1295190joD3 != null) {
            abstractC1295190joD3.LJIIIZ(f);
        }
        AbstractC1295190joD<PointF, PointF> abstractC1295190joD4 = c1295050jnz.LJFF;
        if (abstractC1295190joD4 != null) {
            abstractC1295190joD4.LJIIIZ(f);
        }
        AbstractC1295190joD<?, PointF> abstractC1295190joD5 = c1295050jnz.LJI;
        if (abstractC1295190joD5 != null) {
            abstractC1295190joD5.LJIIIZ(f);
        }
        AbstractC1295190joD<C1295580joq, C1295580joq> abstractC1295190joD6 = c1295050jnz.LJII;
        if (abstractC1295190joD6 != null) {
            abstractC1295190joD6.LJIIIZ(f);
        }
        AbstractC1295190joD<Float, Float> abstractC1295190joD7 = c1295050jnz.LJIIIIZZ;
        if (abstractC1295190joD7 != null) {
            abstractC1295190joD7.LJIIIZ(f);
        }
        C1295230joH c1295230joH = c1295050jnz.LJIIJ;
        if (c1295230joH != null) {
            c1295230joH.LJIIIZ(f);
        }
        C1295230joH c1295230joH2 = c1295050jnz.LJIIJJI;
        if (c1295230joH2 != null) {
            c1295230joH2.LJIIIZ(f);
        }
        if (this.LJIILLIIL != null) {
            for (int i = 0; i < ((ArrayList) this.LJIILLIIL.LIZ).size(); i++) {
                ((AbstractC1295190joD) ListProtector.get(this.LJIILLIIL.LIZ, i)).LJIIIZ(f);
            }
        }
        C1295230joH c1295230joH3 = this.LJIIZILJ;
        if (c1295230joH3 != null) {
            c1295230joH3.LJIIIZ(f);
        }
        AbstractC1295030jnx abstractC1295030jnx = this.LJIJ;
        if (abstractC1295030jnx != null) {
            abstractC1295030jnx.LJIJ(f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseLayer#setProgress.animations.");
        sbLIZ.append(((ArrayList) this.LJIJJLI).size());
        C2188811AlT.LIZIZ(sbLIZ);
        for (int i2 = 0; i2 < ((ArrayList) this.LJIJJLI).size(); i2++) {
            ((AbstractC1295190joD) ListProtector.get(this.LJIJJLI, i2)).LJIIIZ(f);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BaseLayer#setProgress.animations.");
        sbLIZ2.append(((ArrayList) this.LJIJJLI).size());
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public AbstractC1295030jnx(C1295950jpR c1295950jpR, C1294730jnT c1294730jnT) {
        C1294440jn0 c1294440jn0 = new C1294440jn0(1);
        this.LJI = c1294440jn0;
        this.LJII = new C1294440jn0(PorterDuff.Mode.CLEAR);
        this.LJIIIIZZ = new RectF();
        this.LJIIIZ = new RectF();
        this.LJIIJ = new RectF();
        this.LJIIJJI = new RectF();
        this.LJIIL = new RectF();
        this.LJIILIIL = new Matrix();
        this.LJIJJLI = new ArrayList();
        this.LJJ = true;
        this.LJJII = 0.0f;
        this.LJIILJJIL = c1295950jpR;
        this.LJIILL = c1294730jnT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1294730jnT.LIZJ);
        sbLIZ.append("#draw");
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1294730jnT.LJIJJ == EnumC1295410joZ.INVERT) {
            c1294440jn0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c1294440jn0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C1295320joQ c1295320joQ = c1294730jnT.LJIIIIZZ;
        c1295320joQ.getClass();
        C1295050jnz c1295050jnz = new C1295050jnz(c1295320joQ);
        this.LJIL = c1295050jnz;
        c1295050jnz.LIZIZ(this);
        List<C1295690jp1> list = c1294730jnT.LJII;
        if (list != null && !list.isEmpty()) {
            C1294880jni c1294880jni = new C1294880jni(c1294730jnT.LJII);
            this.LJIILLIIL = c1294880jni;
            Iterator it2 = ((ArrayList) c1294880jni.LIZ).iterator();
            while (it2.hasNext()) {
                ((AbstractC1295190joD) it2.next()).LIZ(this);
            }
            for (AbstractC1295190joD<?, ?> abstractC1295190joD : (ArrayList) this.LJIILLIIL.LIZIZ) {
                LIZIZ(abstractC1295190joD);
                abstractC1295190joD.LIZ(this);
            }
        }
        if (!this.LJIILL.LJIJI.isEmpty()) {
            C1295230joH c1295230joH = new C1295230joH(this.LJIILL.LJIJI);
            this.LJIIZILJ = c1295230joH;
            c1295230joH.LIZIZ = true;
            c1295230joH.LIZ(new InterfaceC1294590jnF() { // from class: X.0jov
                @Override // X.InterfaceC1294590jnF
                public final void LIZJ() {
                    AbstractC1295030jnx abstractC1295030jnx = this.LIZ;
                    boolean z = abstractC1295030jnx.LJIIZILJ.LJIIJJI() == 1.0f;
                    if (z != abstractC1295030jnx.LJJ) {
                        abstractC1295030jnx.LJJ = z;
                        abstractC1295030jnx.LJIILJJIL.invalidateSelf();
                    }
                }
            });
            boolean z = this.LJIIZILJ.LJFF().floatValue() == 1.0f;
            if (z != this.LJJ) {
                this.LJJ = z;
                this.LJIILJJIL.invalidateSelf();
            }
            LIZIZ(this.LJIIZILJ);
            return;
        }
        if (true == this.LJJ) {
            return;
        }
        this.LJJ = true;
        this.LJIILJJIL.invalidateSelf();
    }

    public void LJII(C1295400joY c1295400joY, Object obj) {
        this.LJIL.LIZJ(c1295400joY, obj);
    }

    @Override // X.InterfaceC1295800jpC
    public final void LIZ(Canvas canvas, Matrix matrix, int i) {
        int iIntValue;
        boolean z;
        float f;
        C1294440jn0 c1294440jn0;
        Integer numLJFF;
        if (this.LJJ && !this.LJIILL.LJIJJLI) {
            LJIIIIZZ();
            this.LIZIZ.reset();
            this.LIZIZ.set(matrix);
            int i2 = 1;
            for (int size = this.LJIJJ.size() - 1; size >= 0; size--) {
                this.LIZIZ.preConcat(((AbstractC1295030jnx) ListProtector.get(this.LJIJJ, size)).LJIL.LIZLLL());
            }
            AbstractC1295190joD<Integer, Integer> abstractC1295190joD = this.LJIL.LJIIIZ;
            if (abstractC1295190joD != null && (numLJFF = abstractC1295190joD.LJFF()) != null) {
                iIntValue = numLJFF.intValue();
            } else {
                iIntValue = 100;
            }
            int i3 = (int) ((((i / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            boolean z2 = false;
            if (this.LJIJ == null && !LJIILIIL()) {
                this.LIZIZ.preConcat(this.LJIL.LIZLLL());
                LJIIJ(canvas, this.LIZIZ, i3);
                LJIILJJIL();
                return;
            }
            LJI(this.LJIIIIZZ, this.LIZIZ, false);
            RectF rectF = this.LJIIIIZZ;
            if (this.LJIJ != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.LJIILL.LJIJJ != EnumC1295410joZ.INVERT) {
                this.LJIIJJI.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.LJIJ.LJI(this.LJIIJJI, matrix, true);
                if (!rectF.intersect(this.LJIIJJI)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.LIZIZ.preConcat(this.LJIL.LIZLLL());
            RectF rectF2 = this.LJIIIIZZ;
            Matrix matrix2 = this.LIZIZ;
            this.LJIIJ.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = 3;
            int i5 = 4;
            if (!LJIILIIL()) {
                f = 0.0f;
            } else {
                int size2 = this.LJIILLIIL.LIZJ.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        C1295690jp1 c1295690jp1 = (C1295690jp1) ListProtector.get(this.LJIILLIIL.LIZJ, i6);
                        Path path = (Path) ((AbstractC1295190joD) ListProtector.get(this.LJIILLIIL.LIZ, i6)).LJFF();
                        if (path != null) {
                            this.LIZ.set(path);
                            this.LIZ.transform(matrix2);
                            int i7 = C1294930jnn.LIZIZ[c1295690jp1.LIZ.ordinal()];
                            if (i7 == 1 || i7 == 2 || ((i7 == i4 || i7 == i5) && c1295690jp1.LIZLLL)) {
                                break;
                            }
                            this.LIZ.computeBounds(this.LJIIL, z2);
                            if (i6 == 0) {
                                this.LJIIJ.set(this.LJIIL);
                            } else {
                                RectF rectF3 = this.LJIIJ;
                                rectF3.set(Math.min(rectF3.left, this.LJIIL.left), Math.min(this.LJIIJ.top, this.LJIIL.top), Math.max(this.LJIIJ.right, this.LJIIL.right), Math.max(this.LJIIJ.bottom, this.LJIIL.bottom));
                            }
                        }
                        i6++;
                        z2 = false;
                        i4 = 3;
                        i5 = 4;
                    } else if (!rectF2.intersect(this.LJIIJ)) {
                        f = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                f = 0.0f;
            }
            this.LJIIIZ.set(f, f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.LIZJ);
            if (!this.LIZJ.isIdentity()) {
                Matrix matrix3 = this.LIZJ;
                matrix3.invert(matrix3);
                this.LIZJ.mapRect(this.LJIIIZ);
            }
            if (!this.LJIIIIZZ.intersect(this.LJIIIZ)) {
                this.LJIIIIZZ.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            if (this.LJIIIIZZ.width() >= 1.0f && this.LJIIIIZZ.height() >= 1.0f) {
                this.LIZLLL.setAlpha(255);
                canvas.saveLayer(this.LJIIIIZZ, this.LIZLLL);
                LJIIIZ(canvas);
                LJIIJ(canvas, this.LIZIZ, i3);
                if (LJIILIIL()) {
                    Matrix matrix4 = this.LIZIZ;
                    canvas.saveLayer(this.LJIIIIZZ, this.LJ);
                    if (Build.VERSION.SDK_INT < 28) {
                        LJIIIZ(canvas);
                    }
                    int i8 = 0;
                    while (i8 < this.LJIILLIIL.LIZJ.size()) {
                        C1295690jp1 c1295690jp12 = (C1295690jp1) ListProtector.get(this.LJIILLIIL.LIZJ, i8);
                        AbstractC1295190joD abstractC1295190joD2 = (AbstractC1295190joD) ListProtector.get(this.LJIILLIIL.LIZ, i8);
                        AbstractC1295190joD abstractC1295190joD3 = (AbstractC1295190joD) ListProtector.get(this.LJIILLIIL.LIZIZ, i8);
                        int i9 = C1294930jnn.LIZIZ[c1295690jp12.LIZ.ordinal()];
                        if (i9 != i2) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 == 4) {
                                        if (c1295690jp12.LIZLLL) {
                                            canvas.saveLayer(this.LJIIIIZZ, this.LIZLLL);
                                            canvas.drawRect(this.LJIIIIZZ, this.LIZLLL);
                                            this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                            this.LIZ.transform(matrix4);
                                            this.LIZLLL.setAlpha((int) (((Integer) abstractC1295190joD3.LJFF()).intValue() * 2.55f));
                                            canvas.drawPath(this.LIZ, this.LJFF);
                                            canvas.restore();
                                        } else {
                                            this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                            this.LIZ.transform(matrix4);
                                            this.LIZLLL.setAlpha((int) (((Integer) abstractC1295190joD3.LJFF()).intValue() * 2.55f));
                                            canvas.drawPath(this.LIZ, this.LIZLLL);
                                        }
                                    }
                                } else if (c1295690jp12.LIZLLL) {
                                    canvas.saveLayer(this.LJIIIIZZ, this.LJ);
                                    canvas.drawRect(this.LJIIIIZZ, this.LIZLLL);
                                    this.LJFF.setAlpha((int) (((Integer) abstractC1295190joD3.LJFF()).intValue() * 2.55f));
                                    this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                    this.LIZ.transform(matrix4);
                                    canvas.drawPath(this.LIZ, this.LJFF);
                                    canvas.restore();
                                } else {
                                    canvas.saveLayer(this.LJIIIIZZ, this.LJ);
                                    this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                    this.LIZ.transform(matrix4);
                                    this.LIZLLL.setAlpha((int) (((Integer) abstractC1295190joD3.LJFF()).intValue() * 2.55f));
                                    canvas.drawPath(this.LIZ, this.LIZLLL);
                                    canvas.restore();
                                }
                            } else {
                                if (i8 == 0) {
                                    this.LIZLLL.setColor(-16777216);
                                    this.LIZLLL.setAlpha(255);
                                    canvas.drawRect(this.LJIIIIZZ, this.LIZLLL);
                                }
                                if (c1295690jp12.LIZLLL) {
                                    canvas.saveLayer(this.LJIIIIZZ, this.LJFF);
                                    canvas.drawRect(this.LJIIIIZZ, this.LIZLLL);
                                    this.LJFF.setAlpha((int) (((Integer) abstractC1295190joD3.LJFF()).intValue() * 2.55f));
                                    this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                    this.LIZ.transform(matrix4);
                                    canvas.drawPath(this.LIZ, this.LJFF);
                                    canvas.restore();
                                } else {
                                    this.LIZ.set((Path) abstractC1295190joD2.LJFF());
                                    this.LIZ.transform(matrix4);
                                    canvas.drawPath(this.LIZ, this.LJFF);
                                }
                            }
                        } else if (!((ArrayList) this.LJIILLIIL.LIZ).isEmpty()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < this.LJIILLIIL.LIZJ.size()) {
                                    if (((C1295690jp1) ListProtector.get(this.LJIILLIIL.LIZJ, i10)).LIZ == EnumC1294970jnr.MASK_MODE_NONE) {
                                        i10++;
                                    }
                                } else {
                                    this.LIZLLL.setAlpha(255);
                                    canvas.drawRect(this.LJIIIIZZ, this.LIZLLL);
                                    break;
                                }
                            }
                        }
                        i8++;
                        i2 = 1;
                    }
                    canvas.restore();
                }
                if (this.LJIJ != null) {
                    canvas.saveLayer(this.LJIIIIZZ, this.LJI);
                    LJIIIZ(canvas);
                    this.LJIJ.LIZ(canvas, matrix, i3);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.LJJI && (c1294440jn0 = this.LJJIFFI) != null) {
                c1294440jn0.setStyle(Paint.Style.STROKE);
                this.LJJIFFI.setColor(-251901);
                this.LJJIFFI.setStrokeWidth(4.0f);
                canvas.drawRect(this.LJIIIIZZ, this.LJJIFFI);
                this.LJJIFFI.setStyle(Paint.Style.FILL);
                this.LJJIFFI.setColor(1357638635);
                canvas.drawRect(this.LJIIIIZZ, this.LJJIFFI);
            }
            LJIILJJIL();
        }
    }

    @Override // X.InterfaceC1295800jpC
    public void LJI(RectF rectF, Matrix matrix, boolean z) {
        this.LJIIIIZZ.set(0.0f, 0.0f, 0.0f, 0.0f);
        LJIIIIZZ();
        this.LJIILIIL.set(matrix);
        if (z) {
            List<AbstractC1295030jnx> list = this.LJIJJ;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.LJIILIIL.preConcat(((AbstractC1295030jnx) ListProtector.get(this.LJIJJ, size)).LJIL.LIZLLL());
                    }
                }
            } else {
                AbstractC1295030jnx abstractC1295030jnx = this.LJIJI;
                if (abstractC1295030jnx != null) {
                    this.LJIILIIL.preConcat(abstractC1295030jnx.LJIL.LIZLLL());
                }
            }
        }
        this.LJIILIIL.preConcat(this.LJIL.LIZLLL());
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        AbstractC1295030jnx abstractC1295030jnx = this.LJIJ;
        if (abstractC1295030jnx != null) {
            String str = abstractC1295030jnx.LJIILL.LIZJ;
            c1295090jo32.getClass();
            C1295090jo3 c1295090jo33 = new C1295090jo3(c1295090jo32);
            c1295090jo33.LIZ.add(str);
            if (c1295090jo3.LIZ(i, this.LJIJ.LJIILL.LIZJ)) {
                AbstractC1295030jnx abstractC1295030jnx2 = this.LJIJ;
                C1295090jo3 c1295090jo34 = new C1295090jo3(c1295090jo33);
                c1295090jo34.LIZIZ = abstractC1295030jnx2;
                ((ArrayList) list).add(c1295090jo34);
            }
            if (c1295090jo3.LIZLLL(i, this.LJIILL.LIZJ)) {
                this.LJIJ.LJIILLIIL(c1295090jo3, c1295090jo3.LIZIZ(i, this.LJIJ.LJIILL.LIZJ) + i, list, c1295090jo33);
            }
        }
        if (!c1295090jo3.LIZJ(i, this.LJIILL.LIZJ)) {
            return;
        }
        if (!"__container".equals(this.LJIILL.LIZJ)) {
            String str2 = this.LJIILL.LIZJ;
            c1295090jo32.getClass();
            C1295090jo3 c1295090jo35 = new C1295090jo3(c1295090jo32);
            c1295090jo35.LIZ.add(str2);
            if (c1295090jo3.LIZ(i, this.LJIILL.LIZJ)) {
                C1295090jo3 c1295090jo36 = new C1295090jo3(c1295090jo35);
                c1295090jo36.LIZIZ = this;
                ((ArrayList) list).add(c1295090jo36);
            }
            c1295090jo32 = c1295090jo35;
        }
        if (c1295090jo3.LIZLLL(i, this.LJIILL.LIZJ)) {
            LJIILLIIL(c1295090jo3, i + c1295090jo3.LIZIZ(i, this.LJIILL.LIZJ), list, c1295090jo32);
        }
    }
}
