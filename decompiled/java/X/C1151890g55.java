package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0g55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151890g55 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$0(C1151890g55 c1151890g55, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151890g55(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C1151890g55 c1151890g55, CoroutineContext coroutineContext, Throwable th) {
        C20441214yg.LJFF("GiftPanel.Coord", "[Coordinator] Uncaught coroutine exception", th);
        C1AF0.LJFF(th, "GiftPanelCoordinator.coroutine");
    }

    public static final void LJJ$2(C1151890g55 c1151890g55, CoroutineContext coroutineContext, Throwable th) {
        C20441214yg.LJ("GiftGuide", String.valueOf(th));
        C1AF0.LIZJ("GiftGuideWidgetViewModel.sendGiftCoroutine");
    }

    public static final void LJJ$3(C1151890g55 c1151890g55, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coroutineExceptionHandler, exception = ");
        sbLIZ.append(th);
        C1141240fnu.LIZIZ("LiveGiftPlayControllerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$4(C1151890g55 c1151890g55, CoroutineContext coroutineContext, Throwable th) {
        C20441214yg.LJI("GiftAnchorPanelEventTracker", th);
        C1AF0.LJFF(th, "GiftAnchorPanelEventTracker");
    }
}
