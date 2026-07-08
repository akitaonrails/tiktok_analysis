package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qQ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549350qQ9 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[Catch: all -> 0x00e1, PHI: r5
      0x0069: PHI (r5v2 android.view.View) = (r5v0 android.view.View), (r5v4 android.view.View) binds: [B:35:0x005c, B:40:0x0067] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00e1, blocks: (B:34:0x0058, B:41:0x0069, B:42:0x006c, B:44:0x0073, B:45:0x0076, B:39:0x0063), top: B:81:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.view.Window r8, android.view.View r9, com.bytedance.hybrid.spark.third.container.SparkThirdPopUp r10) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549350qQ9.LIZ(android.view.Window, android.view.View, com.bytedance.hybrid.spark.third.container.SparkThirdPopUp):int");
    }

    public static boolean LIZJ(View view, Window window, View view2) {
        int i;
        boolean z;
        boolean z2;
        View view3;
        WindowManager.LayoutParams attributes;
        if (view == null) {
            return false;
        }
        if (window != null && (attributes = window.getAttributes()) != null) {
            i = attributes.flags;
        } else {
            i = 0;
        }
        if ((view.getWindowSystemUiVisibility() & 512) != 0 && (134217728 & i) == 0 && (Integer.MIN_VALUE & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view3 = (View) parent) != null && view3.getPaddingBottom() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(Window window, SparkPopupSchemaParam sparkPopupSchemaParam, SparkThirdPopUp sparkThirdPopUp, boolean z) {
        View decorView;
        Context context;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        Window windowN7 = sparkThirdPopUp.n7();
        Context context2 = null;
        if (windowN7 != null) {
            decorView = windowN7.getDecorView();
            context = windowN7.getContext();
        } else {
            decorView = null;
            context = null;
        }
        int realHeight = sparkPopupSchemaParam.getRealHeight(context);
        int iLIZ = -1;
        if (!z && (bottomSheetBehavior = sparkThirdPopUp.LLJILJILJ) != null && bottomSheetBehavior.LJJIIJ == 3 && sparkPopupSchemaParam.getDragHeight() > 0) {
            realHeight = sparkPopupSchemaParam.getDragHeight();
        }
        if (realHeight > 0) {
            if (windowN7 != null) {
                if (sparkThirdPopUp.RR(null) <= 0 ? realHeight <= (iLIZ = LIZ(windowN7, sparkThirdPopUp.getView(), sparkThirdPopUp)) : realHeight <= (iLIZ = LIZ(windowN7, sparkThirdPopUp.getView(), sparkThirdPopUp) - sparkThirdPopUp.RR(null))) {
                    iLIZ = realHeight;
                }
                LIZJ(decorView, window, sparkThirdPopUp.getView());
                C20246014Ju c20246014Ju = sparkThirdPopUp.LLJJJJ;
                if (c20246014Ju != null) {
                    c20246014Ju.LJIIIIZZ(8);
                }
                return iLIZ;
            }
            return realHeight;
        }
        if (realHeight == 0) {
            if (windowN7 != null) {
                context2 = windowN7.getContext();
            }
            if (Intrinsics.LJFF(sparkPopupSchemaParam.getRealGravity(context2), "center") && windowN7 != null) {
                return C416070GTd.LIZ(400.0d, windowN7.getContext());
            }
            return iLIZ;
        }
        return realHeight;
    }
}
