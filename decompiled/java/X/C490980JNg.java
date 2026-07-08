package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayBaseLayout$initObserver$1$1$1$1", f = "PlayerOverlayBaseLayout.kt", l = {}, m = "invokeSuspend")
public final class C490980JNg extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC490940JNc LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490980JNg(AbstractC490940JNc abstractC490940JNc, float f, InterfaceC1364105Vn<? super C490980JNg> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = abstractC490940JNc;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C490980JNg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayBaseLayout@52ac.initObserver$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C491160JNy seekbarContainer = this.LL.getSeekbarContainer();
        if (seekbarContainer != null) {
            seekbarContainer.setSeekbarProgress(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayBaseLayout@52ac.initObserver$1$1$1$1");
        return unit;
    }
}
