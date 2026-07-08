package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555920qak extends AbstractC1556640qbu<InterfaceC1688870u3B> {
    public final List<InterfaceC1688870u3B> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555920qak) && Intrinsics.LJFF(this.LLILLJJLI, ((C1555920qak) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyGroupState(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555920qak() {
        this(C13BV.INSTANCE);
    }

    @Override // X.AbstractC1556640qbu, X.InterfaceC1556650qbv
    public final List<InterfaceC1688870u3B> getItems() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1555920qak(List<? extends InterfaceC1688870u3B> list) {
        super(list);
        this.LLILLJJLI = list;
    }
}
