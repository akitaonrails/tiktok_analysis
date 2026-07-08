package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07U2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07U2 implements InterfaceC904740ZeS {
    public final Object LIZ;
    public final String LIZIZ;

    public C07U2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07U2) && Intrinsics.LJFF(this.LIZ, ((C07U2) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizMessageEvent(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return this.LIZIZ;
    }

    public C07U2(Object obj) {
        this.LIZ = obj;
        this.LIZIZ = "BizMessageEvent";
    }
}
