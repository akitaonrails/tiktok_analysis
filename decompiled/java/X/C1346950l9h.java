package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346950l9h implements InterfaceC0148002o {
    public final AbstractC1347290lAF LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final C1346480l8w LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final C291001Au<CommentInputContent> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<Pair<Boolean, Boolean>> LLJILJILJ;
    public final C1346560l94 LLJILLL;
    public final boolean LLJJ;
    public final C291001Au<Boolean> LLJJI;
    public final boolean LLJJIII;
    public final EnumC1341660l1A LLJJIJI;
    public final C291001Au<Boolean> LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final C291001Au<Integer> LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final C1346880l9a LLJLIL;
    public final C291001Au<Boolean> LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final C291001Au<Pair<String, Integer>> LLJLLIL;

    public C1346950l9h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346950l9h)) {
            return false;
        }
        C1346950l9h c1346950l9h = (C1346950l9h) obj;
        return Intrinsics.LJFF(this.LL, c1346950l9h.LL) && this.LLILLJJLI == c1346950l9h.LLILLJJLI && this.LLILLL == c1346950l9h.LLILLL && this.LLILZ == c1346950l9h.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1346950l9h.LLILZIL) && this.LLILZLL == c1346950l9h.LLILZLL && this.LLIZ == c1346950l9h.LLIZ && this.LLIZLLLIL == c1346950l9h.LLIZLLLIL && this.LLJ == c1346950l9h.LLJ && Intrinsics.LJFF(this.LLJI, c1346950l9h.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1346950l9h.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1346950l9h.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1346950l9h.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1346950l9h.LLJILLL) && this.LLJJ == c1346950l9h.LLJJ && Intrinsics.LJFF(this.LLJJI, c1346950l9h.LLJJI) && this.LLJJIII == c1346950l9h.LLJJIII && this.LLJJIJI == c1346950l9h.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c1346950l9h.LLJJIJIIJIL) && this.LLJJIJIL == c1346950l9h.LLJJIJIL && this.LLJJJ == c1346950l9h.LLJJJ && this.LLJJJIL == c1346950l9h.LLJJJIL && Intrinsics.LJFF(this.LLJJJJ, c1346950l9h.LLJJJJ) && this.LLJJJJJIL == c1346950l9h.LLJJJJJIL && this.LLJJJJLIIL == c1346950l9h.LLJJJJLIIL && this.LLJJL == c1346950l9h.LLJJL && this.LLJJLIIIJLLLLLLLZ == c1346950l9h.LLJJLIIIJLLLLLLLZ && this.LLJL == c1346950l9h.LLJL && Intrinsics.LJFF(this.LLJLIL, c1346950l9h.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c1346950l9h.LLJLILLLLZIIL) && this.LLJLL == c1346950l9h.LLJLL && Intrinsics.LJFF(this.LLJLLIL, c1346950l9h.LLJLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31;
        C1346480l8w c1346480l8w = this.LLILZIL;
        int iHashCode2 = (((((((((((iHashCode + (c1346480l8w == null ? 0 : c1346480l8w.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLJILJIL;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Pair<Boolean, Boolean>> c291001Au3 = this.LLJILJILJ;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C1346560l94 c1346560l94 = this.LLJILLL;
        int iHashCode6 = (((iHashCode5 + (c1346560l94 == null ? 0 : c1346560l94.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLJJI;
        int iHashCode7 = (((((iHashCode6 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI.hashCode()) * 31;
        C291001Au<Boolean> c291001Au5 = this.LLJJIJIIJIL;
        int iHashCode8 = (((((((iHashCode7 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31;
        C291001Au<Integer> c291001Au6 = this.LLJJJJ;
        int iHashCode9 = (((((((((((iHashCode8 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJLIIL)) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31;
        C1346880l9a c1346880l9a = this.LLJLIL;
        int iHashCode10 = (iHashCode9 + (c1346880l9a == null ? 0 : c1346880l9a.hashCode())) * 31;
        C291001Au<Boolean> c291001Au7 = this.LLJLILLLLZIIL;
        int iHashCode11 = (((iHashCode10 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31;
        C291001Au<Pair<String, Integer>> c291001Au8 = this.LLJLLIL;
        return iHashCode11 + (c291001Au8 != null ? c291001Au8.hashCode() : 0);
    }

    public final String toString() {
        return "CommentInputVMStateV2(panelType=" + this.LL + ", softKeyboardStatus=" + this.LLILLJJLI + ", keyboardHeight=" + this.LLILLL + ", inputAreaHeight=" + this.LLILZ + ", replyCommentState=" + this.LLILZIL + ", showRepostLine=" + this.LLILZLL + ", isTextByCopyPaste=" + this.LLIZ + ", showReplyWithVideo=" + this.LLIZLLLIL + ", isInputtingContent=" + this.LLJ + ", commentInputContent=" + this.LLJI + ", updateGiftPanelCoin=" + this.LLJIJIL + ", enableMentionState=" + this.LLJILJIL + ", tryMention=" + this.LLJILJILJ + ", showHorizontalEmojiPanel=" + this.LLJILLL + ", showReplyInfoAboveInput=" + this.LLJJ + ", updateExposeEmoji=" + this.LLJJI + ", showInputMode=" + this.LLJJIII + ", commentInputViewStatus=" + this.LLJJIJI + ", updateHint=" + this.LLJJIJIIJIL + ", hasPhoto=" + this.LLJJIJIL + ", reachMentionLimit=" + this.LLJJJ + ", pendingAutoPop=" + this.LLJJJIL + ", photoPageStatus=" + this.LLJJJJ + ", showCommentPostLine=" + this.LLJJJJJIL + ", enableCommentPost=" + this.LLJJJJLIIL + ", hasSelectGift=" + this.LLJJL + ", showLinkTab=" + this.LLJJLIIIJLLLLLLLZ + ", addAsPost=" + this.LLJL + ", avatarAreaState=" + this.LLJLIL + ", iconGroupStatus=" + this.LLJLILLLLZIIL + ", enterFullScreenInputBox=" + this.LLJLL + ", textLengthChange=" + this.LLJLLIL + ')';
    }

    public /* synthetic */ C1346950l9h(int i) {
        this(C1347120l9y.LIZ, false, 0, 0, null, false, false, false, false, new C291001Au(new CommentInputContent("", null, null, null, null)), null, null, null, null, false, null, false, EnumC1341660l1A.AVAILABLE, null, false, false, false, null, false, true, false, false, false, null, null, false, null);
    }

    public static C1346950l9h LIZ(C1346950l9h c1346950l9h, AbstractC1347290lAF abstractC1347290lAF, boolean z, int i, int i2, C1346480l8w c1346480l8w, boolean z2, boolean z3, boolean z4, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C1346560l94 c1346560l94, boolean z5, C291001Au c291001Au5, EnumC1341660l1A enumC1341660l1A, C291001Au c291001Au6, boolean z6, boolean z7, C291001Au c291001Au7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, C1346880l9a c1346880l9a, C291001Au c291001Au8, boolean z13, C291001Au c291001Au9, int i3) {
        boolean z14;
        boolean z15;
        boolean z16;
        C291001Au c291001Au10 = c291001Au9;
        C291001Au c291001Au11 = c291001Au8;
        C1346880l9a c1346880l9a2 = c1346880l9a;
        boolean z17 = z11;
        C1346560l94 c1346560l942 = c1346560l94;
        boolean z18 = z10;
        C291001Au c291001Au12 = c291001Au;
        C291001Au c291001Au13 = c291001Au7;
        boolean z19 = z6;
        EnumC1341660l1A enumC1341660l1A2 = enumC1341660l1A;
        boolean z20 = z5;
        boolean z21 = z9;
        C291001Au c291001Au14 = c291001Au4;
        C291001Au c291001Au15 = c291001Au2;
        boolean z22 = z7;
        boolean z23 = z4;
        boolean z24 = z3;
        boolean z25 = z2;
        C291001Au c291001Au16 = c291001Au6;
        boolean z26 = z13;
        C1346480l8w c1346480l8w2 = c1346480l8w;
        boolean z27 = z8;
        int i4 = i2;
        int i5 = i;
        boolean z28 = z;
        C291001Au c291001Au17 = c291001Au3;
        C291001Au c291001Au18 = c291001Au5;
        boolean z29 = z12;
        AbstractC1347290lAF abstractC1347290lAF2 = abstractC1347290lAF;
        if ((i3 & 1) != 0) {
            abstractC1347290lAF2 = c1346950l9h.LL;
        }
        if ((i3 & 2) != 0) {
            z28 = c1346950l9h.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i5 = c1346950l9h.LLILLL;
        }
        if ((i3 & 8) != 0) {
            i4 = c1346950l9h.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c1346480l8w2 = c1346950l9h.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            z25 = c1346950l9h.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            z24 = c1346950l9h.LLIZ;
        }
        if ((i3 & 128) != 0) {
            z14 = c1346950l9h.LLIZLLLIL;
        } else {
            z14 = false;
        }
        if ((i3 & 256) != 0) {
            z23 = c1346950l9h.LLJ;
        }
        if ((i3 & 512) != 0) {
            c291001Au12 = c1346950l9h.LLJI;
        }
        if ((i3 & 1024) != 0) {
            c291001Au15 = c1346950l9h.LLJIJIL;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au17 = c1346950l9h.LLJILJIL;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au14 = c1346950l9h.LLJILJILJ;
        }
        if ((i3 & 8192) != 0) {
            c1346560l942 = c1346950l9h.LLJILLL;
        }
        if ((i3 & 16384) != 0) {
            z20 = c1346950l9h.LLJJ;
        }
        if ((32768 & i3) != 0) {
            c291001Au18 = c1346950l9h.LLJJI;
        }
        if ((65536 & i3) != 0) {
            z15 = c1346950l9h.LLJJIII;
        } else {
            z15 = false;
        }
        if ((131072 & i3) != 0) {
            enumC1341660l1A2 = c1346950l9h.LLJJIJI;
        }
        if ((262144 & i3) != 0) {
            c291001Au16 = c1346950l9h.LLJJIJIIJIL;
        }
        if ((524288 & i3) != 0) {
            z16 = c1346950l9h.LLJJIJIL;
        } else {
            z16 = false;
        }
        if ((1048576 & i3) != 0) {
            z19 = c1346950l9h.LLJJJ;
        }
        if ((2097152 & i3) != 0) {
            z22 = c1346950l9h.LLJJJIL;
        }
        if ((4194304 & i3) != 0) {
            c291001Au13 = c1346950l9h.LLJJJJ;
        }
        if ((8388608 & i3) != 0) {
            z27 = c1346950l9h.LLJJJJJIL;
        }
        if ((16777216 & i3) != 0) {
            z21 = c1346950l9h.LLJJJJLIIL;
        }
        if ((33554432 & i3) != 0) {
            z18 = c1346950l9h.LLJJL;
        }
        if ((67108864 & i3) != 0) {
            z17 = c1346950l9h.LLJJLIIIJLLLLLLLZ;
        }
        if ((134217728 & i3) != 0) {
            z29 = c1346950l9h.LLJL;
        }
        if ((268435456 & i3) != 0) {
            c1346880l9a2 = c1346950l9h.LLJLIL;
        }
        if ((536870912 & i3) != 0) {
            c291001Au11 = c1346950l9h.LLJLILLLLZIIL;
        }
        if ((1073741824 & i3) != 0) {
            z26 = c1346950l9h.LLJLL;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            c291001Au10 = c1346950l9h.LLJLLIL;
        }
        c1346950l9h.getClass();
        C291001Au c291001Au19 = c291001Au13;
        boolean z30 = z27;
        boolean z31 = z21;
        boolean z32 = z18;
        boolean z33 = z17;
        boolean z34 = z29;
        C1346880l9a c1346880l9a3 = c1346880l9a2;
        C291001Au c291001Au20 = c291001Au11;
        boolean z35 = z26;
        C291001Au c291001Au21 = c291001Au10;
        return new C1346950l9h(abstractC1347290lAF2, z28, i5, i4, c1346480l8w2, z25, z24, z14, z23, c291001Au12, c291001Au15, c291001Au17, c291001Au14, c1346560l942, z20, c291001Au18, z15, enumC1341660l1A2, c291001Au16, z16, z19, z22, c291001Au19, z30, z31, z32, z33, z34, c1346880l9a3, c291001Au20, z35, c291001Au21);
    }

    public C1346950l9h(AbstractC1347290lAF abstractC1347290lAF, boolean z, int i, int i2, C1346480l8w c1346480l8w, boolean z2, boolean z3, boolean z4, boolean z5, C291001Au<CommentInputContent> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Pair<Boolean, Boolean>> c291001Au4, C1346560l94 c1346560l94, boolean z6, C291001Au<Boolean> c291001Au5, boolean z7, EnumC1341660l1A enumC1341660l1A, C291001Au<Boolean> c291001Au6, boolean z8, boolean z9, boolean z10, C291001Au<Integer> c291001Au7, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C1346880l9a c1346880l9a, C291001Au<Boolean> c291001Au8, boolean z16, C291001Au<Pair<String, Integer>> c291001Au9) {
        this.LL = abstractC1347290lAF;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c1346480l8w;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
        this.LLJI = c291001Au;
        this.LLJIJIL = c291001Au2;
        this.LLJILJIL = c291001Au3;
        this.LLJILJILJ = c291001Au4;
        this.LLJILLL = c1346560l94;
        this.LLJJ = z6;
        this.LLJJI = c291001Au5;
        this.LLJJIII = z7;
        this.LLJJIJI = enumC1341660l1A;
        this.LLJJIJIIJIL = c291001Au6;
        this.LLJJIJIL = z8;
        this.LLJJJ = z9;
        this.LLJJJIL = z10;
        this.LLJJJJ = c291001Au7;
        this.LLJJJJJIL = z11;
        this.LLJJJJLIIL = z12;
        this.LLJJL = z13;
        this.LLJJLIIIJLLLLLLLZ = z14;
        this.LLJL = z15;
        this.LLJLIL = c1346880l9a;
        this.LLJLILLLLZIIL = c291001Au8;
        this.LLJLL = z16;
        this.LLJLLIL = c291001Au9;
    }
}
