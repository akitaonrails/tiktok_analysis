package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12OW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final Map<String, String> LJIIL;

    public C12OW() {
        this(null, null, null, null, null, false, null, null, 0L, null, null, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12OW)) {
            return false;
        }
        C12OW c12ow = (C12OW) obj;
        return Intrinsics.LJFF(this.LIZ, c12ow.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12ow.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c12ow.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c12ow.LIZLLL) && Intrinsics.LJFF(this.LJ, c12ow.LJ) && this.LJFF == c12ow.LJFF && Intrinsics.LJFF(this.LJI, c12ow.LJI) && Intrinsics.LJFF(this.LJII, c12ow.LJII) && this.LJIIIIZZ == c12ow.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c12ow.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c12ow.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c12ow.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c12ow.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        Map<String, String> map = this.LJIIL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "LiveCenterTopNoticeData(title=" + this.LIZ + ", content=" + this.LIZIZ + ", subContent=" + this.LIZJ + ", iconUrl=" + this.LIZLLL + ", bigIconUrl=" + this.LJ + ", isGeckoResource=" + this.LJFF + ", ctaText=" + this.LJI + ", action=" + this.LJII + ", durationMs=" + this.LJIIIIZZ + ", msgId=" + this.LJIIIZ + ", suggestionTemplateId=" + this.LJIIJ + ", cardName=" + this.LJIIJJI + ", eventExtra=" + this.LJIIL + ')';
    }

    public C12OW(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, long j, String str8, String str9, String str10, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        z = (i & 32) != 0 ? false : z;
        str6 = (i & 64) != 0 ? "" : str6;
        str7 = (i & 128) != 0 ? "" : str7;
        j = (i & 256) != 0 ? 10000L : j;
        str8 = (i & 512) != 0 ? "" : str8;
        str9 = (i & 1024) != 0 ? "" : str9;
        String str11 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str10 : "";
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = z;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = j;
        this.LJIIIZ = str8;
        this.LJIIJ = str9;
        this.LJIIJJI = str11;
        this.LJIIL = null;
    }
}
