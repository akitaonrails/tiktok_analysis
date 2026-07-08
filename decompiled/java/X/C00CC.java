package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00CC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CC<T> {
    public final T LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C00CC() {
        this(0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00CC)) {
            return false;
        }
        C00CC c00cc = (C00CC) obj;
        return Intrinsics.LJFF(this.LIZ, c00cc.LIZ) && this.LIZIZ == c00cc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c00cc.LIZJ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        int iHashCode = (((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGCNetworkResponse(body=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C00CC(int i, Object obj, String str) {
        this.LIZ = obj;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
