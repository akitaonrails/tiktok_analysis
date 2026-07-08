package X;

import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import ln3.a;

/* JADX INFO: renamed from: X.0uIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1698170uIB implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1698170uIB viewTreeObserverOnGlobalLayoutListenerC1698170uIB) {
        a aVar = (a) ((ExteriorVideoRecordScene) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).LLJZIJLIL.LJIIL(null, a.class);
        if (aVar != null) {
            aVar.AE0(true);
        }
        C786410Ut5.C3(((ExteriorVideoRecordScene) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).getWindow().getDecorView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698170uIB);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1698170uIB viewTreeObserverOnGlobalLayoutListenerC1698170uIB) {
        a aVar = (a) ((TTEPEffectPreviewActivity) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).LLIZLLLIL.LJIIL(null, a.class);
        if (aVar != null) {
            aVar.AE0(true);
        }
        C786410Ut5.C3(((TTEPEffectPreviewActivity) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).getWindow().getDecorView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698170uIB);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1698170uIB viewTreeObserverOnGlobalLayoutListenerC1698170uIB) {
        a aVar = (a) ((FTCVideoRecordNewActivity) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).LLJ.LJIIL(null, a.class);
        if (aVar != null) {
            aVar.AE0(true);
        }
        C786410Ut5.C3(((FTCVideoRecordNewActivity) viewTreeObserverOnGlobalLayoutListenerC1698170uIB.l0).getWindow().getDecorView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1698170uIB);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1698170uIB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
