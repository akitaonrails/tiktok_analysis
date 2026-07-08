package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.120z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196875120z implements C121H {
    public final /* synthetic */ C196864120o LIZ;

    @Override // X.C121H
    public final int LIZIZ(C196874120y c196874120y, boolean z, boolean z2) {
        return 0;
    }

    public C196875120z(C196864120o c196864120o) {
        this.LIZ = c196864120o;
    }

    @Override // X.C121H
    public final Float LIZ(float f) {
        return Float.valueOf(f);
    }

    @Override // X.C121H
    public final PointF LIZLLL(C196874120y c196874120y, float f, float f2) {
        return new PointF();
    }

    @Override // X.C121H
    public final void LIZJ(C196874120y c196874120y, int i, int i2, boolean z) {
        Pair<Float, Float> pair;
        Boolean value = this.LIZ.LLLILZLLLI().rb().getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(value, bool) && !Intrinsics.LJFF(this.LIZ.LLLILZLLLI().Mk0().getValue(), bool) && !c196874120y.LLILLL.isNowSmallWindowSticker()) {
            if (z) {
                C1456140nzo.LIZIZ(this.LIZ.LLLILZ(), true, true, false, false, 12);
                InterfaceC1414530muh interfaceC1414530muh = this.LIZ.LLJJL;
                if (interfaceC1414530muh != null) {
                    interfaceC1414530muh.bK1(new C1413010msF(false, false, null, false, false, 62));
                }
                InterfaceC391240FVq interfaceC391240FVqLLLJ = this.LIZ.LLLJ();
                if (interfaceC391240FVqLLLJ != null) {
                    interfaceC391240FVqLLLJ.RG1();
                }
                RectF rectF = new RectF(c196874120y.LLIZLLLIL);
                Matrix matrix = new Matrix();
                matrix.setRotate(c196874120y.LLILLL.rotateAngle, rectF.centerX(), rectF.centerY());
                matrix.mapRect(rectF);
                InterfaceC391240FVq interfaceC391240FVqLLLJ2 = this.LIZ.LLLJ();
                if (interfaceC391240FVqLLLJ2 == null || (pair = interfaceC391240FVqLLLJ2.y42(rectF)) == null) {
                    pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f));
                }
                if (pair.getFirst().floatValue() == 0.0f && pair.getSecond().floatValue() == 1.0f) {
                    return;
                }
                this.LIZ.LLLLIILL().LLILLL.LLIZLLLIL.LJIIIIZZ(c196874120y, pair.getSecond().floatValue());
                this.LIZ.LLLLIILL().LLILLL.LLIZLLLIL.LJI(c196874120y, 0.0f, pair.getFirst().floatValue());
                return;
            }
            C1456140nzo.LIZIZ(this.LIZ.LLLILZ(), false, true, false, false, 12);
            this.LIZ.LLLLIILL().LIZLLL();
            this.LIZ.LLLLIL().LJJJLZIJ();
            InterfaceC391240FVq interfaceC391240FVqLLLJ3 = this.LIZ.LLLJ();
            if (interfaceC391240FVqLLLJ3 != null) {
                interfaceC391240FVqLLLJ3.ck();
            }
            InterfaceC391240FVq interfaceC391240FVqLLLJ4 = this.LIZ.LLLJ();
            if (interfaceC391240FVqLLLJ4 == null) {
                return;
            }
            interfaceC391240FVqLLLJ4.Ps0();
            return;
        }
        if (this.LIZ.LLLLIILL().LLLII != null) {
            C196868120s c196868120sLLLLIILL = this.LIZ.LLLLIILL();
            if (c196868120sLLLLIILL.LLJJL) {
                c196868120sLLLLIILL.LJIIZILJ();
            }
        }
    }
}
