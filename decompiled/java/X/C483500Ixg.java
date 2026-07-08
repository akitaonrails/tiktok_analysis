package X;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ixg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483500Ixg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity) {
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

    public static void LIZIZ(int i, Activity activity) {
        activity.getWindow().addFlags(67108864);
        View view = new View(activity);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(C786410Ut5.n3(activity.getResources(), "status_bar_height", "dimen", "android"))));
        view.setBackgroundColor(i);
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.eu1);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        viewGroup2.setFitsSystemWindows(true);
        viewGroup2.setClipToPadding(true);
    }
}
