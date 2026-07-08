package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS455S0200000_19;

/* JADX INFO: renamed from: X.0EG9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG9 {
    public static void LIZ(ViewGroup viewGroup, Function0 function0) {
        ViewGroup.LayoutParams layoutParams;
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-438595842, new AwS455S0200000_19(c1685760tyA, function0, 54), true));
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388629;
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof ConstraintLayout) {
            C19ME c19me = new C19ME(-2, -2);
            c19me.endToEnd = 0;
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            layoutParams = c19me;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        C786410Ut5.k6(composeView, layoutParams);
        viewGroup.addView(composeView);
    }
}
