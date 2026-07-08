package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898600ZNa implements InterfaceC898720ZNm {
    public final int LIZ;
    public final String LIZIZ;

    public C898600ZNa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898600ZNa)) {
            return false;
        }
        C898600ZNa c898600ZNa = (C898600ZNa) obj;
        return this.LIZ == c898600ZNa.LIZ && Intrinsics.LJFF(this.LIZIZ, c898600ZNa.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MsgTypeNotSupported(reasonRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reasonMobString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C898600ZNa(int i) {
        this.LIZ = 2131831615;
        this.LIZIZ = "sunset";
    }
}
