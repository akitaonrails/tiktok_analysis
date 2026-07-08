package X;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* JADX INFO: renamed from: X.0txO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685280txO {
    public static final ViewGroup.LayoutParams LIZ = new ViewGroup.LayoutParams(-2, -2);

    public static void LIZ(ComponentActivity componentActivity, C19719212De c19719212De) {
        ComposeView composeView;
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if ((childAt instanceof ComposeView) && (composeView = (ComposeView) childAt) != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(c19719212De);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(c19719212De);
        View decorView = componentActivity.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.get(decorView) == null) {
            ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
            ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (C1688560u2g.LIZ(decorView) == null) {
            C1688560u2g.LIZIZ(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, LIZ);
    }
}
