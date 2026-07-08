package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596620Nae extends AbstractC596640Nag {
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C596620Nae) && Intrinsics.LJFF(this.LIZIZ, ((C596620Nae) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C596620Nae(Throwable th) {
        super("failed");
        this.LIZIZ = th;
    }
}
