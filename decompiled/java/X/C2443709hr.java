package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2443709hr implements InterfaceC0148002o {
    public final C291001Au<C2443809hs> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2443709hr) && Intrinsics.LJFF(this.LL, ((C2443709hr) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowingHvrLabelState(showState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2443709hr() {
        this(new C291001Au(new C2443809hs(0)));
    }

    public C2443709hr(C291001Au<C2443809hs> c291001Au) {
        this.LL = c291001Au;
    }
}
