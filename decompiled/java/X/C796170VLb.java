package X;

import Y.ACallableS245S0200000_13;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796170VLb implements InterfaceC351940Dqy {
    public final AbstractC796540VMm LIZ;
    public final C796180VLc LIZIZ;
    public final C0VLE LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VLc] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VLE] */
    public C796170VLb(final AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new AbstractC796330VLr<C353310DtB>(abstractC796540VMm) { // from class: X.0VLc
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "INSERT OR ABORT INTO `Record` (`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // X.AbstractC796330VLr
            public final void bind(InterfaceC796340VLs interfaceC796340VLs, C353310DtB c353310DtB) {
                C353310DtB c353310DtB2 = c353310DtB;
                interfaceC796340VLs.LJIJ(1, c353310DtB2.LIZ);
                Long l = c353310DtB2.LIZIZ;
                if (l == null) {
                    interfaceC796340VLs.LLD(2);
                } else {
                    interfaceC796340VLs.LJIJ(2, l.longValue());
                }
                String str = c353310DtB2.LIZJ;
                if (str == null) {
                    interfaceC796340VLs.LLD(3);
                } else {
                    interfaceC796340VLs.LJIILIIL(3, str);
                }
                if (c353310DtB2.LIZLLL == null) {
                    interfaceC796340VLs.LLD(4);
                } else {
                    interfaceC796340VLs.LJIJ(4, r0.intValue());
                }
            }
        };
        this.LIZJ = new AbstractC795470VIj(abstractC796540VMm) { // from class: X.0VLE
            @Override // X.AbstractC795470VIj
            public final String createQuery() {
                return "DELETE FROM record WHERE rid = ?";
            }
        };
    }

    @Override // X.InterfaceC351940Dqy
    public final List<C353310DtB> LIZIZ(Integer num) {
        Long lValueOf;
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM record where share_type = ? order by time desc limit 10");
        if (num == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIJ(1, num.intValue());
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "rid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "channel");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "share_type");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                C353310DtB c353310DtB = new C353310DtB();
                c353310DtB.LIZ = cursorLIZIZ.getInt(iLIZIZ);
                Integer numValueOf = null;
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                }
                c353310DtB.LIZIZ = lValueOf;
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ3);
                }
                c353310DtB.LIZJ = string;
                if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                    numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ4));
                }
                c353310DtB.LIZLLL = numValueOf;
                arrayList.add(c353310DtB);
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

    @Override // X.InterfaceC351940Dqy
    public final void LIZLLL(C353310DtB c353310DtB) {
        this.LIZ.assertNotSuspendingTransaction();
        this.LIZ.beginTransaction();
        try {
            insert(c353310DtB);
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            throw th;
        }
    }

    @Override // X.InterfaceC351940Dqy
    public final void LJ(Integer num) {
        this.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        if (num == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIJ(1, num.intValue());
        }
        this.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            this.LIZ.setTransactionSuccessful();
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.endTransaction();
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    @Override // X.InterfaceC351940Dqy
    public final List<C353310DtB> LIZ(Integer num, Integer num2) {
        Long lValueOf;
        String string;
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM record where share_type = ? order by time desc limit ?");
        if (num == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIJ(1, num.intValue());
        }
        if (num2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIJ(2, num2.intValue());
        }
        this.LIZ.assertNotSuspendingTransaction();
        Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
        try {
            int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "rid");
            int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "time");
            int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "channel");
            int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "share_type");
            ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
            while (cursorLIZIZ.moveToNext()) {
                C353310DtB c353310DtB = new C353310DtB();
                c353310DtB.LIZ = cursorLIZIZ.getInt(iLIZIZ);
                Integer numValueOf = null;
                if (cursorLIZIZ.isNull(iLIZIZ2)) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorLIZIZ.getLong(iLIZIZ2));
                }
                c353310DtB.LIZIZ = lValueOf;
                if (cursorLIZIZ.isNull(iLIZIZ3)) {
                    string = null;
                } else {
                    string = cursorLIZIZ.getString(iLIZIZ3);
                }
                c353310DtB.LIZJ = string;
                if (!cursorLIZIZ.isNull(iLIZIZ4)) {
                    numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ4));
                }
                c353310DtB.LIZLLL = numValueOf;
                arrayList.add(c353310DtB);
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

    @Override // X.InterfaceC351940Dqy
    public final C11LF LIZJ(Integer num, Integer num2) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM record where share_type = ? order by time desc limit ?");
        if (num == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIJ(1, num.intValue());
        }
        if (num2 == null) {
            c0vn5LIZLLL.LLD(2);
        } else {
            c0vn5LIZLLL.LJIJ(2, num2.intValue());
        }
        return AbstractC19483511Kn.LJIIJJI(new ACallableS245S0200000_13(this, c0vn5LIZLLL, 26));
    }
}
