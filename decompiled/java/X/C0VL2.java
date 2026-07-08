package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VL2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VL2 implements InterfaceC612860O2a {
    public final AbstractC796540VMm LIZ;
    public final C854560Xfi LIZIZ;
    public final C211700rj LIZJ = new C211700rj();
    public final C854550Xfh LIZLLL;
    public final C854550Xfh LJ;

    public C0VL2(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C854560Xfi(this, abstractC796540VMm, 0);
        this.LIZLLL = new C854550Xfh(abstractC796540VMm, 31);
        this.LJ = new C854550Xfh(abstractC796540VMm, 32);
    }

    @Override // X.InterfaceC612860O2a
    public final void LIZ(List<C0VL3> list) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            this.LIZIZ.insert((Iterable) list);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC612860O2a
    public final void LJ(long j) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJ.acquire();
        interfaceC796340VLsAcquire.LJIJ(1, j);
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC612860O2a
    public final int LJFF(String str) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT count(*) FROM aweme_detail where api_path = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        this.LIZ.assertNotSuspendingTransaction();
        int i = 0;
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            if (cursorLIZIZ.moveToFirst()) {
                i = cursorLIZIZ.getInt(0);
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC612860O2a
    public final List LIZIZ(long j, String str) {
        String string;
        String string2;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM aweme_detail where api_path = ? and start_time > ?");
        c0vn5LIZLLL.LJIILIIL(1, str);
        c0vn5LIZLLL.LJIJ(2, j);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_id");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "api_path");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "start_time");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                String string3 = null;
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ2);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                    string3 = cursorLIZIZ.getString(iLIZIZ3);
                }
                this.LIZJ.getClass();
                Aweme awemeLIZ = C211700rj.LIZ(string3);
                if (awemeLIZ != null) {
                    arrayList.add(new C0VL3(cursorLIZIZ.getLong(iLIZIZ4), awemeLIZ, string, string2));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.android.ugc.aweme.feed.model.Aweme, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }

    @Override // X.InterfaceC612860O2a
    public final void LIZLLL(int i, String str) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = this.LIZLLL.acquire();
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, str);
        }
        interfaceC796340VLsAcquire.LJIJ(2, i);
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            this.LIZLLL.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC612860O2a
    public final C0VL3 LIZJ(long j, String str, String str2) {
        String string;
        String string2;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(3, "SELECT * FROM aweme_detail where aweme_id = ? and api_path = ? and start_time > ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        if (str2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIILIIL(2, str2);
        }
        c0vn5LIZLLL.LJIJ(3, j);
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "aweme_id");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "api_path");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "data");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "start_time");
            C0VL3 c0vl3 = null;
            String string3 = null;
            if (cursorLIZIZ.moveToFirst()) {
                if (cursorLIZIZ.isNull(iLIZIZ)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ);
                }
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    string2 = null;
                } else {
                    string2 = cursorLIZIZ.getString(iLIZIZ2);
                }
                if (!cursorLIZIZ.isNull(iLIZIZ3)) {
                    string3 = cursorLIZIZ.getString(iLIZIZ3);
                }
                this.LIZJ.getClass();
                Aweme awemeLIZ = C211700rj.LIZ(string3);
                if (awemeLIZ != null) {
                    c0vl3 = new C0VL3(cursorLIZIZ.getLong(iLIZIZ4), awemeLIZ, string, string2);
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.android.ugc.aweme.feed.model.Aweme, but it was null.");
                }
            }
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            return c0vl3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorLIZIZ.close();
            c0vn5LIZLLL.release();
            throw th;
        }
    }
}
