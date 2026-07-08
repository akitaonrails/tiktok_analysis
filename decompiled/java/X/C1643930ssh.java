package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0ssh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643930ssh {
    public final String LIZ = "";
    public final Keva LIZIZ;

    public C1643930ssh() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraFilterStrategyResId_Repo");
        sbLIZ.append("");
        this.LIZIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final String LIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.LIZIZ.getString("CameraFilter_Selected_Front_Filter", "");
            }
            throw new IllegalArgumentException("cameraPosition must be CAMERA_FACING_BACK or CAMERA_FACING_FRONT");
        }
        return this.LIZIZ.getString("CameraFilter_Selected_Back_Filter", "");
    }
}
