package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0khl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329630khl implements InterfaceC1330960kju, InterfaceC1330920kjq {
    public static final Class<?> LJIILL = C1329630khl.class;
    public final AbstractC1301670jyf LIZ;
    public final InterfaceC1329690khr LIZIZ;
    public final InterfaceC1330470kj7 LIZJ;
    public final InterfaceC1331310kkT LIZLLL;
    public InterfaceC1330330kit LJ;
    public final InterfaceC1331320kkU LJFF;
    public Rect LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public C1330000kiM LJIIJJI;
    public boolean LJIIL;
    public final Object LJIILJJIL;
    public Bitmap.Config LJIIJ = Bitmap.Config.ARGB_8888;
    public int LJIILIIL = -1;
    public final Paint LJI = new Paint(6);

    @Override // X.InterfaceC1330960kju
    public final boolean LIZ() {
        boolean z = this.LJIIL;
        if (C1328130kfL.LJIILIIL().LJJI()) {
            return true;
        }
        return z && C1328130kfL.LJIILIIL().LJJIFFI();
    }

    @Override // X.InterfaceC1330920kjq
    public final void LJI() {
        if (C1328580kg4.LIZIZ(this.LJIIJJI) && (C1328130kfL.LJIILIIL().LJJI() || C1328130kfL.LJIILIIL().LJJIFFI())) {
            return;
        }
        clear();
    }

    public final void LJIILIIL() {
        int width = ((C1329620khk) this.LIZLLL).LIZIZ.getWidth();
        this.LJIIIIZZ = width;
        if (width == -1) {
            Rect rect = this.LJII;
            this.LJIIIIZZ = rect == null ? -1 : rect.width();
        }
        int height = ((C1329620khk) this.LIZLLL).LIZIZ.getHeight();
        this.LJIIIZ = height;
        if (height == -1) {
            Rect rect2 = this.LJII;
            this.LJIIIZ = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // X.InterfaceC1330960kju
    public final void clear() {
        this.LIZIZ.LIZ(this.LJIIJJI, LIZ());
    }

    @Override // X.InterfaceC1330470kj7
    public final int getFrameCount() {
        return this.LIZJ.getFrameCount();
    }

    @Override // X.InterfaceC1330470kj7
    public final int getLoopCount() {
        return this.LIZJ.getLoopCount();
    }

    @Override // X.InterfaceC1330960kju
    public final int LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1330960kju
    public final int LJII() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1330960kju
    public final C1330000kiM getImageFormat() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1330960kju
    public final void LIZJ(int i) {
        this.LJI.setAlpha(i);
    }

    @Override // X.InterfaceC1330960kju
    public final void LIZLLL(ColorFilter colorFilter) {
        this.LJI.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC1330470kj7
    public final int LJ(int i) {
        return this.LIZJ.LJ(i);
    }

    @Override // X.InterfaceC1330960kju
    public final void LJIIIIZZ(Rect rect) {
        this.LJII = rect;
        C1329620khk c1329620khk = (C1329620khk) this.LIZLLL;
        C1329590khh c1329590khhLJ = c1329620khk.LIZIZ.LJ(rect);
        if (c1329590khhLJ != c1329620khk.LIZIZ) {
            c1329620khk.LIZIZ = c1329590khhLJ;
            c1329620khk.LIZJ = new C1329790ki1(c1329590khhLJ, c1329620khk.LIZLLL);
        }
        LJIILIIL();
    }

    @Override // X.InterfaceC1330960kju
    public final boolean LJIIIZ(int i) {
        return this.LIZIZ.LIZJ(i, this.LJIIJJI, LIZ());
    }

    public final boolean LJIIL(C1323050kX9 c1323050kX9, int i) {
        if (!C1323050kX9.LJIJJ(c1323050kX9)) {
            return false;
        }
        boolean zLIZ = ((C1329620khk) this.LIZLLL).LIZ(i, (Bitmap) c1323050kX9.get());
        if (!zLIZ) {
            C1323050kX9.LJII(c1323050kX9);
        }
        return zLIZ;
    }

    @Override // X.InterfaceC1330960kju
    public final boolean LIZIZ(int i, Canvas canvas, Drawable drawable) throws Throwable {
        InterfaceC1331320kkU interfaceC1331320kkU;
        C1323050kX9 c1323050kX9LIZLLL;
        boolean zLJIIJ;
        C1323050kX9 c1323050kX9LIZIZ;
        boolean zLJIIJJI = false;
        if (C1328580kg4.LIZIZ(this.LJIIJJI)) {
            C1323050kX9 c1323050kX9 = null;
            try {
                if (i == this.LJIILIIL) {
                    c1323050kX9LIZLLL = this.LIZIZ.LIZIZ();
                    try {
                        zLJIIJ = LJIIJ(i, c1323050kX9LIZLLL, canvas, 3);
                    } catch (Throwable th) {
                        th = th;
                        c1323050kX9 = c1323050kX9LIZLLL;
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9);
                        throw th;
                    }
                } else {
                    c1323050kX9LIZLLL = null;
                    zLJIIJ = false;
                }
                if (!zLJIIJ && !(zLJIIJ = LJIIJ(i, (c1323050kX9LIZLLL = this.LIZIZ.LIZLLL(i, this.LJIIJJI, LIZ())), canvas, 1))) {
                    try {
                        if (C1328730kgJ.LJII) {
                            c1323050kX9LIZIZ = this.LIZ.LIZIZ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIILJJIL);
                        } else {
                            c1323050kX9LIZIZ = this.LIZ.LIZIZ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, null);
                        }
                        if (LJIIL(c1323050kX9LIZIZ, i) && LJIIJ(i, c1323050kX9LIZIZ, canvas, 2)) {
                            zLJIIJJI = true;
                        }
                        c1323050kX9LIZLLL = c1323050kX9LIZIZ;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1328570kg3.LJIILLIIL(LJIILL, "Failed to create frame bitmap for render heif frame", th2);
                        C1323050kX9.LJII(c1323050kX9LIZLLL);
                    }
                } else {
                    zLJIIJJI = zLJIIJ;
                }
                C1323050kX9.LJII(c1323050kX9LIZLLL);
                this.LJIILIIL = i;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            zLJIIJJI = LJIIJJI(i, 0, canvas);
        }
        InterfaceC1330330kit interfaceC1330330kit = this.LJ;
        if (interfaceC1330330kit != null && (interfaceC1331320kkU = this.LJFF) != null) {
            interfaceC1330330kit.LIZ(interfaceC1331320kkU, this.LIZIZ, this, i);
        }
        return zLJIIJJI;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean LJIIJJI(int i, int i2, Canvas canvas) {
        C1323050kX9 c1323050kX9LIZLLL;
        boolean zLJIIJ = false;
        int i3 = 1;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return false;
                        }
                        c1323050kX9LIZLLL = this.LIZIZ.LIZIZ();
                        zLJIIJ = LJIIJ(i, c1323050kX9LIZLLL, canvas, 3);
                        i3 = -1;
                    } else {
                        try {
                            if (C1328730kgJ.LJII) {
                                c1323050kX9LIZLLL = this.LIZ.LIZIZ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIILJJIL);
                            } else {
                                c1323050kX9LIZLLL = this.LIZ.LIZIZ(this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, null);
                            }
                            if (LJIIL(c1323050kX9LIZLLL, i) && LJIIJ(i, c1323050kX9LIZLLL, canvas, 2)) {
                                zLJIIJ = true;
                            }
                            i3 = 3;
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1328570kg3.LJIILLIIL(LJIILL, "Failed to create frame bitmap", e);
                            return false;
                        }
                    }
                } else {
                    c1323050kX9LIZLLL = this.LIZIZ.LJI(this.LJIIJJI, LIZ());
                    if (LJIIL(c1323050kX9LIZLLL, i) && LJIIJ(i, c1323050kX9LIZLLL, canvas, 1)) {
                        zLJIIJ = true;
                    }
                    i3 = 2;
                }
            } else {
                c1323050kX9LIZLLL = this.LIZIZ.LIZLLL(i, this.LJIIJJI, LIZ());
                zLJIIJ = LJIIJ(i, c1323050kX9LIZLLL, canvas, 0);
            }
            C1323050kX9.LJII(c1323050kX9LIZLLL);
            if (!zLJIIJ && i3 != -1) {
                return LJIIJJI(i, i3, canvas);
            }
            return zLJIIJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(null);
            throw th;
        }
    }

    public final boolean LJIIJ(int i, C1323050kX9<Bitmap> c1323050kX9, Canvas canvas, int i2) {
        if (!C1323050kX9.LJIJJ(c1323050kX9)) {
            return false;
        }
        try {
            if (this.LJII == null) {
                canvas.drawBitmap(c1323050kX9.get(), 0.0f, 0.0f, this.LJI);
            } else {
                canvas.drawBitmap(c1323050kX9.get(), (Rect) null, this.LJII, this.LJI);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LIZLLL(LJIILL, "canvas draw error: ", e);
        }
        if (i2 != 3) {
            this.LIZIZ.LJ(i, c1323050kX9, this.LJIIJJI, LIZ());
            return true;
        }
        return true;
    }

    public C1329630khl(AbstractC1301670jyf abstractC1301670jyf, InterfaceC1329690khr interfaceC1329690khr, C1329980kiK c1329980kiK, C1329620khk c1329620khk, C1329660kho c1329660kho, C1329650khn c1329650khn, C1329360khK c1329360khK) {
        this.LIZ = abstractC1301670jyf;
        this.LIZIZ = interfaceC1329690khr;
        this.LIZJ = c1329980kiK;
        this.LIZLLL = c1329620khk;
        this.LJ = c1329660kho;
        this.LJFF = c1329650khn;
        this.LJIILJJIL = c1329360khK;
        LJIILIIL();
    }
}
