package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547250LdD {
    public final C547200Ld8 LIZ;
    public final Function1<CreativeModel, String> LIZIZ;
    public final C547270LdF LIZJ;

    public C547250LdD() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C547250LdD)) {
            return false;
        }
        C547250LdD c547250LdD = (C547250LdD) obj;
        return Intrinsics.LJFF(this.LIZ, c547250LdD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c547250LdD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c547250LdD.LIZJ);
    }

    public final int hashCode() {
        C547200Ld8 c547200Ld8 = this.LIZ;
        int iHashCode = (c547200Ld8 == null ? 0 : c547200Ld8.hashCode()) * 31;
        Function1<CreativeModel, String> function1 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        C547270LdF c547270LdF = this.LIZJ;
        return iHashCode2 + (c547270LdF != null ? c547270LdF.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceConfig(traceKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", traceIdFetcher=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategyConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C547250LdD(C547200Ld8 c547200Ld8, Function1<? super CreativeModel, String> function1, C547270LdF c547270LdF) {
        this.LIZ = c547200Ld8;
        this.LIZIZ = function1;
        this.LIZJ = c547270LdF;
    }
}
