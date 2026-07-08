package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRF implements InterfaceC1618170sD9<C0PRF> {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final boolean LLJIJIL;
    public final Integer LLJILJIL;
    public final String LLJILJILJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0PRF() {
        String str = null;
        this(str, str, str, str, 8191);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRF)) {
            return false;
        }
        C0PRF c0prf = (C0PRF) obj;
        return this.LL == c0prf.LL && this.LLILLJJLI == c0prf.LLILLJJLI && this.LLILLL == c0prf.LLILLL && Intrinsics.LJFF(this.LLILZ, c0prf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0prf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0prf.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0prf.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0prf.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0prf.LLJ) && Intrinsics.LJFF(this.LLJI, c0prf.LLJI) && this.LLJIJIL == c0prf.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c0prf.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0prf.LLJILJILJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        Integer num = this.LLJILJIL;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LLJILJILJ.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("last_showing_page_index", Integer.valueOf(this.LL));
        linkedHashMap.put("last_show_page_index", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("last_tab_index", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("launch_schema_string", this.LLILZ);
        linkedHashMap.put("enter_from_second", this.LLILZIL);
        linkedHashMap.put("blank_page_enter_from", this.LLILZLL);
        linkedHashMap.put("blank_page_enter_method", this.LLIZ);
        linkedHashMap.put("blank_page_enter_action", this.LLIZLLLIL);
        linkedHashMap.put("last_feed_group_id", this.LLJ);
        linkedHashMap.put("real_search_word_while_open_search", this.LLJI);
        linkedHashMap.put("is_search_middle_page_cold_launch_key_board_show", Boolean.valueOf(this.LLJIJIL));
        linkedHashMap.put("search_activity_hash_code", this.LLJILJIL);
        linkedHashMap.put("request_search_keyword", this.LLJILJILJ);
        return linkedHashMap;
    }

    public final String toString() {
        return "SearchGlobalState(lastShowingPageIndex=" + this.LL + ", searchLastShowPageIndex=" + this.LLILLJJLI + ", lastTabIndex=" + this.LLILLL + ", launchSchemaString=" + this.LLILZ + ", enterFromSecond=" + this.LLILZIL + ", blankPageEnterFrom=" + this.LLILZLL + ", blankPageEnterMethod=" + this.LLIZ + ", blankPageEnterAction=" + this.LLIZLLLIL + ", lastFeedGroupId=" + this.LLJ + ", realSearchWordWhileOpenSearch=" + this.LLJI + ", isSearchMiddlePageColdLaunchKeyBoardShow=" + this.LLJIJIL + ", searchActivityHashCode=" + this.LLJILJIL + ", requestSearchKeyword=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0PRF(String str, String str2, String str3, String str4, int i) {
        int i2;
        int i3;
        String str5;
        String str6;
        String str7;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        str11 = (i & 8) != 0 ? "" : str11;
        if ((i & 16) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        str10 = (i & 32) != 0 ? "" : str10;
        str9 = (i & 64) != 0 ? "" : str9;
        if ((i & 128) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        this(i2, 0, i3, str11, str5, str10, str9, str6, str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0, null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? null : "");
    }

    public static C0PRF LIZ(C0PRF c0prf, int i, int i2, int i3, String str, String str2, String str3, boolean z, String str4, int i4) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = str4;
        boolean z2 = z;
        String str10 = str2;
        String str11 = str;
        int i5 = i3;
        int i6 = i2;
        String str12 = str3;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c0prf.LL;
        }
        if ((i4 & 2) != 0) {
            i6 = c0prf.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            i5 = c0prf.LLILLL;
        }
        Integer num = null;
        if ((i4 & 8) != 0) {
            str5 = c0prf.LLILZ;
        } else {
            str5 = null;
        }
        if ((i4 & 16) != 0) {
            str6 = c0prf.LLILZIL;
        } else {
            str6 = null;
        }
        if ((i4 & 32) != 0) {
            str11 = c0prf.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            str10 = c0prf.LLIZ;
        }
        if ((i4 & 128) != 0) {
            str12 = c0prf.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            str7 = c0prf.LLJ;
        } else {
            str7 = null;
        }
        if ((i4 & 512) != 0) {
            str8 = c0prf.LLJI;
        } else {
            str8 = null;
        }
        if ((i4 & 1024) != 0) {
            z2 = c0prf.LLJIJIL;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = c0prf.LLJILJIL;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = c0prf.LLJILJILJ;
        }
        c0prf.getClass();
        return new C0PRF(i7, i6, i5, str5, str6, str11, str10, str12, str7, str8, z2, num, str9);
    }

    public C0PRF(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Integer num, String str8) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = z;
        this.LLJILJIL = num;
        this.LLJILJILJ = str8;
        C0P8T.LIZ();
    }
}
