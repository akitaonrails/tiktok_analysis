package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1639906bV implements InterfaceC0148002o {
    public final IMUser LL;
    public final C429270GsP LLILLJJLI;
    public final C894700Z8a LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final ThoughtInfo LLIZLLLIL;
    public final String LLJ;
    public final C06IF LLJI;

    public C1639906bV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639906bV)) {
            return false;
        }
        C1639906bV c1639906bV = (C1639906bV) obj;
        return Intrinsics.LJFF(this.LL, c1639906bV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1639906bV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1639906bV.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1639906bV.LLILZ) && this.LLILZIL == c1639906bV.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1639906bV.LLILZLL) && this.LLIZ == c1639906bV.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1639906bV.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1639906bV.LLJ) && this.LLJI == c1639906bV.LLJI;
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        int iHashCode = (iMUser == null ? 0 : iMUser.hashCode()) * 31;
        C429270GsP c429270GsP = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c429270GsP == null ? 0 : c429270GsP.hashCode())) * 31;
        C894700Z8a c894700Z8a = this.LLILLL;
        int iHashCode3 = (((((((((iHashCode2 + (c894700Z8a == null ? 0 : c894700Z8a.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        ThoughtInfo thoughtInfo = this.LLIZLLLIL;
        return ((((iHashCode3 + (thoughtInfo != null ? thoughtInfo.hashCode() : 0)) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleTitleBarCenterState(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activityStatusViewData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", activityStatusTextWithType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", recalculateHint=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isTyping=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isMutualFollower=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", currentThoughtData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", thoughtBubbleText=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", thoughtBubbleState=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1639906bV(int i) {
        this(null, null, null, new C291001Au(Boolean.FALSE), false, "", false, null, "", C06IF.NONE);
    }

    public C1639906bV(IMUser iMUser, C429270GsP c429270GsP, C894700Z8a c894700Z8a, C291001Au<Boolean> c291001Au, boolean z, String str, boolean z2, ThoughtInfo thoughtInfo, String str2, C06IF c06if) {
        this.LL = iMUser;
        this.LLILLJJLI = c429270GsP;
        this.LLILLL = c894700Z8a;
        this.LLILZ = c291001Au;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = z2;
        this.LLIZLLLIL = thoughtInfo;
        this.LLJ = str2;
        this.LLJI = c06if;
    }

    public static C1639906bV LIZ(C1639906bV c1639906bV, IMUser iMUser, C429270GsP c429270GsP, C894700Z8a c894700Z8a, boolean z, String str, boolean z2, ThoughtInfo thoughtInfo, String str2, C06IF c06if, int i) {
        C291001Au<Boolean> c291001Au;
        C06IF c06if2 = c06if;
        String str3 = str2;
        ThoughtInfo thoughtInfo2 = thoughtInfo;
        boolean z3 = z2;
        String str4 = str;
        boolean z4 = z;
        C894700Z8a c894700Z8a2 = c894700Z8a;
        C429270GsP c429270GsP2 = c429270GsP;
        IMUser iMUser2 = iMUser;
        if ((i & 1) != 0) {
            iMUser2 = c1639906bV.LL;
        }
        if ((i & 2) != 0) {
            c429270GsP2 = c1639906bV.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c894700Z8a2 = c1639906bV.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1639906bV.LLILZ;
        } else {
            c291001Au = null;
        }
        if ((i & 16) != 0) {
            z4 = c1639906bV.LLILZIL;
        }
        if ((i & 32) != 0) {
            str4 = c1639906bV.LLILZLL;
        }
        if ((i & 64) != 0) {
            z3 = c1639906bV.LLIZ;
        }
        if ((i & 128) != 0) {
            thoughtInfo2 = c1639906bV.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str3 = c1639906bV.LLJ;
        }
        if ((i & 512) != 0) {
            c06if2 = c1639906bV.LLJI;
        }
        c1639906bV.getClass();
        return new C1639906bV(iMUser2, c429270GsP2, c894700Z8a2, c291001Au, z4, str4, z3, thoughtInfo2, str3, c06if2);
    }
}
