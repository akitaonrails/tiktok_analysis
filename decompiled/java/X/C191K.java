package X;

import android.view.View;

/* JADX INFO: renamed from: X.191K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C191K {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;

    public final int hashCode() {
        float f = this.LIZ;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.LIZIZ;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.LIZJ;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.LIZLLL;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.LJ;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.LJFF;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.LJI;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.LJII;
        return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }

    public C191K(View view) {
        this.LIZ = view.getTranslationX();
        this.LIZIZ = view.getTranslationY();
        this.LIZJ = C14K9.LJIIJJI(view);
        this.LIZLLL = view.getScaleX();
        this.LJ = view.getScaleY();
        this.LJFF = view.getRotationX();
        this.LJI = view.getRotationY();
        this.LJII = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C191K)) {
            return false;
        }
        C191K c191k = (C191K) obj;
        if (c191k.LIZ != this.LIZ || c191k.LIZIZ != this.LIZIZ || c191k.LIZJ != this.LIZJ || c191k.LIZLLL != this.LIZLLL || c191k.LJ != this.LJ || c191k.LJFF != this.LJFF || c191k.LJI != this.LJI || c191k.LJII != this.LJII) {
            return false;
        }
        return true;
    }
}
