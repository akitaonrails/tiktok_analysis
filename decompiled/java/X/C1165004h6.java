package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165004h6 implements InterfaceC1165104h7 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1165004h6) && Intrinsics.LJFF(this.LIZ, ((C1165004h6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleLineTitle(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165004h6(String str) {
        this.LIZ = str;
    }
}
