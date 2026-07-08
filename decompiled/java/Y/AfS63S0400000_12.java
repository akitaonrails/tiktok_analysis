package Y;

import X.C09JN;
import X.C0UF5;
import X.C16F5;
import X.C1C7U;
import X.C759930TrT;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelData;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelResponse;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONException;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: loaded from: classes13.dex */
public class AfS63S0400000_12 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS63S0400000_12 afS63S0400000_12, Object obj) {
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard;
        C1C7U.LIZ("LiveAdminSettingGuideAdapter@ff9f.initAutoShareToBB$result$1");
        GetSettingPanelData getSettingPanelData = ((GetSettingPanelResponse) ((BaseResponse) obj).data).data;
        if (getSettingPanelData != null && (autoShareLiveCardToBulletinBoard = getSettingPanelData.autoShareLiveCardToBulletinBoard) != null) {
            LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter = (LiveAdminSettingGuideAdapter) afS63S0400000_12.l0;
            View view = (View) afS63S0400000_12.l1;
            C16F5 c16f5 = (C16F5) afS63S0400000_12.l2;
            View view2 = (View) afS63S0400000_12.l3;
            C0UF5.LJFF = autoShareLiveCardToBulletinBoard;
            liveAdminSettingGuideAdapter.LIZ(view, c16f5, view2, autoShareLiveCardToBulletinBoard);
        }
        C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.initAutoShareToBB$result$1");
    }

    public static final void accept$1(AfS63S0400000_12 afS63S0400000_12, Object obj) throws JSONException {
        C1C7U.LIZ("UserManageService@d46e.violationReport$2");
        ViolationStatusResponse.ResponseData responseData = ((ViolationStatusResponse) obj).data;
        if (responseData != null) {
            if (responseData.status == 0) {
                ((UserManageService) afS63S0400000_12.l0).fJ2((Context) afS63S0400000_12.l1, (C759930TrT) afS63S0400000_12.l2);
            } else if (responseData.status == 1) {
                ((UserManageService) afS63S0400000_12.l0).LIZJ((Context) afS63S0400000_12.l1, responseData, (DataChannel) afS63S0400000_12.l3, (C759930TrT) afS63S0400000_12.l2);
            }
        }
        C1C7U.LIZIZ("UserManageService@d46e.violationReport$2");
    }

    public AfS63S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
