package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155610gB5 {
    public final Boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public C1155610gB5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155610gB5)) {
            return false;
        }
        C1155610gB5 c1155610gB5 = (C1155610gB5) obj;
        return Intrinsics.LJFF(this.LIZ, c1155610gB5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155610gB5.LIZIZ) && this.LIZJ == c1155610gB5.LIZJ;
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerSurveyDecision(legacyForceShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", surveyName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enablePersonalized=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1155610gB5(int i) {
        this(null, false, null);
    }

    public C1155610gB5(String str, boolean z, Boolean bool) {
        this.LIZ = bool;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
