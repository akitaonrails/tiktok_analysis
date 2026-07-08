package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DigitalDelivery;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755902xJ extends AbstractC756202xM {
    public final DigitalDelivery LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C755902xJ() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C755902xJ) && Intrinsics.LJFF(this.LLILZLL, ((C755902xJ) obj).LLILZLL);
    }

    public final int hashCode() {
        DigitalDelivery digitalDelivery = this.LLILZLL;
        if (digitalDelivery == null) {
            return 0;
        }
        return digitalDelivery.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USDigitalDeliveryVO(digitalDelivery=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C755902xJ(DigitalDelivery digitalDelivery) {
        this.LLILZLL = digitalDelivery;
        this.LLIZ = "digital_delivery";
        this.LLIZLLLIL = "digital_delivery_item";
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C755902xJ) && this.LLILZ == ((AbstractC756202xM) interfaceC1891350zJl).LLILZ) {
            return true;
        }
        return false;
    }
}
