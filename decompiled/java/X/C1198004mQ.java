package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.anchor.sensor.ExposureRecord;

/* JADX INFO: renamed from: X.04mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1198004mQ {
    public static final ExposureRecord LIZ(String str) {
        try {
            C1227904rF.LIZ.getClass();
            return (ExposureRecord) C1227904rF.LIZLLL().LJII(str, ExposureRecord.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("something was wrong when getExposureRecord, e=");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }
}
