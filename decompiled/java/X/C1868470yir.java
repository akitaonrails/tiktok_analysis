package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0yir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868470yir {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(long j) {
        String strValueOf;
        String strValueOf2;
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        long j4 = j2 / j3;
        long j5 = j2 % j3;
        long j6 = j4 % j3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (j6 < 10) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
            sbLIZ2.append(j6);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strValueOf = String.valueOf(j6);
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append(':');
        if (j5 < 10) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('0');
            sbLIZ3.append(j5);
            strValueOf2 = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            strValueOf2 = String.valueOf(j5);
        }
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(long j) {
        String strValueOf;
        String strValueOf2;
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long j3 = 60;
        long j4 = j2 % j3;
        long j5 = (j2 / j3) % j3;
        if (j5 <= 0 && j2 <= 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j4);
            sbLIZ2.append('s');
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        if (j5 < 10) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append('0');
            sbLIZ4.append(j5);
            strValueOf = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            strValueOf = String.valueOf(j5);
        }
        sbLIZ3.append(strValueOf);
        sbLIZ3.append(':');
        if (j4 < 10) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append('0');
            sbLIZ5.append(j4);
            strValueOf2 = C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            strValueOf2 = String.valueOf(j4);
        }
        sbLIZ3.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
