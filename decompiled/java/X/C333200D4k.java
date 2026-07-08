package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333200D4k extends AbstractC333220D4m {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C333200D4k) && Intrinsics.LJFF(this.LIZ, ((C333200D4k) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowError(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C333200D4k(String str) {
        this.LIZ = str;
    }
}
