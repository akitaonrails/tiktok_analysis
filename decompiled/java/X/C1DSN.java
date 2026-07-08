package X;

import android.os.Build;

/* JADX INFO: renamed from: X.1DSN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DSN extends C1DST {
    public final String LIZIZ = C1DSL.LIZJ("ro.letv.release.version");

    @Override // X.C1DST
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eui_");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("_");
        sbLIZ.append(Build.DISPLAY);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
