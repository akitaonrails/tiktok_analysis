package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$initObserver$1$2$1$1", f = "PlayerOverlayLandscapeLayout.kt", l = {}, m = "invokeSuspend")
public final class C491060JNo extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C490990JNh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491060JNo(boolean z, C490990JNh c490990JNh, InterfaceC1364105Vn<? super C491060JNo> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c490990JNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491060JNo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getPlayContainer());
            C500260Jjc.LJIILLIIL(this.LLILLJJLI.getTopBar());
        } else {
            C500260Jjc.LLFFF(this.LLILLJJLI.getPlayContainer());
            C500260Jjc.LLFFF(this.LLILLJJLI.getTopBar());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$2$1$1");
        return unit;
    }
}
