package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ESx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365050ESx {
    public final C0ECF LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C365050ESx) && Intrinsics.LJFF(this.LIZ, ((C365050ESx) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFadeHeaderStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C365050ESx(C0ECF c0ecf) {
        this.LIZ = c0ecf;
    }
}
