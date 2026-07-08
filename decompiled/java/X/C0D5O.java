package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5O extends C0D5P {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D5O) && Intrinsics.LJFF(this.LIZ, ((C0D5O) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JumpToLoginOrSignup(viewType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5O(String str) {
        this.LIZ = str;
    }
}
