package X;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1506005v0 extends AbstractC1492605sq {
    public final String LJ;

    public C1506005v0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1506005v0) && Intrinsics.LJFF(this.LJ, ((C1506005v0) obj).LJ);
    }

    public final int hashCode() {
        return this.LJ.hashCode();
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubmitListComputationKey(uuid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506005v0(int i) {
        super("im_submit_list_performance", (String) null, EnumC1492905st.TEA, 6);
        String string = UUID.randomUUID().toString();
        this.LJ = string;
    }
}
