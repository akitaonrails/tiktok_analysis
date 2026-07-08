package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663990Q2r implements InterfaceC1618170sD9<C663990Q2r> {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final boolean LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C663990Q2r() {
        String str = null;
        this(str, str, false, str, str, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, str, 262143);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C663990Q2r)) {
            return false;
        }
        C663990Q2r c663990Q2r = (C663990Q2r) obj;
        return Intrinsics.LJFF(this.LL, c663990Q2r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c663990Q2r.LLILLJJLI) && this.LLILLL == c663990Q2r.LLILLL && Intrinsics.LJFF(this.LLILZ, c663990Q2r.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c663990Q2r.LLILZIL) && this.LLILZLL == c663990Q2r.LLILZLL && this.LLIZ == c663990Q2r.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c663990Q2r.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c663990Q2r.LLJ) && Intrinsics.LJFF(this.LLJI, c663990Q2r.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c663990Q2r.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c663990Q2r.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c663990Q2r.LLJILJILJ) && this.LLJILLL == c663990Q2r.LLJILLL && this.LLJJ == c663990Q2r.LLJJ && this.LLJJI == c663990Q2r.LLJJI && Intrinsics.LJFF(this.LLJJIII, c663990Q2r.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c663990Q2r.LLJJIJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        String str = this.LLJIJIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL) * 31) + this.LLJJ) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31;
        String str3 = this.LLJJIII;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJIJI;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_entrance", this.LL);
        linkedHashMap.put("search_entrance_sub", this.LLILLJJLI);
        linkedHashMap.put("previous_page", this.LLILZIL);
        linkedHashMap.put("should_show_scan_view", Boolean.valueOf(this.LLILZLL));
        linkedHashMap.put("should_show_sug", Boolean.valueOf(this.LLIZ));
        linkedHashMap.put("is_from_comment", this.LLIZLLLIL);
        linkedHashMap.put("is_from_video", this.LLJ);
        linkedHashMap.put("is_from_popular_words", this.LLJI);
        linkedHashMap.put("back_press_flag", Integer.valueOf(this.LLJILLL));
        linkedHashMap.put("feed_search_bar_flag", Integer.valueOf(this.LLJJ));
        linkedHashMap.put("keep_tab_position", Boolean.valueOf(this.LLJJI));
        linkedHashMap.put("tako_process_id", this.LLJJIII);
        linkedHashMap.put("tako_message_id", this.LLJJIJI);
        return linkedHashMap;
    }

    public final String toString() {
        return "SearchCommonState(searchEntrance=" + this.LL + ", searchEntranceSub=" + this.LLILLJJLI + ", isResumeFromPublished=" + this.LLILLL + ", publishId=" + this.LLILZ + ", previousPage=" + this.LLILZIL + ", shouldShowScanView=" + this.LLILZLL + ", shouldShowSug=" + this.LLIZ + ", isFromComment=" + this.LLIZLLLIL + ", isFromVideo=" + this.LLJ + ", isFromPopularWords=" + this.LLJI + ", blankPageLynxQuery=" + this.LLJIJIL + ", interventionGuideInfoParams=" + this.LLJILJIL + ", isFromVideoOld=" + this.LLJILJILJ + ", backPressFlag=" + this.LLJILLL + ", feedSearchBarFlag=" + this.LLJJ + ", keepTabPosition=" + this.LLJJI + ", takoProcessId=" + this.LLJJIII + ", takoMessageId=" + this.LLJJIJI + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public static C663990Q2r LIZ(C663990Q2r c663990Q2r, String str, String str2, boolean z, String str3, String str4, String str5, String str6, int i) {
        String str7;
        boolean z2;
        boolean z3;
        String str8;
        String str9;
        String str10;
        int i2;
        int i3;
        boolean z4;
        String str11;
        String str12;
        String str13 = str6;
        String str14 = str5;
        String str15 = str3;
        String str16 = str4;
        boolean z5 = z;
        String str17 = str2;
        String str18 = str;
        if ((i & 1) != 0) {
            str18 = c663990Q2r.LL;
        }
        if ((i & 2) != 0) {
            str17 = c663990Q2r.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z5 = c663990Q2r.LLILLL;
        }
        if ((i & 8) != 0) {
            str15 = c663990Q2r.LLILZ;
        }
        if ((i & 16) != 0) {
            str7 = c663990Q2r.LLILZIL;
        } else {
            str7 = null;
        }
        if ((i & 32) != 0) {
            z2 = c663990Q2r.LLILZLL;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c663990Q2r.LLIZ;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            str8 = c663990Q2r.LLIZLLLIL;
        } else {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = c663990Q2r.LLJ;
        } else {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str16 = c663990Q2r.LLJI;
        }
        if ((i & 1024) != 0) {
            str14 = c663990Q2r.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str13 = c663990Q2r.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = c663990Q2r.LLJILJILJ;
        } else {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            i2 = c663990Q2r.LLJILLL;
        } else {
            i2 = 0;
        }
        if ((i & 16384) != 0) {
            i3 = c663990Q2r.LLJJ;
        } else {
            i3 = 0;
        }
        if ((32768 & i) != 0) {
            z4 = c663990Q2r.LLJJI;
        } else {
            z4 = false;
        }
        if ((65536 & i) != 0) {
            str11 = c663990Q2r.LLJJIII;
        } else {
            str11 = null;
        }
        if ((i & 131072) != 0) {
            str12 = c663990Q2r.LLJJIJI;
        } else {
            str12 = null;
        }
        c663990Q2r.getClass();
        String str19 = str13;
        String str20 = str16;
        String str21 = str14;
        return new C663990Q2r(str18, str17, z5, str15, str7, z2, z3, str8, str9, str20, str21, str19, str10, i2, i3, z4, str11, str12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C663990Q2r(String str, String str2, boolean z, String str3, String str4, String str5, int i, int i2, boolean z2, String str6, String str7, int i3) {
        String str8;
        String str9;
        boolean z3 = z2;
        int i4 = i2;
        int i5 = i;
        String str10 = str6;
        String str11 = str5;
        boolean z4 = z;
        String str12 = str4;
        String str13 = str2;
        String str14 = str3;
        String str15 = (i3 & 1) != 0 ? "discovery" : str;
        if ((i3 & 2) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i3 & 8) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        this(str15, str8, false, str9, (i3 & 16) != 0 ? "" : str13, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0, (i3 & 128) != 0 ? "" : str14, (i3 & 256) != 0 ? "" : str12, (i3 & 512) != 0 ? "" : null, null, null, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str11, (i3 & 8192) != 0 ? 0 : i5, (i3 & 16384) != 0 ? 0 : i4, (32768 & i3) != 0 ? false : z3, (65536 & i3) != 0 ? "" : str10, (i3 & 131072) == 0 ? str7 : "");
    }

    public C663990Q2r(String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, boolean z4, String str11, String str12) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
        this.LLJILLL = i;
        this.LLJJ = i2;
        this.LLJJI = z4;
        this.LLJJIII = str11;
        this.LLJJIJI = str12;
        C0P8T.LIZ();
    }
}
