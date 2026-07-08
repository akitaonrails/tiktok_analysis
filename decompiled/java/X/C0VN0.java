package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VN0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VN0 {
    public static void LIZ(C0VLF c0vlf) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorQuery = c0vlf.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(cursorQuery.getString(0));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DROP TRIGGER IF EXISTS ");
                sbLIZ.append(str);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static Cursor LIZIZ(AbstractC796540VMm abstractC796540VMm, C0VOJ c0voj, boolean z) {
        int numRows;
        Cursor cursorQuery = abstractC796540VMm.query(c0voj, (CancellationSignal) null);
        if (z && (cursorQuery instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                numRows = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                numRows = count;
            }
            if (numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            int type = abstractWindowedCursor.getType(i);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i] = abstractWindowedCursor.getBlob(i);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i] = abstractWindowedCursor.getString(i);
                                        }
                                    } else {
                                        objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                                    }
                                } else {
                                    objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                                }
                            } else {
                                objArr[i] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return cursorQuery;
    }
}
