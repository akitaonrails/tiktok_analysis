package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZLV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLV implements InterfaceC901080ZWo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZLV) && Intrinsics.LJFF(this.LIZ, ((C0ZLV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translated(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZLV(String str) {
        this.LIZ = str;
    }
}
