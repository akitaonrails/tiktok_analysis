package X;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$5$1$1", f = "PlayerOverlayPortraitLayout.kt", l = {}, m = "invokeSuspend")
public final class C459901qf extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490900JMy LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459901qf(C490900JMy c490900JMy, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(1, interfaceC1364105Vn);
        this.LL = c490900JMy;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459901qf(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinearLayout fullScreenContainer = this.LL.getFullScreenContainer();
        if (fullScreenContainer != null) {
            if (this.LLILLJJLI) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJZL(i, fullScreenContainer);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$5$1$1");
        return unit;
    }
}
