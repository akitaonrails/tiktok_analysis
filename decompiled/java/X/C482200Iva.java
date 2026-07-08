package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482200Iva {
    public static final Map<Integer, Boolean> LIZ = new HashMap();
    public static final Map<Integer, Boolean> LIZIZ = new HashMap();

    public static final void LIZ(Activity activity) {
        ViewGroup viewGroup;
        if (activity != null && (viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)) != null && !(viewGroup instanceof GestureDetectorOnGestureListenerC1848670yCv) && !(viewGroup.getChildAt(0) instanceof GestureDetectorOnGestureListenerC1848670yCv)) {
            if (Intrinsics.LJFF(viewGroup.getClass(), FrameLayout.class)) {
                GestureDetectorOnGestureListenerC1848670yCv gestureDetectorOnGestureListenerC1848670yCv = new GestureDetectorOnGestureListenerC1848670yCv(activity);
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    C786410Ut5.LJJLIL(0, viewGroup);
                    gestureDetectorOnGestureListenerC1848670yCv.addView(childAt, childAt.getLayoutParams());
                }
                Window window = activity.getWindow();
                try {
                    Field declaredField = window.getClass().getDeclaredField("mContentParent");
                    declaredField.setAccessible(true);
                    if (declaredField.get(window) != null) {
                        declaredField.set(window, gestureDetectorOnGestureListenerC1848670yCv);
                        gestureDetectorOnGestureListenerC1848670yCv.setId(R.id.content);
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                        int iIndexOfChild = viewGroup2.indexOfChild(viewGroup);
                        C786410Ut5.LJJLJLI(viewGroup, viewGroup2);
                        viewGroup2.addView(gestureDetectorOnGestureListenerC1848670yCv, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                viewGroup.addView(gestureDetectorOnGestureListenerC1848670yCv, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            GestureDetectorOnGestureListenerC1848670yCv gestureDetectorOnGestureListenerC1848670yCv2 = new GestureDetectorOnGestureListenerC1848670yCv(activity);
            while (viewGroup.getChildCount() > 0) {
                View childAt2 = viewGroup.getChildAt(0);
                C786410Ut5.LJJLIL(0, viewGroup);
                gestureDetectorOnGestureListenerC1848670yCv2.addView(childAt2, childAt2.getLayoutParams());
            }
            viewGroup.addView(gestureDetectorOnGestureListenerC1848670yCv2, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
