package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340410kz9 {
    public final String LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C1340040kyY LJ;
    public final boolean LJFF;
    public boolean LJI;
    public final boolean LJII;
    public final CommentGiftStruct LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public long LJIIJJI;
    public final UrlModel LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final float LJIILL;
    public final String LJIILLIIL;
    public final boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public final Integer LJIJJLI;
    public final C0HD9 LJIL;
    public boolean LJJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1340410kz9() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, objArr3, objArr4, 0 == true ? 1 : 0, 0.0f, objArr5, 0 == true ? 1 : 0, objArr6, 0 == true ? 1 : 0, 16777215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340410kz9)) {
            return false;
        }
        C1340410kz9 c1340410kz9 = (C1340410kz9) obj;
        return Intrinsics.LJFF(this.LIZ, c1340410kz9.LIZ) && this.LIZIZ == c1340410kz9.LIZIZ && this.LIZJ == c1340410kz9.LIZJ && this.LIZLLL == c1340410kz9.LIZLLL && Intrinsics.LJFF(this.LJ, c1340410kz9.LJ) && this.LJFF == c1340410kz9.LJFF && this.LJI == c1340410kz9.LJI && this.LJII == c1340410kz9.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1340410kz9.LJIIIIZZ) && this.LJIIIZ == c1340410kz9.LJIIIZ && this.LJIIJ == c1340410kz9.LJIIJ && this.LJIIJJI == c1340410kz9.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1340410kz9.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1340410kz9.LJIILIIL) && this.LJIILJJIL == c1340410kz9.LJIILJJIL && Float.compare(this.LJIILL, c1340410kz9.LJIILL) == 0 && Intrinsics.LJFF(this.LJIILLIIL, c1340410kz9.LJIILLIIL) && this.LJIIZILJ == c1340410kz9.LJIIZILJ && this.LJIJ == c1340410kz9.LJIJ && this.LJIJI == c1340410kz9.LJIJI && this.LJIJJ == c1340410kz9.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c1340410kz9.LJIJJLI) && Intrinsics.LJFF(this.LJIL, c1340410kz9.LJIL) && this.LJJ == c1340410kz9.LJJ;
    }

    public final String toString() {
        return "CommentUIState(content=" + this.LIZ + ", diggStatus=" + this.LIZIZ + ", buryStatus=" + this.LIZJ + ", authorDigg=" + this.LIZLLL + ", postStatus=" + this.LJ + ", withCommentSurprise=" + this.LJFF + ", needHint=" + this.LJI + ", pin=" + this.LJII + ", gift=" + this.LJIIIIZZ + ", hasPhoto=" + this.LJIIIZ + ", hasSticker=" + this.LJIIJ + ", imageUploadProgress=" + this.LJIIJJI + ", userAvatar=" + this.LJIIL + ", userNickName=" + this.LJIILIIL + ", addAsPostStatus=" + this.LJIILJJIL + ", addAsPostProgress=" + this.LJIILL + ", badgeUrl=" + this.LJIILLIIL + ", needRefreshSpan=" + this.LJIIZILJ + ", needShowFirstCommentTagAnimation=" + this.LJIJ + ", uiFoldStatus=" + this.LJIJI + ", showReplyConnectLine=" + this.LJIJJ + ", asrStatus=" + this.LJIJJLI + ", repostStatus=" + this.LJIL + ", audioTextIsTranslated=" + this.LJJ + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        CommentGiftStruct commentGiftStruct = this.LJIIIIZZ;
        int iHashCode2 = (((((((iHashCode + (commentGiftStruct == null ? 0 : commentGiftStruct.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31;
        UrlModel urlModel = this.LJIIL;
        int iHashCode3 = (((((((iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL) * 31) + Float.floatToIntBits(this.LJIILL)) * 31;
        String str = this.LJIILLIIL;
        int iHashCode4 = (((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31;
        Integer num = this.LJIJJLI;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C0HD9 c0hd9 = this.LJIL;
        return ((iHashCode5 + (c0hd9 != null ? c0hd9.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJJ);
    }

    public static C1340410kz9 LIZ(C1340410kz9 c1340410kz9, boolean z, boolean z2, int i, float f, String str, boolean z3, boolean z4, boolean z5, Integer num, C0HD9 c0hd9, int i2) {
        String str2;
        boolean z6;
        boolean z7;
        C1340040kyY c1340040kyY;
        boolean z8;
        boolean z9;
        CommentGiftStruct commentGiftStruct;
        boolean z10;
        boolean z11;
        long j;
        UrlModel urlModel;
        String str3;
        boolean z12;
        boolean z13;
        Integer num2 = num;
        boolean z14 = z5;
        boolean z15 = z4;
        boolean z16 = z;
        boolean z17 = z3;
        boolean z18 = z2;
        String str4 = str;
        float f2 = f;
        int i3 = i;
        C0HD9 c0hd92 = c0hd9;
        if ((i2 & 1) != 0) {
            str2 = c1340410kz9.LIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            z6 = c1340410kz9.LIZIZ;
        } else {
            z6 = false;
        }
        if ((i2 & 4) != 0) {
            z7 = c1340410kz9.LIZJ;
        } else {
            z7 = false;
        }
        if ((i2 & 8) != 0) {
            z16 = c1340410kz9.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c1340040kyY = c1340410kz9.LJ;
        } else {
            c1340040kyY = null;
        }
        if ((i2 & 32) != 0) {
            z8 = c1340410kz9.LJFF;
        } else {
            z8 = false;
        }
        if ((i2 & 64) != 0) {
            z18 = c1340410kz9.LJI;
        }
        if ((i2 & 128) != 0) {
            z9 = c1340410kz9.LJII;
        } else {
            z9 = false;
        }
        if ((i2 & 256) != 0) {
            commentGiftStruct = c1340410kz9.LJIIIIZZ;
        } else {
            commentGiftStruct = null;
        }
        if ((i2 & 512) != 0) {
            z10 = c1340410kz9.LJIIIZ;
        } else {
            z10 = false;
        }
        if ((i2 & 1024) != 0) {
            z11 = c1340410kz9.LJIIJ;
        } else {
            z11 = false;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j = c1340410kz9.LJIIJJI;
        } else {
            j = 0;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            urlModel = c1340410kz9.LJIIL;
        } else {
            urlModel = null;
        }
        if ((i2 & 8192) != 0) {
            str3 = c1340410kz9.LJIILIIL;
        } else {
            str3 = null;
        }
        if ((i2 & 16384) != 0) {
            i3 = c1340410kz9.LJIILJJIL;
        }
        if ((32768 & i2) != 0) {
            f2 = c1340410kz9.LJIILL;
        }
        if ((65536 & i2) != 0) {
            str4 = c1340410kz9.LJIILLIIL;
        }
        if ((131072 & i2) != 0) {
            z17 = c1340410kz9.LJIIZILJ;
        }
        if ((262144 & i2) != 0) {
            z15 = c1340410kz9.LJIJ;
        }
        if ((524288 & i2) != 0) {
            z12 = c1340410kz9.LJIJI;
        } else {
            z12 = false;
        }
        if ((1048576 & i2) != 0) {
            z14 = c1340410kz9.LJIJJ;
        }
        if ((2097152 & i2) != 0) {
            num2 = c1340410kz9.LJIJJLI;
        }
        if ((4194304 & i2) != 0) {
            c0hd92 = c1340410kz9.LJIL;
        }
        if ((i2 & 8388608) != 0) {
            z13 = c1340410kz9.LJJ;
        } else {
            z13 = false;
        }
        c1340410kz9.getClass();
        return new C1340410kz9(str2, z6, z7, z16, c1340040kyY, z8, z18, z9, commentGiftStruct, z10, z11, j, urlModel, str3, i3, f2, str4, z17, z15, z12, z14, num2, c0hd92, z13);
    }

    public /* synthetic */ C1340410kz9(String str, boolean z, boolean z2, boolean z3, C1340040kyY c1340040kyY, boolean z4, boolean z5, boolean z6, CommentGiftStruct commentGiftStruct, boolean z7, boolean z8, long j, UrlModel urlModel, String str2, int i, float f, String str3, boolean z9, Integer num, boolean z10, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? new C1340040kyY(2) : c1340040kyY, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? false : z5, (i2 & 128) != 0 ? false : z6, (i2 & 256) != 0 ? null : commentGiftStruct, (i2 & 512) != 0 ? false : z7, (i2 & 1024) != 0 ? false : z8, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : urlModel, (i2 & 8192) == 0 ? str2 : "", (i2 & 16384) != 0 ? -1 : i, (32768 & i2) != 0 ? 0.0f : f, (65536 & i2) != 0 ? null : str3, false, (262144 & i2) != 0 ? false : z9, false, false, (2097152 & i2) == 0 ? num : null, null, (i2 & 8388608) != 0 ? false : z10);
    }

    public C1340410kz9(String str, boolean z, boolean z2, boolean z3, C1340040kyY c1340040kyY, boolean z4, boolean z5, boolean z6, CommentGiftStruct commentGiftStruct, boolean z7, boolean z8, long j, UrlModel urlModel, String str2, int i, float f, String str3, boolean z9, boolean z10, boolean z11, boolean z12, Integer num, C0HD9 c0hd9, boolean z13) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = c1340040kyY;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = commentGiftStruct;
        this.LJIIIZ = z7;
        this.LJIIJ = z8;
        this.LJIIJJI = j;
        this.LJIIL = urlModel;
        this.LJIILIIL = str2;
        this.LJIILJJIL = i;
        this.LJIILL = f;
        this.LJIILLIIL = str3;
        this.LJIIZILJ = z9;
        this.LJIJ = z10;
        this.LJIJI = z11;
        this.LJIJJ = z12;
        this.LJIJJLI = num;
        this.LJIL = c0hd9;
        this.LJJ = z13;
    }
}
