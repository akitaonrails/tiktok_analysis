package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$3$1$1", f = "PlayerOverlayPortraitLayout.kt", l = {}, m = "invokeSuspend")
public final class C0JNC extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490900JMy LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNC(C490900JMy c490900JMy, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(1, interfaceC1364105Vn);
        this.LL = c490900JMy;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNC(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C491160JNy seekbarContainer = this.LL.getSeekbarContainer();
        if (seekbarContainer != null) {
            seekbarContainer.setSeekbarVisibility(!this.LLILLJJLI);
        }
        C491160JNy seekbarContainer2 = this.LL.getSeekbarContainer();
        if (seekbarContainer2 != null) {
            seekbarContainer2.setBufferBarVisibility(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$3$1$1");
        return unit;
    }
}
