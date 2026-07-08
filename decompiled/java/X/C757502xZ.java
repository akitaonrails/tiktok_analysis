package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C757502xZ extends AbstractC756202xM {
    public final ExposeUserRightPanel LLILZLL;
    public final String LLIZ;
    public final BillStarlingText LLIZLLLIL;
    public final Boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C757502xZ)) {
            return false;
        }
        C757502xZ c757502xZ = (C757502xZ) obj;
        return Intrinsics.LJFF(this.LLILZLL, c757502xZ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c757502xZ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c757502xZ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c757502xZ.LLJ);
    }

    public final int hashCode() {
        ExposeUserRightPanel exposeUserRightPanel = this.LLILZLL;
        int iHashCode = (exposeUserRightPanel == null ? 0 : exposeUserRightPanel.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BillStarlingText billStarlingText = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (billStarlingText == null ? 0 : billStarlingText.hashCode())) * 31;
        Boolean bool = this.LLJ;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsUserRightVO(userRightModuleInfo=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", drawSchema=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", benefitStarling=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isUseSkeleton=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJI;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C757502xZ.class, interfaceC1891350zJl.getClass());
    }

    public C757502xZ(ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText) {
        Boolean bool = Boolean.FALSE;
        this.LLILZLL = exposeUserRightPanel;
        this.LLIZ = str;
        this.LLIZLLLIL = billStarlingText;
        this.LLJ = bool;
        this.LLJI = "user_right";
        this.LLJIJIL = "user_right_item";
    }
}
