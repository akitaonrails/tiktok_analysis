package X;

import Y.ARunnableS2S0600000_6;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0GfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421290GfX {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context, Bitmap bitmap, Rect rect, Rect rect2, Runnable runnable) {
        ViewGroup viewGroup;
        if (context != null && bitmap != null && rect != null && rect2 != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ == null) {
                runnable.run();
                return;
            }
            View viewFindViewById = activityLIZ.findViewById(R.id.content);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            } else {
                Window window = activityLIZ.getWindow();
                View decorView = null;
                if (window != null) {
                    decorView = window.getDecorView();
                }
                if (decorView instanceof ViewGroup) {
                    viewGroup = (ViewGroup) decorView;
                }
                runnable.run();
                return;
            }
            if (viewGroup != null) {
                HandlerHook.viewPost(viewGroup, new ARunnableS2S0600000_6(viewGroup, activityLIZ, bitmap, rect, rect2, runnable, 0));
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }
}
