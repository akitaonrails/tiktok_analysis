package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUO {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final float LJI;
    public final Float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final float LJIILL;
    public final float LJIILLIIL;
    public final float LJIIZILJ;
    public final float LJIJ;
    public final float LJIJI;
    public final float LJIJJ;
    public final float LJIJJLI;
    public final float LJIL;
    public final float LJJ;
    public final EnumC2250111D5d LJJI;
    public final float LJJIFFI;
    public final EnumC2250111D5d LJJII;
    public final float LJJIII;
    public final EnumC2250111D5d LJJIIJ;
    public final float LJJIIJZLJL;
    public final EnumC2250111D5d LJJIIZ;
    public final float LJJIIZI;
    public final EnumC2250111D5d LJJIJ;
    public final float LJJIJIIJI;
    public final EnumC2250111D5d LJJIJIIJIL;
    public final float LJJIJIL;
    public final EnumC2250111D5d LJJIJL;
    public final float LJJIJLIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1DUO)) {
            return false;
        }
        C1DUO c1duo = (C1DUO) obj;
        return Intrinsics.LJFF(this.LIZ, c1duo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1duo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1duo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1duo.LIZLLL) && Float.compare(this.LJ, c1duo.LJ) == 0 && this.LJFF == c1duo.LJFF && Float.compare(this.LJI, c1duo.LJI) == 0 && Intrinsics.LJFF(this.LJII, c1duo.LJII) && Float.compare(this.LJIIIIZZ, c1duo.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, c1duo.LJIIIZ) == 0 && Float.compare(this.LJIIJ, c1duo.LJIIJ) == 0 && Float.compare(this.LJIIJJI, c1duo.LJIIJJI) == 0 && Float.compare(this.LJIIL, c1duo.LJIIL) == 0 && Float.compare(this.LJIILIIL, c1duo.LJIILIIL) == 0 && Float.compare(this.LJIILJJIL, c1duo.LJIILJJIL) == 0 && Float.compare(this.LJIILL, c1duo.LJIILL) == 0 && Float.compare(this.LJIILLIIL, c1duo.LJIILLIIL) == 0 && Float.compare(this.LJIIZILJ, c1duo.LJIIZILJ) == 0 && Float.compare(this.LJIJ, c1duo.LJIJ) == 0 && Float.compare(this.LJIJI, c1duo.LJIJI) == 0 && Float.compare(this.LJIJJ, c1duo.LJIJJ) == 0 && Float.compare(this.LJIJJLI, c1duo.LJIJJLI) == 0 && Float.compare(this.LJIL, c1duo.LJIL) == 0 && Float.compare(this.LJJ, c1duo.LJJ) == 0 && this.LJJI == c1duo.LJJI && Float.compare(this.LJJIFFI, c1duo.LJJIFFI) == 0 && this.LJJII == c1duo.LJJII && Float.compare(this.LJJIII, c1duo.LJJIII) == 0 && this.LJJIIJ == c1duo.LJJIIJ && Float.compare(this.LJJIIJZLJL, c1duo.LJJIIJZLJL) == 0 && this.LJJIIZ == c1duo.LJJIIZ && Float.compare(this.LJJIIZI, c1duo.LJJIIZI) == 0 && this.LJJIJ == c1duo.LJJIJ && Float.compare(this.LJJIJIIJI, c1duo.LJJIJIIJI) == 0 && this.LJJIJIIJIL == c1duo.LJJIJIIJIL && Float.compare(this.LJJIJIL, c1duo.LJJIJIL) == 0 && this.LJJIJL == c1duo.LJJIJL && Float.compare(this.LJJIJLIJ, c1duo.LJJIJLIJ) == 0;
    }

    public final String toString() {
        return "HeaderEffectPreset(color1=" + this.LIZ + ", color2=" + this.LIZIZ + ", color3=" + this.LIZJ + ", color4=" + this.LIZLLL + ", flowSpeed=" + this.LJ + ", flowSpeedLink=" + this.LJFF + ", shapeMode=" + this.LJI + ", seed=" + this.LJII + ", centerX=" + this.LJIIIIZZ + ", centerY=" + this.LJIIIZ + ", zoom=" + this.LJIIJ + ", idle=" + this.LJIIJJI + ", complexity=" + this.LJIIL + ", musicStrength=" + this.LJIILIIL + ", liquidRandom=" + this.LJIILJJIL + ", liquidChange=" + this.LJIILL + ", streamSpeed=" + this.LJIILLIIL + ", streamWave=" + this.LJIIZILJ + ", streamShear=" + this.LJIJ + ", rippleAmp=" + this.LJIJI + ", rippleSpeed=" + this.LJIJJ + ", rippleFreq=" + this.LJIJJLI + ", rippleSharp=" + this.LJIL + ", pulseResponse=" + this.LJJ + ", pulseResponseSource=" + this.LJJI + ", rippleFreqResponse=" + this.LJJIFFI + ", rippleFreqResponseSource=" + this.LJJII + ", warpResponse=" + this.LJJIII + ", warpResponseSource=" + this.LJJIIJ + ", brightResponse=" + this.LJJIIJZLJL + ", brightResponseSource=" + this.LJJIIZ + ", flowResponse=" + this.LJJIIZI + ", flowResponseSource=" + this.LJJIJ + ", fuzzResponse=" + this.LJJIJIIJI + ", fuzzResponseSource=" + this.LJJIJIIJIL + ", beatZoomResponse=" + this.LJJIJIL + ", beatZoomResponseSource=" + this.LJJIJL + ", flowSpeedResponse=" + this.LJJIJLIJ + ')';
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LIZLLL;
        int iHashCode4 = (((((((iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31;
        Float f = this.LJII;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode4 + (f != null ? f.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31) + Float.floatToIntBits(this.LJIIJJI)) * 31) + Float.floatToIntBits(this.LJIIL)) * 31) + Float.floatToIntBits(this.LJIILIIL)) * 31) + Float.floatToIntBits(this.LJIILJJIL)) * 31) + Float.floatToIntBits(this.LJIILL)) * 31) + Float.floatToIntBits(this.LJIILLIIL)) * 31) + Float.floatToIntBits(this.LJIIZILJ)) * 31) + Float.floatToIntBits(this.LJIJ)) * 31) + Float.floatToIntBits(this.LJIJI)) * 31) + Float.floatToIntBits(this.LJIJJ)) * 31) + Float.floatToIntBits(this.LJIJJLI)) * 31) + Float.floatToIntBits(this.LJIL)) * 31) + Float.floatToIntBits(this.LJJ)) * 31) + this.LJJI.hashCode()) * 31) + Float.floatToIntBits(this.LJJIFFI)) * 31) + this.LJJII.hashCode()) * 31) + Float.floatToIntBits(this.LJJIII)) * 31) + this.LJJIIJ.hashCode()) * 31) + Float.floatToIntBits(this.LJJIIJZLJL)) * 31) + this.LJJIIZ.hashCode()) * 31) + Float.floatToIntBits(this.LJJIIZI)) * 31) + this.LJJIJ.hashCode()) * 31) + Float.floatToIntBits(this.LJJIJIIJI)) * 31) + this.LJJIJIIJIL.hashCode()) * 31) + Float.floatToIntBits(this.LJJIJIL)) * 31) + this.LJJIJL.hashCode()) * 31) + Float.floatToIntBits(this.LJJIJLIJ);
    }

    public C1DUO(Integer num, Integer num2, Integer num3, Integer num4, float f, boolean z, float f2, Float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f18, float f19, float f20, EnumC2250111D5d enumC2250111D5d, float f21, EnumC2250111D5d enumC2250111D5d2, float f22, EnumC2250111D5d enumC2250111D5d3, float f23, EnumC2250111D5d enumC2250111D5d4, float f24, EnumC2250111D5d enumC2250111D5d5, float f25, EnumC2250111D5d enumC2250111D5d6, float f26, EnumC2250111D5d enumC2250111D5d7, float f27) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
        this.LIZLLL = num4;
        this.LJ = f;
        this.LJFF = z;
        this.LJI = f2;
        this.LJII = f3;
        this.LJIIIIZZ = f4;
        this.LJIIIZ = f5;
        this.LJIIJ = f6;
        this.LJIIJJI = f7;
        this.LJIIL = f8;
        this.LJIILIIL = f9;
        this.LJIILJJIL = f10;
        this.LJIILL = f11;
        this.LJIILLIIL = f12;
        this.LJIIZILJ = f13;
        this.LJIJ = f14;
        this.LJIJI = f15;
        this.LJIJJ = f16;
        this.LJIJJLI = f18;
        this.LJIL = f19;
        this.LJJ = f20;
        this.LJJI = enumC2250111D5d;
        this.LJJIFFI = f21;
        this.LJJII = enumC2250111D5d2;
        this.LJJIII = f22;
        this.LJJIIJ = enumC2250111D5d3;
        this.LJJIIJZLJL = f23;
        this.LJJIIZ = enumC2250111D5d4;
        this.LJJIIZI = f24;
        this.LJJIJ = enumC2250111D5d5;
        this.LJJIJIIJI = f25;
        this.LJJIJIIJIL = enumC2250111D5d6;
        this.LJJIJIL = f26;
        this.LJJIJL = enumC2250111D5d7;
        this.LJJIJLIJ = f27;
    }

    public /* synthetic */ C1DUO(Integer num, Integer num2, Integer num3, Integer num4, float f, boolean z, float f2, Float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f18, float f19, float f20, EnumC2250111D5d enumC2250111D5d, float f21, EnumC2250111D5d enumC2250111D5d2, float f22, EnumC2250111D5d enumC2250111D5d3, float f23, EnumC2250111D5d enumC2250111D5d4, float f24, EnumC2250111D5d enumC2250111D5d5, float f25, EnumC2250111D5d enumC2250111D5d6, float f26, EnumC2250111D5d enumC2250111D5d7, float f27, int i, int i2) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) == 0 ? num4 : null, f, z, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f18, f19, f20, (i & 16777216) != 0 ? EnumC2250111D5d.BASS : enumC2250111D5d, f21, (i & 67108864) != 0 ? EnumC2250111D5d.BASS : enumC2250111D5d2, f22, (i & 268435456) != 0 ? EnumC2250111D5d.MID : enumC2250111D5d3, f23, (i & 1073741824) != 0 ? EnumC2250111D5d.TREBLE : enumC2250111D5d4, f24, (i2 & 1) != 0 ? EnumC2250111D5d.MID : enumC2250111D5d5, f25, (i2 & 4) != 0 ? EnumC2250111D5d.TREBLE : enumC2250111D5d6, f26, (i2 & 16) != 0 ? EnumC2250111D5d.BASS : enumC2250111D5d7, (i2 & 32) != 0 ? 1.0f : f27);
    }
}
