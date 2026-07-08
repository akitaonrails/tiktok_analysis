package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1761406v6 implements InterfaceC904740ZeS {
    public final C869590Y9l LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1761406v6) && Intrinsics.LJFF(this.LIZ, ((C1761406v6) obj).LIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnDelMessageEvent";
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnDelMessageEvent(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1761406v6(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
