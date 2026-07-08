package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596790Nav {
    public final int LIZ;
    public final String LIZIZ;

    public C596790Nav() {
        this(1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C596790Nav)) {
            return false;
        }
        C596790Nav c596790Nav = (C596790Nav) obj;
        return this.LIZ == c596790Nav.LIZ && Intrinsics.LJFF(this.LIZIZ, c596790Nav.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommandMetadata(scenario=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", upstreamLogId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C596790Nav(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
