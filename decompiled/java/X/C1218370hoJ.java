package X;

import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218370hoJ implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final AbstractC1623806Xk<GroupInviteInfoModel> LLILLL;
    public final C291001Au<String> LLILZ;
    public final AbstractC1623806Xk<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218370hoJ)) {
            return false;
        }
        C1218370hoJ c1218370hoJ = (C1218370hoJ) obj;
        return Intrinsics.LJFF(this.LL, c1218370hoJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218370hoJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218370hoJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1218370hoJ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1218370hoJ.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<String> c291001Au = this.LLILZ;
        return ((iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteLinkState(groupAvatar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", resetLinkStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1218370hoJ(String str, String str2, AbstractC1623806Xk<GroupInviteInfoModel> abstractC1623806Xk, C291001Au<String> c291001Au, AbstractC1623806Xk<Unit> abstractC1623806Xk2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = abstractC1623806Xk;
        this.LLILZ = c291001Au;
        this.LLILZIL = abstractC1623806Xk2;
    }

    public static C1218370hoJ LIZ(C1218370hoJ c1218370hoJ, String str, String str2, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        C291001Au c291001Au2 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c1218370hoJ.LL;
        }
        if ((i & 2) != 0) {
            str3 = c1218370hoJ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk4 = c1218370hoJ.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1218370hoJ.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk3 = c1218370hoJ.LLILZIL;
        }
        c1218370hoJ.getClass();
        return new C1218370hoJ(str4, str3, abstractC1623806Xk4, c291001Au2, abstractC1623806Xk3);
    }
}
