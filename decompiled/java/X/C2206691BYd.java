package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* JADX INFO: renamed from: X.1BYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206691BYd {
    public static volatile C2206691BYd LIZIZ;
    public final SharedPreferences LIZ;

    public C2206691BYd(Context context) {
        this.LIZ = C810670Vr7.LIZJ(C786410Ut5.N3(context), 0, "asve_sp");
    }

    public final void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraAntiShakeV1 -> setCameraAntiShakeMode: mode = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CameraAntiShakeV1 -> setCameraAntiShakeMode: ");
        sbLIZ2.append(Log.getStackTraceString(new RuntimeException()));
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LIZ.edit().putInt("key_camera_shake_mode", i).apply();
    }
}
