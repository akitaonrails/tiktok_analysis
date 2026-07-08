package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0K4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511520K4g {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS193S0000000_7.get$arr$(4));

    public static final Context LIZJ() {
        return C2213981Bky.LIZIZ.getApplicationContext();
    }

    public static final int LJI() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final boolean LJIIIZ() {
        Object c098200Yq;
        ApplicationInfo applicationInfo;
        try {
            c098200Yq = LIZJ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Context context = (Context) c098200Yq;
        return context != null && (applicationInfo = context.getApplicationInfo()) != null && (applicationInfo.flags & 4194304) == 4194304 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final float LIZ(float f) {
        return (f * ((DisplayMetrics) LIZ.getValue()).density) + 0.5f;
    }

    public static final String LIZLLL(int i) {
        Object c098200Yq;
        try {
            c098200Yq = LIZJ().getResources().getQuantityString(2131755469, i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final int LJFF(C19EG c19eg) {
        WindowManager windowManager;
        Display displayLLILZIL;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (c19eg != null && (windowManager = c19eg.getWindowManager()) != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0forABR66PADftPwnAlCAPu43GQ=", null))) != null) {
            displayLLILZIL.getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static final String LJII(int i) {
        Object c098200Yq;
        try {
            c098200Yq = LIZJ().getString(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final int LIZIZ(int i, Context context) {
        Object c098200Yq;
        if (context == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (theme == null || !theme.resolveAttribute(i, typedValue, true)) {
            return 0;
        }
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            try {
                c098200Yq = Integer.valueOf(C446980Hfs.LIZ(context, i2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Integer.valueOf(typedValue.data);
            }
            return ((Number) c098200Yq).intValue();
        }
        return typedValue.data;
    }

    public static final String LJIIIIZZ(int i, Object... objArr) {
        Object c098200Yq;
        try {
            c098200Yq = LIZJ().getString(i, Arrays.copyOf(objArr, objArr.length));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final String LJ(int i, int i2, Object... objArr) {
        Object c098200Yq;
        try {
            c098200Yq = LIZJ().getResources().getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }
}
