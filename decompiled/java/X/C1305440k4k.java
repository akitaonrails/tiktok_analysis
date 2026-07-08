package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import java.util.Set;

/* JADX INFO: renamed from: X.0k4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305440k4k {
    public static LruCache<String, C1305440k4k> LIZJ;
    public final SharedPreferences LIZ;
    public SharedPreferences.Editor LIZIZ;

    public final void LIZ() {
        SharedPreferences.Editor editor = this.LIZIZ;
        if (editor != null) {
            C1499900p8O.LIZ(editor);
        }
    }

    public static C1305440k4k LIZIZ(Context context) {
        return LIZJ(context, "default_app_sp");
    }

    public final boolean LJ(String str) {
        return ((Boolean) LIZLLL(str, EnumC1305450k4l.BOOLEAN, Boolean.TRUE)).booleanValue();
    }

    public C1305440k4k(Context context, String str) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, str);
    }

    public static C1305440k4k LIZJ(Context context, String str) {
        if (context != null) {
            if (LIZJ == null) {
                LIZJ = new LruCache<>(3);
            }
            C1305440k4k c1305440k4k = LIZJ.get(str);
            if (c1305440k4k == null) {
                C1305440k4k c1305440k4k2 = new C1305440k4k(context, str);
                LIZJ.put(str, c1305440k4k2);
                return c1305440k4k2;
            }
            return c1305440k4k;
        }
        throw new NullPointerException("null context!!");
    }

    public final int LJFF(String str, int i) {
        return ((Integer) LIZLLL(str, EnumC1305450k4l.INTEGER, Integer.valueOf(i))).intValue();
    }

    public final long LJI(String str, long j) {
        return ((Long) LIZLLL(str, EnumC1305450k4l.LONG, Long.valueOf(j))).longValue();
    }

    public final void LJII(Object obj, String str) {
        if (this.LIZIZ == null) {
            this.LIZIZ = this.LIZ.edit();
        }
        if (obj instanceof String) {
            this.LIZIZ.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            this.LIZIZ.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            this.LIZIZ.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            this.LIZIZ.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            this.LIZIZ.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.LIZIZ.putStringSet(str, (Set) obj);
        } else {
            this.LIZIZ.putString(str, String.valueOf(obj));
        }
    }

    public final void LJIIIIZZ(Object obj, String str) {
        LJII(obj, str);
        LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LIZLLL(String str, EnumC1305450k4l enumC1305450k4l, Object obj) {
        switch (enumC1305450k4l.ordinal()) {
            case 0:
                return (T) this.LIZ.getString(str, (String) obj);
            case 1:
                return (T) Integer.valueOf(this.LIZ.getInt(str, ((Integer) obj).intValue()));
            case 2:
                return (T) Boolean.valueOf(this.LIZ.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 3:
                return (T) Float.valueOf(this.LIZ.getFloat(str, ((Float) obj).floatValue()));
            case 4:
                return (T) Long.valueOf(this.LIZ.getLong(str, ((Long) obj).longValue()));
            case 5:
                return (T) this.LIZ.getStringSet(str, (Set) obj);
            case 6:
                return (T) this.LIZ.getAll();
            default:
                return obj;
        }
    }
}
