package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294740jnU extends AbstractC1295030jnx {
    public AbstractC1295190joD<Float, Float> LJJIIJ;
    public final List<AbstractC1295030jnx> LJJIIJZLJL;
    public final RectF LJJIIZ;
    public final RectF LJJIIZI;
    public final Paint LJJIJ;
    public Boolean LJJIJIIJI;
    public Boolean LJJIJIIJIL;
    public float LJJIJIL;
    public boolean LJJIJL;

    public final boolean LJIJI() {
        if (this.LJJIJIIJIL == null) {
            for (int size = ((ArrayList) this.LJJIIJZLJL).size() - 1; size >= 0; size--) {
                AbstractC1295030jnx abstractC1295030jnx = (AbstractC1295030jnx) ListProtector.get(this.LJJIIJZLJL, size);
                if (abstractC1295030jnx instanceof C1294840jne) {
                    if (abstractC1295030jnx.LJIILIIL()) {
                        this.LJJIJIIJIL = Boolean.TRUE;
                        return true;
                    }
                } else if ((abstractC1295030jnx instanceof C1294740jnU) && ((C1294740jnU) abstractC1295030jnx).LJIJI()) {
                    this.LJJIJIIJIL = Boolean.TRUE;
                    return true;
                }
            }
            this.LJJIJIIJIL = Boolean.FALSE;
        }
        return this.LJJIJIIJIL.booleanValue();
    }

    @Override // X.AbstractC1295030jnx
    public final void LJIIZILJ(boolean z) {
        super.LJIIZILJ(z);
        Iterator it2 = ((ArrayList) this.LJJIIJZLJL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1295030jnx) it2.next()).LJIIZILJ(z);
        }
    }

    @Override // X.AbstractC1295030jnx
    public final void LJIJ(float f) {
        this.LJJIJIL = f;
        super.LJIJ(f);
        AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJJIIJ;
        if (abstractC1295190joD != null) {
            C1294720jnS c1294720jnS = this.LJIILJJIL.LL;
            f = ((abstractC1295190joD.LJFF().floatValue() * this.LJIILL.LIZIZ.LJIIL) - this.LJIILL.LIZIZ.LJIIJ) / ((c1294720jnS.LJIIJJI - c1294720jnS.LJIIJ) + 0.01f);
        }
        if (this.LJJIIJ == null) {
            C1294730jnT c1294730jnT = this.LJIILL;
            float f2 = c1294730jnT.LJIILIIL;
            C1294720jnS c1294720jnS2 = c1294730jnT.LIZIZ;
            f -= f2 / (c1294720jnS2.LJIIJJI - c1294720jnS2.LJIIJ);
        }
        C1294730jnT c1294730jnT2 = this.LJIILL;
        if (c1294730jnT2.LJIIL != 0.0f && !"__container".equals(c1294730jnT2.LIZJ)) {
            f /= this.LJIILL.LJIIL;
        }
        for (int size = ((ArrayList) this.LJJIIJZLJL).size() - 1; size >= 0; size--) {
            ((AbstractC1295030jnx) ListProtector.get(this.LJJIIJZLJL, size)).LJIJ(f);
        }
    }

    @Override // X.AbstractC1295030jnx, X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        super.LJII(c1295400joY, obj);
        if (obj == InterfaceC1295080jo2.LJJIIZ) {
            if (c1295400joY == null) {
                AbstractC1295190joD<Float, Float> abstractC1295190joD = this.LJJIIJ;
                if (abstractC1295190joD != null) {
                    abstractC1295190joD.LJIIJ(null);
                    return;
                }
                return;
            }
            C1295300joO c1295300joO = new C1295300joO(c1295400joY, null);
            this.LJJIIJ = c1295300joO;
            c1295300joO.LIZ(this);
            LIZIZ(this.LJJIIJ);
        }
    }

    @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
    public final void LJI(RectF rectF, Matrix matrix, boolean z) {
        super.LJI(rectF, matrix, z);
        for (int size = ((ArrayList) this.LJJIIJZLJL).size() - 1; size >= 0; size--) {
            this.LJJIIZ.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC1295030jnx) ListProtector.get(this.LJJIIJZLJL, size)).LJI(this.LJJIIZ, this.LJIILIIL, true);
            rectF.union(this.LJJIIZ);
        }
    }

    @Override // X.AbstractC1295030jnx
    public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.LJJIIZI;
        C1294730jnT c1294730jnT = this.LJIILL;
        rectF.set(0.0f, 0.0f, c1294730jnT.LJIILJJIL, c1294730jnT.LJIILL);
        matrix.mapRect(this.LJJIIZI);
        if (this.LJIILJJIL.LLJJJJ && ((ArrayList) this.LJJIIJZLJL).size() > 1 && i != 255) {
            this.LJJIJ.setAlpha(i);
            canvas.saveLayer(this.LJJIIZI, this.LJJIJ);
            i = 255;
        } else {
            canvas.save();
        }
        for (int size = ((ArrayList) this.LJJIIJZLJL).size() - 1; size >= 0; size--) {
            if ((!this.LJJIJL && "__container".equals(this.LJIILL.LIZJ)) || this.LJJIIZI.isEmpty() || canvas.clipRect(this.LJJIIZI)) {
                ((AbstractC1295030jnx) ListProtector.get(this.LJJIIJZLJL, size)).LIZ(canvas, matrix, i);
            }
        }
        canvas.restore();
    }

    public C1294740jnU(final C1295950jpR c1295950jpR, C1294730jnT c1294730jnT, List<C1294730jnT> list, final C1294720jnS c1294720jnS) {
        AbstractC1295030jnx abstractC1295030jnx;
        AbstractC1295030jnx c1294740jnU;
        super(c1295950jpR, c1294730jnT);
        this.LJJIIJZLJL = new ArrayList();
        this.LJJIIZ = new RectF();
        this.LJJIIZI = new RectF();
        this.LJJIJ = new Paint();
        this.LJJIJL = true;
        C1295020jnw c1295020jnw = c1294730jnT.LJIJ;
        if (c1295020jnw != null) {
            AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = c1295020jnw.LIZ();
            this.LJJIIJ = abstractC1295190joDLIZ;
            LIZIZ(abstractC1295190joDLIZ);
            this.LJJIIJ.LIZ(this);
        } else {
            this.LJJIIJ = null;
        }
        C20066713fN c20066713fN = new C20066713fN(c1294720jnS.LJIIIIZZ.size());
        int size = list.size() - 1;
        AbstractC1295030jnx abstractC1295030jnx2 = null;
        while (true) {
            if (size >= 0) {
                final C1294730jnT c1294730jnT2 = (C1294730jnT) ListProtector.get(list, size);
                switch (C1294930jnn.LIZ[c1294730jnT2.LJ.ordinal()]) {
                    case 1:
                        c1294740jnU = new AbstractC1295030jnx(c1294720jnS, c1295950jpR, this, c1294730jnT2) { // from class: X.0jne
                            public final C1295040jny LJJIIJ;
                            public final C1294740jnU LJJIIJZLJL;

                            @Override // X.AbstractC1295030jnx
                            public final C1295860jpI LJIIJJI() {
                                C1295860jpI c1295860jpI = this.LJIILL.LJIL;
                                return c1295860jpI != null ? c1295860jpI : this.LJJIIJZLJL.LJIILL.LJIL;
                            }

                            @Override // X.AbstractC1295030jnx
                            public final C1295720jp4 LJIIL() {
                                C1295720jp4 c1295720jp4 = this.LJIILL.LJJ;
                                return c1295720jp4 != null ? c1295720jp4 : this.LJJIIJZLJL.LJIILL.LJJ;
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
                            public final void LJI(RectF rectF, Matrix matrix, boolean z) {
                                super.LJI(rectF, matrix, z);
                                this.LJJIIJ.LJI(rectF, this.LJIILIIL, z);
                            }

                            @Override // X.AbstractC1295030jnx
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                this.LJJIIJ.LIZ(canvas, matrix, i);
                            }

                            {
                                super(c1295950jpR, c1294730jnT2);
                                this.LJJIIJZLJL = this;
                                C1295040jny c1295040jny = new C1295040jny(c1295950jpR, this, new C1294860jng("__container", false, c1294730jnT2.LIZ), c1294720jnS);
                                this.LJJIIJ = c1295040jny;
                                c1295040jny.LIZLLL(Collections.emptyList(), Collections.emptyList());
                            }

                            @Override // X.AbstractC1295030jnx
                            public final void LJIILLIIL(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list2, C1295090jo3 c1295090jo32) {
                                this.LJJIIJ.LJ(c1295090jo3, i, list2, c1295090jo32);
                            }
                        };
                        break;
                    case 2:
                        c1294740jnU = new C1294740jnU(c1295950jpR, c1294730jnT2, c1294720jnS.LIZJ.get(c1294730jnT2.LJI), c1294720jnS);
                        break;
                    case 3:
                        c1294740jnU = new AbstractC1295030jnx(c1295950jpR, c1294730jnT2) { // from class: X.0jmz
                            public final RectF LJJIIJ = new RectF();
                            public final C1294440jn0 LJJIIJZLJL;
                            public final float[] LJJIIZ;
                            public final Path LJJIIZI;
                            public final C1294730jnT LJJIJ;
                            public C1295300joO LJJIJIIJI;

                            {
                                C1294440jn0 c1294440jn0 = new C1294440jn0();
                                this.LJJIIJZLJL = c1294440jn0;
                                this.LJJIIZ = new float[8];
                                this.LJJIIZI = new Path();
                                this.LJJIJ = c1294730jnT2;
                                c1294440jn0.setAlpha(0);
                                c1294440jn0.setStyle(Paint.Style.FILL);
                                c1294440jn0.setColor(c1294730jnT2.LJIIJJI);
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295760jp8
                            public final void LJII(C1295400joY c1295400joY, Object obj) {
                                super.LJII(c1295400joY, obj);
                                if (obj == InterfaceC1295080jo2.LJJIJL) {
                                    if (c1295400joY == null) {
                                        this.LJJIJIIJI = null;
                                    } else {
                                        this.LJJIJIIJI = new C1295300joO(c1295400joY, null);
                                    }
                                }
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
                            public final void LJI(RectF rectF, Matrix matrix, boolean z) {
                                super.LJI(rectF, matrix, z);
                                RectF rectF2 = this.LJJIIJ;
                                C1294730jnT c1294730jnT3 = this.LJJIJ;
                                rectF2.set(0.0f, 0.0f, c1294730jnT3.LJIIIZ, c1294730jnT3.LJIIJ);
                                this.LJIILIIL.mapRect(this.LJJIIJ);
                                rectF.set(this.LJJIIJ);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.AbstractC1295030jnx
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                                int iIntValue;
                                int iAlpha = Color.alpha(this.LJJIJ.LJIIJJI);
                                if (iAlpha == 0) {
                                    return;
                                }
                                AbstractC1295190joD<Integer, Integer> abstractC1295190joD = this.LJIL.LJIIIZ;
                                if (abstractC1295190joD == null) {
                                    iIntValue = 100;
                                } else {
                                    iIntValue = abstractC1295190joD.LJFF().intValue();
                                }
                                int i2 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
                                this.LJJIIJZLJL.setAlpha(i2);
                                C1295300joO c1295300joO = this.LJJIJIIJI;
                                if (c1295300joO != null) {
                                    this.LJJIIJZLJL.setColorFilter((ColorFilter) c1295300joO.LJFF());
                                }
                                if (i2 > 0) {
                                    float[] fArr = this.LJJIIZ;
                                    fArr[0] = 0.0f;
                                    fArr[1] = 0.0f;
                                    C1294730jnT c1294730jnT3 = this.LJJIJ;
                                    float f = c1294730jnT3.LJIIIZ;
                                    fArr[2] = f;
                                    fArr[3] = 0.0f;
                                    fArr[4] = f;
                                    float f2 = c1294730jnT3.LJIIJ;
                                    fArr[5] = f2;
                                    fArr[6] = 0.0f;
                                    fArr[7] = f2;
                                    matrix.mapPoints(fArr);
                                    this.LJJIIZI.reset();
                                    Path path = this.LJJIIZI;
                                    float[] fArr2 = this.LJJIIZ;
                                    path.moveTo(fArr2[0], fArr2[1]);
                                    Path path2 = this.LJJIIZI;
                                    float[] fArr3 = this.LJJIIZ;
                                    path2.lineTo(fArr3[2], fArr3[3]);
                                    Path path3 = this.LJJIIZI;
                                    float[] fArr4 = this.LJJIIZ;
                                    path3.lineTo(fArr4[4], fArr4[5]);
                                    Path path4 = this.LJJIIZI;
                                    float[] fArr5 = this.LJJIIZ;
                                    path4.lineTo(fArr5[6], fArr5[7]);
                                    Path path5 = this.LJJIIZI;
                                    float[] fArr6 = this.LJJIIZ;
                                    path5.lineTo(fArr6[0], fArr6[1]);
                                    this.LJJIIZI.close();
                                    canvas.drawPath(this.LJJIIZI, this.LJJIIJZLJL);
                                }
                            }
                        };
                        break;
                    case 4:
                        c1294740jnU = new AbstractC1295030jnx(c1295950jpR, c1294730jnT2) { // from class: X.0jmx
                            public final C1294440jn0 LJJIIJ;
                            public final Rect LJJIIJZLJL;
                            public final Rect LJJIIZ;
                            public final C1294320jmo LJJIIZI;
                            public C1295300joO LJJIJ;
                            public C1295300joO LJJIJIIJI;

                            {
                                C1294320jmo c1294320jmo;
                                super(c1295950jpR, c1294730jnT2);
                                this.LJJIIJ = new C1294440jn0(3);
                                this.LJJIIJZLJL = new Rect();
                                this.LJJIIZ = new Rect();
                                String str = c1294730jnT2.LJI;
                                C1294720jnS c1294720jnS2 = c1295950jpR.LL;
                                if (c1294720jnS2 == null) {
                                    c1294320jmo = null;
                                } else {
                                    c1294320jmo = c1294720jnS2.LIZLLL.get(str);
                                }
                                this.LJJIIZI = c1294320jmo;
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295760jp8
                            public final void LJII(C1295400joY c1295400joY, Object obj) {
                                super.LJII(c1295400joY, obj);
                                if (obj == InterfaceC1295080jo2.LJJIJL) {
                                    if (c1295400joY == null) {
                                        this.LJJIJ = null;
                                        return;
                                    } else {
                                        this.LJJIJ = new C1295300joO(c1295400joY, null);
                                        return;
                                    }
                                }
                                if (obj != InterfaceC1295080jo2.LJJIZ) {
                                    return;
                                }
                                if (c1295400joY == null) {
                                    this.LJJIJIIJI = null;
                                } else {
                                    this.LJJIJIIJI = new C1295300joO(c1295400joY, null);
                                }
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
                            public final void LJI(RectF rectF, Matrix matrix, boolean z) {
                                super.LJI(rectF, matrix, z);
                                if (this.LJJIIZI != null) {
                                    float fLIZJ = C1294350jmr.LIZJ();
                                    C1294320jmo c1294320jmo = this.LJJIIZI;
                                    rectF.set(0.0f, 0.0f, c1294320jmo.LIZ * fLIZJ, c1294320jmo.LIZIZ * fLIZJ);
                                    this.LJIILIIL.mapRect(rectF);
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
                            /* JADX WARN: Removed duplicated region for block: B:69:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                            @Override // X.AbstractC1295030jnx
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIJ(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
                                /*
                                    Method dump skipped, instruction units count: 367
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1294410jmx.LJIIJ(android.graphics.Canvas, android.graphics.Matrix, int):void");
                            }
                        };
                        break;
                    case 5:
                        c1294740jnU = new AbstractC1295030jnx(c1295950jpR, c1294730jnT2) { // from class: X.0jmy
                            @Override // X.AbstractC1295030jnx
                            public final void LJIIJ(Canvas canvas, Matrix matrix, int i) {
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
                            public final void LJI(RectF rectF, Matrix matrix, boolean z) {
                                super.LJI(rectF, matrix, z);
                                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                        };
                        break;
                    case 6:
                        c1294740jnU = new AbstractC1295030jnx(c1295950jpR, c1294730jnT2) { // from class: X.0joP
                            public final StringBuilder LJJIIJ;
                            public final RectF LJJIIJZLJL;
                            public final Matrix LJJIIZ;
                            public final C1295740jp6 LJJIIZI;
                            public final C1295750jp7 LJJIJ;
                            public final Map<C1295700jp2, List<C1295040jny>> LJJIJIIJI;
                            public final C20066713fN<String> LJJIJIIJIL;
                            public final List<C1295780jpA> LJJIJIL;
                            public final C1295360joU LJJIJL;
                            public final C1295950jpR LJJIJLIJ;
                            public final C1294720jnS LJJIL;
                            public final C1295250joJ LJJIZ;
                            public C1295300joO LJJJ;
                            public final C1295250joJ LJJJI;
                            public C1295300joO LJJJIL;
                            public final C1295230joH LJJJJ;
                            public C1295300joO LJJJJI;
                            public final C1295230joH LJJJJIZL;
                            public C1295300joO LJJJJJ;
                            public C1295300joO LJJJJJL;
                            public C1295300joO LJJJJL;

                            public static List LJIL(String str) {
                                return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                            }

                            public final C1295780jpA LJIJJLI(int i) {
                                for (int size2 = ((ArrayList) this.LJJIJIL).size(); size2 < i; size2++) {
                                    ((ArrayList) this.LJJIJIL).add(new C1295780jpA());
                                }
                                return (C1295780jpA) ListProtector.get(this.LJJIJIL, i - 1);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [X.0jp6] */
                            /* JADX WARN: Type inference failed for: r0v4, types: [X.0jp7] */
                            {
                                super(c1295950jpR, c1294730jnT2);
                                this.LJJIIJ = new StringBuilder(2);
                                this.LJJIIJZLJL = new RectF();
                                this.LJJIIZ = new Matrix();
                                this.LJJIIZI = new Paint() { // from class: X.0jp6
                                    {
                                        setStyle(Paint.Style.FILL);
                                    }
                                };
                                this.LJJIJ = new Paint() { // from class: X.0jp7
                                    {
                                        setStyle(Paint.Style.STROKE);
                                    }
                                };
                                this.LJJIJIIJI = new HashMap();
                                this.LJJIJIIJIL = new C20066713fN<>();
                                this.LJJIJIL = new ArrayList();
                                this.LJJIJLIJ = c1295950jpR;
                                this.LJJIL = c1294730jnT2.LIZIZ;
                                C1295600jos c1295600jos = c1294730jnT2.LJIILLIIL;
                                c1295600jos.getClass();
                                C1295360joU c1295360joU = new C1295360joU(c1295600jos.LIZ);
                                this.LJJIJL = c1295360joU;
                                c1295360joU.LIZ(this);
                                LIZIZ(c1295360joU);
                                C1295770jp9 c1295770jp9 = c1294730jnT2.LJIIZILJ;
                                if (c1295770jp9 != null) {
                                    C1295450jod c1295450jod = c1295770jp9.LIZ;
                                    if (c1295450jod != null) {
                                        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ2 = c1295450jod.LIZ();
                                        this.LJJIZ = (C1295250joJ) abstractC1295190joDLIZ2;
                                        abstractC1295190joDLIZ2.LIZ(this);
                                        LIZIZ(abstractC1295190joDLIZ2);
                                    }
                                    C1295450jod c1295450jod2 = c1295770jp9.LIZIZ;
                                    if (c1295450jod2 != null) {
                                        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ3 = c1295450jod2.LIZ();
                                        this.LJJJI = (C1295250joJ) abstractC1295190joDLIZ3;
                                        abstractC1295190joDLIZ3.LIZ(this);
                                        LIZIZ(abstractC1295190joDLIZ3);
                                    }
                                    C1295020jnw c1295020jnw2 = c1295770jp9.LIZJ;
                                    if (c1295020jnw2 != null) {
                                        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ4 = c1295020jnw2.LIZ();
                                        this.LJJJJ = (C1295230joH) abstractC1295190joDLIZ4;
                                        abstractC1295190joDLIZ4.LIZ(this);
                                        LIZIZ(abstractC1295190joDLIZ4);
                                    }
                                    C1295020jnw c1295020jnw3 = c1295770jp9.LIZLLL;
                                    if (c1295020jnw3 != null) {
                                        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ5 = c1295020jnw3.LIZ();
                                        this.LJJJJIZL = (C1295230joH) abstractC1295190joDLIZ5;
                                        abstractC1295190joDLIZ5.LIZ(this);
                                        LIZIZ(abstractC1295190joDLIZ5);
                                    }
                                }
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295760jp8
                            public final void LJII(final C1295400joY c1295400joY, Object obj) {
                                super.LJII(c1295400joY, obj);
                                if (obj == InterfaceC1295080jo2.LIZ) {
                                    C1295300joO c1295300joO = this.LJJJ;
                                    if (c1295300joO != null) {
                                        LJIILL(c1295300joO);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJ = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO2 = new C1295300joO(c1295400joY, null);
                                    this.LJJJ = c1295300joO2;
                                    c1295300joO2.LIZ(this);
                                    LIZIZ(this.LJJJ);
                                    return;
                                }
                                if (obj == InterfaceC1295080jo2.LIZIZ) {
                                    C1295300joO c1295300joO3 = this.LJJJIL;
                                    if (c1295300joO3 != null) {
                                        LJIILL(c1295300joO3);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJIL = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO4 = new C1295300joO(c1295400joY, null);
                                    this.LJJJIL = c1295300joO4;
                                    c1295300joO4.LIZ(this);
                                    LIZIZ(this.LJJJIL);
                                    return;
                                }
                                if (obj == InterfaceC1295080jo2.LJIJ) {
                                    C1295300joO c1295300joO5 = this.LJJJJI;
                                    if (c1295300joO5 != null) {
                                        LJIILL(c1295300joO5);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJJI = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO6 = new C1295300joO(c1295400joY, null);
                                    this.LJJJJI = c1295300joO6;
                                    c1295300joO6.LIZ(this);
                                    LIZIZ(this.LJJJJI);
                                    return;
                                }
                                if (obj == InterfaceC1295080jo2.LJIJI) {
                                    C1295300joO c1295300joO7 = this.LJJJJJ;
                                    if (c1295300joO7 != null) {
                                        LJIILL(c1295300joO7);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJJJ = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO8 = new C1295300joO(c1295400joY, null);
                                    this.LJJJJJ = c1295300joO8;
                                    c1295300joO8.LIZ(this);
                                    LIZIZ(this.LJJJJJ);
                                    return;
                                }
                                if (obj == InterfaceC1295080jo2.LJJIIZI) {
                                    C1295300joO c1295300joO9 = this.LJJJJJL;
                                    if (c1295300joO9 != null) {
                                        LJIILL(c1295300joO9);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJJJL = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO10 = new C1295300joO(c1295400joY, null);
                                    this.LJJJJJL = c1295300joO10;
                                    c1295300joO10.LIZ(this);
                                    LIZIZ(this.LJJJJJL);
                                    return;
                                }
                                if (obj == InterfaceC1295080jo2.LJJIL) {
                                    C1295300joO c1295300joO11 = this.LJJJJL;
                                    if (c1295300joO11 != null) {
                                        LJIILL(c1295300joO11);
                                    }
                                    if (c1295400joY == null) {
                                        this.LJJJJL = null;
                                        return;
                                    }
                                    C1295300joO c1295300joO12 = new C1295300joO(c1295400joY, null);
                                    this.LJJJJL = c1295300joO12;
                                    c1295300joO12.LIZ(this);
                                    LIZIZ(this.LJJJJL);
                                    return;
                                }
                                if (obj != InterfaceC1295080jo2.LJJJ) {
                                    return;
                                }
                                C1295360joU c1295360joU = this.LJJIJL;
                                c1295360joU.getClass();
                                final C1295570jop c1295570jop = new C1295570jop();
                                final C1295340joS c1295340joS = new C1295340joS();
                                c1295360joU.LJIIJ(new C1295400joY<C1295340joS>() { // from class: X.0joV
                                    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
                                    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
                                    @Override // X.C1295400joY
                                    public final C1295340joS LIZ(C1295570jop<C1295340joS> c1295570jop2) {
                                        C1295340joS c1295340joS2;
                                        C1295570jop c1295570jop3 = c1295570jop;
                                        float f = c1295570jop2.LIZ;
                                        float f2 = c1295570jop2.LIZIZ;
                                        ?? r4 = c1295570jop2.LIZJ.LIZ;
                                        ?? r3 = c1295570jop2.LIZLLL.LIZ;
                                        float f3 = c1295570jop2.LJ;
                                        float f4 = c1295570jop2.LJFF;
                                        float f5 = c1295570jop2.LJI;
                                        c1295570jop3.LIZ = f;
                                        c1295570jop3.LIZIZ = f2;
                                        c1295570jop3.LIZJ = r4;
                                        c1295570jop3.LIZLLL = r3;
                                        c1295570jop3.LJ = f3;
                                        c1295570jop3.LJFF = f4;
                                        c1295570jop3.LJI = f5;
                                        String str = (String) c1295400joY.LIZ(c1295570jop3);
                                        if (c1295570jop2.LJFF == 1.0f) {
                                            c1295340joS2 = c1295570jop2.LIZLLL;
                                        } else {
                                            c1295340joS2 = c1295570jop2.LIZJ;
                                        }
                                        C1295340joS c1295340joS3 = c1295340joS2;
                                        C1295340joS c1295340joS4 = c1295340joS;
                                        String str2 = c1295340joS3.LIZIZ;
                                        float f6 = c1295340joS3.LIZJ;
                                        EnumC1295510joj enumC1295510joj = c1295340joS3.LIZLLL;
                                        int i = c1295340joS3.LJ;
                                        float f7 = c1295340joS3.LJFF;
                                        float f8 = c1295340joS3.LJI;
                                        int i2 = c1295340joS3.LJII;
                                        int i3 = c1295340joS3.LJIIIIZZ;
                                        float f9 = c1295340joS3.LJIIIZ;
                                        boolean z = c1295340joS3.LJIIJ;
                                        PointF pointF = c1295340joS3.LJIIJJI;
                                        PointF pointF2 = c1295340joS3.LJIIL;
                                        c1295340joS4.LIZ = str;
                                        c1295340joS4.LIZIZ = str2;
                                        c1295340joS4.LIZJ = f6;
                                        c1295340joS4.LIZLLL = enumC1295510joj;
                                        c1295340joS4.LJ = i;
                                        c1295340joS4.LJFF = f7;
                                        c1295340joS4.LJI = f8;
                                        c1295340joS4.LJII = i2;
                                        c1295340joS4.LJIIIIZZ = i3;
                                        c1295340joS4.LJIIIZ = f9;
                                        c1295340joS4.LJIIJ = z;
                                        c1295340joS4.LJIIJJI = pointF;
                                        c1295340joS4.LJIIL = pointF2;
                                        return c1295340joS4;
                                    }
                                });
                            }

                            public static void LJIJI(String str, Paint paint, Canvas canvas) {
                                if (paint.getColor() == 0) {
                                    return;
                                }
                                if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                                    return;
                                }
                                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
                            }

                            public static void LJIJJ(Canvas canvas, Paint paint, Path path) {
                                if (paint.getColor() == 0) {
                                    return;
                                }
                                if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                                    return;
                                }
                                canvas.drawPath(path, paint);
                            }

                            @Override // X.AbstractC1295030jnx, X.InterfaceC1295800jpC
                            public final void LJI(RectF rectF, Matrix matrix, boolean z) {
                                super.LJI(rectF, matrix, z);
                                rectF.set(0.0f, 0.0f, this.LJJIL.LJIIIZ.width(), this.LJJIL.LJIIIZ.height());
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:102:0x02f0  */
                            /* JADX WARN: Removed duplicated region for block: B:107:0x0310  */
                            /* JADX WARN: Removed duplicated region for block: B:147:0x0408  */
                            /* JADX WARN: Removed duplicated region for block: B:150:0x0418  */
                            /* JADX WARN: Removed duplicated region for block: B:168:0x047b  */
                            /* JADX WARN: Removed duplicated region for block: B:196:0x0514  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
                            /* JADX WARN: Removed duplicated region for block: B:90:0x028d A[PHI: r5
                              0x028d: PHI (r5v21 android.graphics.Typeface) = 
                              (r5v4 android.graphics.Typeface)
                              (r5v13 android.graphics.Typeface)
                              (r5v14 android.graphics.Typeface)
                              (r5v33 android.graphics.Typeface)
                             binds: [B:171:0x0496, B:197:0x0516, B:160:0x0444, B:89:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:92:0x0297  */
                            /* JADX WARN: Removed duplicated region for block: B:99:0x02bc  */
                            /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.String] */
                            /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.String] */
                            @Override // X.AbstractC1295030jnx
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIJ(android.graphics.Canvas r24, android.graphics.Matrix r25, int r26) {
                                /*
                                    Method dump skipped, instruction units count: 1308
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1295310joP.LJIIJ(android.graphics.Canvas, android.graphics.Matrix, int):void");
                            }

                            public static void LJJ(Canvas canvas, C1295340joS c1295340joS, int i, float f) {
                                float f2;
                                float f3;
                                PointF pointF = c1295340joS.LJIIJJI;
                                PointF pointF2 = c1295340joS.LJIIL;
                                float fLIZJ = C1294350jmr.LIZJ();
                                float f4 = 0.0f;
                                if (pointF == null) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = (c1295340joS.LJFF * fLIZJ) + pointF.y;
                                }
                                float f5 = (i * c1295340joS.LJFF * fLIZJ) + f2;
                                if (pointF == null) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = pointF.x;
                                }
                                if (pointF2 != null) {
                                    f4 = pointF2.x;
                                }
                                int i2 = C1295500joi.LIZ[c1295340joS.LIZLLL.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 == 3) {
                                            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
                                            return;
                                        }
                                        return;
                                    }
                                    canvas.translate((f3 + f4) - f, f5);
                                    return;
                                }
                                canvas.translate(f3, f5);
                            }

                            public final List<C1295780jpA> LJJI(String str, float f, C1294400jmw c1294400jmw, float f2, float f3, boolean z) {
                                float fMeasureText;
                                int i = 0;
                                int i2 = 0;
                                boolean z2 = false;
                                int i3 = 0;
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                for (int i4 = 0; i4 < str.length(); i4++) {
                                    char cCharAt = str.charAt(i4);
                                    if (z) {
                                        C1295700jp2 c1295700jp2LIZLLL = this.LJJIL.LJI.LIZLLL((((cCharAt * 31) + c1294400jmw.LIZ.hashCode()) * 31) + c1294400jmw.LIZJ.hashCode());
                                        if (c1295700jp2LIZLLL != null) {
                                            fMeasureText = ((float) c1295700jp2LIZLLL.LIZJ) * f2 * C1294350jmr.LIZJ();
                                        }
                                    } else {
                                        fMeasureText = measureText(str.substring(i4, i4 + 1));
                                    }
                                    float f7 = fMeasureText + f3;
                                    if (cCharAt == ' ') {
                                        z2 = true;
                                        f6 = f7;
                                    } else if (z2) {
                                        z2 = false;
                                        i3 = i4;
                                        f5 = f7;
                                    } else {
                                        f5 += f7;
                                    }
                                    f4 += f7;
                                    if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                                        i++;
                                        C1295780jpA c1295780jpALJIJJLI = LJIJJLI(i);
                                        if (i3 == i2) {
                                            c1295780jpALJIJJLI.LIZ = str.substring(i2, i4).trim();
                                            c1295780jpALJIJJLI.LIZIZ = (f4 - f7) - ((r5.length() - r0.length()) * f6);
                                            i2 = i4;
                                            i3 = i4;
                                            f4 = f7;
                                            f5 = f7;
                                        } else {
                                            c1295780jpALJIJJLI.LIZ = str.substring(i2, i3 - 1).trim();
                                            c1295780jpALJIJJLI.LIZIZ = ((f4 - f5) - ((r0.length() - r7.length()) * f6)) - f6;
                                            f4 = f5;
                                            i2 = i3;
                                        }
                                    }
                                }
                                if (f4 > 0.0f) {
                                    i++;
                                    C1295780jpA c1295780jpALJIJJLI2 = LJIJJLI(i);
                                    c1295780jpALJIJJLI2.LIZ = str.substring(i2);
                                    c1295780jpALJIJJLI2.LIZIZ = f4;
                                }
                                return ((ArrayList) this.LJJIJIL).subList(0, i);
                            }
                        };
                        break;
                    default:
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown layer type ");
                        sbLIZ.append(c1294730jnT2.LJ);
                        C1292050jj9.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        continue;
                        size--;
                        break;
                }
                c20066713fN.LJIIIZ(c1294740jnU.LJIILL.LIZLLL, c1294740jnU);
                if (abstractC1295030jnx2 != null) {
                    abstractC1295030jnx2.LJIJ = c1294740jnU;
                    abstractC1295030jnx2 = null;
                } else {
                    ListProtector.add(this.LJJIIJZLJL, 0, c1294740jnU);
                    int i = C1295490joh.LIZ[c1294730jnT2.LJIJJ.ordinal()];
                    if (i == 1 || i == 2) {
                        abstractC1295030jnx2 = c1294740jnU;
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < c20066713fN.LJIIJJI(); i2++) {
                    AbstractC1295030jnx abstractC1295030jnx3 = (AbstractC1295030jnx) c20066713fN.LJ(c20066713fN.LJIIIIZZ(i2));
                    if (abstractC1295030jnx3 != null && (abstractC1295030jnx = (AbstractC1295030jnx) c20066713fN.LJ(abstractC1295030jnx3.LJIILL.LJFF)) != null) {
                        abstractC1295030jnx3.LJIJI = abstractC1295030jnx;
                    }
                }
                return;
            }
        }
    }

    @Override // X.AbstractC1295030jnx
    public final void LJIILLIIL(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        for (int i2 = 0; i2 < ((ArrayList) this.LJJIIJZLJL).size(); i2++) {
            ((AbstractC1295030jnx) ListProtector.get(this.LJJIIJZLJL, i2)).LJ(c1295090jo3, i, list, c1295090jo32);
        }
    }
}
