package X;

import com.ss.android.ugc.aweme.friendstab.ui.input.model.TextPublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395390mPp implements InterfaceC0148002o {
    public final String LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final TextPublishModel LLILZLL;
    public final C1395350mPl LLIZ;

    public C1395390mPp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395390mPp)) {
            return false;
        }
        C1395390mPp c1395390mPp = (C1395390mPp) obj;
        return Intrinsics.LJFF(this.LL, c1395390mPp.LL) && this.LLILLJJLI == c1395390mPp.LLILLJJLI && this.LLILLL == c1395390mPp.LLILLL && this.LLILZ == c1395390mPp.LLILZ && this.LLILZIL == c1395390mPp.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1395390mPp.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1395390mPp.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        TextPublishModel textPublishModel = this.LLILZLL;
        int iHashCode2 = (iHashCode + (textPublishModel == null ? 0 : textPublishModel.hashCode())) * 31;
        C1395350mPl c1395350mPl = this.LLIZ;
        return iHashCode2 + (c1395350mPl != null ? c1395350mPl.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextPublishVMState(inputText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", softKeyBoardHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasValidContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isHasLastContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hasMobShoot=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", textPublishModel=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1395390mPp(int i) {
        this("", 0, false, false, false, null, null);
    }

    public C1395390mPp(String str, int i, boolean z, boolean z2, boolean z3, TextPublishModel textPublishModel, C1395350mPl c1395350mPl) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = textPublishModel;
        this.LLIZ = c1395350mPl;
    }

    public static C1395390mPp LIZ(C1395390mPp c1395390mPp, String str, int i, boolean z, boolean z2, TextPublishModel textPublishModel, C1395350mPl c1395350mPl, int i2) {
        boolean z3;
        C1395350mPl c1395350mPl2 = c1395350mPl;
        TextPublishModel textPublishModel2 = textPublishModel;
        boolean z4 = z2;
        boolean z5 = z;
        int i3 = i;
        String str2 = str;
        if ((i2 & 1) != 0) {
            str2 = c1395390mPp.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c1395390mPp.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z5 = c1395390mPp.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z4 = c1395390mPp.LLILZ;
        }
        if ((i2 & 16) != 0) {
            z3 = c1395390mPp.LLILZIL;
        } else {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            textPublishModel2 = c1395390mPp.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c1395350mPl2 = c1395390mPp.LLIZ;
        }
        c1395390mPp.getClass();
        return new C1395390mPp(str2, i3, z5, z4, z3, textPublishModel2, c1395350mPl2);
    }
}
