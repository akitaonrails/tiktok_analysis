package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857620Xke {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C857620Xke)) {
            return false;
        }
        C857620Xke c857620Xke = (C857620Xke) obj;
        return Intrinsics.LJFF(this.LIZ, c857620Xke.LIZ) && Intrinsics.LJFF(this.LIZIZ, c857620Xke.LIZIZ) && this.LIZJ == c857620Xke.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishPreloadRecord(layout=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C857620Xke(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
