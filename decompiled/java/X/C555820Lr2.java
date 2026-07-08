package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555820Lr2 {
    public final String LIZ;
    public final String LIZIZ;
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
    public final String LJIIL;
    public final int LJIILIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C555820Lr2() {
        String str = null;
        this(str, str, str, str, str, str, str, str, 0L, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555820Lr2)) {
            return false;
        }
        C555820Lr2 c555820Lr2 = (C555820Lr2) obj;
        return Intrinsics.LJFF(this.LIZ, c555820Lr2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555820Lr2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c555820Lr2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c555820Lr2.LIZLLL) && Intrinsics.LJFF(this.LJ, c555820Lr2.LJ) && Intrinsics.LJFF(this.LJFF, c555820Lr2.LJFF) && Intrinsics.LJFF(this.LJI, c555820Lr2.LJI) && Intrinsics.LJFF(this.LJII, c555820Lr2.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c555820Lr2.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c555820Lr2.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c555820Lr2.LJIIJ) && this.LJIIJJI == c555820Lr2.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c555820Lr2.LJIIL) && this.LJIILIIL == c555820Lr2.LJIILIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL;
    }

    public final String toString() {
        return "AIGCWorkflowPersistence(id=" + this.LIZ + ", creationIdReadOnly=" + this.LIZIZ + ", oldFrameworkData=" + this.LIZJ + ", aigcWorkflowStatic=" + this.LIZLLL + ", workflowConfig=" + this.LJ + ", centralRegistry=" + this.LJFF + ", staticCentralRegistry=" + this.LJI + ", workflowState=" + this.LJII + ", previewInfo=" + this.LJIIIIZZ + ", links=" + this.LJIIIZ + ", businessSourceReadOnly=" + this.LJIIJ + ", createdAt=" + this.LJIIJJI + ", serverTaskId=" + this.LJIIL + ", gradeDownCount=" + this.LJIILIIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C555820Lr2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        String str9;
        String str10;
        String str11;
        long j2 = j;
        String str12 = str8;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str4;
        String str17 = str3;
        String str18 = str2;
        String str19 = (i & 1) != 0 ? "" : str;
        str18 = (i & 2) != 0 ? "" : str18;
        str17 = (i & 4) != 0 ? "" : str17;
        str16 = (i & 8) != 0 ? "" : str16;
        str15 = (i & 16) != 0 ? "" : str15;
        if ((i & 32) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((i & 64) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        str14 = (i & 128) != 0 ? "" : str14;
        if ((i & 256) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        this(str19, str18, str17, str16, str15, str9, str10, str14, str11, (i & 512) != 0 ? "" : str13, (i & 1024) != 0 ? "" : str12, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? null : "", 0);
    }

    public C555820Lr2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, String str12, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str10;
        this.LJIIJ = str11;
        this.LJIIJJI = j;
        this.LJIIL = str12;
        this.LJIILIIL = i;
    }
}
