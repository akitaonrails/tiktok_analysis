package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651130PgN implements InterfaceC1618170sD9<C651130PgN> {
    public final String LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final boolean LLJILLL;
    public final long LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final Map<String, Object> LLJJL;

    public C651130PgN() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C651130PgN)) {
            return false;
        }
        C651130PgN c651130PgN = (C651130PgN) obj;
        return Intrinsics.LJFF(this.LL, c651130PgN.LL) && this.LLILLJJLI == c651130PgN.LLILLJJLI && this.LLILLL == c651130PgN.LLILLL && this.LLILZ == c651130PgN.LLILZ && this.LLILZIL == c651130PgN.LLILZIL && this.LLILZLL == c651130PgN.LLILZLL && Intrinsics.LJFF(this.LLIZ, c651130PgN.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c651130PgN.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c651130PgN.LLJ) && Intrinsics.LJFF(this.LLJI, c651130PgN.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c651130PgN.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c651130PgN.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c651130PgN.LLJILJILJ) && this.LLJILLL == c651130PgN.LLJILLL && this.LLJJ == c651130PgN.LLJJ && Intrinsics.LJFF(this.LLJJI, c651130PgN.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c651130PgN.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c651130PgN.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c651130PgN.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c651130PgN.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c651130PgN.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c651130PgN.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c651130PgN.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c651130PgN.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c651130PgN.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c651130PgN.LLJJL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Y2(this.LLJJ)) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL.hashCode()) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + this.LLJJJJJIL.hashCode()) * 31) + this.LLJJJJLIIL.hashCode()) * 31) + this.LLJJL.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tagText", this.LL);
        linkedHashMap.put("searchTime", Long.valueOf(this.LLILLJJLI));
        linkedHashMap.put("queryCorrectType", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("isFilterSearch", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("filterBy", Integer.valueOf(this.LLILZIL));
        linkedHashMap.put("sortType", Integer.valueOf(this.LLILZLL));
        linkedHashMap.put("searchContext", this.LLIZ);
        linkedHashMap.put("groupId", this.LLIZLLLIL);
        linkedHashMap.put("currentUid", this.LLJ);
        linkedHashMap.put("lastSearchId", this.LLJI);
        linkedHashMap.put("sugType", this.LLJIJIL);
        linkedHashMap.put("sugGenerateType", this.LLJILJIL);
        linkedHashMap.put("sugSessionId", this.LLJILJILJ);
        linkedHashMap.put("isFirstSearch", Boolean.valueOf(this.LLJILLL));
        linkedHashMap.put("launchTime", Long.valueOf(this.LLJJ));
        linkedHashMap.put("isFromComment", this.LLJJI);
        linkedHashMap.put("fromMiddleBackFromResult", this.LLJJIII);
        linkedHashMap.put("sugCreatorId", this.LLJJIJI);
        linkedHashMap.put("sugQueryState", this.LLJJIJIIJIL);
        linkedHashMap.put("bubbleType", this.LLJJIJIL);
        linkedHashMap.put("isBubbleClick", this.LLJJJ);
        linkedHashMap.put("bubbleTextType", this.LLJJJIL);
        linkedHashMap.put("isFromVideo", this.LLJJJJ);
        linkedHashMap.put("isFromPhoto", this.LLJJJJJIL);
        linkedHashMap.put("personalContextInfo", this.LLJJJJLIIL);
        return linkedHashMap;
    }

    public final String toString() {
        return "SearchLynxVerticalState(tagText=" + this.LL + ", searchTime=" + this.LLILLJJLI + ", queryCorrectType=" + this.LLILLL + ", isFilterSearch=" + this.LLILZ + ", filterBy=" + this.LLILZIL + ", sortType=" + this.LLILZLL + ", searchContext=" + this.LLIZ + ", groupId=" + this.LLIZLLLIL + ", currentUid=" + this.LLJ + ", lastSearchId=" + this.LLJI + ", sugType=" + this.LLJIJIL + ", sugGenerateType=" + this.LLJILJIL + ", sugSessionId=" + this.LLJILJILJ + ", isFirstSearch=" + this.LLJILLL + ", launchTime=" + this.LLJJ + ", isFromComment=" + this.LLJJI + ", fromMiddleBackFromResult=" + this.LLJJIII + ", sugCreatorId=" + this.LLJJIJI + ", sugQueryState=" + this.LLJJIJIIJIL + ", bubbleType=" + this.LLJJIJIL + ", isBubbleClick=" + this.LLJJJ + ", bubbleTextType=" + this.LLJJJIL + ", isFromVideo=" + this.LLJJJJ + ", isFromPhoto=" + this.LLJJJJJIL + ", personalContextInfo=" + this.LLJJJJLIIL + ", logParams=" + this.LLJJL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C651130PgN(int i) {
        this("", 0L, -1, -1, -1, -1, "", "", "", "", "", "", "", false, 0L, "", "", "", "", "", "", "", "", "", "", C2097608Jq.LJ());
    }

    public C651130PgN(String str, long j, int i, int i2, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, long j2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Map<String, ? extends Object> map) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = z;
        this.LLJJ = j2;
        this.LLJJI = str9;
        this.LLJJIII = str10;
        this.LLJJIJI = str11;
        this.LLJJIJIIJIL = str12;
        this.LLJJIJIL = str13;
        this.LLJJJ = str14;
        this.LLJJJIL = str15;
        this.LLJJJJ = str16;
        this.LLJJJJJIL = str17;
        this.LLJJJJLIIL = str18;
        this.LLJJL = map;
        C0P8T.LIZ();
    }

    public static C651130PgN LIZ(C651130PgN c651130PgN, String str, long j, int i, int i2, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, long j2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Map map, int i5) {
        Map map2 = map;
        String str19 = str18;
        String str20 = str15;
        String str21 = str14;
        String str22 = str13;
        String str23 = str10;
        String str24 = str9;
        long j3 = j2;
        String str25 = str6;
        boolean z2 = z;
        String str26 = str12;
        String str27 = str5;
        String str28 = str3;
        String str29 = str8;
        String str30 = str4;
        int i6 = i4;
        String str31 = str7;
        String str32 = str2;
        String str33 = str11;
        int i7 = i2;
        long j4 = j;
        String str34 = str16;
        int i8 = i;
        String str35 = str17;
        int i9 = i3;
        String str36 = str;
        if ((i5 & 1) != 0) {
            str36 = c651130PgN.LL;
        }
        if ((i5 & 2) != 0) {
            j4 = c651130PgN.LLILLJJLI;
        }
        if ((i5 & 4) != 0) {
            i8 = c651130PgN.LLILLL;
        }
        if ((i5 & 8) != 0) {
            i7 = c651130PgN.LLILZ;
        }
        if ((i5 & 16) != 0) {
            i9 = c651130PgN.LLILZIL;
        }
        if ((i5 & 32) != 0) {
            i6 = c651130PgN.LLILZLL;
        }
        if ((i5 & 64) != 0) {
            str32 = c651130PgN.LLIZ;
        }
        if ((i5 & 128) != 0) {
            str28 = c651130PgN.LLIZLLLIL;
        }
        if ((i5 & 256) != 0) {
            str30 = c651130PgN.LLJ;
        }
        if ((i5 & 512) != 0) {
            str27 = c651130PgN.LLJI;
        }
        if ((i5 & 1024) != 0) {
            str25 = c651130PgN.LLJIJIL;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str31 = c651130PgN.LLJILJIL;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str29 = c651130PgN.LLJILJILJ;
        }
        if ((i5 & 8192) != 0) {
            z2 = c651130PgN.LLJILLL;
        }
        if ((i5 & 16384) != 0) {
            j3 = c651130PgN.LLJJ;
        }
        if ((32768 & i5) != 0) {
            str24 = c651130PgN.LLJJI;
        }
        if ((65536 & i5) != 0) {
            str23 = c651130PgN.LLJJIII;
        }
        if ((131072 & i5) != 0) {
            str33 = c651130PgN.LLJJIJI;
        }
        if ((262144 & i5) != 0) {
            str26 = c651130PgN.LLJJIJIIJIL;
        }
        if ((524288 & i5) != 0) {
            str22 = c651130PgN.LLJJIJIL;
        }
        if ((1048576 & i5) != 0) {
            str21 = c651130PgN.LLJJJ;
        }
        if ((2097152 & i5) != 0) {
            str20 = c651130PgN.LLJJJIL;
        }
        if ((4194304 & i5) != 0) {
            str34 = c651130PgN.LLJJJJ;
        }
        if ((8388608 & i5) != 0) {
            str35 = c651130PgN.LLJJJJJIL;
        }
        if ((16777216 & i5) != 0) {
            str19 = c651130PgN.LLJJJJLIIL;
        }
        if ((i5 & 33554432) != 0) {
            map2 = c651130PgN.LLJJL;
        }
        c651130PgN.getClass();
        Map map3 = map2;
        return new C651130PgN(str36, j4, i8, i7, i9, i6, str32, str28, str30, str27, str25, str31, str29, z2, j3, str24, str23, str33, str26, str22, str21, str20, str34, str35, str19, map3);
    }
}
