package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: X.0W9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818740W9w {
    public final SharedPreferences LIZ;

    public C818740W9w(Context context) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, "pns_region_cache");
    }

    public final void LIZ(String str, String str2) {
        if (str2 != null) {
            this.LIZ.edit().putString(str, str2).apply();
        } else {
            this.LIZ.edit().remove(str).apply();
        }
    }
}
