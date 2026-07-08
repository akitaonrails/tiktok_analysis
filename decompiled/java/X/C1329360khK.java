package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: renamed from: X.0khK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329360khK {
    public static final C1329360khK LJIIZILJ = new C1329360khK(new ImageDecodeOptionsBuilder());
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public Bitmap.Config LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC1330200kig LJIIIZ;
    public final Object LJIIJ;
    public boolean LJIIJJI;
    public final boolean LJIIL;
    public final Rect LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final C1328950kgf LJIILLIIL;

    public final int hashCode() {
        int iOrdinal = ((((((((((((this.LIZ * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31) + (this.LJFF ? 1 : 0)) * 31) + (this.LJI ? 1 : 0)) * 31) + this.LJII.ordinal()) * 31;
        InterfaceC1330200kig interfaceC1330200kig = this.LJIIIZ;
        int iHashCode = (iOrdinal + (interfaceC1330200kig != null ? interfaceC1330200kig.hashCode() : 0)) * 31 * 31;
        Object obj = this.LJIIJ;
        int iHashCode2 = (((((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + (this.LJIIJJI ? 1 : 0)) * 31) + (this.LJIIL ? 1 : 0)) * 31;
        Rect rect = this.LJIILIIL;
        int iHashCode3 = (((((iHashCode2 + (rect != null ? rect.hashCode() : 0)) * 31) + (this.LJIILJJIL ? 1 : 0)) * 31) + (this.LJIILL ? 1 : 0)) * 31;
        C1328950kgf c1328950kgf = this.LJIILLIIL;
        return iHashCode3 + (c1328950kgf != null ? c1328950kgf.hashCode() : 0);
    }

    public final String toString() {
        return C786410Ut5.k4(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s-%s-%b-%b-%s-%b-%b-%s", new Object[]{Integer.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZLLL), Boolean.valueOf(this.LJ), Boolean.valueOf(this.LJFF), Boolean.valueOf(this.LJI), this.LJII.name(), this.LJIIIZ, null, this.LJIIJ, Boolean.valueOf(this.LJIIJJI), Boolean.valueOf(this.LJIIL), this.LJIILIIL, Boolean.valueOf(this.LJIILJJIL), Boolean.valueOf(this.LJIILL), this.LJIILLIIL});
    }

    public C1329360khK(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.LIZ = imageDecodeOptionsBuilder.LIZ;
        this.LIZIZ = imageDecodeOptionsBuilder.LIZIZ;
        this.LIZJ = imageDecodeOptionsBuilder.LIZJ;
        this.LIZLLL = imageDecodeOptionsBuilder.LIZLLL;
        this.LJ = imageDecodeOptionsBuilder.LJ;
        this.LJFF = imageDecodeOptionsBuilder.LJFF;
        this.LJII = imageDecodeOptionsBuilder.LJII;
        this.LJIIIIZZ = imageDecodeOptionsBuilder.LJIIIIZZ;
        this.LJIIIZ = imageDecodeOptionsBuilder.LJIIIZ;
        this.LJI = imageDecodeOptionsBuilder.LJI;
        this.LJIIJ = imageDecodeOptionsBuilder.LJIIJ;
        this.LJIIJJI = imageDecodeOptionsBuilder.LJIIJJI;
        this.LJIIL = imageDecodeOptionsBuilder.LJIIL;
        this.LJIILIIL = imageDecodeOptionsBuilder.LJIILJJIL;
        this.LJIILJJIL = imageDecodeOptionsBuilder.LJIILIIL;
        this.LJIILL = imageDecodeOptionsBuilder.LJIILL;
        this.LJIILLIIL = imageDecodeOptionsBuilder.LJIILLIIL;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1329360khK.class != obj.getClass()) {
            return false;
        }
        C1329360khK c1329360khK = (C1329360khK) obj;
        if (this.LIZIZ != c1329360khK.LIZIZ || this.LIZLLL != c1329360khK.LIZLLL || this.LJ != c1329360khK.LJ || this.LJFF != c1329360khK.LJFF || this.LJI != c1329360khK.LJI || this.LJII != c1329360khK.LJII || this.LJIIIZ != c1329360khK.LJIIIZ || this.LJIIJ != c1329360khK.LJIIJ || this.LJIIJJI != c1329360khK.LJIIJJI || this.LJIIL != c1329360khK.LJIIL || this.LJIILJJIL != c1329360khK.LJIILJJIL || this.LJIILL != c1329360khK.LJIILL || this.LJIILLIIL != c1329360khK.LJIILLIIL) {
            return false;
        }
        Rect rect2 = this.LJIILIIL;
        if ((rect2 == null || rect2.equals(c1329360khK.LJIILIIL)) && ((rect = c1329360khK.LJIILIIL) == null || rect.equals(this.LJIILIIL))) {
            return true;
        }
        return false;
    }
}
