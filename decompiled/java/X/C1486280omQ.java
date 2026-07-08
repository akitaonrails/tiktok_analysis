package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0omQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486280omQ {
    public static int LIZ;
    public static int LIZIZ;

    public static boolean LJ(int i) {
        return i == 0 || i == 6 || i == 8 || i == 11;
    }

    public static boolean LJFF(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    public static void LIZ(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parent isnot ViewGroup. view.context: ");
                sbLIZ.append(view.getContext());
                sbLIZ.append(", parent: ");
                sbLIZ.append(parent);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            try {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("first remove crash. view.context: ");
                sbLIZ2.append(view.getContext());
                sbLIZ2.append(", parent: ");
                sbLIZ2.append(parent);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent2).endViewTransition(view);
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    Logger.throwException(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("second remove crash. view.context: ");
                    sbLIZ3.append(view.getContext());
                    sbLIZ3.append(", parent: ");
                    sbLIZ3.append(parent2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
    }

    public static int LIZIZ(Context context) {
        WindowManager windowManager;
        try {
            Activity activityLIZ = C1474460oTM.LIZ(context);
            if (activityLIZ != null && (windowManager = activityLIZ.getWindowManager()) != null) {
                int rotation = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGbfixMLpxHqze4BXUjV7DYMC+9ggEA9ioM2bg==", null)).getRotation();
                if (rotation == 0) {
                    return 1;
                }
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            return -1;
                        }
                        return 8;
                    }
                    return 9;
                }
                return 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return -1;
    }

    public static int LIZJ(Context context) {
        int iMax = 0;
        if (context == null) {
            return 0;
        }
        if (LIZ <= 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    if (baseContext instanceof Activity) {
                        Activity activity = (Activity) baseContext;
                        if (activity != null) {
                            C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKcGbfixMLpxHqze4BXUjV7DYMC+9ggEA9ioM2bg==", null)).getRealMetrics(displayMetrics);
                        }
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    iMax = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
                }
                LIZ = iMax;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZ;
    }

    public static int LIZLLL(Context context) {
        int iMin = 0;
        if (context == null) {
            return 0;
        }
        if (LIZIZ <= 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        break;
                    }
                    if (baseContext instanceof Activity) {
                        Activity activity = (Activity) baseContext;
                        if (activity != null) {
                            C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKcGbfixMLpxHqze4BXUjV7DYMC+9ggEA9ioM2bg==", null)).getRealMetrics(displayMetrics);
                        }
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                LIZIZ = iMin;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return LIZIZ;
    }
}
