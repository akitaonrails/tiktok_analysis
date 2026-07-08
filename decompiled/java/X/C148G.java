package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.microsoft.device.display.DisplayMask;
import java.util.List;

/* JADX INFO: renamed from: X.148G, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148G {
    public static int LIZ(Context context) {
        try {
            return C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKnbpre3TXNp0F1wA4pqX87OcHE81NvHLSur4TVVwcS4kU=", null)).getRotation();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static Rect LIZIZ(Context context) {
        DisplayMask displayMaskFromResourcesRectApproximation;
        if (LJ(context) && (displayMaskFromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(context)) != null) {
            List<Rect> boundingRectsForRotation = displayMaskFromResourcesRectApproximation.getBoundingRectsForRotation(LIZ(context));
            if (boundingRectsForRotation.size() == 0) {
                return new Rect(0, 0, 0, 0);
            }
            return (Rect) ListProtector.get(boundingRectsForRotation, 0);
        }
        return null;
    }

    public static List LIZJ(Context context) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rectLIZIZ = LIZIZ(context);
        Rect rectLIZLLL = LIZLLL(context);
        if (rectLIZIZ != null) {
            if (rectLIZIZ.left > 0) {
                rect.left = 0;
                rect.right = rectLIZIZ.left;
                rect.top = 0;
                rect.bottom = rectLIZLLL.bottom;
                rect2.left = rectLIZIZ.right;
                rect2.right = rectLIZLLL.right;
                rect2.top = 0;
                rect2.bottom = rectLIZLLL.bottom;
            } else {
                rect.left = 0;
                rect.right = rectLIZLLL.right;
                rect.top = 0;
                rect.bottom = rectLIZIZ.top;
                rect2.left = 0;
                rect2.right = rectLIZLLL.right;
                rect2.top = rectLIZIZ.bottom;
                rect2.bottom = rectLIZLLL.bottom;
            }
        }
        if (!rect.isEmpty() && !rect2.isEmpty()) {
            return C1697810uHb.LJIIJJI(rect, rect2);
        }
        return null;
    }

    public static Rect LIZLLL(Context context) {
        Rect rect = new Rect();
        C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKnbpre3TXNp0F1wA4pqX87OcHE81NvHLSur4TVVwcS4kU=", null)).getRectSize(rect);
        return rect;
    }

    public static boolean LJ(Context context) {
        Boolean boolValueOf;
        boolean zHasSystemFeature;
        if (C148H.LIZ == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    zHasSystemFeature = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                } else {
                    zHasSystemFeature = false;
                }
                boolValueOf = Boolean.valueOf(zHasSystemFeature);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                boolValueOf = Boolean.FALSE;
            }
            C148H.LIZ = boolValueOf;
        }
        Boolean bool = C148H.LIZ;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJFF(Context context) {
        Rect rectLIZIZ = LIZIZ(context);
        Rect rectLIZLLL = LIZLLL(context);
        if (rectLIZIZ != null && rectLIZLLL.width() > 0 && rectLIZLLL.height() > 0) {
            return rectLIZIZ.intersect(rectLIZLLL);
        }
        return false;
    }
}
