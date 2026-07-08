package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439610HLr {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final double LJ = 0.0d;
    public final EnumC1684560twE LJFF;
    public final String LJI;
    public final Bitmap LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439610HLr)) {
            return false;
        }
        C439610HLr c439610HLr = (C439610HLr) obj;
        return Float.compare(this.LIZ, c439610HLr.LIZ) == 0 && Float.compare(this.LIZIZ, c439610HLr.LIZIZ) == 0 && Float.compare(this.LIZJ, c439610HLr.LIZJ) == 0 && Float.compare(this.LIZLLL, c439610HLr.LIZLLL) == 0 && Double.compare(this.LJ, c439610HLr.LJ) == 0 && this.LJFF == c439610HLr.LJFF && Intrinsics.LJFF(this.LJI, c439610HLr.LJI) && Intrinsics.LJFF(this.LJII, c439610HLr.LJII);
    }

    public C439610HLr(float f, float f2, float f3, float f4, EnumC1684560twE enumC1684560twE, String str, Bitmap bitmap) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJFF = enumC1684560twE;
        this.LJI = str;
        this.LJII = bitmap;
    }
}
