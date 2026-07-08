package X;

import android.graphics.Bitmap;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595530rcd implements InterfaceC0148002o {
    public final C1595730rcx LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final Bitmap LLIZLLLIL;
    public final C1595550rcf LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final C291001Au<C1595780rd2> LLJILJIL;

    public C1595530rcd() {
        this(null, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595530rcd)) {
            return false;
        }
        C1595530rcd c1595530rcd = (C1595530rcd) obj;
        return Intrinsics.LJFF(this.LL, c1595530rcd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1595530rcd.LLILLJJLI) && this.LLILLL == c1595530rcd.LLILLL && this.LLILZ == c1595530rcd.LLILZ && this.LLILZIL == c1595530rcd.LLILZIL && this.LLILZLL == c1595530rcd.LLILZLL && this.LLIZ == c1595530rcd.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1595530rcd.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1595530rcd.LLJ) && this.LLJI == c1595530rcd.LLJI && this.LLJIJIL == c1595530rcd.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1595530rcd.LLJILJIL);
    }

    public final int hashCode() {
        C1595730rcx c1595730rcx = this.LL;
        int iHashCode = (((((((((((((c1595730rcx == null ? 0 : c1595730rcx.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31;
        Bitmap bitmap = this.LLIZLLLIL;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        C1595550rcf c1595550rcf = this.LLJ;
        int iHashCode3 = (((((iHashCode2 + (c1595550rcf == null ? 0 : c1595550rcf.hashCode())) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31;
        C291001Au<C1595780rd2> c291001Au = this.LLJILJIL;
        return iHashCode3 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        return "StoryToolBarIconState(iconDisplayState=" + this.LL + ", curFeed=" + this.LLILLJJLI + ", isForUSkylightShow=" + this.LLILLL + ", isFollowSkylightShow=" + this.LLILZ + ", isFriendSkylightShow=" + this.LLILZIL + ", cameraIconVisibility=" + this.LLILZLL + ", avatarIconVisibility=" + this.LLIZ + ", avatarIconBitmap=" + this.LLIZLLLIL + ", displayDataBean=" + this.LLJ + ", avatarIconAnimationState=" + this.LLJI + ", avatarFrameStartMargin=" + this.LLJIJIL + ", logShowEvent=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1595530rcd(String str, int i) {
        int i2;
        String str2 = (i & 2) != 0 ? "For You" : str;
        if ((i & 64) != 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this(null, str2, false, false, false, 0, i2, null, null, 0, 0, null);
    }

    public C1595530rcd(C1595730rcx c1595730rcx, String str, boolean z, boolean z2, boolean z3, int i, int i2, Bitmap bitmap, C1595550rcf c1595550rcf, int i3, int i4, C291001Au<C1595780rd2> c291001Au) {
        this.LL = c1595730rcx;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = bitmap;
        this.LLJ = c1595550rcf;
        this.LLJI = i3;
        this.LLJIJIL = i4;
        this.LLJILJIL = c291001Au;
    }

    public static C1595530rcd LIZ(C1595530rcd c1595530rcd, C1595730rcx c1595730rcx, String str, boolean z, boolean z2, boolean z3, int i, int i2, Bitmap bitmap, C1595550rcf c1595550rcf, int i3, C291001Au c291001Au, int i4) {
        int i5;
        C291001Au c291001Au2 = c291001Au;
        int i6 = i3;
        C1595550rcf c1595550rcf2 = c1595550rcf;
        Bitmap bitmap2 = bitmap;
        int i7 = i2;
        int i8 = i;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        String str2 = str;
        C1595730rcx c1595730rcx2 = c1595730rcx;
        if ((i4 & 1) != 0) {
            c1595730rcx2 = c1595530rcd.LL;
        }
        if ((i4 & 2) != 0) {
            str2 = c1595530rcd.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            z6 = c1595530rcd.LLILLL;
        }
        if ((i4 & 8) != 0) {
            z5 = c1595530rcd.LLILZ;
        }
        if ((i4 & 16) != 0) {
            z4 = c1595530rcd.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            i8 = c1595530rcd.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            i7 = c1595530rcd.LLIZ;
        }
        if ((i4 & 128) != 0) {
            bitmap2 = c1595530rcd.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            c1595550rcf2 = c1595530rcd.LLJ;
        }
        if ((i4 & 512) != 0) {
            i6 = c1595530rcd.LLJI;
        }
        if ((i4 & 1024) != 0) {
            i5 = c1595530rcd.LLJIJIL;
        } else {
            i5 = 0;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au2 = c1595530rcd.LLJILJIL;
        }
        c1595530rcd.getClass();
        return new C1595530rcd(c1595730rcx2, str2, z6, z5, z4, i8, i7, bitmap2, c1595550rcf2, i6, i5, c291001Au2);
    }
}
