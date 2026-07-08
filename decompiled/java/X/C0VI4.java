package X;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VI4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI4 implements InterfaceC795340VHw {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;

    public C0VI4(WorkDatabase workDatabase) {
        this.LIZ = workDatabase;
        this.LIZIZ = new C854570Xfj(workDatabase, 13);
    }

    public final Long LIZ(String str) {
        Long lValueOf;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT long_value FROM Preference where `key`=?");
        c0vn5LIZLLL.LJIILIIL(1, str);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst() && !cursorLIZIZ.isNull(0)) {
                lValueOf = Long.valueOf(cursorLIZIZ.getLong(0));
            } else {
                lValueOf = null;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final void LIZIZ(C0VIB c0vib) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            this.LIZIZ.insert(c0vib);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }
}
