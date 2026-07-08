package X;

import android.app.Activity;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.1AxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2196081AxC {
    public TuxSheet LIZ;

    public abstract boolean LIZ();

    public abstract void LIZJ(Activity activity);

    public abstract TuxSheet LIZLLL();

    public final void LIZIZ(Activity activity) {
        boolean zLIZ = LIZ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMockUI, context:");
        sbLIZ.append(activity);
        sbLIZ.append(", isMockDebugEnv:");
        sbLIZ.append(zLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZJ(activity);
    }
}
