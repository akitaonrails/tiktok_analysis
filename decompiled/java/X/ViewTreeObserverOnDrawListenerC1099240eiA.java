package X;

import Y.ARunnableS117S0100000_17;
import android.text.Layout;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0eiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewTreeObserverOnDrawListenerC1099240eiA implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ LiveRoomUserInfoWidget LL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int lineCount;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.LL;
        C472860IgW c472860IgW = liveRoomUserInfoWidget.LLJJIJIIJIL;
        if (c472860IgW == null) {
            return;
        }
        liveRoomUserInfoWidget.getClass();
        Layout layout = c472860IgW.getLayout();
        if (layout == null || liveRoomUserInfoWidget.LLJJIJIIJIL.getVisibility() != 0 || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        liveRoomUserInfoWidget.LLZZZIL = true;
        HandlerHook.viewPost(this.LL.LLJJIJIIJIL, new ARunnableS117S0100000_17(this, 208));
    }

    public ViewTreeObserverOnDrawListenerC1099240eiA(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.LL = liveRoomUserInfoWidget;
    }
}
