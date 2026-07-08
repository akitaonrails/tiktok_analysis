package X;

import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VI3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI3 {
    public final WorkDatabase LIZ;

    public C0VI3(WorkDatabase workDatabase) {
        this.LIZ = workDatabase;
    }

    public final int LIZ(String str) {
        int iIntValue;
        this.LIZ.beginTransaction();
        try {
            Long lLIZ = ((C0VI4) this.LIZ.LIZIZ()).LIZ(str);
            int i = 0;
            if (lLIZ != null) {
                iIntValue = lLIZ.intValue();
                if (iIntValue != Integer.MAX_VALUE) {
                }
                ((C0VI4) this.LIZ.LIZIZ()).LIZIZ(new C0VIB(str, i));
                this.LIZ.setTransactionSuccessful();
                this.LIZ.endTransaction();
                return iIntValue;
            }
            iIntValue = 0;
            i = iIntValue + 1;
            ((C0VI4) this.LIZ.LIZIZ()).LIZIZ(new C0VIB(str, i));
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    public final int LIZIZ(int i) {
        int iLIZ;
        synchronized (C0VI3.class) {
            try {
                iLIZ = LIZ("next_job_scheduler_id");
                if (iLIZ < 0 || iLIZ > i) {
                    ((C0VI4) this.LIZ.LIZIZ()).LIZIZ(new C0VIB("next_job_scheduler_id", 1));
                    iLIZ = 0;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLIZ;
    }
}
