package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2L implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final UrlModel LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;

    public C0S2L() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S2L)) {
            return false;
        }
        C0S2L c0s2l = (C0S2L) obj;
        return Intrinsics.LJFF(this.LL, c0s2l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0s2l.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0s2l.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0s2l.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0s2l.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0s2l.LLILZLL) && this.LLIZ == c0s2l.LLIZ && this.LLIZLLLIL == c0s2l.LLIZLLLIL && this.LLJ == c0s2l.LLJ && this.LLJI == c0s2l.LLJI && this.LLJIJIL == c0s2l.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c0s2l.LLJILJIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        UrlModel urlModel = this.LLILLL;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZIL;
        int iHashCode4 = (((((((((((((iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLJILJIL;
        return iHashCode4 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        return "VideoExposeSharerState(nickName=" + this.LL + ", callerId=" + this.LLILLJJLI + ", avatar=" + this.LLILLL + ", followAnimation=" + this.LLILZ + ", unfollow=" + this.LLILZIL + ", followText=" + this.LLILZLL + ", followBtnColor=" + this.LLIZ + ", followTextColor=" + this.LLIZLLLIL + ", hasAnimationPlayed=" + this.LLJ + ", isShowQuickReplyBox=" + this.LLJI + ", isInQuickReplayBoxAnimation=" + this.LLJIJIL + ", retryContention=" + this.LLJILJIL + ')';
    }

    public /* synthetic */ C0S2L(int i) {
        this("", "", null, null, null, "", 0, R.attr.bx, false, false, false, null);
    }

    public C0S2L(String str, String str2, UrlModel urlModel, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, C291001Au<Boolean> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = urlModel;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = z;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = c291001Au3;
    }

    public static C0S2L LIZ(C0S2L c0s2l, String str, String str2, UrlModel urlModel, C291001Au c291001Au, C291001Au c291001Au2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, C291001Au c291001Au3, int i3) {
        C291001Au c291001Au4 = c291001Au3;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        int i4 = i2;
        int i5 = i;
        String str4 = str3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        UrlModel urlModel2 = urlModel;
        String str5 = str2;
        String str6 = str;
        if ((i3 & 1) != 0) {
            str6 = c0s2l.LL;
        }
        if ((i3 & 2) != 0) {
            str5 = c0s2l.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            urlModel2 = c0s2l.LLILLL;
        }
        if ((i3 & 8) != 0) {
            c291001Au6 = c0s2l.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c291001Au5 = c0s2l.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            str4 = c0s2l.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            i5 = c0s2l.LLIZ;
        }
        if ((i3 & 128) != 0) {
            i4 = c0s2l.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            z6 = c0s2l.LLJ;
        }
        if ((i3 & 512) != 0) {
            z5 = c0s2l.LLJI;
        }
        if ((i3 & 1024) != 0) {
            z4 = c0s2l.LLJIJIL;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au4 = c0s2l.LLJILJIL;
        }
        c0s2l.getClass();
        return new C0S2L(str6, str5, urlModel2, c291001Au6, c291001Au5, str4, i5, i4, z6, z5, z4, c291001Au4);
    }
}
