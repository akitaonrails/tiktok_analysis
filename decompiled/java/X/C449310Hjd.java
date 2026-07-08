package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449310Hjd implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C291001Au<User> LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final boolean LLIZLLLIL;

    public C449310Hjd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C449310Hjd)) {
            return false;
        }
        C449310Hjd c449310Hjd = (C449310Hjd) obj;
        return Intrinsics.LJFF(this.LL, c449310Hjd.LL) && this.LLILLJJLI == c449310Hjd.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c449310Hjd.LLILLL) && this.LLILZ == c449310Hjd.LLILZ && this.LLILZIL == c449310Hjd.LLILZIL && this.LLILZLL == c449310Hjd.LLILZLL && Intrinsics.LJFF(this.LLIZ, c449310Hjd.LLIZ) && this.LLIZLLLIL == c449310Hjd.LLIZLLLIL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<User> c291001Au = this.LLILLL;
        int iHashCode2 = (((((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLIZ;
        return ((iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCaptionMentionState(keyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needFinishAfterChoose=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", chooseResult=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", navBarShow=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", needIndexView=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isFromPublishPanel=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", mentionRisk=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", mentionVisible=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C449310Hjd(int i) {
        this("", true, null, true, true, false, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C449310Hjd(String str, boolean z, C291001Au<? extends User> c291001Au, boolean z2, boolean z3, boolean z4, C291001Au<Boolean> c291001Au2, boolean z5) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = z5;
    }

    public static C449310Hjd LIZ(C449310Hjd c449310Hjd, String str, boolean z, C291001Au c291001Au, boolean z2, boolean z3, boolean z4, C291001Au c291001Au2, boolean z5, int i) {
        boolean z6 = z5;
        C291001Au c291001Au3 = c291001Au2;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        C291001Au c291001Au4 = c291001Au;
        boolean z10 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c449310Hjd.LL;
        }
        if ((i & 2) != 0) {
            z10 = c449310Hjd.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c449310Hjd.LLILLL;
        }
        if ((i & 8) != 0) {
            z9 = c449310Hjd.LLILZ;
        }
        if ((i & 16) != 0) {
            z8 = c449310Hjd.LLILZIL;
        }
        if ((i & 32) != 0) {
            z7 = c449310Hjd.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c449310Hjd.LLIZ;
        }
        if ((i & 128) != 0) {
            z6 = c449310Hjd.LLIZLLLIL;
        }
        c449310Hjd.getClass();
        return new C449310Hjd(str2, z10, c291001Au4, z9, z8, z7, c291001Au3, z6);
    }
}
