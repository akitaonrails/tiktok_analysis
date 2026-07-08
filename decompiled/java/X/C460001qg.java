package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$6$1$1", f = "PlayerOverlayPortraitLayout.kt", l = {}, m = "invokeSuspend")
public final class C460001qg extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490900JMy LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C460001qg(C490900JMy c490900JMy, int i, InterfaceC1364105Vn<? super C460001qg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c490900JMy;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C460001qg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$6$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinearLayout fullScreenContainer = this.LL.getFullScreenContainer();
        if (fullScreenContainer != null) {
            LinearLayout fullScreenContainer2 = this.LL.getFullScreenContainer();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (fullScreenContainer2 != null) {
                layoutParams = fullScreenContainer2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = this.LLILLJJLI + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(10)));
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.d6(fullScreenContainer, marginLayoutParams2);
        }
        LinearLayout fullScreenContainer3 = this.LL.getFullScreenContainer();
        if (fullScreenContainer3 != null) {
            Boolean.valueOf(HandlerHook.viewPost(fullScreenContainer3, new RunnableC514801zW(this.LL, 118)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$6$1$1");
        return unit;
    }
}
