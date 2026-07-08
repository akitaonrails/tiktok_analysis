package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898610ZNb implements C0ZNL {
    public final int LIZ;
    public final String LIZIZ;

    public C898610ZNb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898610ZNb)) {
            return false;
        }
        C898610ZNb c898610ZNb = (C898610ZNb) obj;
        return this.LIZ == c898610ZNb.LIZ && Intrinsics.LJFF(this.LIZIZ, c898610ZNb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostAwemeUnavailable(reasonRes=");
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

    public C898610ZNb(int i) {
        this.LIZ = 2131847845;
        this.LIZIZ = "repost_post_unavailable";
    }
}
