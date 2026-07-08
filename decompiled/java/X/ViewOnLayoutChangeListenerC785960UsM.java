package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.broadcast.preview.widget.GamePreviewDecouplingWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewDecouplingWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0UsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnLayoutChangeListenerC785960UsM implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC785960UsM(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC785960UsM viewOnLayoutChangeListenerC785960UsM, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((View) viewOnLayoutChangeListenerC785960UsM.l0).getBottom() > ((View) viewOnLayoutChangeListenerC785960UsM.l1).getTop()) {
            C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner cancel");
            if (C500260Jjc.LJJJJIZL(((PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).getView())) {
                C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner invisible");
                C500260Jjc.LJIILLIIL(((PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).getView());
            }
            PreviewDecouplingWidget previewDecouplingWidget = (PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2;
            previewDecouplingWidget.LLJI = false;
            AnonymousClass0956 anonymousClass0956 = previewDecouplingWidget.LLILZLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            ((PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).LLILZLL = null;
            return;
        }
        C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner try visible1");
        PreviewDecouplingWidget previewDecouplingWidget2 = (PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2;
        if (previewDecouplingWidget2.LLILZLL != null || previewDecouplingWidget2.LLJI) {
            return;
        }
        previewDecouplingWidget2.LLILZLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(previewDecouplingWidget2), C0PEM.LIZJ, null, new C770710ULd((View) viewOnLayoutChangeListenerC785960UsM.l0, (PreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2, null), 2);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC785960UsM viewOnLayoutChangeListenerC785960UsM, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((View) viewOnLayoutChangeListenerC785960UsM.l0).getBottom() > ((View) viewOnLayoutChangeListenerC785960UsM.l1).getTop()) {
            C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner cancel");
            if (C500260Jjc.LJJJJIZL(((GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).getView())) {
                C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner invisible");
                View view2 = ((GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).getView();
                if (view2 != null) {
                    HandlerHook.viewPost(view2, new ARunnableS112S0100000_12((GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2, 406));
                }
            }
            GamePreviewDecouplingWidget gamePreviewDecouplingWidget = (GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2;
            gamePreviewDecouplingWidget.getClass();
            AnonymousClass0956 anonymousClass0956 = gamePreviewDecouplingWidget.LLILZLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            ((GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2).LLILZLL = null;
            return;
        }
        C20441214yg.LIZIZ("VideoModeContainer", "decoupling_center_banner try visible1");
        GamePreviewDecouplingWidget gamePreviewDecouplingWidget2 = (GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2;
        if (gamePreviewDecouplingWidget2.LLILZLL != null) {
            return;
        }
        gamePreviewDecouplingWidget2.LLILZLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(gamePreviewDecouplingWidget2), C0PEM.LIZJ, null, new C770690ULb((View) viewOnLayoutChangeListenerC785960UsM.l0, (GamePreviewDecouplingWidget) viewOnLayoutChangeListenerC785960UsM.l2, null), 2);
    }
}
