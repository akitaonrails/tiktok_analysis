package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WFS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WFS {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final SharedPreferences LIZJ;

    public C0WFS(Context context) {
        boolean z;
        if (C2103808Ma.LIZJ(context) && WsChannelMultiProcessSharedProvider.LLIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3;
        this.LIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(contextN3), 4, "wschannel_multi_process_config");
        Logger.debug();
    }

    public final String LIZJ(String str) {
        String string;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getString(str, "");
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), WsChannelMultiProcessSharedProvider.LIZ(this.LIZ, str, "string"), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6s5VEfn+T9fnirLcQeLPotovHeCvPS8w4YkKDjFSRJNgbuuT", null));
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

    public final boolean LIZ(String str, boolean z) {
        boolean z2;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getBoolean(str, z);
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), WsChannelMultiProcessSharedProvider.LIZ(this.LIZ, str, "boolean"), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6s5VEfn+T9fnirLcQeLPotovHeCvPS8w4YkKDjFSRJNgbuuT", null));
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

    public final long LIZIZ(String str, long j) {
        long j2;
        try {
            if (this.LIZIZ) {
                return this.LIZJ.getLong(str, j);
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), WsChannelMultiProcessSharedProvider.LIZ(this.LIZ, str, "long"), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6s5VEfn+T9fnirLcQeLPotovHeCvPS8w4YkKDjFSRJNgbuuT", null));
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
