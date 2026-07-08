package X;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.1AFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176411AFr {
    public boolean LIZ;
    public SharedPreferences LIZIZ;
    public SharedPreferences.Editor LIZJ;

    public final Object LIZ(String str) {
        SharedPreferences sharedPreferences = this.LIZIZ;
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(str, "");
    }

    public final void LIZIZ(Object obj, String str, boolean z) {
        synchronized (this) {
            if (this.LIZJ == null) {
                this.LIZJ = this.LIZIZ.edit();
            }
        }
        if (obj instanceof String) {
            this.LIZJ.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.LIZJ.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.LIZJ.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.LIZJ.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.LIZJ.putLong(str, ((Long) obj).longValue());
        } else if (obj == null) {
            return;
        } else {
            this.LIZJ.putString(str, obj.toString());
        }
        if (z) {
            this.LIZJ.apply();
        } else {
            this.LIZJ.commit();
        }
    }
}
