package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ltq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557560Ltq {
    public final C551290Ljj LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final C551430Ljx LJ;
    public final List<InputBlock> LJFF;
    public final List<MentionDataItem> LJI;
    public final C555200Lq2 LJII;
    public final List<MentionDataItem> LJIIIIZZ;
    public final List<C557390LtZ> LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final String LJIIL;
    public final long LJIILIIL;
    public final String LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final String LJIIZILJ;
    public final List<String> LJIJ;
    public final boolean LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final boolean LJIL;

    public C557560Ltq() {
        this(0, 0, false, null, null, false, null, null, 8388607);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C557560Ltq)) {
            return false;
        }
        C557560Ltq c557560Ltq = (C557560Ltq) obj;
        return Intrinsics.LJFF(this.LIZ, c557560Ltq.LIZ) && this.LIZIZ == c557560Ltq.LIZIZ && this.LIZJ == c557560Ltq.LIZJ && this.LIZLLL == c557560Ltq.LIZLLL && Intrinsics.LJFF(this.LJ, c557560Ltq.LJ) && Intrinsics.LJFF(this.LJFF, c557560Ltq.LJFF) && Intrinsics.LJFF(this.LJI, c557560Ltq.LJI) && Intrinsics.LJFF(this.LJII, c557560Ltq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c557560Ltq.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c557560Ltq.LJIIIZ) && this.LJIIJ == c557560Ltq.LJIIJ && this.LJIIJJI == c557560Ltq.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c557560Ltq.LJIIL) && this.LJIILIIL == c557560Ltq.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c557560Ltq.LJIILJJIL) && this.LJIILL == c557560Ltq.LJIILL && this.LJIILLIIL == c557560Ltq.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c557560Ltq.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c557560Ltq.LJIJ) && this.LJIJI == c557560Ltq.LJIJI && Intrinsics.LJFF(this.LJIJJ, c557560Ltq.LJIJJ) && Intrinsics.LJFF(this.LJIJJLI, c557560Ltq.LJIJJLI) && this.LJIL == c557560Ltq.LJIL;
    }

    public final int hashCode() {
        C551290Ljj c551290Ljj = this.LIZ;
        int iHashCode = (((((((c551290Ljj == null ? 0 : c551290Ljj.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C551430Ljx c551430Ljx = this.LJ;
        int iHashCode2 = (((((iHashCode + (c551430Ljx == null ? 0 : c551430Ljx.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        C555200Lq2 c555200Lq2 = this.LJII;
        int iHashCode3 = (iHashCode2 + (c555200Lq2 == null ? 0 : c555200Lq2.hashCode())) * 31;
        List<MentionDataItem> list = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<C557390LtZ> list2 = this.LJIIIZ;
        int iHashCode5 = (((((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31;
        String str = this.LJIIL;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31;
        String str2 = this.LJIILJJIL;
        int iHashCode7 = (((((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LJIILL)) * 31) + C786410Ut5.Y2(this.LJIILLIIL)) * 31;
        String str3 = this.LJIIZILJ;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list3 = this.LJIJ;
        int iHashCode9 = (((iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31;
        String str4 = this.LJIJJ;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIJJLI;
        return ((iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIL);
    }

    public final String toString() {
        return "InputBoxStates(mentionEvent=" + this.LIZ + ", inputMentionLimit=" + this.LIZIZ + ", maxInputCharCount=" + this.LIZJ + ", autoShowSoftInput=" + this.LIZLLL + ", clickAtEvent=" + this.LJ + ", restoreBlockData=" + this.LJFF + ", followPathExistingMention=" + this.LJI + ", changeUser=" + this.LJII + ", updateUserMentionSpan=" + this.LJIIIIZZ + ", insertImageDataList=" + this.LJIIIZ + ", insertImageDataListEventId=" + this.LJIIJ + ", prepareNextImageInsertAtEndEventId=" + this.LJIIJJI + ", insertPlainText=" + this.LJIIL + ", insertPlainTextEventId=" + this.LJIILIIL + ", appendPlainTextAtEnd=" + this.LJIILJJIL + ", appendPlainTextAtEndEventId=" + this.LJIILL + ", focusInputAtEndEventId=" + this.LJIILLIIL + ", mentionLimitReachedToast=" + this.LJIIZILJ + ", inputBoxHintTexts=" + this.LJIJ + ", enableDynamicHeight=" + this.LJIJI + ", inputCharReachLimitText=" + this.LJIJJ + ", followHint=" + this.LJIJJLI + ", voiceUnderstandingLoading=" + this.LJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C557560Ltq(int i, int i2, boolean z, String str, List list, boolean z2, String str2, String str3, int i3) {
        C13BV c13bv;
        C13BV c13bv2;
        String str4 = str2;
        boolean z3 = z2;
        String str5 = str3;
        List list2 = list;
        String str6 = str;
        boolean z4 = z;
        int i4 = i2;
        int i5 = (i3 & 2) != 0 ? 2 : i;
        i4 = (i3 & 4) != 0 ? 500 : i4;
        z4 = (i3 & 8) != 0 ? true : z4;
        if ((i3 & 32) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i3 & 64) != 0) {
            c13bv2 = C13BV.INSTANCE;
        } else {
            c13bv2 = null;
        }
        this(null, i5, i4, z4, null, c13bv, c13bv2, null, null, null, 0L, 0L, null, 0L, null, 0L, 0L, (i3 & 131072) != 0 ? null : str6, (i3 & 262144) != 0 ? null : list2, (i3 & 524288) != 0 ? false : z3, (i3 & 1048576) != 0 ? null : str4, (i3 & 2097152) != 0 ? null : str5, false);
    }

    public static C557560Ltq LIZ(C557560Ltq c557560Ltq, C551290Ljj c551290Ljj, C551430Ljx c551430Ljx, List list, List list2, C555200Lq2 c555200Lq2, List list3, List list4, long j, long j2, String str, long j3, String str2, long j4, long j5, boolean z, int i) {
        int i2;
        int i3;
        boolean z2;
        String str3;
        List<String> list5;
        boolean z3;
        String str4;
        long j6 = j4;
        long j7 = j3;
        String str5 = str;
        List list6 = list4;
        String str6 = str2;
        List list7 = list3;
        C555200Lq2 c555200Lq22 = c555200Lq2;
        long j8 = j;
        List list8 = list2;
        long j9 = j5;
        long j10 = j2;
        C551430Ljx c551430Ljx2 = c551430Ljx;
        boolean z4 = z;
        List list9 = list;
        C551290Ljj c551290Ljj2 = c551290Ljj;
        if ((i & 1) != 0) {
            c551290Ljj2 = c557560Ltq.LIZ;
        }
        if ((i & 2) != 0) {
            i2 = c557560Ltq.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = c557560Ltq.LIZJ;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            z2 = c557560Ltq.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            c551430Ljx2 = c557560Ltq.LJ;
        }
        if ((i & 32) != 0) {
            list9 = c557560Ltq.LJFF;
        }
        if ((i & 64) != 0) {
            list8 = c557560Ltq.LJI;
        }
        if ((i & 128) != 0) {
            c555200Lq22 = c557560Ltq.LJII;
        }
        if ((i & 256) != 0) {
            list7 = c557560Ltq.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            list6 = c557560Ltq.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            j8 = c557560Ltq.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j10 = c557560Ltq.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = c557560Ltq.LJIIL;
        }
        if ((i & 8192) != 0) {
            j7 = c557560Ltq.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            str6 = c557560Ltq.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            j6 = c557560Ltq.LJIILL;
        }
        if ((65536 & i) != 0) {
            j9 = c557560Ltq.LJIILLIIL;
        }
        String str7 = null;
        if ((131072 & i) != 0) {
            str3 = c557560Ltq.LJIIZILJ;
        } else {
            str3 = null;
        }
        if ((262144 & i) != 0) {
            list5 = c557560Ltq.LJIJ;
        } else {
            list5 = null;
        }
        if ((524288 & i) != 0) {
            z3 = c557560Ltq.LJIJI;
        } else {
            z3 = false;
        }
        if ((1048576 & i) != 0) {
            str4 = c557560Ltq.LJIJJ;
        } else {
            str4 = null;
        }
        if ((2097152 & i) != 0) {
            str7 = c557560Ltq.LJIJJLI;
        }
        if ((i & 4194304) != 0) {
            z4 = c557560Ltq.LJIL;
        }
        c557560Ltq.getClass();
        return new C557560Ltq(c551290Ljj2, i2, i3, z2, c551430Ljx2, list9, list8, c555200Lq22, list7, list6, j8, j10, str5, j7, str6, j6, j9, str3, list5, z3, str4, str7, z4);
    }

    public C557560Ltq(C551290Ljj c551290Ljj, int i, int i2, boolean z, C551430Ljx c551430Ljx, List<InputBlock> list, List<MentionDataItem> list2, C555200Lq2 c555200Lq2, List<MentionDataItem> list3, List<C557390LtZ> list4, long j, long j2, String str, long j3, String str2, long j4, long j5, String str3, List<String> list5, boolean z2, String str4, String str5, boolean z3) {
        this.LIZ = c551290Ljj;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = c551430Ljx;
        this.LJFF = list;
        this.LJI = list2;
        this.LJII = c555200Lq2;
        this.LJIIIIZZ = list3;
        this.LJIIIZ = list4;
        this.LJIIJ = j;
        this.LJIIJJI = j2;
        this.LJIIL = str;
        this.LJIILIIL = j3;
        this.LJIILJJIL = str2;
        this.LJIILL = j4;
        this.LJIILLIIL = j5;
        this.LJIIZILJ = str3;
        this.LJIJ = list5;
        this.LJIJI = z2;
        this.LJIJJ = str4;
        this.LJIJJLI = str5;
        this.LJIL = z3;
    }
}
