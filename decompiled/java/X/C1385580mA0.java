package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0mA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385580mA0 {
    public static final long LIZ(AndroidComposeView androidComposeView) {
        Activity activity;
        InterfaceC1385590mA1 interfaceC1385590mA1;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof Activity) {
                activity = (Activity) baseContext;
                break;
            }
            if (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity != null) {
            InterfaceC1385590mA1.LIZ.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                interfaceC1385590mA1 = new InterfaceC1385590mA1() { // from class: X.0mA3
                    @Override // X.InterfaceC1385590mA1
                    public final Rect LIZ(Activity activity2) {
                        return ((WindowManager) activity2.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
                    }
                };
            } else if (i >= 29) {
                interfaceC1385590mA1 = new InterfaceC1385590mA1() { // from class: X.12Ki
                    @Override // X.InterfaceC1385590mA1
                    public final Rect LIZ(Activity activity2) throws Exception {
                        boolean z;
                        boolean z2;
                        Configuration configuration = activity2.getResources().getConfiguration();
                        boolean z3 = true;
                        try {
                            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(configuration);
                            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (e instanceof NoSuchFieldException) {
                                z = true;
                            } else {
                                z = e instanceof NoSuchMethodException;
                            }
                            if (z) {
                                z2 = true;
                            } else {
                                z2 = e instanceof IllegalAccessException;
                            }
                            if (!z2) {
                                z3 = e instanceof InvocationTargetException;
                            }
                            if (z3) {
                                return C19738012Kk.LIZIZ.LIZ(activity2);
                            }
                            throw e;
                        }
                    }
                };
            } else if (i >= 28) {
                interfaceC1385590mA1 = C19738012Kk.LIZIZ;
            } else if (i >= 24) {
                interfaceC1385590mA1 = new InterfaceC1385590mA1() { // from class: X.0m9R
                    @Override // X.InterfaceC1385590mA1
                    public final Rect LIZ(Activity activity2) {
                        int dimensionPixelSize;
                        Rect rect = new Rect();
                        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
                        defaultDisplay.getRectSize(rect);
                        if (!activity2.isInMultiWindowMode()) {
                            Point point = new Point();
                            defaultDisplay.getRealSize(point);
                            Resources resources = activity2.getResources();
                            int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
                            if (iN3 > 0) {
                                dimensionPixelSize = resources.getDimensionPixelSize(iN3);
                            } else {
                                dimensionPixelSize = 0;
                            }
                            int i2 = rect.bottom + dimensionPixelSize;
                            if (i2 == point.y) {
                                rect.bottom = i2;
                            } else {
                                int i3 = rect.right + dimensionPixelSize;
                                if (i3 == point.x) {
                                    rect.right = i3;
                                    return rect;
                                }
                            }
                        }
                        return rect;
                    }
                };
            } else {
                interfaceC1385590mA1 = new InterfaceC1385590mA1() { // from class: X.0m9S
                    @Override // X.InterfaceC1385590mA1
                    public final Rect LIZ(Activity activity2) {
                        int i2;
                        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect();
                        int i3 = point.x;
                        if (i3 != 0 && (i2 = point.y) != 0) {
                            rect.right = i3;
                            rect.bottom = i2;
                            return rect;
                        }
                        defaultDisplay.getRectSize(rect);
                        return rect;
                    }
                };
            }
            Rect rectLIZ = interfaceC1385590mA1.LIZ(activity);
            return (((long) rectLIZ.height()) & 4294967295L) | (((long) rectLIZ.width()) << 32);
        }
        Configuration configuration = context.getResources().getConfiguration();
        float f = context.getResources().getDisplayMetrics().density;
        return (((long) Math.round(configuration.screenHeightDp * f)) & 4294967295L) | (((long) Math.round(configuration.screenWidthDp * f)) << 32);
    }
}
