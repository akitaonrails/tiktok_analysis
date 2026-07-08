package X;

import android.app.Application;

/* JADX INFO: renamed from: X.1Bcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208841Bcg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Application application) {
        if (!C2208851Bch.LIZ() && !C2208851Bch.LIZIZ()) {
            C201955140j.LIZ("CameraAntiShakeV1 -> initialize cameraAntiShakeMode = SHAKE_FREE_NOT_SET");
            C2206701BYe.LIZ(application).LIZIZ(0);
        } else {
            C201955140j.LIZ("CameraAntiShakeV1 -> initialize cameraAntiShakeMode = SHAKE_FREE_ENABLE");
            C2206701BYe.LIZ(application).LIZIZ(1);
        }
    }
}
