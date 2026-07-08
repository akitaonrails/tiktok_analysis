package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481550IuX extends AbstractC481570IuZ {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481550IuX) && Intrinsics.LJFF(this.LIZ, ((C481550IuX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartRandomMatchFailed(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481550IuX(Throwable th) {
        this.LIZ = th;
    }
}
