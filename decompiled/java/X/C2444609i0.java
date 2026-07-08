package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2444609i0 implements InterfaceC0148002o {
    public final C291001Au<C2444809i2> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2444609i0) && Intrinsics.LJFF(this.LL, ((C2444609i0) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FYPFollowingSuggestState(showState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2444609i0() {
        this(new C291001Au(new C2444809i2(0)));
    }

    public C2444609i0(C291001Au<C2444809i2> c291001Au) {
        this.LL = c291001Au;
    }
}
