package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547290LdH {
    public final String LIZ = "AI_THEATER";
    public final C547270LdF LIZIZ;
    public final Function0<Boolean> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547290LdH)) {
            return false;
        }
        C547290LdH c547290LdH = (C547290LdH) obj;
        return Intrinsics.LJFF(this.LIZ, c547290LdH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c547290LdH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c547290LdH.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIKitTraceProviderConfig(businessId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C547290LdH(C547270LdF c547270LdF, AwS552S0100000_8 awS552S0100000_8) {
        this.LIZIZ = c547270LdF;
        this.LIZJ = awS552S0100000_8;
    }
}
