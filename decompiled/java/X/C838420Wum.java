package X;

import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: renamed from: X.0Wum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838420Wum {
    public static C838510Wuv LIZ(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C838510Wuv.LJ(C838450Wup.LIZ(configuration));
        }
        return C838510Wuv.LIZ(configuration.locale);
    }
}
