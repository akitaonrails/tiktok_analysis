package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OA0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OA0 implements C0O35 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OA0)) {
            return false;
        }
        C0OA0 c0oa0 = (C0OA0) obj;
        return this.LIZ == c0oa0.LIZ && Intrinsics.LJFF(this.LIZIZ, c0oa0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0oa0.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoLikeState(isLike=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0O35
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0O35
    public final String getId() {
        return this.LIZIZ;
    }

    public C0OA0(boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
