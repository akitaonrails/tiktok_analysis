package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452910HpR implements InterfaceC452960HpW {
    public final C452840HpK LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C452910HpR) && Intrinsics.LJFF(this.LIZ, ((C452910HpR) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Visible(panelState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C452910HpR(C452840HpK c452840HpK) {
        this.LIZ = c452840HpK;
    }
}
