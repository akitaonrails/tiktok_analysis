package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661190Pwb implements InterfaceC0148002o {
    public final Comment LL;
    public final C661300Pwm LLILLJJLI;
    public final int LLILLL;
    public final Aweme LLILZ;
    public final C661320Pwo LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final long LLJ;
    public final InterfaceC660500PvU LLJI;
    public final InterfaceC660490PvT LLJIJIL;

    public C661190Pwb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C661190Pwb)) {
            return false;
        }
        C661190Pwb c661190Pwb = (C661190Pwb) obj;
        return Intrinsics.LJFF(this.LL, c661190Pwb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c661190Pwb.LLILLJJLI) && this.LLILLL == c661190Pwb.LLILLL && Intrinsics.LJFF(this.LLILZ, c661190Pwb.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c661190Pwb.LLILZIL) && this.LLILZLL == c661190Pwb.LLILZLL && this.LLIZ == c661190Pwb.LLIZ && this.LLIZLLLIL == c661190Pwb.LLIZLLLIL && this.LLJ == c661190Pwb.LLJ && Intrinsics.LJFF(this.LLJI, c661190Pwb.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c661190Pwb.LLJIJIL);
    }

    public final int hashCode() {
        Comment comment = this.LL;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        C661300Pwm c661300Pwm = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (c661300Pwm == null ? 0 : c661300Pwm.hashCode())) * 31) + this.LLILLL) * 31;
        Aweme aweme = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C661320Pwo c661320Pwo = this.LLILZIL;
        return ((((((((((((iHashCode3 + (c661320Pwo != null ? c661320Pwo.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31) + C786410Ut5.Y2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode();
    }

    public final String toString() {
        return "SearchPhotoCommentState(comment=" + this.LL + ", commentState=" + this.LLILLJJLI + ", uiStyle=" + this.LLILLL + ", curAweme=" + this.LLILZ + ", curAwemeState=" + this.LLILZIL + ", commentShowTime=" + this.LLILZLL + ", isShowAssem=" + this.LLIZ + ", playStatus=" + this.LLIZLLLIL + ", closeCommentStartTime=" + this.LLJ + ", curVideoAnchor=" + this.LLJI + ", curPhotoAnchor=" + this.LLJIJIL + ')';
    }

    public /* synthetic */ C661190Pwb(int i) {
        this(null, null, 0, null, null, 0L, false, 1, 0L, C660610Pvf.LIZ, C659270PtV.LIZ);
    }

    public C661190Pwb(Comment comment, C661300Pwm c661300Pwm, int i, Aweme aweme, C661320Pwo c661320Pwo, long j, boolean z, int i2, long j2, InterfaceC660500PvU interfaceC660500PvU, InterfaceC660490PvT interfaceC660490PvT) {
        this.LL = comment;
        this.LLILLJJLI = c661300Pwm;
        this.LLILLL = i;
        this.LLILZ = aweme;
        this.LLILZIL = c661320Pwo;
        this.LLILZLL = j;
        this.LLIZ = z;
        this.LLIZLLLIL = i2;
        this.LLJ = j2;
        this.LLJI = interfaceC660500PvU;
        this.LLJIJIL = interfaceC660490PvT;
    }

    public static C661190Pwb LIZ(C661190Pwb c661190Pwb, Comment comment, C661300Pwm c661300Pwm, int i, Aweme aweme, C661320Pwo c661320Pwo, long j, boolean z, int i2, long j2, InterfaceC660500PvU interfaceC660500PvU, InterfaceC660490PvT interfaceC660490PvT, int i3) {
        long j3 = j2;
        int i4 = i2;
        boolean z2 = z;
        long j4 = j;
        C661320Pwo c661320Pwo2 = c661320Pwo;
        Aweme aweme2 = aweme;
        int i5 = i;
        InterfaceC660490PvT interfaceC660490PvT2 = interfaceC660490PvT;
        C661300Pwm c661300Pwm2 = c661300Pwm;
        InterfaceC660500PvU interfaceC660500PvU2 = interfaceC660500PvU;
        Comment comment2 = comment;
        if ((i3 & 1) != 0) {
            comment2 = c661190Pwb.LL;
        }
        if ((i3 & 2) != 0) {
            c661300Pwm2 = c661190Pwb.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i5 = c661190Pwb.LLILLL;
        }
        if ((i3 & 8) != 0) {
            aweme2 = c661190Pwb.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c661320Pwo2 = c661190Pwb.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            j4 = c661190Pwb.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            z2 = c661190Pwb.LLIZ;
        }
        if ((i3 & 128) != 0) {
            i4 = c661190Pwb.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            j3 = c661190Pwb.LLJ;
        }
        if ((i3 & 512) != 0) {
            interfaceC660500PvU2 = c661190Pwb.LLJI;
        }
        if ((i3 & 1024) != 0) {
            interfaceC660490PvT2 = c661190Pwb.LLJIJIL;
        }
        c661190Pwb.getClass();
        return new C661190Pwb(comment2, c661300Pwm2, i5, aweme2, c661320Pwo2, j4, z2, i4, j3, interfaceC660500PvU2, interfaceC660490PvT2);
    }
}
