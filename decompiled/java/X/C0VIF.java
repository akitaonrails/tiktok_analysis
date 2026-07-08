package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VIF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VIF implements InterfaceC795130VHb {
    public final AbstractC796540VMm LIZ;
    public final C854550Xfh LIZIZ;
    public final C854550Xfh LIZJ;

    public final void LIZIZ() {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZJ.acquire();
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

    public C0VIF(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        new C854570Xfj(abstractC796540VMm, 16);
        this.LIZIZ = new C854550Xfh(abstractC796540VMm, 46);
        this.LIZJ = new C854550Xfh(abstractC796540VMm, 47);
    }

    public final void LIZ(String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZIZ.acquire();
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
            this.LIZIZ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZIZ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }
}
