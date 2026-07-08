package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722650SWh implements InterfaceC0148002o {
    public final C1342780l2y LL;

    public C722650SWh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C722650SWh) && Intrinsics.LJFF(this.LL, ((C722650SWh) obj).LL);
    }

    public final int hashCode() {
        C1342780l2y c1342780l2y = this.LL;
        if (c1342780l2y == null) {
            return 0;
        }
        return c1342780l2y.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPublishState(publishState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C722650SWh(C1342780l2y c1342780l2y) {
        this.LL = c1342780l2y;
    }
}
