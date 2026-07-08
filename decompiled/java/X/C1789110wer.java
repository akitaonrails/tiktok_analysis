package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789110wer<T, ERR> extends AbstractC1789120wes<T, ERR> {
    public final ERR LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1789110wer) && Intrinsics.LJFF(this.LIZ, ((C1789110wer) obj).LIZ);
    }

    public final int hashCode() {
        ERR err = this.LIZ;
        if (err == null) {
            return 0;
        }
        return err.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1789110wer(C1788880weU c1788880weU) {
        this.LIZ = c1788880weU;
    }
}
