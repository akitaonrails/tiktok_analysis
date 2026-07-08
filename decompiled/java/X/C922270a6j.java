package X;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorActivityBannerChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorCommonBannerChannel;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorActivityInfoSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922270a6j {
    public static final /* synthetic */ int LIZJ = 0;
    public final DataChannel LIZ;
    public volatile int LIZIZ;

    public static boolean LIZ() {
        return MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable() && InterfaceC934710aQn.Wb.LIZIZ().booleanValue();
    }

    public final boolean LIZLLL() {
        C922280a6k c922280a6k;
        DataChannel dataChannel = this.LIZ;
        return (dataChannel == null || (c922280a6k = (C922280a6k) dataChannel.gg0(AnchorCommonBannerChannel.class)) == null || c922280a6k.LIZ() == null || this.LIZIZ == 1) ? false : true;
    }

    public final boolean LIZJ() {
        DataChannel dataChannel;
        C922290a6l c922290a6l;
        return (!LIZ() || (dataChannel = this.LIZ) == null || (c922290a6l = (C922290a6l) dataChannel.gg0(AnchorActivityBannerChannel.class)) == null || !c922290a6l.LIZ || TextUtils.isEmpty(c922290a6l.LIZJ) || TextUtils.isEmpty(c922290a6l.LIZIZ) || this.LIZIZ == 2) ? false : true;
    }

    public C922270a6j(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZIZ(int i, Object obj, Function1<? super String, Unit> function1) {
        C946320ajW<String, String> c946320ajW;
        InRoomMultiGuestBanner inRoomMultiGuestBanner;
        C922280a6k c922280a6k;
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemClose, ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("MultiLiveBannerHelper", strLIZIZ, null, null);
        if (i == 2) {
            InterfaceC934710aQn.Yb.LJFF(Long.valueOf(System.currentTimeMillis()));
            DataChannel dataChannel = this.LIZ;
            if (dataChannel == null || (c922280a6k = (C922280a6k) dataChannel.gg0(AnchorCommonBannerChannel.class)) == null || (c946320ajW = c922280a6k.LIZIZ) == null) {
                C922260a6i c922260a6i = C946320ajW.Companion;
                Map<String, String> mapLIZIZ = InterfaceC934710aQn.Xb.LIZIZ();
                c922260a6i.getClass();
                c946320ajW = new C946320ajW<>(50);
                c946320ajW.putAll(mapLIZIZ);
            }
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(AnchorCommonBannerChannel.class, new C922280a6k(C13BV.INSTANCE, c946320ajW));
            }
            if ((obj instanceof InRoomMultiGuestBanner) && (inRoomMultiGuestBanner = (InRoomMultiGuestBanner) obj) != null) {
                c946320ajW.put(String.valueOf(inRoomMultiGuestBanner.id), String.valueOf(System.currentTimeMillis()));
                InterfaceC934710aQn.Xb.LJFF(c946320ajW);
                if (function1 != null) {
                    function1.invoke(String.valueOf(inRoomMultiGuestBanner.id));
                }
            }
        }
    }
}
