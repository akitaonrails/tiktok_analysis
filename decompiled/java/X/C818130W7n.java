package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818130W7n {
    public static SharedPreferences LIZ;
    public static volatile JSONObject LIZIZ = new JSONObject();

    public static boolean LIZ() {
        SharedPreferences sharedPreferences = LIZ;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("release_build", "");
        String str = NxRewordManager.LJFF;
        if (str == null) {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string, str);
        if (!zLJFF) {
            SharedPreferences sharedPreferences2 = LIZ;
            (sharedPreferences2 != null ? sharedPreferences2 : null).edit().clear().apply();
        }
        return zLJFF;
    }

    public static String LIZIZ(Locale locale) {
        return Intrinsics.LJIIJJI(C818240W7y.LIZ.invoke(locale), C818240W7y.LIZIZ).toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.util.Locale r10, X.C818170W7r r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C818130W7n.LIZJ(java.util.Locale, X.0W7r, boolean):void");
    }
}
