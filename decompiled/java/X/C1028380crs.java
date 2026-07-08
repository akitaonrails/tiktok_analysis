package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0crs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028380crs {
    public final String LIZ;
    public final C0WOV LIZIZ;
    public final Context LIZJ;
    public final C1029740cu4 LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdHybridContainerOption(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", adHybridContainerType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", adHybridDataModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1028380crs(String str, C0WOV c0wov, Context context, C1029740cu4 c1029740cu4) {
        this.LIZ = str;
        this.LIZIZ = c0wov;
        this.LIZJ = context;
        this.LIZLLL = c1029740cu4;
    }
}
