package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0We4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC828060We4 {
    public String LIZ;

    public abstract void LJII();

    public AbstractC828060We4() {
        LJII();
    }

    public final SharedPreferences LJ(Context context) {
        if (context == null) {
            return null;
        }
        if (!TextUtils.isEmpty(this.LIZ)) {
            return C810670Vr7.LIZJ(context, 0, this.LIZ);
        }
        throw new IllegalStateException("filename can not bo null");
    }

    public final List LIZ(Context context, Class cls) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return null;
        }
        String string = sharedPreferencesLJ.getString("aweme_gecko_offline_host_prefix", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JsonParseUtils.LIZJ(cls, string);
        } catch (Error e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final long LIZJ(Context context, String str) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return 0L;
        }
        return sharedPreferencesLJ.getLong(str, 0L);
    }

    public final String LJFF(Context context, String str) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return null;
        }
        return sharedPreferencesLJ.getString(str, "");
    }

    public final boolean LIZIZ(Context context, String str, boolean z) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return false;
        }
        return sharedPreferencesLJ.getBoolean(str, z);
    }

    public final Object LIZLLL(Context context, Class cls, String str) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return null;
        }
        String string = sharedPreferencesLJ.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JsonParseUtils.LIZLLL(cls, string);
        } catch (Error e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void LJI(Context context, String str, boolean z) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLJ.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public final void LJIIIIZZ(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, this.LIZ).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public final void LJIIIZ(Context context, String str, long j) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLJ.edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public final void LJIIJ(Context context, Object obj, String str) {
        try {
            SharedPreferences sharedPreferencesLJ = LJ(context);
            if (sharedPreferencesLJ != null && obj != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesLJ.edit();
                editorEdit.putString(str, JsonParseUtils.LJ(obj));
                editorEdit.apply();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJIIJJI(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesLJ = LJ(context);
        if (sharedPreferencesLJ == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLJ.edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
