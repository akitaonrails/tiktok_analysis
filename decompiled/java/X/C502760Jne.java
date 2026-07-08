package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0Jne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502760Jne {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, EditText editText) {
        Activity activityLIZ;
        Window window;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            int requestedOrientation = activityLIZ.getRequestedOrientation();
            if (requestedOrientation == 0 || requestedOrientation == 8 || requestedOrientation == 6 || requestedOrientation == 11) {
                if (editText != null) {
                    editText.setImeOptions(268435456);
                }
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (activityLIZ2 != null && (window = activityLIZ2.getWindow()) != null) {
                    window.setSoftInputMode(32);
                }
            }
        }
    }

    public static void LIZIZ(Dialog dialog, FrameLayout frameLayout) {
        WindowManager.LayoutParams attributes;
        View decorView;
        View decorView2;
        if (dialog != null) {
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(false);
            }
            Window window = dialog.getWindow();
            if (window != null && (decorView2 = window.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(3846);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    attributes = window2.getAttributes();
                    if (attributes != null) {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                } else {
                    attributes = null;
                }
                Window window3 = dialog.getWindow();
                if (window3 != null) {
                    window3.setAttributes(attributes);
                }
                Window window4 = dialog.getWindow();
                if (window4 != null && (decorView = window4.getDecorView()) != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
        }
    }
}
