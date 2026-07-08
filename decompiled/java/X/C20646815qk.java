package X;

import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachStorageConfig;

/* JADX INFO: renamed from: X.15qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20646815qk {
    public static boolean LIZ(Long l) {
        if (l == null) {
            C20571715ed.LIZ.getClass();
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = jCurrentTimeMillis - l.longValue();
        C20571715ed c20571715ed = C20571715ed.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInvalidPopup, currentTime:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", showTime:");
        sbLIZ.append(l);
        sbLIZ.append(", duration:");
        sbLIZ.append(jLongValue);
        C2188811AlT.LIZIZ(sbLIZ);
        c20571715ed.getClass();
        if (jLongValue >= ((OutreachStorageConfig) C20646915ql.LIZIZ.getValue()).dispersionQuotaDelayTimeAndroid) {
            return false;
        }
        return true;
    }
}
