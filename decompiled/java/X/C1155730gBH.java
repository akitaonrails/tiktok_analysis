package X;

import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155730gBH implements InterfaceC2753014t, InterfaceC111300bX {
    public final Boolean LL;
    public final C01GW LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155730gBH) && Intrinsics.LJFF(this.LL, ((C1155730gBH) obj).LL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaSkylightHierarchyData(useDarkModeColor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155730gBH() {
        this(Boolean.TRUE);
    }

    public C1155730gBH(Boolean bool) {
        this.LL = bool;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(720));
    }
}
