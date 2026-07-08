package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0tqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681300tqy {
    public static final Rect LIZ(C1680470tpd c1680470tpd) {
        return new Rect(c1680470tpd.LIZ, c1680470tpd.LIZIZ, c1680470tpd.LIZJ, c1680470tpd.LIZLLL);
    }

    @InterfaceC1294060jmO
    public static final Rect LIZIZ(C1683130ttv c1683130ttv) {
        return new Rect((int) c1683130ttv.LIZ, (int) c1683130ttv.LIZIZ, (int) c1683130ttv.LIZJ, (int) c1683130ttv.LIZLLL);
    }

    public static final RectF LIZJ(C1683130ttv c1683130ttv) {
        return new RectF(c1683130ttv.LIZ, c1683130ttv.LIZIZ, c1683130ttv.LIZJ, c1683130ttv.LIZLLL);
    }

    public static final C1683130ttv LIZLLL(RectF rectF) {
        return new C1683130ttv(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
