package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.AboutThisProductActionCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406490mhj implements InterfaceC1059904Cn {
    public final AboutThisProductActionCard LL;
    public String LLILLJJLI = "undefined";
    public final int LLILLL = EnumC1752690vi7.DESCRIPTION.getValue();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1406490mhj) && Intrinsics.LJFF(this.LL, ((C1406490mhj) obj).LL);
    }

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductActionCardVO(actionCard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILLL;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LLILLJJLI;
    }

    public C1406490mhj(AboutThisProductActionCard aboutThisProductActionCard) {
        this.LL = aboutThisProductActionCard;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LLILLJJLI = str;
    }
}
