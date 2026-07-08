package X;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.MultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0VJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VJ3 {
    public final Context LIZ;

    public C0VJ3(Context context) {
        this.LIZ = C786410Ut5.N3(context);
        Logger.debug();
    }

    public final String LIZIZ(String str) {
        String string;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), MultiProcessSharedProvider.LIZ(this.LIZ, str, "string"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKZTmhVITkWSj6weDpGnLojDMJYhdVY+954Vr01H9mVzyMBBGSOWw=", null));
            if (cursorLJJJ == null) {
                return "";
            }
            try {
                if (!cursorLJJJ.moveToFirst()) {
                    string = "";
                } else {
                    string = cursorLJJJ.getString(0);
                }
                try {
                    cursorLJJJ.close();
                    return string;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    return string;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    cursorLJJJ.close();
                    return "";
                } catch (Exception e2) {
                    e = e2;
                    string = "";
                    TryCatchGuardChecker.doCheck(e);
                    return string;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "";
        }
    }

    public final int LIZ(String str, int i) {
        int i2;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), MultiProcessSharedProvider.LIZ(this.LIZ, str, "integer"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKZTmhVITkWSj6weDpGnLojDMJYhdVY+954Vr01H9mVzyMBBGSOWw=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        i2 = cursorLJJJ.getInt(0);
                    } else {
                        i2 = i;
                    }
                    try {
                        cursorLJJJ.close();
                        return i2;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        return i2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        cursorLJJJ.close();
                        return i;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i;
                        TryCatchGuardChecker.doCheck(e);
                        return i2;
                    }
                }
            }
            return i;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return i;
        }
    }
}
