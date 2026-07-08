package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P1Y implements InterfaceC0148002o {
    public final Music LL;
    public final boolean LLILLJJLI;
    public final AwemeRawAd LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public C0P1Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P1Y)) {
            return false;
        }
        C0P1Y c0p1y = (C0P1Y) obj;
        return Intrinsics.LJFF(this.LL, c0p1y.LL) && this.LLILLJJLI == c0p1y.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0p1y.LLILLL) && this.LLILZ == c0p1y.LLILZ && this.LLILZIL == c0p1y.LLILZIL && this.LLILZLL == c0p1y.LLILZLL;
    }

    public final int hashCode() {
        Music music = this.LL;
        int iHashCode = (((music == null ? 0 : music.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        AwemeRawAd awemeRawAd = this.LLILLL;
        return ((((((iHashCode + (awemeRawAd != null ? awemeRawAd.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMusicTitleState(music=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isScheduleVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", awemeRawAd=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", startMusicAnimation=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pauseNotesAnimation=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", stopNotesAnimation=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0P1Y(int i) {
        this(null, false, null, false, false, false);
    }

    public C0P1Y(Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4) {
        this.LL = music;
        this.LLILLJJLI = z;
        this.LLILLL = awemeRawAd;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
    }

    public static C0P1Y LIZ(C0P1Y c0p1y, Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        boolean z8 = z;
        Music music2 = music;
        if ((i & 1) != 0) {
            music2 = c0p1y.LL;
        }
        if ((i & 2) != 0) {
            z8 = c0p1y.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            awemeRawAd2 = c0p1y.LLILLL;
        }
        if ((i & 8) != 0) {
            z7 = c0p1y.LLILZ;
        }
        if ((i & 16) != 0) {
            z6 = c0p1y.LLILZIL;
        }
        if ((i & 32) != 0) {
            z5 = c0p1y.LLILZLL;
        }
        c0p1y.getClass();
        return new C0P1Y(music2, z8, awemeRawAd2, z7, z6, z5);
    }
}
