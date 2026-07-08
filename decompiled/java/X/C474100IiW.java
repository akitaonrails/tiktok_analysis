package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.widget.followguide.ShareUserFollowGuideDialogWidget;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.0IiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474100IiW extends AbstractC1081700eFs<Object> {
    public final InterfaceC1078180eAC LIZ;

    @Override // X.AbstractC1081700eFs
    public final Object LIZIZ() {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.LIZ;
        if (absAudienceInteractionFragment.LLLLIIL != null) {
            return null;
        }
        EnterRoomConfig enterRoomConfig = absAudienceInteractionFragment.LLJJJJJIL;
        if (!enterRoomConfig.mRoomsData.fromShareDeepLink || TextUtils.isEmpty(enterRoomConfig.mLogData.shareFromUserId) || !((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Xy2()) {
            return null;
        }
        absAudienceInteractionFragment.LLJIJIL.SX0(C748960TZm.class, Long.valueOf(CastLongProtector.parseLong(absAudienceInteractionFragment.LLJJJJJIL.mLogData.shareFromUserId)));
        absAudienceInteractionFragment.LLLLIIL = (ShareUserFollowGuideDialogWidget) absAudienceInteractionFragment.LLJJI.load(ShareUserFollowGuideDialogWidget.class);
        return null;
    }

    public C474100IiW(InterfaceC1078180eAC interfaceC1078180eAC) {
        this.LIZ = interfaceC1078180eAC;
    }
}
