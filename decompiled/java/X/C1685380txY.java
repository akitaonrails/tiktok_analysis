package X;

import Y.AObjectS399S0100000_25;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0txY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685380txY extends AbstractC1676270tir implements InterfaceC20035313aJ {
    public final Drawable LLILZLL;
    public final C05P0 LLIZLLLIL;
    public boolean LLJ;
    public final InterfaceC1676320tiw LLIZ = C1696870uG5.LIZ(0);
    public final C01GW LLJI = C452501pT.LIZIZ(new AObjectS399S0100000_25(this, 28));

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        this.LLJ = true;
        Object obj = this.LLILZLL;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.LLILZLL.setVisible(false, false);
        this.LLILZLL.setCallback(null);
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        this.LLJ = false;
        this.LLILZLL.setCallback((Drawable.Callback) this.LLJI.getValue());
        this.LLILZLL.setVisible(true, true);
        Object obj = this.LLILZLL;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // X.AbstractC1676270tir
    public final long LJIIIIZZ() {
        return ((C1680770tq7) ((C13FE) this.LLIZLLLIL).getValue()).LIZ;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        LIZLLL();
    }

    public C1685380txY(Drawable drawable) {
        this.LLILZLL = drawable;
        this.LLIZLLLIL = C20028913Yh.LJI(new C1680770tq7(C1668830tWr.LIZ(drawable)));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZ(float f) {
        this.LLILZLL.setAlpha(C13LZ.LJ(C814420VxA.LIZIZ(f * 255), 0, 255));
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final boolean LIZIZ(C1685400txa c1685400txa) {
        ColorFilter colorFilter;
        Drawable drawable = this.LLILZLL;
        if (c1685400txa != null) {
            colorFilter = c1685400txa.LIZ;
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    @Override // X.AbstractC1676270tir
    public final void LIZJ(EnumC1671200tag enumC1671200tag) {
        Drawable drawable = this.LLILZLL;
        int i = C1672270tcP.LIZ[enumC1671200tag.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
        } else {
            i2 = 0;
        }
        drawable.setLayoutDirection(i2);
    }

    @Override // X.AbstractC1676270tir
    public final void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
        ((C13FG) this.LLIZ).LIZLLL();
        if (!this.LLJ) {
            this.LLILZLL.setBounds(0, 0, C814420VxA.LIZIZ(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32))), C814420VxA.LIZIZ(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L))));
            try {
                interfaceC1686290tz1LIZ.save();
                try {
                    Drawable drawable = this.LLILZLL;
                    Canvas canvas = C1296530jqN.LIZ;
                    drawable.draw(((C1696880uG6) interfaceC1686290tz1LIZ).LIZ);
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!(this.LLILZLL instanceof C1321120kU2)) {
                        throw e;
                    }
                }
                interfaceC1686290tz1LIZ.LJIIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC1686290tz1LIZ.LJIIJ();
                throw th;
            }
        }
    }
}
