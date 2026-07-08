package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I8L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8L implements C0I8O {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I8L) && Intrinsics.LJFF(this.LIZ, ((C0I8L) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomVoice(durationText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I8L(String str) {
        this.LIZ = str;
    }
}
