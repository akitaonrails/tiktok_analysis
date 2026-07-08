package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1236504sd implements C0I5T {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1236504sd) && Intrinsics.LJFF(this.LIZ, ((C1236504sd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedCallLog(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1236504sd(String str) {
        this.LIZ = str;
    }
}
