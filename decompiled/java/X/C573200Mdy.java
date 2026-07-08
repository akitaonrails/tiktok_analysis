package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;

/* JADX INFO: renamed from: X.0Mdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573200Mdy {
    public static final boolean LIZ() {
        return LIZIZ().width >= 1080;
    }

    @InterfaceC1294060jmO
    public static final CompileConfigResolution LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("enable_1080p_photo_to_video", false);
        int i = zLIZ ? 1080 : 720;
        int i2 = zLIZ ? 1920 : 1280;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoMVMaxResolution v1 , maxResolution = (");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        C564000MAc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return new CompileConfigResolution(i, i2, null, null, 12, null);
    }
}
