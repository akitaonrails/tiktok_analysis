package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelPulldownSetting;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class RunnableC1132540fZs implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ ConstraintLayout LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C1133890fc3 LLILZIL;

    public RunnableC1132540fZs(Context context, View view, ConstraintLayout constraintLayout, C1133890fc3 c1133890fc3, boolean z) {
        this.LL = view;
        this.LLILLJJLI = z;
        this.LLILLL = constraintLayout;
        this.LLILZ = context;
        this.LLILZIL = c1133890fc3;
    }

    public final void LIZ() {
        final int iLJIIIZ;
        final int iLJIIIZ2;
        int[] iArr = new int[2];
        this.LL.getLocationInWindow(iArr);
        final int i = iArr[0];
        final int width = i + this.LL.getWidth();
        final int i2 = iArr[1];
        final boolean zIsPad = ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad();
        if (zIsPad) {
            InterfaceC469390Iav interfaceC469390Iav = ((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).MR().get();
            iLJIIIZ = (interfaceC469390Iav == null || !interfaceC469390Iav.St()) ? C497740JfY.LJIIIZ(R.dimen.aq8) : C497740JfY.LJIIIZ(R.dimen.aq9);
            iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.aq4);
        } else {
            iLJIIIZ = this.LLILLJJLI ? C497740JfY.LJIIIZ(R.dimen.aq6) : C497740JfY.LJIIIZ(R.dimen.aq7);
            iLJIIIZ2 = this.LLILLJJLI ? C497740JfY.LJIIIZ(R.dimen.aq2) : C497740JfY.LJIIIZ(R.dimen.aq3);
        }
        if (LiveGiftPanelPulldownSetting.INSTANCE.isEnabled()) {
            final ConstraintLayout constraintLayout = this.LLILLL;
            final Context context = this.LLILZ;
            final boolean z = this.LLILLJJLI;
            HandlerHook.viewPost(constraintLayout, new Runnable() { // from class: X.0fZx
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GiftPanelLayoutHelper@b7b9.setPanelAndCPCRelativePosInPad$1$1");
                    try {
                        C1129410fUp.LIZIZ(context, z, constraintLayout, iLJIIIZ, iLJIIIZ2, i, width, i2, zIsPad);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GiftPanelLayoutHelper@b7b9.setPanelAndCPCRelativePosInPad$1$1");
                }
            });
        } else {
            C1129410fUp.LIZIZ(this.LLILZ, this.LLILLJJLI, this.LLILLL, iLJIIIZ, iLJIIIZ2, i, width, i2, zIsPad);
        }
        ViewTreeObserver viewTreeObserver = this.LLILLL.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n = new ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(this.LLILLL, this.LLILZIL, 4);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151710g4n, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelLayoutHelper@b7b9.setPanelAndCPCRelativePosInPad$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelLayoutHelper@b7b9.setPanelAndCPCRelativePosInPad$1");
    }
}
