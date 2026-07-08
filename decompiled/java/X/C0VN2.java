package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VN2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VN2 extends C0VOE {
    public C796520VMk LIZIZ;
    public final C0VN3 LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.C0VOE
    public final void LIZIZ() {
    }

    @Override // X.C0VOE
    public final void LIZJ(C0VOI c0voi) {
        Cursor cursorQuery = c0voi.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) == 0) {
                    z = true;
                }
            }
            cursorQuery.close();
            this.LIZJ.createAllTables(c0voi);
            if (!z) {
                C0VN4 c0vn4OnValidateSchema = this.LIZJ.onValidateSchema(c0voi);
                if (!c0vn4OnValidateSchema.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Pre-packaged database has an invalid schema: ");
                    sbLIZ.append(c0vn4OnValidateSchema.LIZIZ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            LJI(c0voi);
            this.LIZJ.onCreate(c0voi);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // X.C0VOE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C0VOI r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r1 = r6.query(r0)
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L88
            r3 = 0
            if (r0 == 0) goto L15
            int r0 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            r1.close()
            r4 = 0
            if (r0 == 0) goto L56
            X.0VN1 r1 = new X.0VN1
            java.lang.String r0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r0, r4)
            android.database.Cursor r2 = r6.LJLLLL(r1)
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L32
            java.lang.String r1 = r2.getString(r3)     // Catch: java.lang.Throwable -> L4e
            goto L33
        L32:
            r1 = r4
        L33:
            r2.close()
            java.lang.String r0 = r5.LIZLLL
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L68
            java.lang.String r0 = r5.LJ
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L68
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r1.<init>(r0)
            throw r1
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4e
            r2.close()
            throw r0
        L56:
            X.0VN3 r0 = r5.LIZJ
            X.0VN4 r3 = r0.onValidateSchema(r6)
            boolean r0 = r3.LIZ
            if (r0 == 0) goto L70
            X.0VN3 r0 = r5.LIZJ
            r0.onPostMigrate(r6)
            r5.LJI(r6)
        L68:
            X.0VN3 r0 = r5.LIZJ
            r0.onOpen(r6)
            r5.LIZIZ = r4
            return
        L70:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VN2.LJ(X.0VOI):void");
    }

    public final void LJI(C0VOI c0voi) {
        c0voi.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sbLIZ.append(str);
        sbLIZ.append("')");
        c0voi.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0VOE
    public final void LIZLLL(C0VOI c0voi, int i, int i2) {
        LJFF(c0voi, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r4 != 0) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac A[EDGE_INSN: B:53:0x00ac->B:42:0x00ac BREAK  A[LOOP:1: B:15:0x0033->B:28:0x0065], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // X.C0VOE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C0VOI r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VN2.LJFF(X.0VOI, int, int):void");
    }

    public C0VN2(C796520VMk c796520VMk, C0VN3 c0vn3, String str, String str2) {
        super(c0vn3.version);
        this.LIZIZ = c796520VMk;
        this.LIZJ = c0vn3;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
