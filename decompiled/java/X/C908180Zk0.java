package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.Log;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Zk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908180Zk0 implements Closeable {
    public final WeakReference<SQLiteDatabase> LL;
    public byte[] LLILLJJLI;
    public SQLiteCipherSpec LLILLL;
    public final C908220Zk4 LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public C908240Zk6 LLJI;
    public C908240Zk6 LLJIJIL;
    public SQLiteConnection LLJILJILJ;
    public final Object LLILZ = new Object();
    public final AtomicBoolean LLILZIL = new AtomicBoolean();
    public final ArrayList<SQLiteConnection> LLJILJIL = new ArrayList<>();
    public final WeakHashMap<SQLiteConnection, EnumC908230Zk5> LLJILLL = new WeakHashMap<>();

    public final void LIZ() {
        int size = this.LLJILJIL.size();
        for (int i = 0; i < size; i++) {
            LIZIZ((SQLiteConnection) ListProtector.get(this.LLJILJIL, i));
        }
        this.LLJILJIL.clear();
    }

    public final void LJFF() {
        synchronized (this.LLILZ) {
            try {
                LJJJJ();
                this.LLIZLLLIL = false;
                LIZ();
                SQLiteConnection sQLiteConnection = this.LLJILJILJ;
                if (sQLiteConnection != null) {
                    LIZIZ(sQLiteConnection);
                    this.LLJILJILJ = null;
                }
                int size = this.LLJILLL.size();
                if (size != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("The connection pool for ");
                    sbLIZ.append(this.LLILZLL.LIZIZ);
                    sbLIZ.append(" has been closed but there are still ");
                    sbLIZ.append(size);
                    sbLIZ.append(" connections in use.  They will be closed as they are released back to the pool.");
                    Log.LIZJ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ));
                }
                LJJJLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII() {
        synchronized (this.LLILZ) {
            try {
                LJIILL(0, 0L);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJ() {
        SQLiteConnection sQLiteConnection = this.LLJILJILJ;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.LJIILLIIL(this.LLILZLL);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to reconfigure available primary connection, closing it: ");
                sbLIZ.append(this.LLJILJILJ);
                Log.LIZIZ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ), e);
                LIZIZ(this.LLJILJILJ);
                this.LLJILJILJ = null;
            }
        }
        int size = this.LLJILJIL.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = (SQLiteConnection) ListProtector.get(this.LLJILJIL, i);
            try {
                sQLiteConnection2.LJIILLIIL(this.LLILZLL);
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to reconfigure available non-primary connection, closing it: ");
                sbLIZ2.append(sQLiteConnection2);
                Log.LIZIZ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ2), e2);
                LIZIZ(sQLiteConnection2);
                ListProtector.remove(this.LLJILJIL, i);
                size--;
                i--;
            }
            i++;
        }
        LJIILLIIL(EnumC908230Zk5.RECONFIGURE);
    }

    public final void LJJJ() {
        int i = (this.LLILZLL.LIZLLL & 536870912) != 0 ? 4 : 1;
        this.LLIZ = i;
        Log.LIZLLL(Integer.valueOf(i));
    }

    public final void LJJJJ() {
        if (!this.LLIZLLLIL) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: RuntimeException -> 0x0034, TryCatch #0 {RuntimeException -> 0x0034, blocks: (B:6:0x000d, B:9:0x0013, B:16:0x0029, B:13:0x0020), top: B:32:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL() {
        /*
            r8 = this;
            X.0Zk6 r7 = r8.LLJIJIL
            r6 = 0
            r5 = r6
            r4 = 0
            r3 = 0
        L6:
            if (r7 == 0) goto L31
            boolean r0 = r8.LLIZLLLIL
            r2 = 1
            if (r0 == 0) goto L3a
            boolean r0 = r7.LJ     // Catch: java.lang.RuntimeException -> L34
            if (r0 != 0) goto L1e
            if (r4 != 0) goto L1e
            java.lang.String r1 = r7.LJFF     // Catch: java.lang.RuntimeException -> L34
            int r0 = r7.LJI     // Catch: java.lang.RuntimeException -> L34
            com.tencent.wcdb.database.SQLiteConnection r0 = r8.LJJJJJ(r0, r1)     // Catch: java.lang.RuntimeException -> L34
            if (r0 != 0) goto L29
            r4 = 1
        L1e:
            if (r3 != 0) goto L2d
            int r0 = r7.LJI     // Catch: java.lang.RuntimeException -> L34
            com.tencent.wcdb.database.SQLiteConnection r0 = r8.LJJJJJL(r0)     // Catch: java.lang.RuntimeException -> L34
            if (r0 != 0) goto L29
            goto L2c
        L29:
            r7.LJII = r0     // Catch: java.lang.RuntimeException -> L34
            goto L3a
        L2c:
            r3 = 1
        L2d:
            if (r4 == 0) goto L32
            if (r3 == 0) goto L32
        L31:
            return
        L32:
            r2 = 0
            goto L3a
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7.LJIIIIZZ = r0
        L3a:
            X.0Zk6 r1 = r7.LIZ
            if (r2 == 0) goto L4e
            if (r5 == 0) goto L4b
            r5.LIZ = r1
        L42:
            r7.LIZ = r6
            java.lang.Thread r0 = r7.LIZIZ
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L49:
            r7 = r1
            goto L6
        L4b:
            r8.LLJIJIL = r1
            goto L42
        L4e:
            r5 = r7
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C908180Zk0.LJJJLL():void");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteConnectionPool: ");
        sbLIZ.append(this.LLILZLL.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LJFF();
    }

    public final void finalize() throws Throwable {
        super.finalize();
    }

    public static void LIZIZ(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.LIZLLL();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to close connection, its fate is now in the hands of the merciful GC: ");
            sbLIZ.append(sQLiteConnection);
            sbLIZ.append(e.getMessage());
            Log.LIZ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZLLL(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.LLILZ) {
            try {
                if (this.LLJILJILJ != null) {
                    this.LLJILJILJ.LIZJ(arrayList);
                }
                Iterator<SQLiteConnection> it2 = this.LLJILJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(arrayList);
                }
                Iterator<SQLiteConnection> it3 = this.LLJILLL.keySet().iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next().LJIIL(0, 0L, 0L));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILLIIL(EnumC908230Zk5 enumC908230Zk5) {
        if (!this.LLJILLL.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.LLJILLL.size());
            for (Map.Entry<SQLiteConnection, EnumC908230Zk5> entry : this.LLJILLL.entrySet()) {
                EnumC908230Zk5 value = entry.getValue();
                if (enumC908230Zk5 != value && value != EnumC908230Zk5.DISCARD) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.LLJILLL.put((SQLiteConnection) ListProtector.get(arrayList, i), enumC908230Zk5);
            }
        }
    }

    public final void LJIJJLI(C908220Zk4 c908220Zk4) {
        boolean z;
        String str;
        String str2;
        if (c908220Zk4 != null) {
            synchronized (this.LLILZ) {
                try {
                    LJJJJ();
                    if (((c908220Zk4.LIZLLL ^ this.LLILZLL.LIZLLL) & 536870912) != 0) {
                        z = true;
                        if (this.LLJILLL.isEmpty()) {
                            LIZ();
                        } else {
                            throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                        }
                    } else {
                        z = false;
                    }
                    if (c908220Zk4.LJI != this.LLILZLL.LJI && !this.LLJILLL.isEmpty()) {
                        throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    C908220Zk4 c908220Zk42 = this.LLILZLL;
                    if (((c908220Zk42.LIZLLL ^ c908220Zk4.LIZLLL) & 268435473) == 0 && ((str = c908220Zk42.LIZJ) == (str2 = c908220Zk4.LIZJ) || (str != null && str.equals(str2)))) {
                        this.LLILZLL.LIZ(c908220Zk4);
                        LJJJ();
                        int size = this.LLJILJIL.size();
                        while (true) {
                            int i = size - 1;
                            if (size <= this.LLIZ - 1) {
                                break;
                            }
                            LIZIZ((SQLiteConnection) ListProtector.remove(this.LLJILJIL, i));
                            size = i;
                        }
                        LJJ();
                    } else {
                        if (z) {
                            LIZ();
                            SQLiteConnection sQLiteConnection = this.LLJILJILJ;
                            if (sQLiteConnection != null) {
                                LIZIZ(sQLiteConnection);
                                this.LLJILJILJ = null;
                            }
                        }
                        SQLiteConnection sQLiteConnectionLJIJJ = LJIJJ(c908220Zk4, true);
                        LIZ();
                        SQLiteConnection sQLiteConnection2 = this.LLJILJILJ;
                        if (sQLiteConnection2 != null) {
                            LIZIZ(sQLiteConnection2);
                            this.LLJILJILJ = null;
                        }
                        LJIILLIIL(EnumC908230Zk5.DISCARD);
                        this.LLJILJILJ = sQLiteConnectionLJIJJ;
                        this.LLILZLL.LIZ(c908220Zk4);
                        LJJJ();
                    }
                    LJJJLL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }

    public final void LJJIZ(SQLiteConnection sQLiteConnection) {
        synchronized (this.LLILZ) {
            try {
                EnumC908230Zk5 enumC908230Zk5Remove = this.LLJILLL.remove(sQLiteConnection);
                if (enumC908230Zk5Remove != null) {
                    if (!this.LLIZLLLIL) {
                        LIZIZ(sQLiteConnection);
                    } else if (sQLiteConnection.LIZLLL) {
                        if (LJJIL(sQLiteConnection, enumC908230Zk5Remove)) {
                            this.LLJILJILJ = sQLiteConnection;
                        }
                        LJJJLL();
                    } else if (this.LLJILJIL.size() >= this.LLIZ - 1) {
                        LIZIZ(sQLiteConnection);
                    } else {
                        if (LJJIL(sQLiteConnection, enumC908230Zk5Remove)) {
                            this.LLJILJIL.add(sQLiteConnection);
                        }
                        LJJJLL();
                    }
                } else {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final SQLiteConnection LJJJJJL(int i) {
        SQLiteConnection sQLiteConnection = this.LLJILJILJ;
        if (sQLiteConnection != null) {
            this.LLJILJILJ = null;
            LJI(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it2 = this.LLJILLL.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZLLL) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionLJIJJ = LJIJJ(this.LLILZLL, true);
        LJI(sQLiteConnectionLJIJJ, i);
        return sQLiteConnectionLJIJJ;
    }

    public C908180Zk0(SQLiteDatabase sQLiteDatabase, C908220Zk4 c908220Zk4) {
        this.LL = new WeakReference<>(sQLiteDatabase);
        this.LLILZLL = new C908220Zk4(c908220Zk4);
        LJJJ();
    }

    public final void LJI(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.LJIIJ = z;
            this.LLJILLL.put(sQLiteConnection, EnumC908230Zk5.NORMAL);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to prepare acquired connection for session, closing it: ");
            sbLIZ.append(sQLiteConnection);
            sbLIZ.append(", connectionFlags=");
            sbLIZ.append(i);
            Log.LIZ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(sQLiteConnection);
            throw e;
        }
    }

    public final void LJIILL(int i, long j) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread threadU3 = C786410Ut5.u3();
            sb.append("The connection pool for database '");
            sb.append(this.LLILZLL.LIZIZ);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(threadU3.getId());
            sb.append(" (");
            sb.append(threadU3.getName());
            sb.append(") with flags 0x");
            sb.append(Integer.toHexString(i));
            sb.append(" for ");
            sb.append(j * 0.001f);
            sb.append(" seconds.\n");
        }
        ArrayList<String> arrayList = new ArrayList();
        int i3 = 0;
        if (!this.LLJILLL.isEmpty()) {
            Iterator<SQLiteConnection> it2 = this.LLJILLL.keySet().iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                C908200Zk2 c908200Zk2 = it2.next().LJII;
                synchronized (c908200Zk2.LIZ) {
                    try {
                        C908210Zk3 c908210Zk3 = c908200Zk2.LIZ[c908200Zk2.LIZIZ];
                        if (c908210Zk3 != null && !c908210Zk3.LJFF) {
                            StringBuilder sb2 = new StringBuilder();
                            c908210Zk3.LIZ(sb2);
                            String string = sb2.toString();
                            if (string != null) {
                                arrayList.add(string);
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                i4++;
            }
            i2 = i3;
            i3 = i4;
        } else {
            i2 = 0;
        }
        int size = this.LLJILJIL.size();
        if (this.LLJILJILJ != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i2);
        sb.append(" active, ");
        sb.append(i3);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            for (String str : arrayList) {
                sb.append("  ");
                sb.append(str);
                sb.append("\n");
            }
        }
        Log.LJ("WCDB.SQLiteConnectionPool", sb.toString());
        this.LL.get();
    }

    public final SQLiteConnection LJIJJ(C908220Zk4 c908220Zk4, boolean z) {
        int i = this.LLJ;
        this.LLJ = i + 1;
        SQLiteConnection sQLiteConnection = new SQLiteConnection(this, c908220Zk4, i, z, this.LLILLJJLI, this.LLILLL);
        try {
            sQLiteConnection.LJIILJJIL();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            SQLiteDebug.LIZ(sQLiteConnection);
            sQLiteConnection.LIZLLL();
            throw e;
        }
    }

    public final boolean LJJIL(SQLiteConnection sQLiteConnection, EnumC908230Zk5 enumC908230Zk5) {
        if (enumC908230Zk5 == EnumC908230Zk5.RECONFIGURE) {
            try {
                sQLiteConnection.LJIILLIIL(this.LLILZLL);
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to reconfigure released connection, closing it: ");
                sbLIZ.append(sQLiteConnection);
                Log.LIZIZ("WCDB.SQLiteConnectionPool", C2188811AlT.LIZIZ(sbLIZ), e);
                enumC908230Zk5 = EnumC908230Zk5.DISCARD;
            }
        }
        if (enumC908230Zk5 != EnumC908230Zk5.DISCARD) {
            return true;
        }
        LIZIZ(sQLiteConnection);
        return false;
    }

    public final SQLiteConnection LJJJJJ(int i, String str) {
        int size = this.LLJILJIL.size();
        if (size > 1) {
            if (str != null) {
                int i2 = 0;
                do {
                    SQLiteConnection sQLiteConnection = (SQLiteConnection) ListProtector.get(this.LLJILJIL, i2);
                    if (sQLiteConnection.LJFF.LIZIZ(str) != null) {
                        ListProtector.remove(this.LLJILJIL, i2);
                        LJI(sQLiteConnection, i);
                        return sQLiteConnection;
                    }
                    i2++;
                } while (i2 < size);
            }
        } else if (size <= 0) {
            int size2 = this.LLJILLL.size();
            if (this.LLJILJILJ != null) {
                size2++;
            }
            if (size2 >= this.LLIZ) {
                return null;
            }
            SQLiteConnection sQLiteConnectionLJIJJ = LJIJJ(this.LLILZLL, false);
            LJI(sQLiteConnectionLJIJJ, i);
            return sQLiteConnectionLJIJJ;
        }
        SQLiteConnection sQLiteConnection2 = (SQLiteConnection) ListProtector.remove(this.LLJILJIL, size - 1);
        LJI(sQLiteConnection2, i);
        return sQLiteConnection2;
    }

    public static C908180Zk0 LJIIZILJ(SQLiteDatabase sQLiteDatabase, C908220Zk4 c908220Zk4, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        if (c908220Zk4 != null) {
            C908180Zk0 c908180Zk0 = new C908180Zk0(sQLiteDatabase, c908220Zk4);
            c908180Zk0.LLILLJJLI = bArr;
            if (sQLiteCipherSpec == null) {
                sQLiteCipherSpec2 = null;
            } else {
                sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
            }
            c908180Zk0.LLILLL = sQLiteCipherSpec2;
            c908180Zk0.LLJILJILJ = c908180Zk0.LJIJJ(c908180Zk0.LLILZLL, true);
            c908180Zk0.LLIZLLLIL = true;
            return c908180Zk0;
        }
        throw new IllegalArgumentException("configuration must not be null.");
    }
}
