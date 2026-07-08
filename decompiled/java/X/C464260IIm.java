package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0IIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464260IIm extends C0IJV {
    public final void LJIILL() {
        Set<Widget> set;
        this.LIZLLL = true;
        C20441214yg.LJIIIZ("LiveExtraCardManager", "showCard");
        WidgetManager widgetManager = this.LJFF;
        if (widgetManager == null || (set = widgetManager.widgets) == null || !set.contains(this.LJI)) {
            C20441214yg.LJIIIZ("LiveExtraCardManager", "cardWidget didn't loaded");
        } else {
            LJIILJJIL();
        }
    }

    public C464260IIm(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    @Override // X.C0IJV
    public final void LJI(ILiveNewStyleCardWidget iLiveNewStyleCardWidget, RecyclableWidgetManager recyclableWidgetManager) {
        super.LJI(iLiveNewStyleCardWidget, recyclableWidgetManager);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cardContainer translationY:");
        sbLIZ.append(LJFF());
        C20441214yg.LJIIIZ("LiveExtraCardManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
