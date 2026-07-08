package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YCC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YCC implements C0YBF {
    public final C0YEM LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1379));

    public final C0YCZ LJFF() {
        return (C0YCZ) this.LIZJ.getValue();
    }

    public C0YCC(C0YEM c0yem) {
        this.LIZIZ = c0yem;
    }

    public static List LJ(InterfaceC869470Y8z interfaceC869470Y8z) {
        int columnIndex = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_ID.getKey());
        int columnIndex2 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_CURSOR.getKey());
        int columnIndex3 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_SERVER_MESSAGE_ID.getKey());
        int columnIndex4 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_CREATED_AT.getKey());
        int columnIndex5 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_UPDATED_AT.getKey());
        int columnIndex6 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_PROCESS_RESULT.getKey());
        int columnIndex7 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_INBOX_TYPE.getKey());
        int columnIndex8 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_CHAIN_TYPE.getKey());
        int columnIndex9 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_SUB_ERROR_CODE.getKey());
        int columnIndex10 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_CONVERSATION_ID.getKey());
        int columnIndex11 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_MESSAGE_ID.getKey());
        int columnIndex12 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_MESSAGE_TYPE.getKey());
        int columnIndex13 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_SUB_MESSAGE_TYPE.getKey());
        int columnIndex14 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_DURATION.getKey());
        int columnIndex15 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_LOG_ID.getKey());
        int columnIndex16 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_ERROR_MSG.getKey());
        int columnIndex17 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_MESSAGE_SOURCE.getKey());
        int columnIndex18 = interfaceC869470Y8z.getColumnIndex(C0YCB.COLUMN_ERROR_CODE.getKey());
        ArrayList arrayList = new ArrayList();
        while (interfaceC869470Y8z.moveToNext()) {
            int i = interfaceC869470Y8z.getInt(columnIndex);
            long j = interfaceC869470Y8z.getLong(columnIndex2);
            long j2 = interfaceC869470Y8z.getLong(columnIndex3);
            long j3 = interfaceC869470Y8z.getLong(columnIndex4);
            long j4 = interfaceC869470Y8z.getLong(columnIndex5);
            int i2 = interfaceC869470Y8z.getInt(columnIndex6);
            int i3 = interfaceC869470Y8z.getInt(columnIndex7);
            int i4 = interfaceC869470Y8z.getInt(columnIndex8);
            String string = interfaceC869470Y8z.getString(columnIndex9);
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = interfaceC869470Y8z.getString(columnIndex10);
            if (string2 == null) {
                string2 = "";
            }
            String string3 = interfaceC869470Y8z.getString(columnIndex11);
            if (string3 == null) {
                string3 = "";
            }
            String string4 = interfaceC869470Y8z.getString(columnIndex12);
            if (string4 == null) {
                string4 = "";
            }
            int i5 = interfaceC869470Y8z.getInt(columnIndex13);
            long j5 = interfaceC869470Y8z.getLong(columnIndex14);
            String string5 = interfaceC869470Y8z.getString(columnIndex15);
            if (string5 == null) {
                string5 = "";
            }
            String string6 = interfaceC869470Y8z.getString(columnIndex16);
            if (string6 == null) {
                string6 = "";
            }
            int i6 = interfaceC869470Y8z.getInt(columnIndex17);
            String string7 = interfaceC869470Y8z.getString(columnIndex18);
            if (string7 != null) {
                str = string7;
            }
            arrayList.add(new C0YCG(i, j, j2, j3, j4, i2, i3, i4, string, string2, string3, string4, i5, j5, string5, string6, i6, str));
        }
        return arrayList;
    }

    @Override // X.C0YBF
    public final boolean LIZ(C0YCG c0ycg) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "insertOrUpdate, start", 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT ");
        C0YCB c0ycb = C0YCB.COLUMN_ID;
        sbLIZ.append(c0ycb.getKey());
        sbLIZ.append(", ");
        C0YCB c0ycb2 = C0YCB.COLUMN_PROCESS_RESULT;
        sbLIZ.append(c0ycb2.getKey());
        sbLIZ.append(" FROM status_message_result\n            WHERE ");
        sbLIZ.append(C0YCB.COLUMN_CURSOR.getKey());
        sbLIZ.append(" = ?\n        ");
        boolean zLJII = true;
        try {
            try {
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = LJFF().getProxy().LJIIJJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), "insertOrUpdateStatusMessageResult", new String[]{String.valueOf(c0ycg.LIZIZ)});
                if (interfaceC869470Y8zLJIIJJI == null) {
                    LJFF().LIZ().getClass();
                    return false;
                }
                if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0ycb.getKey());
                    int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(c0ycb2.getKey());
                    int i = interfaceC869470Y8zLJIIJJI.getInt(columnIndex);
                    if (interfaceC869470Y8zLJIIJJI.getInt(columnIndex2) != 0) {
                        zLJII = LJII(C0YCG.LIZ(c0ycg, i, System.currentTimeMillis()));
                    }
                    LJFF().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return zLJII;
                }
                boolean zLJI = LJI(c0ycg);
                LJFF().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return zLJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "insertOrUpdate, failed", e);
                this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMStatusMessageResultDao: insertOrUpdate", e);
                LJFF().LIZ().LIZ(null);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJFF().LIZ().LIZ(null);
            throw th;
        }
    }

    public final boolean LJI(C0YCG c0ycg) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "insert, start", 4);
        try {
            InterfaceC869960YAw interfaceC869960YAwLIZ = LJFF().getProxy().LIZ(C09AZ.LIZJ("\n                INSERT INTO status_message_result\n                (\n                    " + C0YCB.COLUMN_CURSOR.getKey() + ",\n                    " + C0YCB.COLUMN_SERVER_MESSAGE_ID.getKey() + ",\n                    " + C0YCB.COLUMN_CREATED_AT.getKey() + ",\n                    " + C0YCB.COLUMN_UPDATED_AT.getKey() + ",\n                    " + C0YCB.COLUMN_PROCESS_RESULT.getKey() + ",\n                    " + C0YCB.COLUMN_CHAIN_TYPE.getKey() + ",\n                    " + C0YCB.COLUMN_INBOX_TYPE.getKey() + ",\n                    " + C0YCB.COLUMN_SUB_ERROR_CODE.getKey() + ",\n                    " + C0YCB.COLUMN_CONVERSATION_ID.getKey() + ",\n                    " + C0YCB.COLUMN_MESSAGE_ID.getKey() + ",\n                    " + C0YCB.COLUMN_MESSAGE_TYPE.getKey() + ",\n                    " + C0YCB.COLUMN_SUB_MESSAGE_TYPE.getKey() + ",\n                    " + C0YCB.COLUMN_DURATION.getKey() + ",\n                    " + C0YCB.COLUMN_LOG_ID.getKey() + ",\n                    " + C0YCB.COLUMN_ERROR_MSG.getKey() + ",\n                    " + C0YCB.COLUMN_MESSAGE_SOURCE.getKey() + ",\n                    " + C0YCB.COLUMN_ERROR_CODE.getKey() + "\n                ) \n                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n            "));
            if (interfaceC869960YAwLIZ == null) {
                return false;
            }
            try {
                LIZLLL(interfaceC869960YAwLIZ, c0ycg);
                interfaceC869960YAwLIZ.LJIL();
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "insert, success", 4);
                interfaceC869960YAwLIZ.close();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC869960YAwLIZ.close();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "insert, failed", e);
            this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMStatusMessageResultDao: insert", e);
            return false;
        }
    }

    public final boolean LJII(C0YCG c0ycg) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "update, start", 4);
        if (c0ycg.LIZ == -1) {
            this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "update, failed: row ID not saved", null);
            return false;
        }
        try {
            InterfaceC869960YAw interfaceC869960YAwLIZ = LJFF().getProxy().LIZ("UPDATE status_message_result SET " + C0YCB.COLUMN_CURSOR.getKey() + " = ?, " + C0YCB.COLUMN_SERVER_MESSAGE_ID.getKey() + " = ?, " + C0YCB.COLUMN_UPDATED_AT.getKey() + " = ?, " + C0YCB.COLUMN_PROCESS_RESULT.getKey() + " = ?, " + C0YCB.COLUMN_INBOX_TYPE.getKey() + " = ?, " + C0YCB.COLUMN_CHAIN_TYPE.getKey() + " = ?, " + C0YCB.COLUMN_SUB_ERROR_CODE.getKey() + " = ?, " + C0YCB.COLUMN_CONVERSATION_ID.getKey() + " = ?, " + C0YCB.COLUMN_MESSAGE_ID.getKey() + " = ?, " + C0YCB.COLUMN_MESSAGE_TYPE.getKey() + " = ?, " + C0YCB.COLUMN_SUB_MESSAGE_TYPE.getKey() + " = ?, " + C0YCB.COLUMN_DURATION.getKey() + " = ?, " + C0YCB.COLUMN_LOG_ID.getKey() + " = ?, " + C0YCB.COLUMN_ERROR_MSG.getKey() + " = ?, " + C0YCB.COLUMN_MESSAGE_SOURCE.getKey() + " = ?, " + C0YCB.COLUMN_ERROR_CODE.getKey() + " = ? WHERE " + C0YCB.COLUMN_ID.getKey() + " = ?");
            if (interfaceC869960YAwLIZ == null) {
                return false;
            }
            try {
                boolean z = true;
                interfaceC869960YAwLIZ.LJIJ(1, c0ycg.LIZIZ);
                interfaceC869960YAwLIZ.LJIJ(2, c0ycg.LIZJ);
                interfaceC869960YAwLIZ.LJIJ(3, c0ycg.LJ);
                interfaceC869960YAwLIZ.LJIJ(4, c0ycg.LJFF);
                interfaceC869960YAwLIZ.LJIJ(5, c0ycg.LJI);
                interfaceC869960YAwLIZ.LJIJ(6, c0ycg.LJII);
                interfaceC869960YAwLIZ.LJIILIIL(7, c0ycg.LJIIIIZZ);
                interfaceC869960YAwLIZ.LJIILIIL(8, c0ycg.LJIIIZ);
                interfaceC869960YAwLIZ.LJIILIIL(9, c0ycg.LJIIJ);
                interfaceC869960YAwLIZ.LJIILIIL(10, c0ycg.LJIIJJI);
                interfaceC869960YAwLIZ.LJIJ(11, c0ycg.LJIIL);
                interfaceC869960YAwLIZ.LJIJ(12, c0ycg.LJIILIIL);
                interfaceC869960YAwLIZ.LJIILIIL(13, c0ycg.LJIILJJIL);
                interfaceC869960YAwLIZ.LJIILIIL(14, c0ycg.LJIILL);
                interfaceC869960YAwLIZ.LJIJ(15, c0ycg.LJIILLIIL);
                interfaceC869960YAwLIZ.LJIILIIL(16, c0ycg.LJIIZILJ);
                interfaceC869960YAwLIZ.LJIJ(17, c0ycg.LIZ);
                if (interfaceC869960YAwLIZ.LJIIL() <= 0) {
                    z = false;
                }
                C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "update, success", 4);
                interfaceC869960YAwLIZ.close();
                return z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC869960YAwLIZ.close();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "update, failed", e);
            this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMStatusMessageResultDao: update", e);
            return false;
        }
    }

    public static void LIZLLL(InterfaceC869960YAw interfaceC869960YAw, C0YCG c0ycg) {
        interfaceC869960YAw.LJIJ(1, c0ycg.LIZIZ);
        interfaceC869960YAw.LJIJ(2, c0ycg.LIZJ);
        interfaceC869960YAw.LJIJ(3, c0ycg.LIZLLL);
        interfaceC869960YAw.LJIJ(4, c0ycg.LJ);
        interfaceC869960YAw.LJIJ(5, c0ycg.LJFF);
        interfaceC869960YAw.LJIJ(6, c0ycg.LJII);
        interfaceC869960YAw.LJIJ(7, c0ycg.LJI);
        interfaceC869960YAw.LJIILIIL(8, c0ycg.LJIIIIZZ);
        interfaceC869960YAw.LJIILIIL(9, c0ycg.LJIIIZ);
        interfaceC869960YAw.LJIILIIL(10, c0ycg.LJIIJ);
        interfaceC869960YAw.LJIILIIL(11, c0ycg.LJIIJJI);
        interfaceC869960YAw.LJIJ(12, c0ycg.LJIIL);
        interfaceC869960YAw.LJIJ(13, c0ycg.LJIILIIL);
        interfaceC869960YAw.LJIILIIL(14, c0ycg.LJIILJJIL);
        interfaceC869960YAw.LJIILIIL(15, c0ycg.LJIILL);
        interfaceC869960YAw.LJIJ(16, c0ycg.LJIILLIIL);
        interfaceC869960YAw.LJIILIIL(17, c0ycg.LJIIZILJ);
    }

    @Override // X.C0YBF
    public final Object LIZJ(int i, int i2, long j) {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "deleteStatusMessagesBeforeCursor, start", 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            DELETE FROM status_message_result\n            WHERE ");
        sbLIZ.append(C0YCB.COLUMN_CURSOR.getKey());
        sbLIZ.append(" <= ?\n            AND ");
        sbLIZ.append(C0YCB.COLUMN_CHAIN_TYPE.getKey());
        sbLIZ.append(" = ?\n            AND ");
        sbLIZ.append(C0YCB.COLUMN_INBOX_TYPE.getKey());
        sbLIZ.append(" = ?\n        ");
        try {
            InterfaceC869960YAw interfaceC869960YAwLIZ = LJFF().getProxy().LIZ(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
            if (interfaceC869960YAwLIZ == null) {
                C098200Yq c098200Yq = new C098200Yq(new IllegalStateException("Failed to compile statement"));
                C189200o6.m2constructorimpl(c098200Yq);
                return c098200Yq;
            }
            try {
                interfaceC869960YAwLIZ.LJIJ(1, j);
                interfaceC869960YAwLIZ.LJIJ(2, i);
                interfaceC869960YAwLIZ.LJIJ(3, i2);
                int iLJIIL = interfaceC869960YAwLIZ.LJIIL();
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("deleteStatusMessagesBeforeCursor, success: deleted ");
                sbLIZ2.append(iLJIIL);
                sbLIZ2.append(" records");
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMStatusMessageResultDao", C2188811AlT.LIZIZ(sbLIZ2), 4);
                Integer numValueOf = Integer.valueOf(iLJIIL);
                C189200o6.m2constructorimpl(numValueOf);
                interfaceC869960YAwLIZ.close();
                return numValueOf;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC869960YAwLIZ.close();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "deleteStatusMessagesBeforeCursor, failed", e);
            this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMStatusMessageResultDao: deleteStatusMessagesBeforeCursor", e);
            C098200Yq c098200Yq2 = new C098200Yq(e);
            C189200o6.m2constructorimpl(c098200Yq2);
            return c098200Yq2;
        }
    }

    @Override // X.C0YBF
    public final Object LIZIZ(int i, int i2, int i3, long j, long j2) throws Throwable {
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "IMStatusMessageResultDao", "getAllBetweenCursor, start", 4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT * FROM status_message_result\n            WHERE ");
        C0YCB c0ycb = C0YCB.COLUMN_CURSOR;
        sbLIZ.append(c0ycb.getKey());
        sbLIZ.append(" >= ?\n            AND ");
        sbLIZ.append(c0ycb.getKey());
        sbLIZ.append(" <= ?\n            AND ");
        sbLIZ.append(C0YCB.COLUMN_CHAIN_TYPE.getKey());
        sbLIZ.append(" = ?\n            AND ");
        sbLIZ.append(C0YCB.COLUMN_INBOX_TYPE.getKey());
        sbLIZ.append(" = ?\n            ORDER BY ");
        sbLIZ.append(c0ycb.getKey());
        sbLIZ.append(" DESC\n            LIMIT ?\n        ");
        String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            try {
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = LJFF().getProxy().LJIIJJI(strLIZJ, "getAllBetweenCursor", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(i), String.valueOf(i2), String.valueOf(i3)});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        arrayList.addAll(LJ(interfaceC869470Y8zLJIIJJI));
                        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("getAllBetweenCursor, success with rows: ");
                        sbLIZ2.append(arrayList.size());
                        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMStatusMessageResultDao", C2188811AlT.LIZIZ(sbLIZ2), 4);
                        LJFF().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        C189200o6.m2constructorimpl(arrayList);
                        return arrayList;
                    } catch (Exception e) {
                        e = e;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                LJFF().LIZ().LIZ(interfaceC869470Y8z);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("IMStatusMessageResultDao dbCursor is null");
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        TryCatchGuardChecker.doCheck(e);
        this.LIZIZ.LIZLLL().LJIIIIZZ("IMStatusMessageResultDao", "getAllBetweenCursor, failed.", e);
        this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
        C098200Yq c098200Yq = new C098200Yq(e);
        C189200o6.m2constructorimpl(c098200Yq);
        LJFF().LIZ().LIZ(interfaceC869470Y8z);
        return c098200Yq;
    }
}
