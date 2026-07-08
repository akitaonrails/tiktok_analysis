package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$initObserver$1$6$1$1", f = "PlayerOverlayLandscapeLayout.kt", l = {}, m = "invokeSuspend")
public final class C491040JNm extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C490990JNh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491040JNm(boolean z, C490990JNh c490990JNh, InterfaceC1364105Vn<? super C491040JNm> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c490990JNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491040JNm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$6$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C1390410mHn loadingBall = this.LLILLJJLI.getLoadingBall();
            if (loadingBall != null) {
                loadingBall.LIZJ();
            }
            C1390410mHn loadingBall2 = this.LLILLJJLI.getLoadingBall();
            if (loadingBall2 != null) {
                C500260Jjc.LLFFF(loadingBall2);
            }
        } else {
            C1390410mHn loadingBall3 = this.LLILLJJLI.getLoadingBall();
            if (loadingBall3 != null) {
                C500260Jjc.LJIILLIIL(loadingBall3);
            }
            C1390410mHn loadingBall4 = this.LLILLJJLI.getLoadingBall();
            if (loadingBall4 != null) {
                loadingBall4.LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$6$1$1");
        return unit;
    }
}
