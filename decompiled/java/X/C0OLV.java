package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinTaskData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OLV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLV implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final Map<String, String> LLJILJIL;
    public final List<BulletinTaskData> LLJILJILJ;
    public final Long LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OLV)) {
            return false;
        }
        C0OLV c0olv = (C0OLV) obj;
        return Intrinsics.LJFF(this.LL, c0olv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0olv.LLILLJJLI) && this.LLILLL == c0olv.LLILLL && this.LLILZ == c0olv.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0olv.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0olv.LLILZLL) && this.LLIZ == c0olv.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c0olv.LLIZLLLIL) && this.LLJ == c0olv.LLJ && this.LLJI == c0olv.LLJI && Intrinsics.LJFF(this.LLJIJIL, c0olv.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0olv.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0olv.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0olv.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c0olv.LLJJ) && Intrinsics.LJFF(this.LLJJI, c0olv.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c0olv.LLJJIII);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31;
        String str2 = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZLL;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        String str4 = this.LLIZLLLIL;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        String str5 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<BulletinTaskData> list = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.LLJILLL;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.LLJJ;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJJIII;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinBoardParam(bulletinBoardId=" + this.LL + ", previousPage=" + this.LLILLJJLI + ", enterFromCreate=" + this.LLILLL + ", status=" + this.LLILZ + ", enterFromConversationId=" + this.LLILZIL + ", enterFromMessageId=" + this.LLILZLL + ", hideBackButton=" + this.LLIZ + ", openReason=" + this.LLIZLLLIL + ", isHalfScreen=" + this.LLJ + ", enableAction=" + this.LLJI + ", fromScene=" + this.LLJIJIL + ", liveFollowLogParams=" + this.LLJILJIL + ", bulletinTasks=" + this.LLJILJILJ + ", pageStartTime=" + this.LLJILLL + ", dcSessionId=" + this.LLJJ + ", enterMethod=" + this.LLJJI + ", enterAction=" + this.LLJJIII + ')';
    }

    public C0OLV(String str, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, String str6, Map<String, String> map, List<BulletinTaskData> list, Long l, String str7, String str8, String str9) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = z2;
        this.LLIZLLLIL = str5;
        this.LLJ = z3;
        this.LLJI = z4;
        this.LLJIJIL = str6;
        this.LLJILJIL = map;
        this.LLJILJILJ = list;
        this.LLJILLL = l;
        this.LLJJ = str7;
        this.LLJJI = str8;
        this.LLJJIII = str9;
    }

    public /* synthetic */ C0OLV(String str, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, String str6, Map map, List list, Long l, String str7, String str8, String str9, int i2) {
        this(str, str2, z, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, z2, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? true : z4, (i2 & 1024) != 0 ? null : str6, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : map, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list, (i2 & 8192) != 0 ? null : l, (i2 & 16384) != 0 ? null : str7, (32768 & i2) != 0 ? null : str8, (i2 & 65536) == 0 ? str9 : null);
    }
}
