package X;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0FTO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTO {
    public final Rect LIZ;
    public final EnumC1466150oFx LIZIZ;
    public final RectF LIZJ;
    public final float LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final String LJI;
    public final float LJII;

    public C0FTO() {
        this(0);
    }

    public /* synthetic */ C0FTO(int i) {
        this(new Rect(), EnumC1466150oFx.NONE, new RectF(), 0.0f, false, 5.0f, null, 1.0f);
    }

    public C0FTO(Rect rect, EnumC1466150oFx enumC1466150oFx, RectF rectF, float f, boolean z, float f2, String str, float f3) {
        this.LIZ = rect;
        this.LIZIZ = enumC1466150oFx;
        this.LIZJ = rectF;
        this.LIZLLL = f;
        this.LJ = z;
        this.LJFF = f2;
        this.LJI = str;
        this.LJII = f3;
    }

    public static C0FTO LIZ(C0FTO c0fto, Rect rect, EnumC1466150oFx enumC1466150oFx, RectF rectF, float f, boolean z, String str, float f2, int i) {
        float f3;
        float f4 = f2;
        String str2 = str;
        boolean z2 = z;
        float f5 = f;
        RectF rectF2 = rectF;
        EnumC1466150oFx enumC1466150oFx2 = enumC1466150oFx;
        Rect rect2 = rect;
        if ((i & 1) != 0) {
            rect2 = c0fto.LIZ;
        }
        if ((i & 2) != 0) {
            enumC1466150oFx2 = c0fto.LIZIZ;
        }
        if ((i & 4) != 0) {
            rectF2 = c0fto.LIZJ;
        }
        if ((i & 8) != 0) {
            f5 = c0fto.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c0fto.LJ;
        }
        if ((i & 32) != 0) {
            f3 = c0fto.LJFF;
        } else {
            f3 = 0.0f;
        }
        if ((i & 64) != 0) {
            str2 = c0fto.LJI;
        }
        if ((i & 128) != 0) {
            f4 = c0fto.LJII;
        }
        c0fto.getClass();
        return new C0FTO(rect2, enumC1466150oFx2, rectF2, f5, z2, f3, str2, f4);
    }
}
