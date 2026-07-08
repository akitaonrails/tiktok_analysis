package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755202xC extends AbstractC756202xM {
    public final List<UserTrustItem> LLILZLL;
    public final Boolean LLIZ;
    public final Boolean LLIZLLLIL;
    public final Boolean LLJ;
    public Boolean LLJI;
    public final Boolean LLJIJIL;
    public final ExposeUserRightPanel LLJILJIL;
    public final String LLJILJILJ;
    public final BillStarlingText LLJILLL;
    public final String LLJJ;
    public final String LLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C755202xC)) {
            return false;
        }
        C755202xC c755202xC = (C755202xC) obj;
        return Intrinsics.LJFF(this.LLILZLL, c755202xC.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c755202xC.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c755202xC.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c755202xC.LLJ) && Intrinsics.LJFF(this.LLJI, c755202xC.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c755202xC.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c755202xC.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c755202xC.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c755202xC.LLJILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        Boolean bool = this.LLIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LLJ;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ExposeUserRightPanel exposeUserRightPanel = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (exposeUserRightPanel == null ? 0 : exposeUserRightPanel.hashCode())) * 31;
        String str = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        BillStarlingText billStarlingText = this.LLJILLL;
        return iHashCode8 + (billStarlingText != null ? billStarlingText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserTrustVO(userTrustItems=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isUseSkeleton=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isPreHandle=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", notShowAddNote=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", notShowUserRight=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", shouldModifyPolicyLink=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", userRightModuleInfo=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", userBenefitDrawSchema=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", userBenefitViewAllStarling=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJJ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJJI;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C755202xC.class, interfaceC1891350zJl.getClass());
    }

    public static C755202xC LIZIZ(C755202xC c755202xC, Boolean bool, Boolean bool2, int i) {
        List<UserTrustItem> list;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        ExposeUserRightPanel exposeUserRightPanel;
        String str;
        Boolean bool6 = bool2;
        Boolean bool7 = bool;
        BillStarlingText billStarlingText = null;
        if ((i & 1) != 0) {
            list = c755202xC.LLILZLL;
        } else {
            list = null;
        }
        if ((i & 2) != 0) {
            bool7 = c755202xC.LLIZ;
        }
        if ((i & 4) != 0) {
            bool3 = c755202xC.LLIZLLLIL;
        } else {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            bool4 = c755202xC.LLJ;
        } else {
            bool4 = null;
        }
        if ((i & 16) != 0) {
            bool5 = c755202xC.LLJI;
        } else {
            bool5 = null;
        }
        if ((i & 32) != 0) {
            bool6 = c755202xC.LLJIJIL;
        }
        if ((i & 64) != 0) {
            exposeUserRightPanel = c755202xC.LLJILJIL;
        } else {
            exposeUserRightPanel = null;
        }
        if ((i & 128) != 0) {
            str = c755202xC.LLJILJILJ;
        } else {
            str = null;
        }
        if ((i & 256) != 0) {
            billStarlingText = c755202xC.LLJILLL;
        }
        c755202xC.getClass();
        return new C755202xC(list, bool7, bool3, bool4, bool5, bool6, exposeUserRightPanel, str, billStarlingText);
    }

    public /* synthetic */ C755202xC(List list, Boolean bool, ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText, int i) {
        this(list, (i & 2) != 0 ? null : bool, null, null, null, null, exposeUserRightPanel, str, billStarlingText);
    }

    public C755202xC(List<UserTrustItem> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText) {
        this.LLILZLL = list;
        this.LLIZ = bool;
        this.LLIZLLLIL = bool2;
        this.LLJ = bool3;
        this.LLJI = bool4;
        this.LLJIJIL = bool5;
        this.LLJILJIL = exposeUserRightPanel;
        this.LLJILJILJ = str;
        this.LLJILLL = billStarlingText;
        this.LLJJ = "privacy_policy_statement";
        this.LLJJI = "privacy_policy_statement_item";
    }
}
