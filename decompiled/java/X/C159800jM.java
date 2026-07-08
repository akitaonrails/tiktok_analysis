package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159800jM {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C159800jM) && Intrinsics.LJFF(this.LIZ, ((C159800jM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSUserNetworkRequest(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C159800jM() {
        this("");
    }

    public C159800jM(String str) {
        this.LIZ = str;
    }
}
