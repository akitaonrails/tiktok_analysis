package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$1$1$1", f = "PlayerOverlayPortraitLayout.kt", l = {}, m = "invokeSuspend")
public final class C449201ow extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C490900JMy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C449201ow(C490900JMy c490900JMy, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(1, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c490900JMy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C449201ow(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getHeaderSection());
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getDetailSection());
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getCenterSection());
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getBottomSection());
        } else {
            C500260Jjc.LLFFF(this.LLILLJJLI.getHeaderSection());
            C500260Jjc.LLFFF(this.LLILLJJLI.getDetailSection());
            C500260Jjc.LLFFF(this.LLILLJJLI.getCenterSection());
            C500260Jjc.LLFFF(this.LLILLJJLI.getBottomSection());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$1$1$1");
        return unit;
    }
}
