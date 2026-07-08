package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0Vow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C809320Vow {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final SharedPreferences LIZJ;

    public final C809340Voy LIZ() {
        return new C809340Voy(this.LIZ);
    }

    public C809320Vow(Context context) {
        this.LIZIZ = C0V4R.LJII(context);
        this.LIZ = context;
        this.LIZJ = C810670Vr7.LIZJ(context, 4, "push_multi_process_config");
        Logger.debug();
    }

    public final String LJ(String str) {
        String string;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getString(str, "");
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), PushMultiProcessSharedProvider.LIZJ(this.LIZ, str, "string"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdnVOFpN6X1hLB4FBmHz6zVGF7O0xaK8jOLKpA1mLHLyL9bOH0WeCnrhIzkeiGnkhyac=", null));
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

    public final boolean LIZIZ(String str, boolean z) {
        boolean z2;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getBoolean(str, z);
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), PushMultiProcessSharedProvider.LIZJ(this.LIZ, str, "boolean"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdnVOFpN6X1hLB4FBmHz6zVGF7O0xaK8jOLKpA1mLHLyL9bOH0WeCnrhIzkeiGnkhyac=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        z2 = false;
                        if (cursorLJJJ.getInt(0) > 0) {
                            z2 = true;
                        }
                    } else {
                        z2 = z;
                    }
                    try {
                        cursorLJJJ.close();
                        return z2;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        return z2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        cursorLJJJ.close();
                        return z;
                    } catch (Exception e2) {
                        e = e2;
                        z2 = z;
                        TryCatchGuardChecker.doCheck(e);
                        return z2;
                    }
                }
            }
            return z;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return z;
        }
    }

    public final int LIZJ(String str, int i) {
        int i2;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getInt(str, i);
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), PushMultiProcessSharedProvider.LIZJ(this.LIZ, str, "integer"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdnVOFpN6X1hLB4FBmHz6zVGF7O0xaK8jOLKpA1mLHLyL9bOH0WeCnrhIzkeiGnkhyac=", null));
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

    public final long LIZLLL(String str, long j) {
        long j2;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getLong(str, j);
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), PushMultiProcessSharedProvider.LIZJ(this.LIZ, str, "long"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKdnVOFpN6X1hLB4FBmHz6zVGF7O0xaK8jOLKpA1mLHLyL9bOH0WeCnrhIzkeiGnkhyac=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        j2 = cursorLJJJ.getLong(0);
                    } else {
                        j2 = j;
                    }
                    try {
                        cursorLJJJ.close();
                        return j2;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        return j2;
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            cursorLJJJ.close();
                            return j;
                        } catch (Exception e2) {
                            e = e2;
                            j2 = j;
                            TryCatchGuardChecker.doCheck(e);
                            return j2;
                        }
                    } finally {
                    }
                }
            }
            return j;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return j;
        }
    }
}
