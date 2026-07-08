package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.010F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010F {
    public static final String LIZ(long j) {
        if (j < 0) {
            return "-";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((float) Math.floor(((j * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT) * r3)) / 10);
            sbLIZ.append('K');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j < 1000000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(((float) Math.floor(((j * 1.0f) / 1000000) * r3)) / 10);
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(((float) Math.floor(((j * 1.0f) / 1000000000) * r3)) / 10);
        sbLIZ3.append('B');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
