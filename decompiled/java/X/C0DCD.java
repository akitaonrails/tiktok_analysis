package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCD implements C0DCQ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DCD) && Intrinsics.LJFF(this.LIZ, ((C0DCD) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ready(displayText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DCD(String str) {
        this.LIZ = str;
    }
}
