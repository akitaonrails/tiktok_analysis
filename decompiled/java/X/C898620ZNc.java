package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898620ZNc implements C0ZNL {
    public final int LIZ;
    public final String LIZIZ;

    public C898620ZNc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898620ZNc)) {
            return false;
        }
        C898620ZNc c898620ZNc = (C898620ZNc) obj;
        return this.LIZ == c898620ZNc.LIZ && Intrinsics.LJFF(this.LIZIZ, c898620ZNc.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostUnavailable(reasonRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reasonMobString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZNL
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.C0ZNL
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    public C898620ZNc(int i) {
        this.LIZ = 2131847844;
        this.LIZIZ = "repost_unavailable";
    }
}
