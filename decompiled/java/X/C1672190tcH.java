package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672190tcH {
    public final EnumC043200Dm LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1672190tcH)) {
            return false;
        }
        C1672190tcH c1672190tcH = (C1672190tcH) obj;
        return this.LIZ == c1672190tcH.LIZ && Intrinsics.LJFF(this.LIZIZ, c1672190tcH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1672190tcH.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1672190tcH.LIZLLL) && Intrinsics.LJFF(this.LJ, c1672190tcH.LJ) && C1668650tWZ.LIZJ(this.LJFF, c1672190tcH.LJFF) && C1668650tWZ.LIZJ(this.LJI, c1672190tcH.LJI) && C1668650tWZ.LIZJ(this.LJII, c1672190tcH.LJII) && C1668650tWZ.LIZJ(this.LJIIIIZZ, c1672190tcH.LJIIIIZZ) && C1668650tWZ.LIZJ(this.LJIIIZ, c1672190tcH.LJIIIZ) && C1668650tWZ.LIZJ(this.LJIIJ, c1672190tcH.LJIIJ) && C1668650tWZ.LIZJ(this.LJIIJJI, c1672190tcH.LJIIJJI);
    }

    public final String toString() {
        return "BigBannerProperties(bannerType=" + this.LIZ + ", bgUrl=" + this.LIZIZ + ", iconUrl=" + this.LIZJ + ", textColor=" + this.LIZLLL + ", textContent=" + this.LJ + ", textMaxWidth=" + ((Object) C1668650tWZ.LJFF(this.LJFF)) + ", rightArrowSize=" + ((Object) C1668650tWZ.LJFF(this.LJI)) + ", rightArrowMarginEnd=" + ((Object) C1668650tWZ.LJFF(this.LJII)) + ", iconSize=" + ((Object) C1668650tWZ.LJFF(this.LJIIIIZZ)) + ", iconMarginEnd=" + ((Object) C1668650tWZ.LJFF(this.LJIIIZ)) + ", textMarginStart=" + ((Object) C1668650tWZ.LJFF(this.LJIIJ)) + ", textMarginEnd=" + ((Object) C1668650tWZ.LJFF(this.LJIIJJI)) + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31) + Float.floatToIntBits(this.LJIIJJI);
    }

    public C1672190tcH(EnumC043200Dm enumC043200Dm, String str, String str2, String str3, String str4, float f, int i) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        enumC043200Dm = (i & 1) != 0 ? EnumC043200Dm.EDP : enumC043200Dm;
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "" : str4;
        if ((i & 32) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = 0.0f;
        }
        if ((i & 64) != 0) {
            f3 = 20;
        } else {
            f3 = 0.0f;
        }
        if ((i & 128) != 0) {
            f4 = 6;
        } else {
            f4 = 0.0f;
        }
        if ((i & 256) != 0) {
            f5 = 64;
        } else {
            f5 = 0.0f;
        }
        if ((i & 512) != 0) {
            f6 = 2;
        } else {
            f6 = 0.0f;
        }
        float f7 = (i & 1024) != 0 ? 16 : 0.0f;
        f = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 2 : f;
        this.LIZ = enumC043200Dm;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = f2;
        this.LJI = f3;
        this.LJII = f4;
        this.LJIIIIZZ = f5;
        this.LJIIIZ = f6;
        this.LJIIJ = f7;
        this.LJIIJJI = f;
    }
}
