package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991740bum implements InterfaceC1715120ujW {
    public final String LIZ;

    public C991740bum() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991740bum) && Intrinsics.LJFF(this.LIZ, ((C991740bum) obj).LIZ);
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
        sbLIZ.append("Success(nextVerifyInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991740bum(String str) {
        this.LIZ = str;
    }
}
