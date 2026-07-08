package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0VAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793410VAl<T> {
    public final Context LIZ;
    public final String LIZIZ;
    public Uri LIZJ;
    public final HashMap<String, Integer> LIZLLL = new HashMap<>();

    public final Uri LIZ() {
        if (this.LIZJ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("content://");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("/");
            sbLIZ.append("apm_monitor_t1.db");
            sbLIZ.append("/");
            sbLIZ.append("t_battery");
            this.LIZJ = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        }
        return this.LIZJ;
    }

    public AbstractC793410VAl() {
        Context context = C792400V6o.LIZ;
        this.LIZ = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getPackageName());
        sbLIZ.append(".apm");
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final synchronized <I extends T> long LIZIZ(ContentValues contentValues) {
        try {
            Uri uriLJJIJLIJ = C2204961BRm.LJJIJLIJ(C792400V6o.LIZ.getContentResolver(), LIZ(), contentValues, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++dO64Aq4UVs9P2jBX/eCHk/Ngg==", null));
            if (uriLJJIJLIJ == null) {
                return -1L;
            }
            try {
                return CastLongProtector.parseLong(uriLJJIJLIJ.getLastPathSegment());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 1L;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1L;
        }
    }

    public final List LIZJ(String str, String[] strArr, C793400VAk c793400VAk) {
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZ(), C793400VAk.LJFF, str, strArr, "_id", new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++dO64Aq4UVs9P2jBX/eCHk/Ngg==", null));
            if (cursorLJJJ != null && cursorLJJJ.getCount() > 0) {
                TextUtils.isEmpty("_id");
                LinkedList linkedList = new LinkedList();
                for (int i = 0; cursorLJJJ.moveToNext() && i < Integer.MAX_VALUE; i++) {
                    linkedList.add(C793400VAk.LJ(new C793420VAm(cursorLJJJ, this.LIZLLL)));
                }
                LIZLLL(cursorLJJJ);
                return linkedList;
            }
            List listEmptyList = Collections.emptyList();
            LIZLLL(cursorLJJJ);
            return listEmptyList;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                LIZLLL(null);
                return Collections.emptyList();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LIZLLL(null);
                throw th2;
            }
        }
    }
}
