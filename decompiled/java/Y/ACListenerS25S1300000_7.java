package Y;

import X.C0K54;
import X.C1602160rnK;
import X.C2097608Jq;
import X.C488720JEo;
import X.C488790JEv;
import X.C511970K5z;
import X.EnumC510710K1d;
import X.InterfaceC20673515v3;
import X.InterfaceC488780JEu;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS25S1300000_7 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS25S1300000_7 aCListenerS25S1300000_7, View view) {
        ((C488790JEv) aCListenerS25S1300000_7.l1).setClickWatchLive(true);
        C488790JEv c488790JEv = (C488790JEv) aCListenerS25S1300000_7.l1;
        int visibility = c488790JEv.getVisibility();
        c488790JEv.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c488790JEv);
        InterfaceC488780JEu interfaceC488780JEu = ((C488790JEv) aCListenerS25S1300000_7.l1).LLIZLLLIL;
        if (interfaceC488780JEu != null) {
            interfaceC488780JEu.LJFF();
        }
        if (((MaskLayer) aCListenerS25S1300000_7.l2).isR2OrUnknownMask()) {
            C488720JEo.LIZ((LiveRoomStruct) aCListenerS25S1300000_7.l3, aCListenerS25S1300000_7.s0, "watch", "click");
        }
    }

    public static final void onClick$1(ACListenerS25S1300000_7 aCListenerS25S1300000_7, View view) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ((C488790JEv) aCListenerS25S1300000_7.l1).setClickSkip(true);
        InterfaceC488780JEu interfaceC488780JEu = ((C488790JEv) aCListenerS25S1300000_7.l1).LLIZLLLIL;
        if (interfaceC488780JEu != null) {
            interfaceC488780JEu.LJ();
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K4.LJIILL(((C488790JEv) aCListenerS25S1300000_7.l1).getContext().getString(2131843035));
        }
        if (((MaskLayer) aCListenerS25S1300000_7.l2).isR2OrUnknownMask()) {
            C488720JEo.LIZ((LiveRoomStruct) aCListenerS25S1300000_7.l3, aCListenerS25S1300000_7.s0, "skip", "click");
        }
    }

    public static final void onClick$2(ACListenerS25S1300000_7 aCListenerS25S1300000_7, View view) {
        String str;
        String secUid;
        long id;
        SubscriptionSceneContext subscriptionSceneContext;
        Uri.Builder builderBuildUpon = UriProtector.parse("sslocal://webcast_subscribe/sub_suggest_emote").buildUpon();
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) aCListenerS25S1300000_7.l1;
        if (subscriptionPrivilegeDetailFragment.LLILZ == EnumC510710K1d.POPUP && (subscriptionSceneContext = subscriptionPrivilegeDetailFragment.LLJJI) != null && subscriptionSceneContext.isInLiveRoom) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("is_sheet", str);
        User user = ((PGCGetSubPrivilegeDetailResponse.Data) aCListenerS25S1300000_7.l2).anchorDetail;
        if (user == null || (secUid = user.getSecUid()) == null) {
            secUid = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("sec_anchor_id", secUid);
        User user2 = ((PGCGetSubPrivilegeDetailResponse.Data) aCListenerS25S1300000_7.l2).anchorDetail;
        long id2 = 0;
        if (user2 != null) {
            id = user2.getId();
        } else {
            id = 0;
        }
        C0K54.LIZ().LIZ((Context) aCListenerS25S1300000_7.l3, builderAppendQueryParameter2.appendQueryParameter("anchor_id", String.valueOf(id)).appendQueryParameter("show_entrance", "privilege_page").appendQueryParameter("upload_user_type", aCListenerS25S1300000_7.s0).build(), C2097608Jq.LJ());
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_suggest_emotes_entrance_click");
        User user3 = ((PGCGetSubPrivilegeDetailResponse.Data) aCListenerS25S1300000_7.l2).anchorDetail;
        if (user3 != null) {
            id2 = user3.getId();
        }
        c511970K5z.LIZIZ(Long.valueOf(id2), "anchor_id");
        c511970K5z.LIZIZ("privilege_page", "entrance_page");
        c511970K5z.LIZIZ(aCListenerS25S1300000_7.s0, "upload_user_type");
        c511970K5z.LIZLLL();
    }

    public ACListenerS25S1300000_7(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
