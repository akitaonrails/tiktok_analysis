package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HW3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HW3 implements InterfaceC0148002o {
    public final C291001Au<C0HW5> LL;

    public C0HW3() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HW3) && Intrinsics.LJFF(this.LL, ((C0HW3) obj).LL);
    }

    public final int hashCode() {
        C291001Au<C0HW5> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentSyncState(commentCountSyncState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HW3(C291001Au<C0HW5> c291001Au) {
        this.LL = c291001Au;
    }
}
