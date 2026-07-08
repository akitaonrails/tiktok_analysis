package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0ag7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944210ag7 {
    public static MultiMatchAnchorWidget LIZ(View view, MultiCoHostWindowManager multiCoHostWindowManager, DataChannel dataChannel) {
        C974540bT2.LIZ.LJJLIL(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getWidget dataChannel = ");
        sbLIZ.append(dataChannel.hashCode());
        C20441214yg.LIZIZ("MultiMatchWidget", C2188811AlT.LIZIZ(sbLIZ));
        MultiMatchAnchorWidget multiMatchAnchorWidget = new MultiMatchAnchorWidget(view);
        multiMatchAnchorWidget.LLILLJJLI = multiCoHostWindowManager;
        if (LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            multiMatchAnchorWidget.dataChannel = dataChannel;
            multiMatchAnchorWidget.Q1();
        }
        return multiMatchAnchorWidget;
    }
}
