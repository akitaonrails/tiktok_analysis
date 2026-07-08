package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C653150Pjd implements InterfaceC653000PjO {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(20));
    public final Rect LIZJ = new Rect(0, 0, 0, 0);
    public final Rect LIZLLL = new Rect(0, 0, 0, 0);
    public int LJ;

    public void LJFF() {
        this.LIZ.getLocationOnScreen(LJI());
        this.LIZLLL.left = LJI()[0];
        this.LIZLLL.top = LJI()[1];
        this.LIZLLL.right = LJI()[0] + this.LIZ.getWidth();
        this.LIZLLL.bottom = LJI()[1] + this.LIZ.getHeight();
        float fHeight = this.LIZLLL.height();
        Rect rect = this.LIZJ;
        Rect rect2 = this.LIZLLL;
        int i = rect2.left;
        int i2 = rect2.top;
        rect.set(i, (int) (i2 + (0.0f * fHeight)), rect2.right, (int) (i2 + (fHeight * 1.0f)));
    }

    public final int[] LJI() {
        return (int[]) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC653000PjO
    public final int getOrientation() {
        return this.LJ;
    }

    public C653150Pjd(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public static final boolean LJIIIIZZ(Rect rect) {
        if (rect.right > rect.left && rect.bottom > rect.top) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC653000PjO
    public final void LIZ(int i) {
        this.LJ = i;
    }

    @Override // X.InterfaceC653000PjO
    public final boolean LIZIZ(Rect rect) {
        float f;
        int i;
        int i2;
        if (!LJIIIIZZ(rect)) {
            return false;
        }
        if (this.LJ == 0) {
            f = rect.top + ((rect.bottom - r1) / 2.0f);
            Rect rect2 = this.LIZJ;
            i = rect2.top;
            i2 = rect2.bottom;
        } else {
            f = rect.left + ((rect.right - r1) / 2.0f);
            Rect rect3 = this.LIZJ;
            i = rect3.left;
            i2 = rect3.right;
        }
        if (f < i || f > i2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    @Override // X.InterfaceC653000PjO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.AbstractC653010PjP LIZJ(java.util.Collection<? extends X.AbstractC653010PjP> r14) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C653150Pjd.LIZJ(java.util.Collection):X.0PjP");
    }

    @Override // X.InterfaceC653000PjO
    public final boolean LIZLLL(Rect rect) {
        float f;
        int i;
        int i2;
        if (!LJIIIIZZ(rect)) {
            return false;
        }
        if (this.LJ == 0) {
            f = this.LIZJ.top + ((r0.bottom - r1) / 2.0f);
            i = rect.top;
            i2 = rect.bottom;
        } else {
            f = this.LIZJ.left + ((r0.right - r1) / 2.0f);
            i = rect.left;
            i2 = rect.right;
        }
        if (f < i || f > i2) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(AbstractC653010PjP abstractC653010PjP, int i) {
        if (abstractC653010PjP == null || abstractC653010PjP.LIZ == i) {
            return false;
        }
        abstractC653010PjP.LIZ = i;
        return true;
    }

    public final float LJ(Rect rect, float f) {
        int i;
        int i2;
        if (this.LJ == 0) {
            i = rect.top;
            i2 = rect.bottom;
        } else {
            i = rect.left;
            i2 = rect.right;
        }
        float f2 = i;
        if (f2 <= f && i2 >= f) {
            return 0.0f;
        }
        if (f2 > f) {
            return f2 - f;
        }
        return f - i2;
    }
}
