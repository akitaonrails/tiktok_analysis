package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C793420VAm {
    public final Cursor LIZ;
    public final HashMap<String, Integer> LIZIZ;

    public final int LIZ(String str) {
        Integer numValueOf = this.LIZIZ.get(str);
        if (numValueOf == null) {
            try {
                numValueOf = Integer.valueOf(this.LIZ.getColumnIndex(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                numValueOf = -1;
            }
            this.LIZIZ.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final long LIZIZ(String str) {
        try {
            return this.LIZ.getLong(LIZ(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    public final String LIZJ(String str) {
        try {
            return this.LIZ.getString(LIZ(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public C793420VAm(Cursor cursor, HashMap map) {
        this.LIZ = cursor;
        this.LIZIZ = map;
    }
}
