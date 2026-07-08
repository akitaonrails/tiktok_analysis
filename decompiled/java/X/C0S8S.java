package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S8S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S8S {
    public final FrameLayout LIZ;
    public final FrameLayout LIZIZ;
    public final InterfaceC717360SBy LIZJ;
    public C0S89<Object> LIZLLL;
    public C0S87<Object> LJ;
    public C0S8T LJFF;
    public boolean LJI;

    public final InterfaceC716320S7y LIZ(C0S8V c0s8v) {
        C0SBU c0sbuLIZ;
        ComposeView composeView;
        FrameLayout frameLayout;
        Context context;
        FrameLayout frameLayout2;
        C0S8T c0s8t = this.LJFF;
        if (c0s8t != null) {
            c0sbuLIZ = c0s8t.LIZ();
        } else {
            c0sbuLIZ = null;
        }
        if (!Intrinsics.LJFF(c0sbuLIZ, c0s8v.LIZIZ())) {
            if (this.LJFF != null && (frameLayout2 = this.LIZ) != null) {
                C786410Ut5.LJJJJIZL(frameLayout2);
            }
            FrameLayout frameLayout3 = this.LIZ;
            if (frameLayout3 != null && (context = frameLayout3.getContext()) != null) {
                ComposeView composeView2 = new ComposeView(context, null, 6);
                C786410Ut5.k6(composeView2, new ViewGroup.LayoutParams(-1, -1));
                C1669670tYD.LJ(composeView2, EnumC1427810nG7.Auto, new C19719212De(1837368865, new AwS633S0100000_19(c0s8v, 291), true));
                this.LJFF = new C0S8T(c0s8v, composeView2);
            }
            C0S8T c0s8t2 = this.LJFF;
            if (c0s8t2 != null && (composeView = c0s8t2.LIZIZ) != null && (frameLayout = this.LIZ) != null) {
                frameLayout.addView(composeView);
            }
        }
        C0S8T c0s8t3 = this.LJFF;
        if (c0s8t3 != null) {
            return c0s8t3;
        }
        throw new IllegalStateException("fullFetchOverlayView is null after initialization");
    }

    public C0S8S(FrameLayout frameLayout, FrameLayout frameLayout2, C0S8G c0s8g) {
        this.LIZ = frameLayout;
        this.LIZIZ = frameLayout2;
        this.LIZJ = c0s8g;
    }
}
