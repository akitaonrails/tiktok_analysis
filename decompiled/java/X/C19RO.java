package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19RO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RO {
    public static final void LIZIZ(C19RS c19rs) {
        float f;
        C19RQ c19rq = (C19RQ) c19rs;
        if (!c19rq.LIZIZ.getUseCompatPadding()) {
            c19rq.LIZ(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c19rq.LIZ;
        float f2 = ((C19RP) drawable).LJ;
        float f3 = ((C19RP) drawable).LIZ;
        if (c19rq.LIZIZ.getPreventCornerOverlap()) {
            f = (float) (((double) f2) + ((1.0d - C19RR.LIZ) * ((double) f3)));
        } else {
            int i = C19RR.LIZIZ;
            f = f2;
        }
        int iCeil = (int) Math.ceil(f);
        int iCeil2 = (int) Math.ceil(C19RR.LIZ(f2, f3, c19rq.LIZIZ.getPreventCornerOverlap()));
        c19rq.LIZ(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void LIZ(C19RS c19rs, float f) {
        C19RQ c19rq = (C19RQ) c19rs;
        C19RP c19rp = (C19RP) c19rq.LIZ;
        boolean useCompatPadding = c19rq.LIZIZ.getUseCompatPadding();
        boolean preventCornerOverlap = c19rq.LIZIZ.getPreventCornerOverlap();
        if (f != c19rp.LJ || c19rp.LJFF != useCompatPadding || c19rp.LJI != preventCornerOverlap) {
            c19rp.LJ = f;
            c19rp.LJFF = useCompatPadding;
            c19rp.LJI = preventCornerOverlap;
            c19rp.LIZJ(null);
            c19rp.invalidateSelf();
        }
        LIZIZ(c19rq);
    }
}
