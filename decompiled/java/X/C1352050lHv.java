package X;

import android.text.Editable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352050lHv implements InterfaceC0148002o {
    public final Aweme LL;
    public final User LLILLJJLI;
    public final C291001Au<Comment> LLILLL;
    public final AbstractC1347290lAF LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final C1352270lIH LLJ;
    public final C291001Au<BaseResponse> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<String> LLJILJIL;
    public final boolean LLJILJILJ;
    public final C291001Au<Editable> LLJILLL;
    public final C291001Au<Boolean> LLJJ;
    public final C291001Au<Pair<Boolean, Boolean>> LLJJI;
    public final String LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;

    public C1352050lHv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352050lHv)) {
            return false;
        }
        C1352050lHv c1352050lHv = (C1352050lHv) obj;
        return Intrinsics.LJFF(this.LL, c1352050lHv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1352050lHv.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1352050lHv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1352050lHv.LLILZ) && this.LLILZIL == c1352050lHv.LLILZIL && this.LLILZLL == c1352050lHv.LLILZLL && this.LLIZ == c1352050lHv.LLIZ && this.LLIZLLLIL == c1352050lHv.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1352050lHv.LLJ) && Intrinsics.LJFF(this.LLJI, c1352050lHv.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1352050lHv.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1352050lHv.LLJILJIL) && this.LLJILJILJ == c1352050lHv.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1352050lHv.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1352050lHv.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1352050lHv.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1352050lHv.LLJJIII) && this.LLJJIJI == c1352050lHv.LLJJIJI && this.LLJJIJIIJIL == c1352050lHv.LLJJIJIIJIL && this.LLJJIJIL == c1352050lHv.LLJJIJIL;
    }

    public final int hashCode() {
        Aweme aweme = this.LL;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        User user = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        C291001Au<Comment> c291001Au = this.LLILLL;
        int iHashCode3 = (((((((((((iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31;
        C1352270lIH c1352270lIH = this.LLJ;
        int iHashCode4 = (iHashCode3 + (c1352270lIH == null ? 0 : c1352270lIH.hashCode())) * 31;
        C291001Au<BaseResponse> c291001Au2 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<String> c291001Au4 = this.LLJILJIL;
        int iHashCode7 = (((iHashCode6 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        C291001Au<Editable> c291001Au5 = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Boolean> c291001Au6 = this.LLJJ;
        int iHashCode9 = (iHashCode8 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Pair<Boolean, Boolean>> c291001Au7 = this.LLJJI;
        int iHashCode10 = (iHashCode9 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        String str = this.LLJJIII;
        return ((((((iHashCode10 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + C786410Ut5.Z2(this.LLJJIJIL);
    }

    public final String toString() {
        return "NowCommentInputVMState(currentAweme=" + this.LL + ", user=" + this.LLILLJJLI + ", comment=" + this.LLILLL + ", panelType=" + this.LLILZ + ", isShowKeyboard=" + this.LLILZIL + ", inputPos=" + this.LLILZLL + ", softKeyboardStatus=" + this.LLIZ + ", keyboardHeight=" + this.LLIZLLLIL + ", replyCommentState=" + this.LLJ + ", commentError=" + this.LLJI + ", closeCommentKeyboard=" + this.LLJIJIL + ", openCommentKeyboard=" + this.LLJILJIL + ", isInputtingContent=" + this.LLJILJILJ + ", inputContent=" + this.LLJILLL + ", enableMentionState=" + this.LLJJ + ", tryMention=" + this.LLJJI + ", enterMethod=" + this.LLJJIII + ", inputVisible=" + this.LLJJIJI + ", showHorizontalEmojiPanel=" + this.LLJJIJIIJIL + ", commentPanelVisible=" + this.LLJJIJIL + ')';
    }

    public /* synthetic */ C1352050lHv(int i) {
        this(null, null, null, C1347120l9y.LIZ, false, 0, false, 0, null, null, null, null, false, null, null, null, null, true, true, false);
    }

    public static C1352050lHv LIZ(C1352050lHv c1352050lHv, Aweme aweme, C291001Au c291001Au, AbstractC1347290lAF abstractC1347290lAF, boolean z, int i, C1352270lIH c1352270lIH, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, boolean z2, C291001Au c291001Au5, C291001Au c291001Au6, String str, boolean z3, boolean z4, boolean z5, int i2) {
        User user;
        boolean z6;
        boolean z7 = z5;
        boolean z8 = z4;
        String str2 = str;
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        boolean z9 = z2;
        boolean z10 = z3;
        C291001Au c291001Au9 = c291001Au;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        C1352270lIH c1352270lIH2 = c1352270lIH;
        C291001Au c291001Au12 = c291001Au4;
        AbstractC1347290lAF abstractC1347290lAF2 = abstractC1347290lAF;
        int i3 = i;
        boolean z11 = z;
        Aweme aweme2 = aweme;
        if ((i2 & 1) != 0) {
            aweme2 = c1352050lHv.LL;
        }
        C291001Au<Boolean> c291001Au13 = null;
        if ((i2 & 2) != 0) {
            user = c1352050lHv.LLILLJJLI;
        } else {
            user = null;
        }
        if ((i2 & 4) != 0) {
            c291001Au9 = c1352050lHv.LLILLL;
        }
        if ((i2 & 8) != 0) {
            abstractC1347290lAF2 = c1352050lHv.LLILZ;
        }
        int i4 = 0;
        if ((i2 & 16) != 0) {
            z6 = c1352050lHv.LLILZIL;
        } else {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            i4 = c1352050lHv.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z11 = c1352050lHv.LLIZ;
        }
        if ((i2 & 128) != 0) {
            i3 = c1352050lHv.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c1352270lIH2 = c1352050lHv.LLJ;
        }
        if ((i2 & 512) != 0) {
            c291001Au11 = c1352050lHv.LLJI;
        }
        if ((i2 & 1024) != 0) {
            c291001Au10 = c1352050lHv.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au12 = c1352050lHv.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z9 = c1352050lHv.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            c291001Au8 = c1352050lHv.LLJILLL;
        }
        if ((i2 & 16384) != 0) {
            c291001Au13 = c1352050lHv.LLJJ;
        }
        if ((32768 & i2) != 0) {
            c291001Au7 = c1352050lHv.LLJJI;
        }
        if ((65536 & i2) != 0) {
            str2 = c1352050lHv.LLJJIII;
        }
        if ((131072 & i2) != 0) {
            z10 = c1352050lHv.LLJJIJI;
        }
        if ((262144 & i2) != 0) {
            z8 = c1352050lHv.LLJJIJIIJIL;
        }
        if ((i2 & 524288) != 0) {
            z7 = c1352050lHv.LLJJIJIL;
        }
        c1352050lHv.getClass();
        return new C1352050lHv(aweme2, user, c291001Au9, abstractC1347290lAF2, z6, i4, z11, i3, c1352270lIH2, c291001Au11, c291001Au10, c291001Au12, z9, c291001Au8, c291001Au13, c291001Au7, str2, z10, z8, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1352050lHv(Aweme aweme, User user, C291001Au<? extends Comment> c291001Au, AbstractC1347290lAF abstractC1347290lAF, boolean z, int i, boolean z2, int i2, C1352270lIH c1352270lIH, C291001Au<? extends BaseResponse> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<String> c291001Au4, boolean z3, C291001Au<? extends Editable> c291001Au5, C291001Au<Boolean> c291001Au6, C291001Au<Pair<Boolean, Boolean>> c291001Au7, String str, boolean z4, boolean z5, boolean z6) {
        this.LL = aweme;
        this.LLILLJJLI = user;
        this.LLILLL = c291001Au;
        this.LLILZ = abstractC1347290lAF;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = z2;
        this.LLIZLLLIL = i2;
        this.LLJ = c1352270lIH;
        this.LLJI = c291001Au2;
        this.LLJIJIL = c291001Au3;
        this.LLJILJIL = c291001Au4;
        this.LLJILJILJ = z3;
        this.LLJILLL = c291001Au5;
        this.LLJJ = c291001Au6;
        this.LLJJI = c291001Au7;
        this.LLJJIII = str;
        this.LLJJIJI = z4;
        this.LLJJIJIIJIL = z5;
        this.LLJJIJIL = z6;
    }
}
