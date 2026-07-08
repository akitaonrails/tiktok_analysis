package X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.partnership.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886090zBH extends C09AY implements Function1<MotionEvent, Unit> {
    public final /* synthetic */ GameShortVideoAdDetailPageDialogFragment LL;
    public final /* synthetic */ C1884370z8V LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886090zBH(C1884370z8V c1884370z8V, GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment) {
        super(1);
        this.LL = gameShortVideoAdDetailPageDialogFragment;
        this.LLILLJJLI = c1884370z8V;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        boolean z;
        MotionEvent motionEvent2 = motionEvent;
        final GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LL;
        final C1884370z8V c1884370z8V = this.LLILLJJLI;
        gameShortVideoAdDetailPageDialogFragment.getClass();
        if (motionEvent2.getAction() == 0) {
            BottomSheetBehavior<?> bottomSheetBehavior = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.getState();
            }
            gameShortVideoAdDetailPageDialogFragment.LLJJIII = gameShortVideoAdDetailPageDialogFragment.LLJJI;
        }
        if (motionEvent2.getAction() == 1) {
            float f = gameShortVideoAdDetailPageDialogFragment.LLJJI;
            if (f > gameShortVideoAdDetailPageDialogFragment.LLJJIII) {
                z = true;
            } else {
                z = false;
            }
            if (0.1f <= f && f <= 0.5f) {
                HandlerHook.viewPost(c1884370z8V, new Runnable() { // from class: X.0zBG
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.onTouchActionEvent$1");
                        try {
                            if (c1884370z8V.getParent() != null) {
                                ViewGroup viewGroup = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                                if (viewGroup != null) {
                                    viewGroup.setScrollY(0);
                                }
                                BottomSheetBehavior<?> bottomSheetBehavior2 = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
                                if (bottomSheetBehavior2 != null) {
                                    bottomSheetBehavior2.setState(6);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.onTouchActionEvent$1");
                    }
                });
            }
            double d = gameShortVideoAdDetailPageDialogFragment.LLJJI;
            if (0.5d <= d && d <= 0.9d && !z) {
                HandlerHook.viewPost(c1884370z8V, new Runnable() { // from class: X.0zBI
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.onTouchActionEvent$2");
                        try {
                            ViewGroup viewGroup = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                            if (viewGroup != null) {
                                viewGroup.setScrollY(0);
                            }
                            BottomSheetBehavior<?> bottomSheetBehavior2 = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(6);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.onTouchActionEvent$2");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
