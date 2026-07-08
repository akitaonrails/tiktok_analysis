package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Zk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908200Zk2 {
    public final C908210Zk3[] LIZ = new C908210Zk3[20];
    public int LIZIZ;
    public int LIZJ;
    public final /* synthetic */ SQLiteConnection LIZLLL;

    public C908200Zk2(SQLiteConnection sQLiteConnection) {
        this.LIZLLL = sQLiteConnection;
    }

    public static boolean LIZLLL(C908210Zk3 c908210Zk3) {
        if (c908210Zk3 != null) {
            c908210Zk3.LIZIZ = System.currentTimeMillis();
            c908210Zk3.LJFF = true;
            Exception exc = c908210Zk3.LJI;
            if (exc != null && exc.getMessage() != null) {
                return true;
            }
            long j = c908210Zk3.LIZIZ - c908210Zk3.LIZ;
            int i = SQLiteDebug.LIZ;
            if (j > 300) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LIZIZ(int i) {
        String str;
        synchronized (this.LIZ) {
            try {
                C908210Zk3 c908210Zk3LJFF = LJFF(i);
                if (LIZLLL(c908210Zk3LJFF)) {
                    LJII(c908210Zk3LJFF, null);
                }
                str = c908210Zk3LJFF.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!"prepare".equals(str)) {
            this.LIZLLL.LIZ.LL.get();
        }
    }

    public final boolean LIZJ(int i) {
        synchronized (this.LIZ) {
            try {
                C908210Zk3 c908210Zk3LJFF = LJFF(i);
                if (c908210Zk3LJFF == null) {
                    return false;
                }
                boolean zLIZLLL = LIZLLL(c908210Zk3LJFF);
                String str = c908210Zk3LJFF.LIZJ;
                if (!"prepare".equals(str)) {
                    this.LIZLLL.LIZ.LL.get();
                }
                return zLIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C908210Zk3 LJFF(int i) {
        C908210Zk3 c908210Zk3 = this.LIZ[i & 255];
        if (c908210Zk3.LJII != i) {
            return null;
        }
        return c908210Zk3;
    }

    public static void LJII(C908210Zk3 c908210Zk3, String str) {
        StringBuilder sb = new StringBuilder();
        c908210Zk3.LIZ(sb);
        if (str != null) {
            sb.append(", ");
            sb.append(str);
        }
        Log.LIZJ("WCDB.SQLiteConnection", sb.toString());
    }

    public final void LJ(int i, Exception exc) {
        synchronized (this.LIZ) {
            try {
                C908210Zk3 c908210Zk3LJFF = LJFF(i);
                if (c908210Zk3LJFF != null) {
                    c908210Zk3LJFF.LJI = exc;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(int i, String str) {
        synchronized (this.LIZ) {
            try {
                C908210Zk3 c908210Zk3LJFF = LJFF(i);
                if (c908210Zk3LJFF != null) {
                    LJII(c908210Zk3LJFF, str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C908210Zk3 LIZ(String str, String str2, Object[] objArr) {
        C908210Zk3 c908210Zk3;
        synchronized (this.LIZ) {
            try {
                int i = (this.LIZIZ + 1) % 20;
                c908210Zk3 = this.LIZ[i];
                if (c908210Zk3 == null) {
                    c908210Zk3 = new C908210Zk3();
                    this.LIZ[i] = c908210Zk3;
                } else {
                    c908210Zk3.LJFF = false;
                    c908210Zk3.LJI = null;
                    ArrayList<Object> arrayList = c908210Zk3.LJ;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                c908210Zk3.LIZ = System.currentTimeMillis();
                c908210Zk3.LIZJ = str;
                c908210Zk3.LIZLLL = str2;
                if (objArr != null) {
                    ArrayList<Object> arrayList2 = c908210Zk3.LJ;
                    if (arrayList2 == null) {
                        c908210Zk3.LJ = new ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj != null && (obj instanceof byte[])) {
                            c908210Zk3.LJ.add(SQLiteConnection.LJIILLIIL);
                        } else {
                            c908210Zk3.LJ.add(obj);
                        }
                    }
                }
                int i2 = this.LIZJ;
                this.LIZJ = i2 + 1;
                c908210Zk3.LJII = (i2 << 8) | i;
                c908210Zk3.LJIIIIZZ = this.LIZLLL.LJIIIIZZ;
                this.LIZIZ = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c908210Zk3;
    }
}
