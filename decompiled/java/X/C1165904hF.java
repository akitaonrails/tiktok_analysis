package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165904hF {
    public final String LIZ;
    public final Function0<String> LIZIZ;

    public C1165904hF() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165904hF)) {
            return false;
        }
        C1165904hF c1165904hF = (C1165904hF) obj;
        return Intrinsics.LJFF(this.LIZ, c1165904hF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1165904hF.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionLoadingActions(loadingEnter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", obtainLanguageName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165904hF(C371840Ehy c371840Ehy) {
        this.LIZ = "";
        this.LIZIZ = c371840Ehy;
    }
}
