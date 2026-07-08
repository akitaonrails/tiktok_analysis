package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VirtualInfoModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721002rg extends AbstractC756202xM {
    public VirtualInfoModule LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C721002rg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C721002rg)) {
            return false;
        }
        C721002rg c721002rg = (C721002rg) obj;
        return Intrinsics.LJFF(this.LLILZLL, c721002rg.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c721002rg.LLIZ);
    }

    public final int hashCode() {
        VirtualInfoModule virtualInfoModule = this.LLILZLL;
        int iHashCode = (virtualInfoModule == null ? 0 : virtualInfoModule.hashCode()) * 31;
        String str = this.LLIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USVirtualModuleInfoVO(virtualInfoModule=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_virtual_info_item_");
        String str = this.LLIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C721002rg;
    }

    public C721002rg(VirtualInfoModule virtualInfoModule, String str) {
        this.LLILZLL = virtualInfoModule;
        this.LLIZ = str;
        this.LLIZLLLIL = "user_virtual_info";
    }
}
