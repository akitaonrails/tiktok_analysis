package Y;

import X.C0K0R;
import X.C0UX6;
import X.C1146120fvm;
import X.C1161920gLG;
import X.C20744016Fi;
import X.C475060Ik4;
import X.C475080Ik6;
import X.C498240JgM;
import X.C500260Jjc;
import X.C510430K0b;
import X.C511970K5z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.top.GiftAnchorPanelTopAssem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CascadeAnswer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS46S0400000_7 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onClick$0(ACListenerS46S0400000_7 aCListenerS46S0400000_7, View view) {
        DataChannel dataChannel;
        boolean z;
        C1146120fvm c1146120fvmHp = ((GiftAnchorPanelTopAssem) aCListenerS46S0400000_7.l0).hp();
        if (c1146120fvmHp != null) {
            dataChannel = c1146120fvmHp.LLILLJJLI;
        } else {
            dataChannel = null;
        }
        Room room = (Room) aCListenerS46S0400000_7.l1;
        View view2 = ((GiftAnchorPanelTopAssem) aCListenerS46S0400000_7.l0).LLJJJ;
        boolean z2 = true;
        if (view2 != null && C500260Jjc.LJJJJIZL(view2)) {
            z = true;
        } else {
            z = false;
        }
        C498240JgM.LJFF("click", "gift_panel", dataChannel, room, z);
        GiftAnchorPanelTopAssem giftAnchorPanelTopAssem = (GiftAnchorPanelTopAssem) aCListenerS46S0400000_7.l0;
        Context context = (Context) aCListenerS46S0400000_7.l2;
        Room room2 = (Room) aCListenerS46S0400000_7.l1;
        PrivilegeCenterConfig privilegeCenterConfig = (PrivilegeCenterConfig) aCListenerS46S0400000_7.l3;
        View view3 = giftAnchorPanelTopAssem.LLJJJ;
        if (view3 == null || view3.getVisibility() != 0) {
            z2 = false;
        }
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, C498240JgM.LIZLLL("gift_panel", context, room2, privilegeCenterConfig, z2), null);
        ((GiftAnchorPanelTopAssem) aCListenerS46S0400000_7.l0).hp();
        RedDotExtensionKt.LIZ(C0UX6.RED_DOT_LIVE_PRIVILEGE_CENTER);
    }

    public static final void onClick$1(ACListenerS46S0400000_7 aCListenerS46S0400000_7, View view) {
        ((C20744016Fi) aCListenerS46S0400000_7.l0).setChecked(!((C20744016Fi) aCListenerS46S0400000_7.l0).isChecked());
        ((C475080Ik6) aCListenerS46S0400000_7.l1).L5(((Question) aCListenerS46S0400000_7.l2).questionId, ((CascadeAnswer) view.getTag()).value);
        ((C475060Ik4) aCListenerS46S0400000_7.l3).LLLI();
    }

    public static final void onClick$2(ACListenerS46S0400000_7 aCListenerS46S0400000_7, View view) {
        String str;
        if (!((C510430K0b) aCListenerS46S0400000_7.l0).LLIZLLLIL) {
            C0K0R.LIZ((ViewGroup) aCListenerS46S0400000_7.l1);
            C510430K0b c510430K0b = (C510430K0b) aCListenerS46S0400000_7.l0;
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) aCListenerS46S0400000_7.l2;
            c510430K0b.getClass();
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_privilege_intro_view_more_click");
            if (subscriptionPrivilegeDetailFragment != null) {
                SubscriptionSceneContext subscriptionSceneContext = subscriptionPrivilegeDetailFragment.LLJJI;
                if (subscriptionSceneContext != null) {
                    c511970K5z.LIZIZ(String.valueOf(subscriptionSceneContext.roomId), "room_id");
                    c511970K5z.LIZIZ(String.valueOf(subscriptionSceneContext.anchorUid), "anchor_id");
                    c511970K5z.LIZIZ(subscriptionSceneContext.anchorSecUid, "sec_anchor_id");
                }
                str = subscriptionPrivilegeDetailFragment.LLILZLL;
            } else {
                str = null;
            }
            c511970K5z.LIZIZ(str, "show_entrance");
            c511970K5z.LIZLLL();
            List<View> list = (List) aCListenerS46S0400000_7.l3;
            C510430K0b c510430K0b2 = (C510430K0b) aCListenerS46S0400000_7.l0;
            for (View view2 : list) {
                LinearLayout linearLayout = c510430K0b2.LLILLJJLI;
                if (linearLayout != null) {
                    linearLayout.addView(view2);
                }
            }
            ((C510430K0b) aCListenerS46S0400000_7.l0).LLIZLLLIL = true;
        }
    }

    public ACListenerS46S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
