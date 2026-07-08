package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetQuickReturnReuseSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0Iae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469220Iae {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) {
        if (context != null) {
            LiveWidgetQuickReturnReuseSetting liveWidgetQuickReturnReuseSetting = LiveWidgetQuickReturnReuseSetting.INSTANCE;
            if (liveWidgetQuickReturnReuseSetting.enable() && C0IJ7.LIZIZ(context)) {
                LiveWidgetProviderProxy.Companion companion = LiveWidgetProviderProxy.Companion;
                companion.getInstance().clearNonWhitelist(AFwS237S0000000_7.get$arr$(301));
                companion.getInstance().scheduleDelayedClear(liveWidgetQuickReturnReuseSetting.getDelayMillis());
                return;
            }
        }
        LiveWidgetProviderProxy.Companion.getInstance().clearAll();
    }

    public static void LIZIZ(C0J4A c0j4a, Class cls, final FrameLayout frameLayout) {
        final LiveRecyclableWidget liveRecyclableWidget;
        LiveWidgetProviderProxy.Companion companion = LiveWidgetProviderProxy.Companion;
        if (companion.getInstance().hasMarked(cls)) {
            return;
        }
        IRecyclableWidget iRecyclableWidgetProvide = companion.getInstance().provide(cls);
        if (iRecyclableWidgetProvide instanceof LiveRecyclableWidget) {
            liveRecyclableWidget = (LiveRecyclableWidget) iRecyclableWidgetProvide;
            if (liveRecyclableWidget != null) {
                liveRecyclableWidget.dataChannel = new DataChannel();
                if (Integer.valueOf(liveRecyclableWidget.getLayoutId()) != null && (liveRecyclableWidget == null || liveRecyclableWidget.getLayoutId() != 0)) {
                    int layoutId = liveRecyclableWidget.getLayoutId();
                    C0IR4 c0ir4 = new C0IR4() { // from class: X.0Iaf
                        @Override // X.C0IR4
                        public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                            C786410Ut5.LJJJZ(view, frameLayout);
                            liveRecyclableWidget.setContentView(view);
                            LiveWidgetProviderProxy.Companion.getInstance().recycleRecyclableWidget(liveRecyclableWidget);
                        }
                    };
                    C0J40 c0j40LIZIZ = c0j4a.LIZJ.LLILLL.LIZIZ();
                    if (c0j40LIZIZ == null) {
                        c0j40LIZIZ = new C0J40();
                    }
                    c0j40LIZIZ.LIZ = c0j4a;
                    c0j40LIZIZ.LIZJ = layoutId;
                    c0j40LIZIZ.LIZLLL = 0;
                    c0j40LIZIZ.LIZIZ = frameLayout;
                    c0j40LIZIZ.LJI = c0ir4;
                    c0j40LIZIZ.LJFF = null;
                    c0j40LIZIZ.LJIIJJI = false;
                    c0j40LIZIZ.LJIIJ = false;
                    c0j4a.LIZJ.LIZJ(c0j40LIZIZ);
                    return;
                }
            }
        } else {
            liveRecyclableWidget = null;
        }
        companion.getInstance().recycleRecyclableWidget(liveRecyclableWidget);
    }
}
