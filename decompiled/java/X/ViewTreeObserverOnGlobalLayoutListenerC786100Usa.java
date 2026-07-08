package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.broadcast.shortcutpanel.BaseSubShortCutPanelWidget;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.android.livesdk.userinfowidget.TryModeUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Usa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC786100Usa implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa) {
        C786410Ut5.C3(((C16F5) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC786100Usa);
        if (((C16F5) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getLineCount() > 3) {
            C500260Jjc.LJIILIIL((C16F5) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa) {
        View view = ((TryModeUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getView();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC786100Usa);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC786100Usa, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            view.getLocationOnScreen(new int[2]);
            view.getHeight();
            if (C497740JfY.LJII() != null) {
                C497740JfY.LJIJ();
                C497740JfY.LIZIZ(52.0f);
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa) {
        C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC786100Usa);
        if (((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getLineCount() == 2) {
            ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).setTuxFont(82);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa) {
        int height;
        ViewTreeObserver viewTreeObserver;
        View view = ((BaseSubShortCutPanelWidget) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getView();
        if (view != null && (height = view.getHeight()) > 0) {
            DataChannel dataChannel = ((BaseSubShortCutPanelWidget) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(ShortCutPanelShowChannel.class, Integer.valueOf(height));
            }
            View view2 = ((BaseSubShortCutPanelWidget) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).getView();
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa2 = ((BaseSubShortCutPanelWidget) viewTreeObserverOnGlobalLayoutListenerC786100Usa.l0).LLILZ;
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC786100Usa2);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC786100Usa2, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC786100Usa(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
