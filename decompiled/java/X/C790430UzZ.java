package X;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790430UzZ {
    public final Application LIZ;
    public final boolean LIZIZ = false;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790430UzZ)) {
            return false;
        }
        C790430UzZ c790430UzZ = (C790430UzZ) obj;
        return Intrinsics.LJFF(this.LIZ, c790430UzZ.LIZ) && this.LIZIZ == c790430UzZ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c790430UzZ.LIZJ) && this.LIZLLL == c790430UzZ.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        String str = this.LIZJ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppConfig(application=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isOfflineEnv=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", releaseBuild=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", appLaunchTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C790430UzZ(Application application, String str, long j) {
        this.LIZ = application;
        this.LIZJ = str;
        this.LIZLLL = j;
    }
}
