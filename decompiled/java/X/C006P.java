package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006P {
    public final Long LIZ;
    public final AnonymousClass0080 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C006P)) {
            return false;
        }
        C006P c006p = (C006P) obj;
        return Intrinsics.LJFF(this.LIZ, c006p.LIZ) && this.LIZIZ == c006p.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ObjectHandleResult(featureId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C006P(Long l, AnonymousClass0080 anonymousClass0080) {
        this.LIZ = l;
        this.LIZIZ = anonymousClass0080;
    }
}
