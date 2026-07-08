package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C220200t6 implements InterfaceC220300t7 {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File(fileName=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C220200t6(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C220200t6) || !Intrinsics.LJFF(str, ((C220200t6) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
