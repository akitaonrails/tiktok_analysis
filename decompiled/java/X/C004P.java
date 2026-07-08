package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004P implements C004O {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C004P) && Intrinsics.LJFF(this.LIZ, ((C004P) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomContent(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C004P(String str) {
        this.LIZ = str;
    }
}
