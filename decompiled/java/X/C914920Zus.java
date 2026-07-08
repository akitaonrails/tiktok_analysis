package X;

import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutFeedRoomTypeData;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Zus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914920Zus {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(DataChannel dataChannel) {
        C20441214yg.LJIIIZ("TopLiveHangoutEnterSceneHelper", "enterFeedRoomScene");
        if (dataChannel != null) {
            dataChannel.zW(TopLiveHangoutFeedRoomTypeData.class, Boolean.TRUE);
            ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).GL(true, false, dataChannel);
            EnumC1102740eno.MULTI_GUEST_JOIN.load(dataChannel, new C925210aBT(), true);
            EnumC1102740eno.MULTIGUEST.hide(dataChannel);
        }
    }
}
