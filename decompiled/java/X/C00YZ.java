package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YZ implements InterfaceC1693130uA3 {
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AndroidPointerIcon(pointerIcon=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C00YZ.class, cls)) {
            return false;
        }
        return Intrinsics.LJFF(null, null);
    }
}
