package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC934860aR2 extends InteractDialogFragmentBaseContract$AbsPresenter<MultiLiveSettingDialogContract$AbsView> {
    public abstract boolean LJIIIZ();

    public abstract void LJIIJ(DataChannel dataChannel, Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC930180aJU enumC930180aJU, String str2, int i2);

    public abstract void LJIIL(DataChannel dataChannel, Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, EnumC930180aJU enumC930180aJU, String str2, int i2);

    public abstract void LJIILJJIL(Long l, Long l2, Long l3, boolean z);

    public AbstractC934860aR2(BaseMultiLiveSettingView baseMultiLiveSettingView) {
        super(baseMultiLiveSettingView);
    }
}
