package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VI9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI9 implements InterfaceC795100VGy {
    public final AbstractC796540VMm LIZ;
    public final C854570Xfj LIZIZ;
    public final C854550Xfh LIZJ;

    public C0VI9(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854570Xfj(abstractC796540VMm, 14);
        this.LIZJ = new C854550Xfh(abstractC796540VMm, 45);
    }

    public final C0VH0 LIZ(String str) {
        C0VH0 c0vh0;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "work_spec_id");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "system_id");
            if (cursorLIZIZ.moveToFirst()) {
                c0vh0 = new C0VH0(cursorLIZIZ.getString(iLIZIZ), cursorLIZIZ.getInt(iLIZIZ2));
            } else {
                c0vh0 = null;
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return c0vh0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    public final void LIZIZ(C0VH0 c0vh0) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            this.LIZIZ.insert(c0vh0);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    public final void LIZJ(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZJ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }
}
