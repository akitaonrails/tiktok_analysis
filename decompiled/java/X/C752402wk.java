package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C752402wk extends AbstractC723102s1 {
    public final DeliveryInstructionInfo LL;
    public final String LLILLJJLI = "shipping_address";
    public final String LLILLL = "item_delivery_instruction";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C752402wk) && Intrinsics.LJFF(this.LL, ((C752402wk) obj).LL);
    }

    public final int hashCode() {
        DeliveryInstructionInfo deliveryInstructionInfo = this.LL;
        if (deliveryInstructionInfo == null) {
            return 0;
        }
        return deliveryInstructionInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditDeliveryInstruction(deliveryInstructionInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC723102s1
    public final String getItemId() {
        return this.LLILLL;
    }

    public C752402wk(DeliveryInstructionInfo deliveryInstructionInfo) {
        this.LL = deliveryInstructionInfo;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C752402wk;
    }
}
