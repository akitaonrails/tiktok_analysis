package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZN3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZN3 implements C0ZN0 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZN3)) {
            return false;
        }
        C0ZN3 c0zn3 = (C0ZN3) obj;
        return Intrinsics.LJFF(this.LIZ, c0zn3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zn3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zn3.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentUnavailable(username=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZN0
    public final String getAuthorId() {
        return this.LIZJ;
    }

    @Override // X.C0ZN0
    public final String getAwemeId() {
        return this.LIZIZ;
    }

    public C0ZN3(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
