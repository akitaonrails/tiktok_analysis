package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wpt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835390Wpt<R> extends AbstractC835400Wpu {
    public final R LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C835390Wpt) && Intrinsics.LJFF(this.LIZ, ((C835390Wpt) obj).LIZ);
    }

    public final int hashCode() {
        R r = this.LIZ;
        if (r == null) {
            return 0;
        }
        return r.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Right(b=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C835390Wpt(R r) {
        this.LIZ = r;
    }
}
