package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895603ek implements InterfaceC896803ew {
    @Override // X.InterfaceC896803ew
    public final void LJJLIIIJJIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895603ek)) {
            return false;
        }
        obj.getClass();
        if (!Intrinsics.LJFF(null, null)) {
            return false;
        }
        obj.getClass();
        if (!Intrinsics.LJFF(null, null)) {
            return false;
        }
        obj.getClass();
        if (!Intrinsics.LJFF(null, null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC896803ew
    public final ElementDTO getElementDTO() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NormalTextInputItem(elementDTO=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", adapter=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", inputType=");
        sbLIZ.append(0);
        sbLIZ.append(", changeAble=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
