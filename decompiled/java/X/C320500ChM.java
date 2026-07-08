package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ChM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C320500ChM {
    public final C326880Cre LIZ;

    public C320500ChM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C320500ChM) && Intrinsics.LJFF(this.LIZ, ((C320500ChM) obj).LIZ);
    }

    public final int hashCode() {
        C326880Cre c326880Cre = this.LIZ;
        if (c326880Cre == null) {
            return 0;
        }
        return c326880Cre.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StableHeightDelegate(bindMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C320500ChM(C326880Cre c326880Cre) {
        this.LIZ = c326880Cre;
    }
}
