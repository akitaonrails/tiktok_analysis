package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wXO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1841100y0i
public final class C1784480wXO {
    public static final C1784490wXP Companion = new C1784490wXP();
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1784480wXO)) {
            return false;
        }
        C1784480wXO c1784480wXO = (C1784480wXO) obj;
        return Intrinsics.LJFF(this.LIZ, c1784480wXO.LIZ) && this.LIZIZ == c1784480wXO.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1784480wXO.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1784480wXO.LIZLLL) && Intrinsics.LJFF(this.LJ, c1784480wXO.LJ) && Intrinsics.LJFF(this.LJFF, c1784480wXO.LJFF) && Intrinsics.LJFF(this.LJI, c1784480wXO.LJI) && Intrinsics.LJFF(this.LJII, c1784480wXO.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1784480wXO.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1784480wXO.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1784480wXO.LJIIJ) && this.LJIIJJI == c1784480wXO.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIIZ;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIJ;
        return ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIJJI);
    }

    public final String toString() {
        return "KMPSharePropagationCacheItem(itemId=" + this.LIZ + ", sceneType=" + this.LIZIZ + ", spRootD=" + this.LIZJ + ", spLevel=" + this.LIZLLL + ", spRootU=" + this.LJ + ", spRootOd=" + this.LJFF + ", spSourceD=" + this.LJI + ", spSourceOd=" + this.LJII + ", spSourceU=" + this.LJIIIIZZ + ", spSourceW=" + this.LJIIIZ + ", spRootShareLinkId=" + this.LJIIJ + ", timestamp=" + this.LJIIJJI + ')';
    }

    public C1784480wXO(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = j;
    }

    public /* synthetic */ C1784480wXO(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j) {
        long j2 = j;
        if (15 == (i & 15)) {
            this.LIZ = str;
            this.LIZIZ = i2;
            this.LIZJ = str2;
            this.LIZLLL = str3;
            if ((i & 16) == 0) {
                this.LJ = null;
            } else {
                this.LJ = str4;
            }
            if ((i & 32) == 0) {
                this.LJFF = null;
            } else {
                this.LJFF = str5;
            }
            if ((i & 64) == 0) {
                this.LJI = null;
            } else {
                this.LJI = str6;
            }
            if ((i & 128) == 0) {
                this.LJII = null;
            } else {
                this.LJII = str7;
            }
            if ((i & 256) == 0) {
                this.LJIIIIZZ = null;
            } else {
                this.LJIIIIZZ = str8;
            }
            if ((i & 512) == 0) {
                this.LJIIIZ = null;
            } else {
                this.LJIIIZ = str9;
            }
            if ((i & 1024) == 0) {
                this.LJIIJ = null;
            } else {
                this.LJIIJ = str10;
            }
            this.LJIIJJI = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? 0L : j2;
            return;
        }
        C19989713Jf.LIZ(i, 15, C13IJ.LIZ.getDescriptor());
        throw null;
    }
}
