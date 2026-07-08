package X;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: X.0YBW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@InterfaceC1294060jmO
public final class C0YBW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, String str) {
        File databasePath;
        if (str != null && (databasePath = context.getDatabasePath(str)) != null && databasePath.exists()) {
            return true;
        }
        return false;
    }
}
