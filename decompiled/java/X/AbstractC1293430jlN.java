package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1293430jlN implements InterfaceC1293690jln, InterfaceC1291770jih, InterfaceC1292580jk0 {
    public final C1291430ji9 LJ;
    public final AbstractC1292630jk5 LJFF;
    public final float[] LJII;
    public final Paint LJIIIIZZ;
    public final C1293040jkk LJIIIZ;
    public final C1293030jkj LJIIJ;
    public final List<AbstractC1293310jlB<?, Float>> LJIIJJI;
    public final C1293040jkk LJIIL;
    public C1293360jlG LJIILIIL;
    public final PathMeasure LIZ = new PathMeasure();
    public final Path LIZIZ = new Path();
    public final Path LIZJ = new Path();
    public final RectF LIZLLL = new RectF();
    public final List<C1293610jlf> LJI = new ArrayList();

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJ.invalidateSelf();
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        C1293610jlf c1293610jlf = null;
        C1293500jlU c1293500jlU = null;
        for (int size = ((ArrayList) list).size() - 1; size >= 0; size--) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, size);
            if (interfaceC1291780jii instanceof C1293500jlU) {
                C1293500jlU c1293500jlU2 = (C1293500jlU) interfaceC1291780jii;
                if (c1293500jlU2.LIZIZ == EnumC994260byq.Individually) {
                    c1293500jlU = c1293500jlU2;
                }
            }
        }
        if (c1293500jlU != null) {
            c1293500jlU.LIZIZ(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            InterfaceC1291780jii interfaceC1291780jii2 = (InterfaceC1291780jii) ListProtector.get(list2, size2);
            if (interfaceC1291780jii2 instanceof C1293500jlU) {
                C1293500jlU c1293500jlU3 = (C1293500jlU) interfaceC1291780jii2;
                if (c1293500jlU3.LIZIZ == EnumC994260byq.Individually) {
                    if (c1293610jlf != null) {
                        ((ArrayList) this.LJI).add(c1293610jlf);
                    }
                    c1293610jlf = new C1293610jlf(c1293500jlU3);
                    c1293500jlU3.LIZIZ(this);
                }
            }
            if (interfaceC1291780jii2 instanceof InterfaceC1292610jk3) {
                if (c1293610jlf == null) {
                    c1293610jlf = new C1293610jlf(c1293500jlU);
                }
                ((ArrayList) c1293610jlf.LIZ).add(interfaceC1291780jii2);
            }
        }
        if (c1293610jlf != null) {
            ((ArrayList) this.LJI).add(c1293610jlf);
        }
    }

    @Override // X.InterfaceC1292580jk0
    public final void LJ(RectF rectF, Matrix matrix) {
        this.LIZIZ.reset();
        for (int i = 0; i < ((ArrayList) this.LJI).size(); i++) {
            C1293610jlf c1293610jlf = (C1293610jlf) ListProtector.get(this.LJI, i);
            for (int i2 = 0; i2 < ((ArrayList) c1293610jlf.LIZ).size(); i2++) {
                this.LIZIZ.addPath(((InterfaceC1292610jk3) ListProtector.get(c1293610jlf.LIZ, i2)).getPath(), matrix);
            }
        }
        this.LIZIZ.computeBounds(this.LIZLLL, false);
        float fFloatValue = this.LJIIIZ.LJ().floatValue();
        RectF rectF2 = this.LIZLLL;
        float f = fFloatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.LIZLLL);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1291650jiV.LIZ();
    }

    @Override // X.InterfaceC1291570jiN
    public <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        if (t == InterfaceC1292740jkG.LIZLLL) {
            LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJIIJ) {
            this.LJIIIZ.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t != InterfaceC1292740jkG.LJJ) {
            return;
        }
        if (c1292420jjk == null) {
            this.LJIILIIL = null;
            return;
        }
        C1293360jlG c1293360jlG = new C1293360jlG(c1292420jjk);
        this.LJIILIIL = c1293360jlG;
        c1293360jlG.LIZ(this);
        this.LJFF.LIZIZ(this.LJIILIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156  */
    @Override // X.InterfaceC1292580jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(android.graphics.Canvas r14, android.graphics.Matrix r15, int r16) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1293430jlN.LIZ(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }

    public AbstractC1293430jlN(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, Paint.Cap cap, Paint.Join join, float f, C1292990jkf c1292990jkf, C1292960jkc c1292960jkc, List<C1292960jkc> list, C1292960jkc c1292960jkc2) {
        Paint paint = new Paint(1);
        this.LJIIIIZZ = paint;
        this.LJ = c1291430ji9;
        this.LJFF = abstractC1292630jk5;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        this.LJIIJ = (C1293030jkj) c1292990jkf.LIZ();
        this.LJIIIZ = (C1293040jkk) c1292960jkc.LIZ();
        if (c1292960jkc2 == null) {
            this.LJIIL = null;
        } else {
            this.LJIIL = (C1293040jkk) c1292960jkc2.LIZ();
        }
        this.LJIIJJI = new ArrayList(list.size());
        this.LJII = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.LJIIJJI).add(((C1292960jkc) ListProtector.get(list, i)).LIZ());
        }
        abstractC1292630jk5.LIZIZ(this.LJIIJ);
        abstractC1292630jk5.LIZIZ(this.LJIIIZ);
        for (int i2 = 0; i2 < ((ArrayList) this.LJIIJJI).size(); i2++) {
            abstractC1292630jk5.LIZIZ((AbstractC1293310jlB) ListProtector.get(this.LJIIJJI, i2));
        }
        C1293040jkk c1293040jkk = this.LJIIL;
        if (c1293040jkk != null) {
            abstractC1292630jk5.LIZIZ(c1293040jkk);
        }
        LIZ(this);
        this.LJIIIZ.LIZ(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((AbstractC1293310jlB) ListProtector.get(this.LJIIJJI, i3)).LIZ(this);
        }
        C1293040jkk c1293040jkk2 = this.LJIIL;
        if (c1293040jkk2 != null) {
            c1293040jkk2.LIZ(this);
        }
    }
}
