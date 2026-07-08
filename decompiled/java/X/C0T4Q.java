package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4Q extends AbstractC1393330mMV {
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0T4Q) && Intrinsics.LJFF(this.LIZJ, ((C0T4Q) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Report(aid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1393330mMV
    public final String LIZ() {
        return this.LIZJ;
    }

    public C0T4Q(String str) {
        super(str);
        this.LIZJ = str;
    }
}
