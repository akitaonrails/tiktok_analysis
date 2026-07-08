package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.fangroup.assem.FanGroupListLogicAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DQT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQT extends C09AY implements Function2<UIAssem, C291001Au<? extends Unit>, Unit> {
    public final /* synthetic */ FanGroupListLogicAssem LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DQT(FanGroupListLogicAssem fanGroupListLogicAssem, float f) {
        super(2);
        this.LL = fanGroupListLogicAssem;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Unit> c291001Au) {
        View viewLJJIJL;
        final UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends Unit> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ() != null && (viewLJJIJL = uIAssem2.LJJIJL()) != null) {
            final FanGroupListLogicAssem fanGroupListLogicAssem = this.LL;
            final float f = this.LLILLJJLI;
            HandlerHook.viewPost(viewLJJIJL, new Runnable() { // from class: X.0DQS
                public final void LIZ() {
                    View viewLJJIJL2;
                    FrameLayout.LayoutParams layoutParams;
                    View viewLJJIJL3 = uIAssem2.LJJIJL();
                    FrameLayout.LayoutParams layoutParams2 = null;
                    if (viewLJJIJL3 == null || viewLJJIJL3.getParent() == null) {
                        return;
                    }
                    if ((((View) fanGroupListLogicAssem.LLJIJIL.getValue()).canScrollVertically(1) || ((View) fanGroupListLogicAssem.LLJIJIL.getValue()).canScrollVertically(-1)) && (viewLJJIJL2 = uIAssem2.LJJIJL()) != null) {
                        View viewLJJIJL4 = uIAssem2.LJJIJL();
                        ViewGroup.LayoutParams layoutParams3 = viewLJJIJL4 != null ? viewLJJIJL4.getLayoutParams() : null;
                        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                            layoutParams.height = (int) (f * 0.7f);
                            layoutParams2 = layoutParams;
                        }
                        C786410Ut5.W5(viewLJJIJL2, layoutParams2);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FanGroupListLogicAssem@d687.adjustPeekHeight$3$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FanGroupListLogicAssem@d687.adjustPeekHeight$3$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
