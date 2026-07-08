package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370820EgK {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheKey(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fileId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZIZ * 31) + this.LIZJ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C370820EgK)) {
            return false;
        }
        C370820EgK c370820EgK = (C370820EgK) obj;
        if (this.LIZIZ == c370820EgK.LIZIZ && Intrinsics.LJFF(this.LIZJ, c370820EgK.LIZJ)) {
            return true;
        }
        return false;
    }

    public C370820EgK(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
