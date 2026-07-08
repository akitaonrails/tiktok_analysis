package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264900j1M implements InterfaceC0148002o {
    public final boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1610760s1C LLILZLL;
    public final Set<String> LLIZ;
    public final int LLIZLLLIL;

    public C1264900j1M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264900j1M)) {
            return false;
        }
        C1264900j1M c1264900j1M = (C1264900j1M) obj;
        return this.LL == c1264900j1M.LL && Intrinsics.LJFF(this.LLILLJJLI, c1264900j1M.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1264900j1M.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1264900j1M.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1264900j1M.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1264900j1M.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1264900j1M.LLIZ) && this.LLIZLLLIL == c1264900j1M.LLIZLLLIL;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31;
        C1610760s1C c1610760s1C = this.LLILZLL;
        return ((((iHashCode + (c1610760s1C != null ? c1610760s1C.hashCode() : 0)) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRelationInfo(isSelf=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", relationType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageSource=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", homepageUserId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", liveSortBy=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", avatarBorderMultiViewController=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showGreetNoteSet=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", fansCount=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1264900j1M(int i) {
        this(false, "", null, "", "", null, new LinkedHashSet(), 0);
    }

    public C1264900j1M(boolean z, String str, String str2, String str3, String str4, C1610760s1C c1610760s1C, Set<String> set, int i) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = c1610760s1C;
        this.LLIZ = set;
        this.LLIZLLLIL = i;
    }

    public static C1264900j1M LIZ(C1264900j1M c1264900j1M, boolean z, String str, String str2, String str3, String str4, C1610760s1C c1610760s1C, Set set, int i, int i2) {
        int i3 = i;
        Set set2 = set;
        C1610760s1C c1610760s1C2 = c1610760s1C;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c1264900j1M.LL;
        }
        if ((i2 & 2) != 0) {
            str8 = c1264900j1M.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str7 = c1264900j1M.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str6 = c1264900j1M.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str5 = c1264900j1M.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c1610760s1C2 = c1264900j1M.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            set2 = c1264900j1M.LLIZ;
        }
        if ((i2 & 128) != 0) {
            i3 = c1264900j1M.LLIZLLLIL;
        }
        c1264900j1M.getClass();
        return new C1264900j1M(z2, str8, str7, str6, str5, c1610760s1C2, set2, i3);
    }
}
