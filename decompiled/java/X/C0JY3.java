package X;

import com.bytedance.android.livesdk.comp.api.subscription.setting.SubVipSubOnlyLiveSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: renamed from: X.0JY3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JY3 extends C09AY implements Function2<C03H5, GetSubOnlyLiveInfoResponse, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JY3(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(2);
        this.LL = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse) {
        GetSubOnlyLiveInfoResponse.Data data;
        VIPSubOnlyLiveSettingInfo vIPSubOnlyLiveSettingInfo;
        List<VIPSubOnlyLiveSettingInfo.Category> list;
        GetSubOnlyLiveInfoResponse.Data data2;
        VIPSubOnlyLiveSettingInfo vIPSubOnlyLiveSettingInfo2;
        List<VIPSubOnlyLiveSettingInfo.Category> list2;
        GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse2 = getSubOnlyLiveInfoResponse;
        if (getSubOnlyLiveInfoResponse2 != null && (data = getSubOnlyLiveInfoResponse2.data) != null && (vIPSubOnlyLiveSettingInfo = data.vipSolSettingInfo) != null && (list = vIPSubOnlyLiveSettingInfo.monthCategoryList) != null && (!list.isEmpty()) && (data2 = getSubOnlyLiveInfoResponse2.data) != null && (vIPSubOnlyLiveSettingInfo2 = data2.vipSolSettingInfo) != null && (list2 = vIPSubOnlyLiveSettingInfo2.monthCategoryList) != null && (!list2.isEmpty()) && SubVipSubOnlyLiveSetting.INSTANCE.isEnable() && !Intrinsics.LJFF(C0KPJ.Xe.LIZ(), Boolean.TRUE)) {
            SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LL;
            if (!subOnlyLiveSettingFragment.LLJJIJIIJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LiveSubscribeLynxUrl.INSTANCE.getValue().getSubOnlyLiveVipIntro());
                sbLIZ.append("&anchor_id=");
                sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
                sbLIZ.append("&show_entrance=");
                sbLIZ.append(subOnlyLiveSettingFragment.LLJJI);
                C500260Jjc.LJJLIIIJJIZ(new C474420Ij2(subOnlyLiveSettingFragment, C2188811AlT.LIZIZ(sbLIZ)));
            }
        } else {
            this.LL.SR();
        }
        return Unit.LIZ;
    }
}
