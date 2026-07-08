package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.14bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20299214bm {
    public View LIZ;
    public boolean LIZIZ;
    public final C20299414bo LIZJ;
    public final Context LIZLLL;
    public final ViewGroup LJ;

    public final void LIZIZ() throws Throwable {
        ViewGroup viewGroup;
        Activity activityLIZJ;
        Window window;
        if (this.LIZIZ) {
            this.LIZIZ = false;
            Context context = this.LIZLLL;
            LIZLLL(context, true);
            Activity activityLIZJ2 = LIZJ(context);
            if (activityLIZJ2 != null && (window = activityLIZJ2.getWindow()) != null) {
                window.clearFlags(1024);
                View decorView = window.getDecorView();
                if (decorView != null) {
                    decorView.setSystemUiVisibility(1792);
                }
            }
            if (LIZ(this.LIZLLL) && (activityLIZJ = LIZJ(this.LIZLLL)) != null) {
                activityLIZJ.setRequestedOrientation(-1);
            }
            Activity activityLIZJ3 = LIZJ(this.LIZLLL);
            if (activityLIZJ3 != null && (viewGroup = (ViewGroup) activityLIZJ3.findViewById(R.id.content)) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZJ, viewGroup);
            }
            C20299414bo c20299414bo = this.LIZJ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c20299414bo, null);
            c20299414bo.removeAllViews();
            this.LJ.addView(this.LIZ, new ViewGroup.LayoutParams(-1, -1));
            this.LJ.requestLayout();
        }
    }

    public static boolean LIZ(Context context) {
        Activity activityLIZJ = LIZJ(context);
        if (activityLIZJ == null) {
            return false;
        }
        try {
            PackageManager packageManager = activityLIZJ.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            if ((packageManager.getActivityInfo(activityLIZJ.getComponentName(), 128).configChanges & 128) != 0) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static Activity LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return LIZJ(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14bo, android.view.View] */
    public C20299214bm(final Context context, ViewGroup viewGroup) {
        ?? r1 = new RelativeLayout(context) { // from class: X.14bo
            @Override // android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        this.LIZJ = r1;
        r1.setOnKeyListener(new View.OnKeyListener() { // from class: X.14bn
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) throws Throwable {
                if (this.LL.LIZIZ && keyEvent.getAction() == 1 && i == 4) {
                    this.LL.LIZIZ();
                    return true;
                }
                return false;
            }
        });
        this.LIZLLL = context;
        this.LJ = viewGroup;
    }

    public static void LIZLLL(Context context, boolean z) throws Throwable {
        Method method;
        String str;
        try {
            Activity activityLIZJ = LIZJ(context);
            if (activityLIZJ != null && (method = activityLIZJ.getClass().getMethod("getSupportActionBar", new Class[0])) != null) {
                method.setAccessible(true);
                Object objInvoke = method.invoke(activityLIZJ, new Object[0]);
                if (objInvoke != null) {
                    Method method2 = objInvoke.getClass().getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(objInvoke, Boolean.FALSE);
                    Class<?> cls = objInvoke.getClass();
                    if (z) {
                        str = "show";
                    } else {
                        str = "hide";
                    }
                    Method method3 = cls.getMethod(str, new Class[0]);
                    method3.setAccessible(true);
                    C2204961BRm.a0(method3, objInvoke, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/B0jdsW/iqhIS1GDqwsMs9wlTIn642QVeqbScVAy/deilf0B39RVnnGQ==", null));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
