package X;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.0VOE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VOE {
    public final int LIZ;

    public abstract void LIZIZ();

    public abstract void LIZJ(C0VOI c0voi);

    public abstract void LIZLLL(C0VOI c0voi, int i, int i2);

    public abstract void LJ(C0VOI c0voi);

    public abstract void LJFF(C0VOI c0voi, int i, int i2);

    public C0VOE(int i) {
        this.LIZ = i;
    }

    public static void LIZ(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
