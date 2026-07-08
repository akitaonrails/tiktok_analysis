package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.145c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202078145c {
    public static Context LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static WeakReference<List<String>> LIZLLL;

    public static Context LIZ() {
        Context context = LIZ;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Please make sure Deximage.init(...) first");
    }

    public static List<String> LIZIZ() throws Throwable {
        WeakReference<List<String>> weakReference = LIZLLL;
        if (weakReference == null) {
            List<String> listLIZ = C2080608Dc.LIZ(LIZJ());
            LIZLLL = new WeakReference<>(listLIZ);
            return listLIZ;
        }
        List<String> list = weakReference.get();
        if (list != null) {
            return list;
        }
        List<String> listLIZ2 = C2080608Dc.LIZ(LIZJ());
        LIZLLL = new WeakReference<>(listLIZ2);
        return listLIZ2;
    }

    public static String LIZJ() {
        if (LIZJ == null) {
            LIZJ = LIZ().getPackageCodePath();
        }
        return LIZJ;
    }

    public static C0VSJ LIZLLL() {
        C0VSJ c0vsj = new C0VSJ(LIZ().getCodeCacheDir(), "app_profiles");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }
}
