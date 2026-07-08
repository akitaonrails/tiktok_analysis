package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C226600u8<T> extends AbstractC401801hI<T> {
    public final T LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C226600u8)) {
            return false;
        }
        C226600u8 c226600u8 = (C226600u8) obj;
        return Intrinsics.LJFF(this.LIZ, c226600u8.LIZ) && this.LIZIZ == c226600u8.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemDownloading(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C226600u8(int i, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = i;
    }
}
