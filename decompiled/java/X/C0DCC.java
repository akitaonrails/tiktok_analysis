package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCC implements C0DCQ {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DCC) && Intrinsics.LJFF(this.LIZ, ((C0DCC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Empty(ctaText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DCC(String str) {
        this.LIZ = str;
    }
}
