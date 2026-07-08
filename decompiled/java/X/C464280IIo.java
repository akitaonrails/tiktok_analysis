package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveExitParentCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveExitInnerFeedCardMockWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveFYPExitInnerFeedCardMockWidget;
import com.bytedance.android.livesdk.setting.LiveInnerSurveyExitSwipe;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0IIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464280IIo extends C0IJV {
    public final void LJIIZILJ() {
        Set<Widget> set;
        Activity activityLIZ;
        Intent intent;
        Activity activityLIZ2;
        Intent intent2;
        this.LIZLLL = true;
        C20441214yg.LJIIIZ("LiveExitExtraCardManager", "showCard");
        WidgetManager widgetManager = this.LJFF;
        int i = 0;
        if (widgetManager == null || (set = widgetManager.widgets) == null || !set.contains(this.LJI)) {
            C20441214yg.LJIIIZ("LiveExitExtraCardManager", "cardWidget didn't loaded");
            return;
        }
        if (this.LJI instanceof LiveExitInnerFeedCardMockWidget) {
            if (C464660IKa.LIZ()) {
                C520010KaN.LJIILIIL(this.LIZ);
                C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
                if (LiveInnerSurveyExitSwipe.INSTANCE.enable()) {
                    C1440005kM.LIZ(new C466430IQv(i));
                    return;
                }
                return;
            }
            Context context = this.LIZ.getContext();
            if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null && (intent2 = activityLIZ2.getIntent()) != null) {
                intent2.putExtra("intent_exit_and_swipe_feed", true);
                C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
                if (LiveInnerSurveyExitSwipe.INSTANCE.enable()) {
                    C1440005kM.LIZ(new C466430IQv(i));
                    return;
                }
                return;
            }
        }
        if (!(this.LJI instanceof LiveFYPExitInnerFeedCardMockWidget)) {
            LJIILJJIL();
            return;
        }
        if (C464660IKa.LIZ()) {
            C520010KaN.LJIILIIL(this.LIZ);
        } else {
            Context context2 = this.LIZ.getContext();
            if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null && (intent = activityLIZ.getIntent()) != null) {
                intent.putExtra("intent_exit_and_swipe_feed", true);
            }
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
    }

    public final int LJIILL() {
        ILiveExitParentCardWidget iLiveExitParentCardWidget;
        ILiveNewStyleCardWidget iLiveNewStyleCardWidget = this.LJI;
        if (!(iLiveNewStyleCardWidget instanceof ILiveExitParentCardWidget) || (iLiveExitParentCardWidget = (ILiveExitParentCardWidget) iLiveNewStyleCardWidget) == null) {
            return 0;
        }
        return iLiveExitParentCardWidget.LLILZLL.style;
    }

    public final boolean LJIILLIIL() {
        return this.LJI != null;
    }

    public C464280IIo(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    @Override // X.C0IJV
    public final void LJI(ILiveNewStyleCardWidget iLiveNewStyleCardWidget, RecyclableWidgetManager recyclableWidgetManager) {
        super.LJI(iLiveNewStyleCardWidget, recyclableWidgetManager);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cardContainer translationY:");
        sbLIZ.append(LJFF());
        C20441214yg.LJIIIZ("LiveExitExtraCardManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
