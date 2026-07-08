package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646370PWx implements InterfaceC1618170sD9<C646370PWx> {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public final Integer LLJILJIL;
    public final String LLJILJILJ;
    public final long LLJILLL;
    public final GlobalDoodleConfig LLJJ;
    public final long LLJJI;
    public final Map<String, String> LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;

    public C646370PWx() {
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
        if (!(obj instanceof C646370PWx)) {
            return false;
        }
        C646370PWx c646370PWx = (C646370PWx) obj;
        return Intrinsics.LJFF(this.LL, c646370PWx.LL) && this.LLILLJJLI == c646370PWx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c646370PWx.LLILLL) && this.LLILZ == c646370PWx.LLILZ && Intrinsics.LJFF(this.LLILZIL, c646370PWx.LLILZIL) && this.LLILZLL == c646370PWx.LLILZLL && this.LLIZ == c646370PWx.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c646370PWx.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c646370PWx.LLJ) && this.LLJI == c646370PWx.LLJI && this.LLJIJIL == c646370PWx.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c646370PWx.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c646370PWx.LLJILJILJ) && this.LLJILLL == c646370PWx.LLJILLL && Intrinsics.LJFF(this.LLJJ, c646370PWx.LLJJ) && this.LLJJI == c646370PWx.LLJJI && Intrinsics.LJFF(this.LLJJIII, c646370PWx.LLJJIII) && this.LLJJIJI == c646370PWx.LLJJIJI && this.LLJJIJIIJIL == c646370PWx.LLJJIJIIJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL) * 31;
        Integer num = this.LLJILJIL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLJILJILJ;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LLJILLL)) * 31;
        GlobalDoodleConfig globalDoodleConfig = this.LLJJ;
        return ((((((((iHashCode3 + (globalDoodleConfig != null ? globalDoodleConfig.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLJJI)) * 31) + this.LLJJIII.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("impl_id", this.LL);
        linkedHashMap.put("origin_type", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("enter_from", this.LLILLL);
        linkedHashMap.put("is_quote_video", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("token_type", this.LLILZIL);
        linkedHashMap.put("rank", Integer.valueOf(this.LLILZLL));
        linkedHashMap.put("is_in_mix_search", Boolean.valueOf(this.LLIZ));
        linkedHashMap.put("log_pb", this.LLIZLLLIL);
        linkedHashMap.put("doc_id", this.LLJ);
        linkedHashMap.put("is_preload", Boolean.valueOf(this.LLJI));
        linkedHashMap.put("mix_feed_id", Integer.valueOf(this.LLJIJIL));
        linkedHashMap.put("universal_rank", this.LLJILJIL);
        linkedHashMap.put("insert_type", this.LLJILJILJ);
        linkedHashMap.put("lynx_bind_time", Long.valueOf(this.LLJILLL));
        return linkedHashMap;
    }

    public final String toString() {
        return "SearchItemState(implId=" + this.LL + ", originType=" + this.LLILLJJLI + ", enterFrom=" + this.LLILLL + ", isQuoteVideo=" + this.LLILZ + ", tokenType=" + this.LLILZIL + ", rankInList=" + this.LLILZLL + ", isInMixSearch=" + this.LLIZ + ", logPb=" + this.LLIZLLLIL + ", docId=" + this.LLJ + ", isPreload=" + this.LLJI + ", searchMixFeedId=" + this.LLJIJIL + ", universalRank=" + this.LLJILJIL + ", insertType=" + this.LLJILJILJ + ", bindTime=" + this.LLJILLL + ", globalDoodleConfig=" + this.LLJJ + ", startSearchTime=" + this.LLJJI + ", mobParams=" + this.LLJJIII + ", isInNullifyCardList=" + this.LLJJIJI + ", isBindFromDataUpdate=" + this.LLJJIJIIJIL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C646370PWx(int i) {
        this("", 0, "", -1, "", -1, false, "", "", false, 0, null, null, 0L, null, 0L, new LinkedHashMap(), false, false);
    }

    public C646370PWx(String str, int i, String str2, int i2, String str3, int i3, boolean z, String str4, String str5, boolean z2, int i4, Integer num, String str6, long j, GlobalDoodleConfig globalDoodleConfig, long j2, Map<String, String> map, boolean z3, boolean z4) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = i2;
        this.LLILZIL = str3;
        this.LLILZLL = i3;
        this.LLIZ = z;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = z2;
        this.LLJIJIL = i4;
        this.LLJILJIL = num;
        this.LLJILJILJ = str6;
        this.LLJILLL = j;
        this.LLJJ = globalDoodleConfig;
        this.LLJJI = j2;
        this.LLJJIII = map;
        this.LLJJIJI = z3;
        this.LLJJIJIIJIL = z4;
        C0P8T.LIZ();
    }

    public static C646370PWx LIZ(C646370PWx c646370PWx, String str, int i, String str2, int i2, String str3, int i3, boolean z, String str4, String str5, boolean z2, int i4, Integer num, String str6, long j, GlobalDoodleConfig globalDoodleConfig, long j2, Map map, boolean z3, boolean z4, int i5) {
        boolean z5 = z4;
        boolean z6 = z3;
        Map map2 = map;
        long j3 = j2;
        Integer num2 = num;
        int i6 = i4;
        GlobalDoodleConfig globalDoodleConfig2 = globalDoodleConfig;
        boolean z7 = z2;
        String str7 = str5;
        String str8 = str4;
        boolean z8 = z;
        int i7 = i3;
        long j4 = j;
        String str9 = str3;
        int i8 = i2;
        String str10 = str2;
        String str11 = str6;
        int i9 = i;
        String str12 = str;
        if ((i5 & 1) != 0) {
            str12 = c646370PWx.LL;
        }
        if ((i5 & 2) != 0) {
            i9 = c646370PWx.LLILLJJLI;
        }
        if ((i5 & 4) != 0) {
            str10 = c646370PWx.LLILLL;
        }
        if ((i5 & 8) != 0) {
            i8 = c646370PWx.LLILZ;
        }
        if ((i5 & 16) != 0) {
            str9 = c646370PWx.LLILZIL;
        }
        if ((i5 & 32) != 0) {
            i7 = c646370PWx.LLILZLL;
        }
        if ((i5 & 64) != 0) {
            z8 = c646370PWx.LLIZ;
        }
        if ((i5 & 128) != 0) {
            str8 = c646370PWx.LLIZLLLIL;
        }
        if ((i5 & 256) != 0) {
            str7 = c646370PWx.LLJ;
        }
        if ((i5 & 512) != 0) {
            z7 = c646370PWx.LLJI;
        }
        if ((i5 & 1024) != 0) {
            i6 = c646370PWx.LLJIJIL;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = c646370PWx.LLJILJIL;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = c646370PWx.LLJILJILJ;
        }
        if ((i5 & 8192) != 0) {
            j4 = c646370PWx.LLJILLL;
        }
        if ((i5 & 16384) != 0) {
            globalDoodleConfig2 = c646370PWx.LLJJ;
        }
        if ((32768 & i5) != 0) {
            j3 = c646370PWx.LLJJI;
        }
        if ((65536 & i5) != 0) {
            map2 = c646370PWx.LLJJIII;
        }
        if ((131072 & i5) != 0) {
            z6 = c646370PWx.LLJJIJI;
        }
        if ((i5 & 262144) != 0) {
            z5 = c646370PWx.LLJJIJIIJIL;
        }
        c646370PWx.getClass();
        boolean z9 = z8;
        String str13 = str8;
        return new C646370PWx(str12, i9, str10, i8, str9, i7, z9, str13, str7, z7, i6, num2, str11, j4, globalDoodleConfig2, j3, map2, z6, z5);
    }
}
