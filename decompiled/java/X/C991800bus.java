package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991800bus implements InterfaceC1785520wZ4 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C991800bus) && Intrinsics.LJFF(this.LIZ, ((C991800bus) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FallbackOpenSchema(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991800bus(String str) {
        this.LIZ = str;
    }
}
