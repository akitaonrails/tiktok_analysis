package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003P {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C003P) && Intrinsics.LJFF(this.LIZ, ((C003P) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetLocationName(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C003P() {
        this("");
    }

    public C003P(String str) {
        this.LIZ = str;
    }
}
