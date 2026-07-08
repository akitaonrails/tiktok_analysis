package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0igv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252230igv implements InterfaceC111300bX {
    public final String LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final C1252280ih0 LLIZLLLIL;
    public final int LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final HashMap<String, String> LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1252230igv() {
        String str = null;
        this(str, str, str, str, str, 262143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1252230igv)) {
            return false;
        }
        C1252230igv c1252230igv = (C1252230igv) obj;
        return Intrinsics.LJFF(this.LL, c1252230igv.LL) && this.LLILLJJLI == c1252230igv.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1252230igv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1252230igv.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1252230igv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1252230igv.LLILZLL) && this.LLIZ == c1252230igv.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1252230igv.LLIZLLLIL) && this.LLJ == c1252230igv.LLJ && Intrinsics.LJFF(this.LLJI, c1252230igv.LLJI) && this.LLJIJIL == c1252230igv.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1252230igv.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1252230igv.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1252230igv.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1252230igv.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1252230igv.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1252230igv.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1252230igv.LLJJIJI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        C1252280ih0 c1252280ih0 = this.LLIZLLLIL;
        int iHashCode6 = (((((((iHashCode5 + (c1252280ih0 == null ? 0 : c1252280ih0.hashCode())) * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        String str6 = this.LLJILJIL;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.LLJILJILJ.hashCode()) * 31;
        String str7 = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJJI;
        int iHashCode10 = (((iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.LLJJIII.hashCode()) * 31;
        String str10 = this.LLJJIJI;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileInitData(from=" + this.LL + ", isFromFeed=" + this.LLILLJJLI + ", enterFrom=" + this.LLILLL + ", enterMethod=" + this.LLILZ + ", frEventPreviousPage=" + this.LLILZIL + ", profileFrom=" + this.LLILZLL + ", fromMutual=" + this.LLIZ + ", followLogEvenParams=" + this.LLIZLLLIL + ", generalSearchCardType=" + this.LLJ + ", eventKeys=" + this.LLJI + ", stickyContent=" + this.LLJIJIL + ", noticeType=" + this.LLJILJIL + ", logExtra=" + this.LLJILJILJ + ", fromRoomId=" + this.LLJILLL + ", fromRequestId=" + this.LLJJ + ", originConversationId=" + this.LLJJI + ", previousPage=" + this.LLJJIII + ", fromVideoGid=" + this.LLJJIJI + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1252230igv(String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        String str10 = (i & 4) != 0 ? "" : str;
        str9 = (i & 8) != 0 ? "" : str9;
        str7 = (i & 16) != 0 ? "" : str7;
        str8 = (i & 32) != 0 ? null : str8;
        if ((i & 512) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        this(null, false, str10, str9, str7, str8, false, null, 0, str6, false, null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new HashMap() : null, null, null, null, (i & 65536) == 0 ? str5 : "", null);
    }

    public C1252230igv(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, C1252280ih0 c1252280ih0, int i, String str6, boolean z3, String str7, HashMap<String, String> map, String str8, String str9, String str10, String str11, String str12) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = z2;
        this.LLIZLLLIL = c1252280ih0;
        this.LLJ = i;
        this.LLJI = str6;
        this.LLJIJIL = z3;
        this.LLJILJIL = str7;
        this.LLJILJILJ = map;
        this.LLJILLL = str8;
        this.LLJJ = str9;
        this.LLJJI = str10;
        this.LLJJIII = str11;
        this.LLJJIJI = str12;
    }
}
