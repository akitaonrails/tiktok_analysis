package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JL3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JL3 implements InterfaceC2753014t {
    public final C0JLC LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JL3) && Intrinsics.LJFF(this.LL, ((C0JL3) obj).LL);
    }

    public final int hashCode() {
        C0JLC c0jlc = this.LL;
        if (c0jlc == null) {
            return 0;
        }
        return c0jlc.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioModeratorSource(param=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JL3(C0JLC c0jlc) {
        this.LL = c0jlc;
    }
}
