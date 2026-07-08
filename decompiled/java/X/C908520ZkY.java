package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908520ZkY {
    public final InterfaceC910110Zn7 LIZ;
    public final C0ZLZ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C908520ZkY)) {
            return false;
        }
        C908520ZkY c908520ZkY = (C908520ZkY) obj;
        return Intrinsics.LJFF(this.LIZ, c908520ZkY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c908520ZkY.LIZIZ);
    }

    public C908520ZkY(InterfaceC910110Zn7 interfaceC910110Zn7, C0ZLZ c0zlz) {
        this.LIZ = interfaceC910110Zn7;
        this.LIZIZ = c0zlz;
    }
}
