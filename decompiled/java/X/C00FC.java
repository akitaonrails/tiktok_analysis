package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00FC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FC {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00FC) && Intrinsics.LJFF(this.LIZ, ((C00FC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageCall(msgUuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00FC(String str) {
        this.LIZ = str;
    }
}
