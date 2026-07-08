package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ixh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483510Ixh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (str.length() == 8) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String strSubstring = str.substring(6, 8);
            Locale locale = Locale.ROOT;
            sbLIZ.append(strSubstring.toUpperCase(locale));
            sbLIZ.append(str.substring(0, 6).toUpperCase(locale));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LIZIZ(Activity activity) {
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
            try {
                Class<?> clsLoadClass = C786410Ut5.L3(activity).getClassLoader().loadClass("android.os.SystemProperties");
                if (((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0)).intValue() == 1) {
                    if (Build.VERSION.SDK_INT < 28) {
                        try {
                            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static String LIZJ(String str) throws C1549560qQU {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (a0.LJJLIIIJJIZ(str, '#')) {
            if (length != 7) {
                if (length == 9) {
                    String strLIZ = LIZ(str.substring(1));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(strLIZ);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                return str.toUpperCase(Locale.ROOT);
            }
        }
        if (length == 6) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('#');
            sbLIZ2.append(upperCase);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (length == 8) {
            String strLIZ2 = LIZ(str);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('#');
            sbLIZ3.append(strLIZ2);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("color:");
        sbLIZ4.append(str);
        sbLIZ4.append(" is illegal，please use supported formats: #RRGGBB,#RRGGBBAA,RRGGBB,RRGGBBAA");
        throw new C1549560qQU(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LIZLLL(int i, Activity activity) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        activity.getWindow().addFlags(67108864);
        View view = new View(activity);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(C786410Ut5.n3(activity.getResources(), "status_bar_height", "dimen", "android"))));
        view.setBackgroundColor(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        View viewFindViewById = activity.findViewById(R.id.eu1);
        if ((viewFindViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById) != null) {
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                viewGroup2.setFitsSystemWindows(true);
                viewGroup2.setClipToPadding(true);
            }
        }
    }

    public static void LJ(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (!z) {
                    decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                } else {
                    decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                }
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
