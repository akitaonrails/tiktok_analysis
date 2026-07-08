package X;

import X.C08R7;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08R9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08R9<K extends C08R7, PubInfo> {
    public final String LIZ = "TicketGuardManager";
    public C08R6 LIZIZ;
    public final SharedPreferences LIZJ;
    public final String LIZLLL;
    public String LJ;

    public abstract C08R6 LIZ(String str);

    public abstract C08R6 LIZLLL(String str);

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sp_key_private_key_ree");
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sp_key_public_key_ree");
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append(",timestamp=");
        sbLIZ.append(System.currentTimeMillis());
        this.LJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZJ.edit().putString(this.LIZLLL, this.LJ).apply();
    }

    public C08R9(Context context) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "sp_TicketGuardHelper");
        this.LIZJ = sharedPreferencesLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ree_create_key_log");
        sbLIZ.append('_');
        sbLIZ.append("TicketGuardManager");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = strLIZIZ;
        this.LJ = sharedPreferencesLIZJ.getString(strLIZIZ, "");
    }

    public final boolean LJFF(String str) {
        boolean z;
        C08R6 c08r6LIZ;
        boolean z2 = false;
        if (this.LIZIZ != null) {
            return true;
        }
        synchronized (this) {
            try {
                if (this.LIZIZ != null) {
                    return true;
                }
                try {
                    C08R8 c08r8 = (C08R8) this;
                    C08R6 c08r6 = null;
                    String string = c08r8.LIZJ.getString(c08r8.LIZJ(), null);
                    String string2 = c08r8.LIZJ.getString(c08r8.LIZIZ(), null);
                    if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = this.LIZJ.getBoolean("has_gen_key", false);
                    if (z) {
                        c08r6LIZ = LIZLLL(str);
                    } else {
                        c08r6LIZ = LIZ(str);
                    }
                    if (c08r6LIZ != null) {
                        if (!z3) {
                            this.LIZJ.edit().putBoolean("has_gen_key", true).apply();
                        }
                        if (c08r6LIZ.LIZ) {
                            LJ();
                        }
                        c08r6 = c08r6LIZ;
                    }
                    this.LIZIZ = c08r6;
                    if (c08r6 != null) {
                        z2 = true;
                    }
                    return z2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("containsAlias failed, e=");
                    sbLIZ.append(Log.getStackTraceString(th));
                    C2188811AlT.LIZIZ(sbLIZ);
                    return false;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
