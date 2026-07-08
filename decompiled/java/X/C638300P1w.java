package X;

import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638300P1w implements InterfaceC0148002o {
    public final Music LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;

    public C638300P1w() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C638300P1w)) {
            return false;
        }
        C638300P1w c638300P1w = (C638300P1w) obj;
        return Intrinsics.LJFF(this.LL, c638300P1w.LL) && this.LLILLJJLI == c638300P1w.LLILLJJLI && this.LLILLL == c638300P1w.LLILLL && this.LLILZ == c638300P1w.LLILZ && this.LLILZIL == c638300P1w.LLILZIL && this.LLILZLL == c638300P1w.LLILZLL && this.LLIZ == c638300P1w.LLIZ;
    }

    public final int hashCode() {
        Music music = this.LL;
        return ((((((((((((music == null ? 0 : music.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMusicCoverState(music=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAd=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isScheduleVideo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", startMusicAnimation=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", startNotesAnimation=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", pauseNotesAnimation=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", stopNotesAnimation=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C638300P1w(int i) {
        this(null, false, false, false, false, false, false);
    }

    public C638300P1w(Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.LL = music;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
        this.LLIZ = z6;
    }

    public static C638300P1w LIZ(C638300P1w c638300P1w, Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6;
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z2;
        boolean z11 = z;
        Music music2 = music;
        if ((i & 1) != 0) {
            music2 = c638300P1w.LL;
        }
        if ((i & 2) != 0) {
            z11 = c638300P1w.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z10 = c638300P1w.LLILLL;
        }
        if ((i & 8) != 0) {
            z9 = c638300P1w.LLILZ;
        }
        if ((i & 16) != 0) {
            z6 = c638300P1w.LLILZIL;
        } else {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z8 = c638300P1w.LLILZLL;
        }
        if ((i & 64) != 0) {
            z7 = c638300P1w.LLIZ;
        }
        c638300P1w.getClass();
        return new C638300P1w(music2, z11, z10, z9, z6, z8, z7);
    }
}
