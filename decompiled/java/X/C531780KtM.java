package X;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531780KtM {
    public final Activity LIZ;
    public final EnumC1412640mre LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531780KtM)) {
            return false;
        }
        C531780KtM c531780KtM = (C531780KtM) obj;
        return Intrinsics.LJFF(this.LIZ, c531780KtM.LIZ) && this.LIZIZ == c531780KtM.LIZIZ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC1412640mre enumC1412640mre = this.LIZIZ;
        return iHashCode + (enumC1412640mre == null ? 0 : enumC1412640mre.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitPipelineIn(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531780KtM(Activity activity, EnumC1412640mre enumC1412640mre) {
        this.LIZ = activity;
        this.LIZIZ = enumC1412640mre;
    }
}
