package X;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.1DSM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DSM extends C1DST {
    public final String LIZIZ = C1DSL.LIZJ("ro.build.version.emui");

    @Override // X.C1DST
    public final String LIZ() {
        if (TextUtils.isEmpty(this.LIZIZ) || !this.LIZIZ.toLowerCase(C1DST.LIZ).contains("emotionui")) {
            String str = Build.DISPLAY;
            return str == null ? "unknown" : str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("_");
        sbLIZ.append(Build.DISPLAY);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
