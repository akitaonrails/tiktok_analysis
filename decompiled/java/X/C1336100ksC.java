package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ksC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336100ksC {
    public static Boolean LIZ;
    public static int LIZIZ;

    static {
        new HashMap();
    }

    public static boolean LJ() {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if ((objInvoke instanceof String) && !C2093608Ic.LJ((String) objInvoke)) {
                if (!"unknown".equals((String) objInvoke)) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = Boolean.valueOf(z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: NotFoundException -> 0x00d2, TryCatch #0 {NotFoundException -> 0x00d2, blocks: (B:31:0x0095, B:33:0x00a3, B:36:0x00b6), top: B:41:0x0095 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1336100ksC.LIZ(android.content.Context):int");
    }

    public static int LIZIZ(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8troe+yNAVAL34EDQ==", null)).getMetrics(displayMetrics);
        int orientation = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8troe+yNAVAL34EDQ==", null)).getOrientation();
        if (orientation != 1 && orientation != 3) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }

    public static int LIZJ(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8troe+yNAVAL34EDQ==", null)).getMetrics(displayMetrics);
        int orientation = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/7zTjpfgl8troe+yNAVAL34EDQ==", null)).getOrientation();
        if (orientation != 1 && orientation != 3) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.heightPixels;
    }

    public static int LIZLLL(Context context) {
        int iLIZJ;
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        int iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android");
        if (iN3 <= 0 || (iLIZJ = context.getResources().getDimensionPixelSize(iN3)) == 0) {
            iLIZJ = (int) C12ES.LIZJ(25.0f, context);
        }
        LIZIZ = iLIZJ;
        return iLIZJ;
    }

    public static void LJFF(Activity activity) {
        activity.getWindow().setFlags(8192, 8192);
    }
}
