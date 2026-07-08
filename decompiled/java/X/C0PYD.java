package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYD implements InterfaceC1618170sD9<C0PYD> {
    public final String LL;
    public final C0PYR LLILLJJLI;
    public final C0P65 LLILLL;
    public final C0PXE LLILZ;
    public final Long LLILZIL;
    public final List<SearchKeyFramePoint> LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final Function1<EnterRoomConfig, EnterRoomConfig> LLJI;
    public final boolean LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;

    public C0PYD() {
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
        if (!(obj instanceof C0PYD)) {
            return false;
        }
        C0PYD c0pyd = (C0PYD) obj;
        return Intrinsics.LJFF(this.LL, c0pyd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pyd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pyd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pyd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0pyd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0pyd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0pyd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0pyd.LLIZLLLIL) && this.LLJ == c0pyd.LLJ && Intrinsics.LJFF(this.LLJI, c0pyd.LLJI) && this.LLJIJIL == c0pyd.LLJIJIL && this.LLJILJIL == c0pyd.LLJILJIL && this.LLJILJILJ == c0pyd.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c0pyd.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c0pyd.LLJJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C0PYR c0pyr = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c0pyr == null ? 0 : c0pyr.hashCode())) * 31;
        C0P65 c0p65 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c0p65 == null ? 0 : c0p65.hashCode())) * 31;
        C0PXE c0pxe = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c0pxe == null ? 0 : c0pxe.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode7 = (((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        Function1<EnterRoomConfig, EnterRoomConfig> function1 = this.LLJI;
        return ((((((((((iHashCode7 + (function1 != null ? function1.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode();
    }

    public final String toString() {
        return "SearchAwemeBindingState(demoSegment=" + this.LL + ", cardItemInfo=" + this.LLILLJJLI + ", awemeInnerPlayInfo=" + this.LLILLL + ", awemeInnerFlowInfo=" + this.LLILZ + ", awemeStartPlayTimeForCs=" + this.LLILZIL + ", awemeSearchKeyPoints=" + this.LLILZLL + ", docId=" + this.LLIZ + ", imprId=" + this.LLIZLLLIL + ", isRotated=" + this.LLJ + ", liveRoomConfig=" + this.LLJI + ", isNoContinuePlay=" + this.LLJIJIL + ", isQuoteVideo=" + this.LLJILJIL + ", isCoverLoadSuccess=" + this.LLJILJILJ + ", awemeCommentType=" + this.LLJILLL + ", awemeCommentId=" + this.LLJJ + ')';
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

    public C0PYD(int i) {
        this("", null, null, null, null, C13BV.INSTANCE, "", "", false, null, false, -1, false, "", "");
    }

    public static C0PYD LIZ(C0PYD c0pyd, C0PYR c0pyr, C0P65 c0p65, C0PXE c0pxe, Long l, List list, Function1 function1, boolean z, boolean z2, String str, String str2, int i) {
        String str3;
        String str4;
        boolean z3;
        int i2;
        C0PXE c0pxe2 = c0pxe;
        String str5 = str2;
        List list2 = list;
        String str6 = str;
        Long l2 = l;
        boolean z4 = z2;
        C0P65 c0p652 = c0p65;
        boolean z5 = z;
        Function1 function12 = function1;
        C0PYR c0pyr2 = c0pyr;
        String str7 = null;
        if ((i & 1) != 0) {
            str3 = c0pyd.LL;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            c0pyr2 = c0pyd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c0p652 = c0pyd.LLILLL;
        }
        if ((i & 8) != 0) {
            c0pxe2 = c0pyd.LLILZ;
        }
        if ((i & 16) != 0) {
            l2 = c0pyd.LLILZIL;
        }
        if ((i & 32) != 0) {
            list2 = c0pyd.LLILZLL;
        }
        if ((i & 64) != 0) {
            str4 = c0pyd.LLIZ;
        } else {
            str4 = null;
        }
        if ((i & 128) != 0) {
            str7 = c0pyd.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z3 = c0pyd.LLJ;
        } else {
            z3 = false;
        }
        if ((i & 512) != 0) {
            function12 = c0pyd.LLJI;
        }
        if ((i & 1024) != 0) {
            z5 = c0pyd.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i2 = c0pyd.LLJILJIL;
        } else {
            i2 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z4 = c0pyd.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            str6 = c0pyd.LLJILLL;
        }
        if ((i & 16384) != 0) {
            str5 = c0pyd.LLJJ;
        }
        c0pyd.getClass();
        return new C0PYD(str3, c0pyr2, c0p652, c0pxe2, l2, list2, str4, str7, z3, function12, z5, i2, z4, str6, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0PYD(String str, C0PYR c0pyr, C0P65 c0p65, C0PXE c0pxe, Long l, List<SearchKeyFramePoint> list, String str2, String str3, boolean z, Function1<? super EnterRoomConfig, EnterRoomConfig> function1, boolean z2, int i, boolean z3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = c0pyr;
        this.LLILLL = c0p65;
        this.LLILZ = c0pxe;
        this.LLILZIL = l;
        this.LLILZLL = list;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = z;
        this.LLJI = function1;
        this.LLJIJIL = z2;
        this.LLJILJIL = i;
        this.LLJILJILJ = z3;
        this.LLJILLL = str4;
        this.LLJJ = str5;
        C0P8T.LIZ();
    }
}
