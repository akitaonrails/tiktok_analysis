package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04w0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257404w0 {
    public final String LIZ;

    public C1257404w0() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1257404w0) && Intrinsics.LJFF(this.LIZ, ((C1257404w0) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonatePageViewState(sessionToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1257404w0(String str) {
        this.LIZ = str;
    }
}
