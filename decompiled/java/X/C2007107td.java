package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07td, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2007107td implements InterfaceC0148002o {
    public final String LL;

    public C2007107td() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2007107td) && Intrinsics.LJFF(this.LL, ((C2007107td) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickLiveReactVMState(curTapToPlaySourceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2007107td(int i) {
        this("");
    }

    public C2007107td(String str) {
        this.LL = str;
    }
}
