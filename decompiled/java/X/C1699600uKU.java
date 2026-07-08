package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699600uKU {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;

    public C1699600uKU() {
        try {
            String[] strArrSplit = "05:00".split(":");
            this.LIZ = CastIntegerProtector.parseInt(strArrSplit[0]);
            this.LIZIZ = CastIntegerProtector.parseInt(strArrSplit[1]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ = 5;
            this.LIZIZ = 0;
        }
        this.LIZJ = 0;
    }
}
