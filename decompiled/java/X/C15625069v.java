package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.069v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15625069v implements InterfaceC15624069u {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15625069v) && Intrinsics.LJFF(this.LIZ, ((C15625069v) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Blocked(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15625069v(String str) {
        this.LIZ = str;
    }
}
