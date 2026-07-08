package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08HW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HW extends C07XQ {
    public final AbstractC331870Czh LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C08HW) && Intrinsics.LJFF(this.LIZ, ((C08HW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductSlot(slot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08HW(AbstractC331870Czh abstractC331870Czh) {
        this.LIZ = abstractC331870Czh;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("order_details.product_slot.");
        sbLIZ.append(abstractC331870Czh.getSlotKey());
        sbLIZ.append('.');
        sbLIZ.append(C13LE.LIZ(abstractC331870Czh.getClass()).LJI());
        C2188811AlT.LIZIZ(sbLIZ);
        abstractC331870Czh.getContentHash();
    }
}
