package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.PrivilegeCreatorRoomItemDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507320Jv0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FragmentManager LL;
    public final /* synthetic */ C507650JvX LLILLJJLI;
    public final /* synthetic */ C499110Jhl LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ GetSubPrivilegeDetailResponse.Data LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507320Jv0(FragmentManager fragmentManager, C507650JvX c507650JvX, C499110Jhl c499110Jhl, Function0<Unit> function0, GetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.LL = fragmentManager;
        this.LLILLJJLI = c507650JvX;
        this.LLILLL = c499110Jhl;
        this.LLILZ = function0;
        this.LLILZIL = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String strWS;
        String strXQ2;
        String idStr;
        String secUid;
        String str;
        SubInfo subInfo;
        Boolean bool;
        String str2;
        C508400Jwk c508400Jwk;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        PrivilegeDetailViewModel privilegeDetailViewModelFS;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2;
        FragmentManager fragmentManager = this.LL;
        Bundle bundle = new Bundle();
        C507650JvX c507650JvX = this.LLILLJJLI;
        GetSubPrivilegeDetailResponse.Data data = this.LLILZIL;
        String str3 = "";
        if (c507650JvX == null || (subscriptionPrivilegeDetailFragment2 = c507650JvX.LLILZIL) == null || (strWS = subscriptionPrivilegeDetailFragment2.wS()) == null) {
            strWS = "";
        }
        C786410Ut5.LJJJI("back_url", strWS, bundle);
        if (c507650JvX == null || (subscriptionPrivilegeDetailFragment = c507650JvX.LLILZIL) == null || (privilegeDetailViewModelFS = subscriptionPrivilegeDetailFragment.FS()) == null || (strXQ2 = privilegeDetailViewModelFS.xQ2()) == null) {
            strXQ2 = "";
        }
        C786410Ut5.LJJJI("package_price", strXQ2, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = c507650JvX.LLILZIL;
        boolean zBooleanValue = false;
        bundle.putBoolean("preview_mode", (subscriptionPrivilegeDetailFragment3 == null || (c508400Jwk = subscriptionPrivilegeDetailFragment3.LLJJIII) == null) ? false : c508400Jwk.LIZ());
        User user = data.anchorDetail;
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        C786410Ut5.LJJJI("creator_id", idStr, bundle);
        User user2 = data.anchorDetail;
        if (user2 == null || (secUid = user2.getSecUid()) == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_user_id", secUid, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = c507650JvX.LLILZIL;
        if (subscriptionPrivilegeDetailFragment4 == null || (str = subscriptionPrivilegeDetailFragment4.LLLI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c507650JvX.LLILZIL;
        if (subscriptionPrivilegeDetailFragment5 != null && (str2 = subscriptionPrivilegeDetailFragment5.LLILZIL) != null) {
            str3 = str2;
        }
        C786410Ut5.LJJJI("show_entrance", str3, bundle);
        GetSubPrivilegeDetailResponse.Data data2 = c507650JvX.LLILZ;
        if (data2 != null && (subInfo = data2.subInfo) != null && (bool = subInfo.isSubscribing) != null) {
            zBooleanValue = bool.booleanValue();
        }
        C786410Ut5.LJJJI("is_subscribing", String.valueOf(zBooleanValue), bundle);
        bundle.putBoolean("hide_bottom_button", C507390Jv7.LJFF(data));
        C19322110iZ.LIZLLL(fragmentManager, PrivilegeCreatorRoomItemDetailFragment.class, "sub_privilege_creator_room_detail_dialog", null, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = this.LLILLJJLI.LLILZIL;
        if (subscriptionPrivilegeDetailFragment6 != null) {
            subscriptionPrivilegeDetailFragment6.hS(this.LLILLL.LIZ, C2097608Jq.LJ());
        }
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
