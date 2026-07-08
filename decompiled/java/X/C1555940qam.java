package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555940qam extends AbstractC1556640qbu<EnumC2174261A7k> {
    public final List<EnumC2174261A7k> LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555940qam)) {
            return false;
        }
        C1555940qam c1555940qam = (C1555940qam) obj;
        return Intrinsics.LJFF(this.LLILLJJLI, c1555940qam.LLILLJJLI) && this.LLILLL == c1555940qam.LLILLL && this.LLILZ == c1555940qam.LLILZ;
    }

    public final int hashCode() {
        return (((this.LLILLJJLI.hashCode() * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoginGroupState(items=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showLogout=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showSwitchAccount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1556640qbu, X.InterfaceC1556650qbv
    public final List<EnumC2174261A7k> getItems() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1555940qam(List<? extends EnumC2174261A7k> list, boolean z, boolean z2) {
        super(list);
        this.LLILLJJLI = list;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
