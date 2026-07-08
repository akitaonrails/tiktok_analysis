package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNI implements InterfaceC636340Oxc<C0HNI, C436950HBl> {
    public final Boolean LL;
    public final List<C436960HBm> LLILLJJLI;
    public final C436960HBm LLILLL;
    public final C0HFD LLILZ;
    public final Long LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final C291001Au<Unit> LLJILJILJ;
    public final C627660Ojc<C436950HBl> LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HNI)) {
            return false;
        }
        C0HNI c0hni = (C0HNI) obj;
        return Intrinsics.LJFF(this.LL, c0hni.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hni.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hni.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0hni.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0hni.LLILZIL) && this.LLILZLL == c0hni.LLILZLL && Intrinsics.LJFF(this.LLIZ, c0hni.LLIZ) && this.LLIZLLLIL == c0hni.LLIZLLLIL && this.LLJ == c0hni.LLJ && this.LLJI == c0hni.LLJI && this.LLJIJIL == c0hni.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c0hni.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c0hni.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c0hni.LLJILLL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C436960HBm c436960HBm = this.LLILLL;
        int iHashCode2 = (iHashCode + (c436960HBm == null ? 0 : c436960HBm.hashCode())) * 31;
        C0HFD c0hfd = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c0hfd == null ? 0 : c0hfd.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode4 = (((((((((((((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31;
        String str = this.LLJILJIL;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLJILJILJ;
        return ((iHashCode5 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLJILLL.hashCode();
    }

    public final String toString() {
        return "SocialAvatarReviewState(fetchSuccess=" + this.LL + ", avatarPreviewList=" + this.LLILLJJLI + ", selectedAvatar=" + this.LLILLL + ", selectedStyle=" + this.LLILZ + ", avatarId=" + this.LLILZIL + ", useUserBucket=" + this.LLILZLL + ", defaultExpression=" + this.LLIZ + ", defaultStyleSelection=" + this.LLIZLLLIL + ", hasFetchedSocialAvatarQuota=" + this.LLJ + ", hasSuccessFetchedSocialAvatarQuota=" + this.LLJI + ", hasSocialAvatarQuota=" + this.LLJIJIL + ", socialAvatarResultLogId=" + this.LLJILJIL + ", showErrorStatus=" + this.LLJILJILJ + ", listState=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C436950HBl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C436950HBl> getListState() {
        return this.LLJILLL;
    }

    public C0HNI(Boolean bool, List<C436960HBm> list, C436960HBm c436960HBm, C0HFD c0hfd, Long l, boolean z, String str, int i, boolean z2, boolean z3, boolean z4, String str2, C291001Au<Unit> c291001Au, C627660Ojc<C436950HBl> c627660Ojc) {
        this.LL = bool;
        this.LLILLJJLI = list;
        this.LLILLL = c436960HBm;
        this.LLILZ = c0hfd;
        this.LLILZIL = l;
        this.LLILZLL = z;
        this.LLIZ = str;
        this.LLIZLLLIL = i;
        this.LLJ = z2;
        this.LLJI = z3;
        this.LLJIJIL = z4;
        this.LLJILJIL = str2;
        this.LLJILJILJ = c291001Au;
        this.LLJILLL = c627660Ojc;
    }

    public static C0HNI LIZ(C0HNI c0hni, Boolean bool, List list, C436960HBm c436960HBm, C0HFD c0hfd, Long l, boolean z, String str, int i, boolean z2, boolean z3, boolean z4, String str2, C291001Au c291001Au, C627660Ojc c627660Ojc, int i2) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au2 = c291001Au;
        String str3 = str2;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        int i3 = i;
        String str4 = str;
        boolean z8 = z;
        Long l2 = l;
        C0HFD c0hfd2 = c0hfd;
        C436960HBm c436960HBm2 = c436960HBm;
        List list2 = list;
        Boolean bool2 = bool;
        if ((i2 & 1) != 0) {
            bool2 = c0hni.LL;
        }
        if ((i2 & 2) != 0) {
            list2 = c0hni.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c436960HBm2 = c0hni.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c0hfd2 = c0hni.LLILZ;
        }
        if ((i2 & 16) != 0) {
            l2 = c0hni.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z8 = c0hni.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            str4 = c0hni.LLIZ;
        }
        if ((i2 & 128) != 0) {
            i3 = c0hni.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            z7 = c0hni.LLJ;
        }
        if ((i2 & 512) != 0) {
            z6 = c0hni.LLJI;
        }
        if ((i2 & 1024) != 0) {
            z5 = c0hni.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str3 = c0hni.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au2 = c0hni.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            c627660Ojc2 = c0hni.LLJILLL;
        }
        c0hni.getClass();
        return new C0HNI(bool2, list2, c436960HBm2, c0hfd2, l2, z8, str4, i3, z7, z6, z5, str3, c291001Au2, c627660Ojc2);
    }
}
