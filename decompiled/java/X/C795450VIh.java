package X;

import android.database.Cursor;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795450VIh {
    public static int LIZ(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("`");
        sbLIZ.append(str);
        sbLIZ.append("`");
        int columnIndex2 = cursor.getColumnIndex(C2188811AlT.LIZIZ(sbLIZ));
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = cursor.getColumnNames();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(e3.d);
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(e3.d);
            sbLIZ3.append(str);
            sbLIZ3.append("`");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            for (int i = 0; i < columnNames.length; i++) {
                String str2 = columnNames[i];
                if (str2.length() >= str.length() + 2 && (str2.endsWith(strLIZIZ) || (str2.charAt(0) == '`' && str2.endsWith(strLIZIZ2)))) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public static int LIZIZ(Cursor cursor, String str) {
        String string;
        int iLIZ = LIZ(cursor, str);
        if (iLIZ >= 0) {
            return iLIZ;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}
