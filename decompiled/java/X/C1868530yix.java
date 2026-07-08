package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868530yix extends C0D5P {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Bundle LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868530yix)) {
            return false;
        }
        C1868530yix c1868530yix = (C1868530yix) obj;
        return this.LIZ == c1868530yix.LIZ && Intrinsics.LJFF(this.LIZIZ, c1868530yix.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868530yix.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1868530yix.LIZLLL) && Intrinsics.LJFF(this.LJ, c1868530yix.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("On3pLoginClick(isSignUp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loginPanelType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868530yix(boolean z, String str, String str2, String str3, Bundle bundle) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = bundle;
    }
}
