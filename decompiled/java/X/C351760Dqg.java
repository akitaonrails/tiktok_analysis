package X;

import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0Dqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351760Dqg {
    public static final String LIZ(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        StringBuilder sbLIZ;
        int i;
        int i2 = vEVideoFileInfo.rotation;
        if (i2 != 90 && i2 != 270) {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(vEVideoFileInfo.width);
            sbLIZ.append('*');
            i = vEVideoFileInfo.height;
        } else {
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(vEVideoFileInfo.height);
            sbLIZ.append('*');
            i = vEVideoFileInfo.width;
        }
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
