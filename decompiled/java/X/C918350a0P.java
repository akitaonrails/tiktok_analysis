package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918350a0P {
    public final C918380a0S LIZ;
    public final InterfaceC918290a0J LIZIZ;
    public final C918360a0Q LIZJ;
    public final C918370a0R LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918350a0P)) {
            return false;
        }
        C918350a0P c918350a0P = (C918350a0P) obj;
        return Intrinsics.LJFF(this.LIZ, c918350a0P.LIZ) && Intrinsics.LJFF(this.LIZIZ, c918350a0P.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c918350a0P.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c918350a0P.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteRequest(core=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callbacks=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extension=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC918870a1F LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C918350a0P(C918380a0S c918380a0S, InterfaceC918290a0J interfaceC918290a0J, C918360a0Q c918360a0Q, int i) {
        this(c918380a0S, interfaceC918290a0J, (i & 4) != 0 ? new C918360a0Q(7, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0) : c918360a0Q, (i & 8) != 0 ? new C918370a0R((List) null, 3) : null);
    }

    public C918350a0P(C918380a0S c918380a0S, InterfaceC918290a0J interfaceC918290a0J, C918360a0Q c918360a0Q, C918370a0R c918370a0R) {
        this.LIZ = c918380a0S;
        this.LIZIZ = interfaceC918290a0J;
        this.LIZJ = c918360a0Q;
        this.LIZLLL = c918370a0R;
    }

    public static C918350a0P LIZ(C918350a0P c918350a0P, C918410a0V c918410a0V, C918360a0Q c918360a0Q, C918370a0R c918370a0R, int i) {
        C918380a0S c918380a0S;
        if ((i & 1) != 0) {
            c918380a0S = c918350a0P.LIZ;
        } else {
            c918380a0S = null;
        }
        InterfaceC918290a0J interfaceC918290a0J = c918410a0V;
        if ((i & 2) != 0) {
            interfaceC918290a0J = c918350a0P.LIZIZ;
        }
        if ((i & 4) != 0) {
            c918360a0Q = c918350a0P.LIZJ;
        }
        if ((i & 8) != 0) {
            c918370a0R = c918350a0P.LIZLLL;
        }
        c918350a0P.getClass();
        return new C918350a0P(c918380a0S, interfaceC918290a0J, c918360a0Q, c918370a0R);
    }
}
