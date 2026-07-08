package X;

import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494120JZi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494120JZi(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(0);
        this.LL = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        LiveSubOnlyConfig liveSubOnlyConfig;
        LiveSubOnlyConfig liveSubOnlyConfig2;
        LiveSubOnlyConfig liveSubOnlyConfig3;
        LiveSubOnlyConfig liveSubOnlyConfig4;
        GetSubInfoResponse getSubInfoResponse = this.LL.LLJJIII;
        if (getSubInfoResponse == null || (liveSubOnlyConfig4 = getSubInfoResponse.liveSubOnlyConfig) == null || (str = liveSubOnlyConfig4.disabledReason) == null) {
            str = "";
        }
        String str2 = null;
        if (Intrinsics.LJFF(str, "violation")) {
            C19EG activity = this.LL.getActivity();
            GetSubInfoResponse getSubInfoResponse2 = this.LL.LLJJIII;
            if (getSubInfoResponse2 != null && (liveSubOnlyConfig3 = getSubInfoResponse2.liveSubOnlyConfig) != null) {
                str2 = liveSubOnlyConfig3.disabledToast;
            }
            C766270U4b.LJIIL(R.drawable.eqq, activity, str2);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII("subscription", "scene_type");
            c474500IjALIZ.LJJII("ban", "violation_type");
            c474500IjALIZ.LJJII(this.LL.NR(), "violation_anchor_id");
            c474500IjALIZ.LIZ();
        } else {
            GetSubInfoResponse getSubInfoResponse3 = this.LL.LLJJIII;
            C766270U4b.LJIIJJI((getSubInfoResponse3 == null || (liveSubOnlyConfig2 = getSubInfoResponse3.liveSubOnlyConfig) == null) ? null : liveSubOnlyConfig2.disabledToast);
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscriber_only_live_ban_toast");
            c474500IjALIZ2.LJJII(this.LL.NR(), "anchor_id");
            GetSubInfoResponse getSubInfoResponse4 = this.LL.LLJJIII;
            if (getSubInfoResponse4 != null && (liveSubOnlyConfig = getSubInfoResponse4.liveSubOnlyConfig) != null) {
                str2 = liveSubOnlyConfig.disabledReason;
            }
            c474500IjALIZ2.LJJII(str2, "toast_type");
            c474500IjALIZ2.LIZ();
        }
        return Unit.LIZ;
    }
}
