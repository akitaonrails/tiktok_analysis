package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.08oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2230608oa<T> {
    public final T LIZ;
    public final String LIZIZ;
    public final Type LIZJ;

    public final T LIZ() {
        T stringSet;
        SharedPreferences sharedPreferencesLIZJ = LIZJ();
        try {
            Class<?> cls = this.LIZ.getClass();
            if (cls == String.class) {
                stringSet = (T) sharedPreferencesLIZJ.getString(this.LIZIZ, (String) this.LIZ);
            } else if (cls == Integer.class) {
                stringSet = Integer.valueOf(sharedPreferencesLIZJ.getInt(this.LIZIZ, ((Integer) this.LIZ).intValue()));
            } else if (cls == Float.class) {
                stringSet = Float.valueOf(sharedPreferencesLIZJ.getFloat(this.LIZIZ, ((Float) this.LIZ).floatValue()));
            } else if (cls == Long.class) {
                stringSet = Long.valueOf(sharedPreferencesLIZJ.getLong(this.LIZIZ, ((Long) this.LIZ).longValue()));
            } else if (cls == Boolean.class) {
                stringSet = Boolean.valueOf(sharedPreferencesLIZJ.getBoolean(this.LIZIZ, ((Boolean) this.LIZ).booleanValue()));
            } else {
                if (!Set.class.isAssignableFrom(cls)) {
                    throw new AssertionError();
                }
                stringSet = sharedPreferencesLIZJ.getStringSet(this.LIZIZ, (Set) this.LIZ);
            }
            if (stringSet == null) {
                LIZLLL(this.LIZ);
                stringSet = this.LIZ;
            }
            return stringSet.getClass() != this.LIZ.getClass() ? this.LIZ : (T) stringSet;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return this.LIZ;
        }
    }

    public final T LIZIZ() {
        SharedPreferences sharedPreferencesLIZJ = LIZJ();
        try {
            if (this.LIZ != null) {
                return LIZ();
            }
            Type type = this.LIZJ;
            if (type == null || !(type instanceof Class)) {
                return null;
            }
            Class cls = (Class) type;
            if (!sharedPreferencesLIZJ.contains(this.LIZIZ)) {
                return null;
            }
            if (cls == String.class) {
                return (T) sharedPreferencesLIZJ.getString(this.LIZIZ, "");
            }
            if (cls == Integer.class) {
                return (T) Integer.valueOf(sharedPreferencesLIZJ.getInt(this.LIZIZ, C386801es.DEFAULT));
            }
            if (cls == Float.class) {
                return (T) Float.valueOf(sharedPreferencesLIZJ.getFloat(this.LIZIZ, -1000.0f));
            }
            if (cls == Long.class) {
                return (T) Long.valueOf(sharedPreferencesLIZJ.getLong(this.LIZIZ, -1000L));
            }
            if (cls == Boolean.class) {
                return (T) Boolean.valueOf(sharedPreferencesLIZJ.getBoolean(this.LIZIZ, false));
            }
            if (Set.class.isAssignableFrom(cls)) {
                return (T) sharedPreferencesLIZJ.getStringSet(this.LIZIZ, new HashSet());
            }
            throw new AssertionError();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public SharedPreferences LIZJ() {
        return SharePrefCache.inst().getSharePref();
    }

    public final void LIZLLL(Object obj) {
        if (obj == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = LIZJ().edit();
        if (obj instanceof String) {
            editorEdit.putString(this.LIZIZ, (String) obj);
        } else if (obj instanceof Integer) {
            editorEdit.putInt(this.LIZIZ, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            editorEdit.putFloat(this.LIZIZ, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editorEdit.putLong(this.LIZIZ, ((Long) obj).longValue());
        } else if (obj instanceof Boolean) {
            editorEdit.putBoolean(this.LIZIZ, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Set) {
            editorEdit.putStringSet(this.LIZIZ, (Set) obj);
        }
        editorEdit.apply();
    }

    public final void LJ(T t) {
        if (t != null) {
            LIZLLL(t);
        }
    }

    public C2230608oa(String str, Type type) {
        type.getClass();
        this.LIZ = null;
        this.LIZIZ = str;
        this.LIZJ = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(SharedPreferences.Editor editor, T t) {
        if (editor != null) {
            if (t instanceof String) {
                editor.putString(this.LIZIZ, (String) t);
                return;
            }
            if (t instanceof Integer) {
                editor.putInt(this.LIZIZ, ((Integer) t).intValue());
                return;
            }
            if (t instanceof Float) {
                editor.putFloat(this.LIZIZ, ((Float) t).floatValue());
                return;
            }
            if (t instanceof Long) {
                editor.putLong(this.LIZIZ, ((Long) t).longValue());
                return;
            } else if (t instanceof Boolean) {
                editor.putBoolean(this.LIZIZ, ((Boolean) t).booleanValue());
                return;
            } else {
                if (!(t instanceof Set)) {
                    return;
                }
                editor.putStringSet(this.LIZIZ, (Set) t);
                return;
            }
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    public C2230608oa(String str, T t) {
        t.getClass();
        this.LIZ = t;
        this.LIZIZ = str;
    }
}
