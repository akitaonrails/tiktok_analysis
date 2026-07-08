package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.push.settings.storage.PushProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFM implements InterfaceC810050Vq7 {
    public final Context LIZ;
    public final String LIZIZ;
    public final Map<InterfaceC810260VqS, ContentObserver> LIZJ = new ConcurrentHashMap();

    @Override // X.InterfaceC810050Vq7
    public final void LIZ(Context context, String str, String str2) {
    }

    @Override // X.InterfaceC810050Vq7
    public final void LIZIZ() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0WFO] */
    @Override // X.InterfaceC810050Vq7
    public final SharedPreferences.Editor edit() {
        final Context context = this.LIZ;
        final String str = this.LIZIZ;
        final ?? r0 = new C0WFQ() { // from class: X.0WFO
        };
        return new SharedPreferences.Editor(context, str, r0) { // from class: X.0WFN
            public final C0WFQ LIZ;
            public final String LIZIZ;
            public final Context LIZJ;
            public final ContentValues LIZLLL = new ContentValues();

            @Override // android.content.SharedPreferences.Editor
            public final synchronized void apply() {
                try {
                    C0WFR c0wfr = new C0WFR(this.LIZIZ, "key", "val", "type");
                    ContentResolver contentResolver = this.LIZJ.getContentResolver();
                    C0WFQ c0wfq = this.LIZ;
                    Context context2 = this.LIZJ;
                    ((C0WFO) c0wfq).getClass();
                    C2204961BRm.LJJIJLIJ(contentResolver, C0WFM.LIZLLL(context2, c0wfr), this.LIZLLL, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // android.content.SharedPreferences.Editor
            public final boolean commit() {
                return false;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor clear() {
                throw new UnsupportedOperationException("not support clear");
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor remove(String str2) {
                this.LIZLLL.putNull(str2);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putBoolean(String str2, boolean z) {
                this.LIZLLL.put(str2, Boolean.valueOf(z));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putFloat(String str2, float f) {
                this.LIZLLL.put(str2, Float.valueOf(f));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putInt(String str2, int i) {
                this.LIZLLL.put(str2, Integer.valueOf(i));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putLong(String str2, long j) {
                this.LIZLLL.put(str2, Long.valueOf(j));
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putString(String str2, String str3) {
                this.LIZLLL.put(str2, str3);
                return this;
            }

            @Override // android.content.SharedPreferences.Editor
            public final SharedPreferences.Editor putStringSet(String str2, Set<String> set) {
                throw new UnsupportedOperationException("putStringSet not support");
            }

            {
                this.LIZJ = C786410Ut5.N3(context);
                this.LIZ = r0;
                this.LIZIZ = str;
            }
        };
    }

    public static void LJ(Cursor cursor) {
        try {
            cursor.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final float LIZJ(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean contains(String str) {
        boolean z = false;
        try {
            Uri uriLIZLLL = LIZLLL(this.LIZ, null);
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            String str2 = this.LIZIZ;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("_storage_key", str2, bundle);
            C786410Ut5.LJJJI("_key", str, bundle);
            Bundle bundleLJJIJL = C2204961BRm.LJJIJL(contentResolver, uriLIZLLL, "_contains", null, bundle, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (bundleLJJIJL == null) {
                return false;
            }
            z = bundleLJJIJL.getBoolean("_result");
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return z;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // X.InterfaceC810050Vq7
    public final int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // X.InterfaceC810050Vq7
    public final long getLong(String str) {
        return getLong(str, 0L);
    }

    @Override // X.InterfaceC810050Vq7
    public final String getString(String str) {
        return getString(str, null);
    }

    public C0WFM(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }

    public static synchronized Uri LIZLLL(Context context, C0WFR c0wfr) {
        return PushProvider.LIZ(context, c0wfr);
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean getBoolean(String str, boolean z) {
        boolean z2;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZLLL(this.LIZ, new C0WFR(this.LIZIZ, str, String.valueOf(z), "boolean")), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (cursorLJJJ != null) {
                try {
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                if (cursorLJJJ.moveToFirst()) {
                    z2 = false;
                    if (cursorLJJJ.getInt(0) > 0) {
                        z2 = true;
                    }
                } else {
                    z2 = z;
                }
                LJ(cursorLJJJ);
                return z2;
            }
            return z;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return z;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final float getFloat(String str, float f) {
        float f2;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZLLL(this.LIZ, new C0WFR(this.LIZIZ, str, String.valueOf(f), "float")), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (cursorLJJJ != null) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (cursorLJJJ.moveToFirst()) {
                    f2 = cursorLJJJ.getFloat(0);
                } else {
                    f2 = f;
                }
                LJ(cursorLJJJ);
                return f2;
            }
            return f;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return f;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final int getInt(String str, int i) {
        int i2;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZLLL(this.LIZ, new C0WFR(this.LIZIZ, str, String.valueOf(i), "integer")), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (cursorLJJJ != null) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (cursorLJJJ.moveToFirst()) {
                    i2 = cursorLJJJ.getInt(0);
                } else {
                    i2 = i;
                }
                LJ(cursorLJJJ);
                return i2;
            }
            return i;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return i;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final long getLong(String str, long j) {
        long j2;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZLLL(this.LIZ, new C0WFR(this.LIZIZ, str, String.valueOf(j), "long")), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (cursorLJJJ != null) {
                try {
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                if (cursorLJJJ.moveToFirst()) {
                    j2 = cursorLJJJ.getLong(0);
                } else {
                    j2 = j;
                }
                LJ(cursorLJJJ);
                return j2;
            }
            return j;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return j;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final String getString(String str, String str2) {
        String string;
        try {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), LIZLLL(this.LIZ, new C0WFR(this.LIZIZ, str, str2, "string")), null, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAzpl9tGA0FyVag9sVCmi6+HeMCo0i3sQ1NWUJ7zIG7D7zSi6fBX0", null));
            if (cursorLJJJ != null) {
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (cursorLJJJ.moveToFirst()) {
                    string = cursorLJJJ.getString(0);
                } else {
                    string = str2;
                }
                LJ(cursorLJJJ);
                return string;
            }
            return str2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return str2;
        }
    }
}
