package X;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: renamed from: X.18K0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18K0 {
    public final Context LIZ;

    public final int LIZ() {
        Configuration configuration = this.LIZ.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i < 500) {
            return i > 480 ? i2 > 640 ? 4 : 3 : i < 360 ? 2 : 3;
        }
        return 4;
    }

    public C18K0(Context context) {
        this.LIZ = context;
    }
}
