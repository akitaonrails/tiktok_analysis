package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727340v3E extends AbstractC1727320v3C {
    public final C1727990v4H LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1727340v3E) && Intrinsics.LJFF(this.LLILLJJLI, ((C1727340v3E) obj).LLILLJJLI);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Phone(config=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1727320v3C
    public final C1727990v4H LIZ() {
        return this.LLILLJJLI;
    }

    public C1727340v3E(C1727990v4H c1727990v4H) {
        super(c1727990v4H);
        this.LLILLJJLI = c1727990v4H;
    }
}
