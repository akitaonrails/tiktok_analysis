package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672180tcG {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final String LJFF;
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
        if (!(obj instanceof C1672180tcG)) {
            return false;
        }
        C1672180tcG c1672180tcG = (C1672180tcG) obj;
        return Intrinsics.LJFF(this.LIZ, c1672180tcG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1672180tcG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1672180tcG.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, c1672180tcG.LIZLLL) && C1668650tWZ.LIZJ(this.LJ, c1672180tcG.LJ) && Intrinsics.LJFF(this.LJFF, c1672180tcG.LJFF) && C1668650tWZ.LIZJ(this.LJI, c1672180tcG.LJI) && C1668650tWZ.LIZJ(this.LJII, c1672180tcG.LJII) && C1668650tWZ.LIZJ(this.LJIIIIZZ, c1672180tcG.LJIIIIZZ) && C1668650tWZ.LIZJ(this.LJIIIZ, c1672180tcG.LJIIIZ) && C1668650tWZ.LIZJ(this.LJIIJ, c1672180tcG.LJIIJ) && C1668650tWZ.LIZJ(this.LJIIJJI, c1672180tcG.LJIIJJI);
    }

    public final String toString() {
        return "MiddleBannerProperties(bgUrl=" + this.LIZ + ", iconUrl=" + this.LIZIZ + ", textColor=" + this.LIZJ + ", fixedWidth=" + ((Object) C1668650tWZ.LJFF(this.LIZLLL)) + ", maxWidth=" + ((Object) C1668650tWZ.LJFF(this.LJ)) + ", textContent=" + this.LJFF + ", bgHeight=" + ((Object) C1668650tWZ.LJFF(this.LJI)) + ", iconSize=" + ((Object) C1668650tWZ.LJFF(this.LJII)) + ", iconMarginEnd=" + ((Object) C1668650tWZ.LJFF(this.LJIIIIZZ)) + ", textMarginEnd=" + ((Object) C1668650tWZ.LJFF(this.LJIIIZ)) + ", textMarginStart=" + ((Object) C1668650tWZ.LJFF(this.LJIIJ)) + ", textMaxWidth=" + ((Object) C1668650tWZ.LJFF(this.LJIIJJI)) + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31) + Float.floatToIntBits(this.LJIIJJI);
    }

    public C1672180tcG(String str, String str2, String str3, float f, float f2, String str4, float f3, float f4, float f5, int i) {
        float f6;
        float f7;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        f = (i & 8) != 0 ? Float.NaN : f;
        str4 = (i & 32) != 0 ? "" : str4;
        f3 = (i & 64) != 0 ? 24 : f3;
        float f8 = 0.0f;
        if ((i & 128) != 0) {
            f6 = 32;
        } else {
            f6 = 0.0f;
        }
        if ((i & 256) != 0) {
            f7 = 6;
        } else {
            f7 = 0.0f;
        }
        f4 = (i & 512) != 0 ? 2 : f4;
        f5 = (i & 1024) != 0 ? 12 : f5;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            C123100dR.LIZ(str2);
            f8 = (f2 - f4) - f5;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = str4;
        this.LJI = f3;
        this.LJII = f6;
        this.LJIIIIZZ = f7;
        this.LJIIIZ = f4;
        this.LJIIJ = f5;
        this.LJIIJJI = f8;
    }
}
