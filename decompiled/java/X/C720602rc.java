package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPPageModuleConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720602rc extends AbstractC756202xM {
    public final C719202rO LLILZLL;
    public final Boolean LLIZ = null;
    public final Boolean LLIZLLLIL = null;
    public final String LLJ = "combined_sku_add_note_item";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C720602rc)) {
            return false;
        }
        C720602rc c720602rc = (C720602rc) obj;
        return Intrinsics.LJFF(this.LLILZLL, c720602rc.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c720602rc.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c720602rc.LLIZLLLIL);
    }

    public final int hashCode() {
        C719202rO c719202rO = this.LLILZLL;
        int iHashCode = (c719202rO == null ? 0 : c719202rO.hashCode()) * 31;
        Boolean bool = this.LLIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLIZLLLIL;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombinedSkuAddNoteVO(shopInfoVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isUseSkeleton=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isPreHandle=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        String str;
        OSPPageModuleConfig oSPPageModuleConfig = this.LLILLL;
        return (oSPPageModuleConfig == null || (str = oSPPageModuleConfig.name) == null) ? "add_note_statement" : str;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJ;
    }

    public C720602rc(C719202rO c719202rO) {
        this.LLILZLL = c719202rO;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C720602rc;
    }
}
