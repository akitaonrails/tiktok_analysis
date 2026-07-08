package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607550rw1 implements InterfaceC0148002o {
    public final C291001Au<C1607570rw3> LL;

    public C1607550rw1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1607550rw1) && Intrinsics.LJFF(this.LL, ((C1607550rw1) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabFeedInvitedState(collabStateUpdateEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1607550rw1(int i) {
        this((C291001Au<C1607570rw3>) new C291001Au(new C1607570rw3(0)));
    }

    public C1607550rw1(C291001Au<C1607570rw3> c291001Au) {
        this.LL = c291001Au;
    }
}
