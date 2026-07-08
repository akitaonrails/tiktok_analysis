package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2249808rg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C2249808rg() {
        String str = null;
        this(str, str, str, str, str, str, str, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249808rg)) {
            return false;
        }
        C2249808rg c2249808rg = (C2249808rg) obj;
        return Intrinsics.LJFF(this.LIZ, c2249808rg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2249808rg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2249808rg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2249808rg.LIZLLL) && Intrinsics.LJFF(this.LJ, c2249808rg.LJ) && Intrinsics.LJFF(this.LJFF, c2249808rg.LJFF) && Intrinsics.LJFF(this.LJI, c2249808rg.LJI) && this.LJII == c2249808rg.LJII && this.LJIIIIZZ == c2249808rg.LJIIIIZZ && this.LJIIIZ == c2249808rg.LJIIIZ && this.LJIIJ == c2249808rg.LJIIJ && this.LJIIJJI == c2249808rg.LJIIJJI && this.LJIIL == c2249808rg.LJIIL && this.LJIILIIL == c2249808rg.LJIILIIL && this.LJIILJJIL == c2249808rg.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c2249808rg.LJIILL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        String str = this.LJIILL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MaterialScanConfig(appId=" + this.LIZ + ", appName=" + this.LIZIZ + ", appVersion=" + this.LIZJ + ", deviceId=" + this.LIZLLL + ", deviceType=" + this.LJ + ", deviceName=" + this.LJFF + ", modelCacheDir=" + this.LJI + ", autoTriggerScan=" + this.LJII + ", cvThreadNum=" + this.LJIIIIZZ + ", decodeQueueLength=" + this.LJIIIZ + ", videoMaxFrame=" + this.LJIIJ + ", videoFrameWidth=" + this.LJIIJJI + ", videoFrameHeight=" + this.LJIIL + ", enableStrategy=" + this.LJIILIIL + ", enableScanTask=" + this.LJIILJJIL + ", apiBaseUrl=" + this.LJIILL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2249808rg(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, String str8, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3 = z2;
        boolean z4 = z;
        int i7 = i;
        String str9 = str3;
        String str10 = str6;
        String str11 = str4;
        String str12 = str8;
        String str13 = str5;
        String str14 = str2;
        String str15 = (i2 & 1) != 0 ? "" : str;
        str14 = (i2 & 2) != 0 ? "" : str14;
        str9 = (i2 & 4) != 0 ? "" : str9;
        str11 = (i2 & 8) != 0 ? "" : str11;
        str13 = (i2 & 16) != 0 ? "phone" : str13;
        str10 = (i2 & 32) != 0 ? "Android" : str10;
        String str16 = (i2 & 64) == 0 ? str7 : "";
        i7 = (i2 & 256) != 0 ? 2 : i7;
        if ((i2 & 512) != 0) {
            i3 = 10;
        } else {
            i3 = 0;
        }
        if ((i2 & 1024) != 0) {
            i4 = 5;
        } else {
            i4 = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i5 = 256;
        } else {
            i5 = 0;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i6 = 256;
        } else {
            i6 = 0;
        }
        this(str15, str14, str9, str11, str13, str10, str16, false, i7, i3, i4, i5, i6, (i2 & 8192) != 0 ? true : z4, (i2 & 16384) != 0 ? true : z3, (i2 & 32768) != 0 ? null : str12);
    }

    public C2249808rg(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, int i2, int i3, int i4, int i5, boolean z2, boolean z3, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = z;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = i4;
        this.LJIIL = i5;
        this.LJIILIIL = z2;
        this.LJIILJJIL = z3;
        this.LJIILL = str8;
    }
}
