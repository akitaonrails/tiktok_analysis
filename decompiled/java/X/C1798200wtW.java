package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798200wtW extends AbstractC1798240wta {
    public final String LIZ;
    public final String LIZIZ;
    public final n LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1798200wtW)) {
            return false;
        }
        C1798200wtW c1798200wtW = (C1798200wtW) obj;
        return Intrinsics.LJFF(this.LIZ, c1798200wtW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1798200wtW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1798200wtW.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1798240wta
    public final String LIZ() {
        return this.LIZ;
    }

    public C1798200wtW(String str, String str2, n nVar) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = nVar;
    }
}
