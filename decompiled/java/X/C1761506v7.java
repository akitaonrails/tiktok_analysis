package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06v7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761506v7 implements InterfaceC904740ZeS {
    public final C869590Y9l LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1761506v7) && Intrinsics.LJFF(this.LIZ, ((C1761506v7) obj).LIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnRecallMessageEvent";
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnRecallMessageEvent(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1761506v7(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
