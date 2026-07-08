package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674630QdB {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJFF;
    public final String LIZ = "mall_search_mid";
    public final String LIZIZ = "mall_search_mid";
    public int LJ = -1;
    public Long LJI = null;
    public Long LJII = null;
    public EnumC674660QdE LJIIIIZZ = null;
    public Long LJIIIZ = null;
    public Integer LJIIJ = null;
    public String LJIIJJI = null;
    public String LJIIL = null;
    public Integer LJIILIIL = null;
    public String LJIILJJIL = null;
    public String LJIILL = null;
    public boolean LJIILLIIL = false;

    public final Map<String, Object> LIZ() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("entry_source", this.LIZ), new Pair("page_name", this.LIZIZ), new Pair("voice_message_id", this.LIZJ), new Pair("record_seq", Integer.valueOf(this.LJ)), new Pair("search_entrance", this.LIZLLL));
        String str = this.LJFF;
        if (str != null) {
            mapLJIIJ.put("ai_session_id", str);
        }
        return mapLJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674630QdB)) {
            return false;
        }
        C674630QdB c674630QdB = (C674630QdB) obj;
        return Intrinsics.LJFF(this.LIZ, c674630QdB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c674630QdB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674630QdB.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674630QdB.LIZLLL) && this.LJ == c674630QdB.LJ && Intrinsics.LJFF(this.LJFF, c674630QdB.LJFF) && Intrinsics.LJFF(this.LJI, c674630QdB.LJI) && Intrinsics.LJFF(this.LJII, c674630QdB.LJII) && this.LJIIIIZZ == c674630QdB.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c674630QdB.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c674630QdB.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c674630QdB.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c674630QdB.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c674630QdB.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c674630QdB.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c674630QdB.LJIILL) && this.LJIILLIIL == c674630QdB.LJIILLIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        EnumC674660QdE enumC674660QdE = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (enumC674660QdE == null ? 0 : enumC674660QdE.hashCode())) * 31;
        Long l3 = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJIIJJI;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIL;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.LJIILIIL;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.LJIILJJIL;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIILL;
        return ((iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILLIIL);
    }

    public final String toString() {
        return "EcSearchMiddleAIVoiceContext(entrySource=" + this.LIZ + ", pageName=" + this.LIZIZ + ", voiceMessageId=" + this.LIZJ + ", searchEntrance=" + this.LIZLLL + ", recordSeq=" + this.LJ + ", aiSessionId=" + this.LJFF + ", startTimeMs=" + this.LJI + ", audioDurationMs=" + this.LJII + ", endReason=" + this.LJIIIIZZ + ", loadingDurationMs=" + this.LJIIIZ + ", isError=" + this.LJIIJ + ", errorText=" + this.LJIIJJI + ", originalText=" + this.LJIIL + ", errorCode=" + this.LJIILIIL + ", status=" + this.LJIILJJIL + ", editedText=" + this.LJIILL + ", editAfterVoice=" + this.LJIILLIIL + ')';
    }

    public C674630QdB(String str, String str2, String str3) {
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJFF = str3;
    }
}
