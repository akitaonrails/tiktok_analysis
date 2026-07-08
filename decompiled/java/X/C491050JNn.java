package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$getMinimiseOverlayUIJob$1$1", f = "PlayerOverlayLandscapeLayout.kt", l = {}, m = "invokeSuspend")
public final class C491050JNn extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490990JNh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491050JNn(C490990JNh c490990JNh, InterfaceC1364105Vn<? super C491050JNn> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c490990JNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491050JNn(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.getMinimiseOverlayUIJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View contentContainer = this.LL.getContentContainer();
        if (contentContainer != null) {
            C500260Jjc.LJIILLIIL(contentContainer);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.getMinimiseOverlayUIJob$1$1");
        return unit;
    }
}
