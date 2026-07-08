package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19RX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RX {
    public static final /* synthetic */ int LJIIL = 0;
    public final C21540919Rv LIZ;
    public final C21540919Rv LIZIZ;
    public final C21540919Rv LIZJ;
    public final C21540919Rv LIZLLL;
    public final InterfaceC21538819Ra LJ;
    public final InterfaceC21538819Ra LJFF;
    public final InterfaceC21538819Ra LJI;
    public final InterfaceC21538819Ra LJII;
    public final C21539819Rk LJIIIIZZ;
    public final C21539819Rk LJIIIZ;
    public final C21539819Rk LJIIJ;
    public final C21539819Rk LJIIJJI;

    public C19RX() {
        this.LIZ = new C21539519Rh();
        this.LIZIZ = new C21539519Rh();
        this.LIZJ = new C21539519Rh();
        this.LIZLLL = new C21539519Rh();
        this.LJ = new C1844490y6B(0.0f);
        this.LJFF = new C1844490y6B(0.0f);
        this.LJI = new C1844490y6B(0.0f);
        this.LJII = new C1844490y6B(0.0f);
        this.LJIIIIZZ = new C21539819Rk();
        this.LJIIIZ = new C21539819Rk();
        this.LJIIJ = new C21539819Rk();
        this.LJIIJJI = new C21539819Rk();
    }

    public C19RX(C19RY c19ry) {
        this.LIZ = c19ry.LIZ;
        this.LIZIZ = c19ry.LIZIZ;
        this.LIZJ = c19ry.LIZJ;
        this.LIZLLL = c19ry.LIZLLL;
        this.LJ = c19ry.LJ;
        this.LJFF = c19ry.LJFF;
        this.LJI = c19ry.LJI;
        this.LJII = c19ry.LJII;
        this.LJIIIIZZ = c19ry.LJIIIIZZ;
        this.LJIIIZ = c19ry.LJIIIZ;
        this.LJIIJ = c19ry.LJIIJ;
        this.LJIIJJI = c19ry.LJIIJJI;
    }

    public final boolean LIZLLL(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.LJIIJJI.getClass().equals(C21539819Rk.class) && this.LJIIIZ.getClass().equals(C21539819Rk.class) && this.LJIIIIZZ.getClass().equals(C21539819Rk.class) && this.LJIIJ.getClass().equals(C21539819Rk.class)) {
            z = true;
        } else {
            z = false;
        }
        float fLIZ = this.LJ.LIZ(rectF);
        if (this.LJFF.LIZ(rectF) == fLIZ && this.LJII.LIZ(rectF) == fLIZ && this.LJI.LIZ(rectF) == fLIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.LIZIZ instanceof C21539519Rh) && (this.LIZ instanceof C21539519Rh) && (this.LIZJ instanceof C21539519Rh) && (this.LIZLLL instanceof C21539519Rh)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    public final C19RX LJ(float f) {
        C19RY c19ry = new C19RY(this);
        c19ry.LIZJ(f);
        return new C19RX(c19ry);
    }

    public static InterfaceC21538819Ra LIZJ(TypedArray typedArray, int i, InterfaceC21538819Ra interfaceC21538819Ra) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC21538819Ra;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new C1844490y6B(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C1844480y6A(typedValuePeekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC21538819Ra;
    }

    public static C19RY LIZ(Context context, int i, int i2, C1844490y6B c1844490y6B) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC21538819Ra interfaceC21538819RaLIZJ = LIZJ(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, c1844490y6B);
            InterfaceC21538819Ra interfaceC21538819RaLIZJ2 = LIZJ(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, interfaceC21538819RaLIZJ);
            InterfaceC21538819Ra interfaceC21538819RaLIZJ3 = LIZJ(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, interfaceC21538819RaLIZJ);
            InterfaceC21538819Ra interfaceC21538819RaLIZJ4 = LIZJ(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, interfaceC21538819RaLIZJ);
            InterfaceC21538819Ra interfaceC21538819RaLIZJ5 = LIZJ(typedArrayObtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, interfaceC21538819RaLIZJ);
            C19RY c19ry = new C19RY();
            C21540919Rv c21540919RvLIZ = C21539119Rd.LIZ(i4);
            c19ry.LIZ = c21540919RvLIZ;
            float fLIZIZ = C19RY.LIZIZ(c21540919RvLIZ);
            if (fLIZIZ != -1.0f) {
                c19ry.LIZLLL(fLIZIZ);
            }
            c19ry.LJ = interfaceC21538819RaLIZJ2;
            C21540919Rv c21540919RvLIZ2 = C21539119Rd.LIZ(i5);
            c19ry.LIZIZ = c21540919RvLIZ2;
            float fLIZIZ2 = C19RY.LIZIZ(c21540919RvLIZ2);
            if (fLIZIZ2 != -1.0f) {
                c19ry.LJFF = new C1844490y6B(fLIZIZ2);
            }
            c19ry.LJFF = interfaceC21538819RaLIZJ3;
            C21540919Rv c21540919RvLIZ3 = C21539119Rd.LIZ(i6);
            c19ry.LIZJ = c21540919RvLIZ3;
            float fLIZIZ3 = C19RY.LIZIZ(c21540919RvLIZ3);
            if (fLIZIZ3 != -1.0f) {
                c19ry.LJI = new C1844490y6B(fLIZIZ3);
            }
            c19ry.LJI = interfaceC21538819RaLIZJ4;
            C21540919Rv c21540919RvLIZ4 = C21539119Rd.LIZ(i7);
            c19ry.LIZLLL = c21540919RvLIZ4;
            float fLIZIZ4 = C19RY.LIZIZ(c21540919RvLIZ4);
            if (fLIZIZ4 != -1.0f) {
                c19ry.LJII = new C1844490y6B(fLIZIZ4);
            }
            c19ry.LJII = interfaceC21538819RaLIZJ5;
            typedArrayObtainStyledAttributes.recycle();
            return c19ry;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static C19RY LIZIZ(Context context, AttributeSet attributeSet, int i, int i2) {
        C1844490y6B c1844490y6B = new C1844490y6B(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return LIZ(context, resourceId, resourceId2, c1844490y6B);
    }
}
