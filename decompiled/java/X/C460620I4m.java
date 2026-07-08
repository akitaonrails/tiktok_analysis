package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460620I4m implements C0I5T {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C460620I4m) && Intrinsics.LJFF(this.LIZ, ((C460620I4m) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedVoice(durationString=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C460620I4m(String str) {
        this.LIZ = str;
    }
}
