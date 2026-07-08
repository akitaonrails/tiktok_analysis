package X;

import com.bytedance.im.core.proto.MediaUploadConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YHF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHF {
    public final C0YH7 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0YHE(this));

    public C0YHF(C0YH7 c0yh7) {
        this.LIZ = c0yh7;
    }

    public final MediaUploadConfig LIZ(int i) {
        try {
            String string = ((C0YEV) this.LIZIZ.getValue()).getString(LIZIZ(i), "");
            if (string == null || string.length() == 0) {
                return null;
            }
            return (MediaUploadConfig) C09EF.LIZ.LJII(string, MediaUploadConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String LIZIZ(int i) {
        long jLIZIZ = this.LIZ.getConfig().LIZIZ();
        int bizId = this.LIZ.getConfig().LIZ.LJFF().getBizId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key:");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(bizId);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
