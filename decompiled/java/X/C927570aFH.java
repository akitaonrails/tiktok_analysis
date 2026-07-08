package X;

import Y.AfS184S0100000_15;
import Y.AfS57S0110000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateSettingParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS20S1201000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927570aFH extends AbstractC934860aR2 {
    public static final C927550aFF LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C304201Fw LLILLJJLI;
    public final C11NJ LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C927570aFH.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new C927550aFF();
    }

    @Override // X.AbstractC934860aR2
    public final boolean LJIIIZ() {
        C304201Fw c304201Fw = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
        return C500260Jjc.LJJJI(interfaceC927510aFB != null ? Boolean.valueOf(interfaceC927510aFB.LJIIIIZZ()) : null);
    }

    public C927570aFH(BaseMultiLiveSettingView baseMultiLiveSettingView) {
        super(baseMultiLiveSettingView);
        this.LLILLJJLI = new C304201Fw("ZOOM_SERVICE");
        this.LLILLL = new C11NJ();
    }

    @Override // X.AbstractC934860aR2
    public final void LJIILJJIL(Long l, Long l2, Long l3, boolean z) {
        int i;
        C480460Ism.LIZ().getClass();
        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
        UpdateSettingParams updateSettingParams = new UpdateSettingParams();
        updateSettingParams.channelId = l3;
        updateSettingParams.roomId = l;
        updateSettingParams.liveId = l2;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        updateSettingParams.resetPointAfterLeave = i;
        updateSettingParams.updateScene = 8;
        this.LLILLL.LIZ(multiLiveApi.updateAnchorPanelSettingsV2(updateSettingParams).LJIILIIL(new C0UO0()).LJJLL(new AfS57S0110000_15(this, z, 20), new AfS184S0100000_15(this, 96)));
    }

    @Override // X.AbstractC934860aR2
    public final void LJIIJ(DataChannel dataChannel, Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC930180aJU enumC930180aJU, String str2, int i2) {
        C927550aFF c927550aFF = LLILZ;
        AwS20S1201000_15 awS20S1201000_15 = new AwS20S1201000_15(this, str, i, enumC930180aJU, 0);
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 630);
        c927550aFF.getClass();
        C927550aFF.LIZIZ(dataChannel, l, l2, multiLiveAnchorPanelSettings, i, str, str2, i2, null, awS20S1201000_15, awS594S0100000_15, false);
    }

    @Override // X.AbstractC934860aR2
    public final void LJIIL(DataChannel dataChannel, Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC930180aJU enumC930180aJU, String str2, int i2) {
        C927550aFF c927550aFF = LLILZ;
        AwS20S1201000_15 awS20S1201000_15 = new AwS20S1201000_15(this, str, i, enumC930180aJU, 1);
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 631);
        c927550aFF.getClass();
        C927550aFF.LIZLLL(dataChannel, l, l2, multiLiveAnchorPanelSettings, i, str, str2, i2, null, awS20S1201000_15, awS594S0100000_15);
    }
}
