package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C221600tK implements InterfaceC512170K6t {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C221600tK) && Intrinsics.LJFF(this.LIZ, ((C221600tK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResubscribeSuccess(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C221600tK(String str) {
        this.LIZ = str;
    }
}
