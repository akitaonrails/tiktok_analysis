package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900900ZVw implements C0ZW3 {
    public final C0ZW2<C0ZW8> LIZ;
    public final C1622006Ws<EnumC900890ZVv> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900900ZVw)) {
            return false;
        }
        C900900ZVw c900900ZVw = (C900900ZVw) obj;
        return Intrinsics.LJFF(this.LIZ, c900900ZVw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c900900ZVw.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        this.LIZIZ.getClass();
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoImage(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C900900ZVw(C1622006Ws c1622006Ws) {
        this(new C0ZW2(Unit.LIZ, null), c1622006Ws);
    }

    @Override // X.C0ZW3
    public final boolean LIZ(C0ZW3 c0zw3) {
        return C0ZW0.LIZ(this, c0zw3);
    }

    @Override // X.C0ZW3
    public final boolean LIZIZ(C0ZW3 c0zw3) {
        return C0ZW0.LIZIZ(this, c0zw3);
    }

    @Override // X.C0ZW3
    public final boolean LIZJ(C0ZW3 c0zw3) {
        return C0ZW0.LIZJ(this, c0zw3);
    }

    public C900900ZVw(C0ZW2<C0ZW8> c0zw2, C1622006Ws<EnumC900890ZVv> c1622006Ws) {
        this.LIZ = c0zw2;
        this.LIZIZ = c1622006Ws;
    }
}
