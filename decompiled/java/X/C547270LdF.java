package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547270LdF {
    public static final C547270LdF LJFF = new C547270LdF(false, 31);
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final Set<String> LIZLLL;
    public final Set<String> LJ;

    public C547270LdF() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547270LdF)) {
            return false;
        }
        C547270LdF c547270LdF = (C547270LdF) obj;
        return this.LIZ == c547270LdF.LIZ && this.LIZIZ == c547270LdF.LIZIZ && this.LIZJ == c547270LdF.LIZJ && Intrinsics.LJFF(this.LIZLLL, c547270LdF.LIZLLL) && Intrinsics.LJFF(this.LJ, c547270LdF.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceStrategyConfig(traceEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", traceForceEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", allowLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", eventBlockList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", businessBlockList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C547270LdF(boolean z, int i) {
        C08CX c08cx;
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 8) != 0) {
            c08cx = C08CX.INSTANCE;
        } else {
            c08cx = null;
        }
        this(0, z2, false, c08cx, (i & 16) != 0 ? C08CX.INSTANCE : null);
    }

    public C547270LdF(int i, boolean z, boolean z2, Set set, Set set2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = set;
        this.LJ = set2;
    }
}
