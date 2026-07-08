package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477870Iob {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Long LJFF;
    public final Long LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final Integer LJIIL;
    public final String LJIILIIL;
    public final Map<String, String> LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C477870Iob)) {
            return false;
        }
        C477870Iob c477870Iob = (C477870Iob) obj;
        return Intrinsics.LJFF(this.LIZ, c477870Iob.LIZ) && Intrinsics.LJFF(this.LIZIZ, c477870Iob.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c477870Iob.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c477870Iob.LIZLLL) && Intrinsics.LJFF(this.LJ, c477870Iob.LJ) && Intrinsics.LJFF(this.LJFF, c477870Iob.LJFF) && Intrinsics.LJFF(this.LJI, c477870Iob.LJI) && Intrinsics.LJFF(this.LJII, c477870Iob.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c477870Iob.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c477870Iob.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c477870Iob.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c477870Iob.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c477870Iob.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c477870Iob.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c477870Iob.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJI;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.LJIIIZ;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIJ;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJJI;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.LJIIL;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.LJIILIIL;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.LJIILJJIL;
        return iHashCode13 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ModuleLogData(moduleType=" + this.LIZ + ", moduleName=" + this.LIZIZ + ", moduleSubName=" + this.LIZJ + ", guestNum=" + this.LIZLLL + ", roomNum=" + this.LJ + ", anchorId=" + this.LJFF + ", roomId=" + this.LJI + ", guestRequestId=" + this.LJII + ", viewerNum=" + this.LJIIIIZZ + ", verticalList=" + this.LJIIIZ + ", labelInfo=" + this.LJIIJ + ", summaryContent=" + this.LJIIJJI + ", moduleSubPosition=" + this.LJIIL + ", source=" + this.LJIILIIL + ", aiSummaryExtra=" + this.LJIILJJIL + ')';
    }

    public C477870Iob(String str, String str2, String str3, Integer num, Integer num2, Long l, Long l2, String str4, Integer num3, String str5, String str6, String str7, Integer num4, String str8, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = l;
        this.LJI = l2;
        this.LJII = str4;
        this.LJIIIIZZ = num3;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
        this.LJIIJJI = str7;
        this.LJIIL = num4;
        this.LJIILIIL = str8;
        this.LJIILJJIL = map;
    }

    public /* synthetic */ C477870Iob(String str, String str2, String str3, Integer num, Integer num2, Long l, Long l2, String str4, Integer num3, String str5, String str6, String str7, Integer num4, String str8, Map map, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str7, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num4, (i & 8192) != 0 ? null : str8, (i & 16384) == 0 ? map : null);
    }
}
