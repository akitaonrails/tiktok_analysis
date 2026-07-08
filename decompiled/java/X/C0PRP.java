package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRP implements InterfaceC1618170sD9<C0PRP> {
    public final String LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final boolean LLJILJILJ;

    public C0PRP() {
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
        if (!(obj instanceof C0PRP)) {
            return false;
        }
        C0PRP c0prp = (C0PRP) obj;
        return Intrinsics.LJFF(this.LL, c0prp.LL) && this.LLILLJJLI == c0prp.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0prp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0prp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0prp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0prp.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0prp.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0prp.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0prp.LLJ) && Intrinsics.LJFF(this.LLJI, c0prp.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0prp.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0prp.LLJILJIL) && this.LLJILJILJ == c0prp.LLJILJILJ;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31;
        String str2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJ;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJI;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJIJIL;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LLJILJIL;
        return ((iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJILJILJ);
    }

    public final String toString() {
        return "VisualSearchActivatedState(activatedSearchId=" + this.LL + ", searchResultStartTime=" + this.LLILLJJLI + ", groupId=" + this.LLILLL + ", searchType=" + this.LLILZ + ", enterFrom=" + this.LLILZIL + ", enterMethod=" + this.LLILZLL + ", enterFromChannel=" + this.LLIZ + ", enterGroupId=" + this.LLIZLLLIL + ", reqSearchEnterMethod=" + this.LLJ + ", reqSearchEnterFrom=" + this.LLJI + ", vsResultFeedImprId=" + this.LLJIJIL + ", reqVisualUnifiedTagId=" + this.LLJILJIL + ", needReactiveTime=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C0PRP(int i) {
        this(null, 0L, null, null, null, null, null, null, null, null, null, null, false);
    }

    public C0PRP(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
        this.LLJI = str9;
        this.LLJIJIL = str10;
        this.LLJILJIL = str11;
        this.LLJILJILJ = z;
        C0P8T.LIZ();
    }

    public static C0PRP LIZ(C0PRP c0prp, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i) {
        boolean z2 = z;
        String str12 = str11;
        String str13 = str9;
        String str14 = str8;
        String str15 = str7;
        String str16 = str6;
        String str17 = str5;
        String str18 = str3;
        String str19 = str2;
        long j2 = j;
        String str20 = str4;
        String str21 = str10;
        String str22 = str;
        if ((i & 1) != 0) {
            str22 = c0prp.LL;
        }
        if ((i & 2) != 0) {
            j2 = c0prp.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str19 = c0prp.LLILLL;
        }
        if ((i & 8) != 0) {
            str18 = c0prp.LLILZ;
        }
        if ((i & 16) != 0) {
            str20 = c0prp.LLILZIL;
        }
        if ((i & 32) != 0) {
            str17 = c0prp.LLILZLL;
        }
        if ((i & 64) != 0) {
            str16 = c0prp.LLIZ;
        }
        if ((i & 128) != 0) {
            str15 = c0prp.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str14 = c0prp.LLJ;
        }
        if ((i & 512) != 0) {
            str13 = c0prp.LLJI;
        }
        if ((i & 1024) != 0) {
            str21 = c0prp.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str12 = c0prp.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c0prp.LLJILJILJ;
        }
        c0prp.getClass();
        return new C0PRP(str22, j2, str19, str18, str20, str17, str16, str15, str14, str13, str21, str12, z2);
    }
}
