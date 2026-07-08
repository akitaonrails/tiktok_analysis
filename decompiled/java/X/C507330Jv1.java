package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.PrivilegeDiscordItemDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507330Jv1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C507650JvX LL;
    public final /* synthetic */ C499080Jhi LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ GetSubPrivilegeDetailResponse.Data LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507330Jv1(C507650JvX c507650JvX, C499080Jhi c499080Jhi, FragmentManager fragmentManager, Function0<Unit> function0, GetSubPrivilegeDetailResponse.Data data) {
        super(0);
        this.LL = c507650JvX;
        this.LLILLJJLI = c499080Jhi;
        this.LLILLL = fragmentManager;
        this.LLILZ = function0;
        this.LLILZIL = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String idStr;
        String secUid;
        String str;
        String str2;
        String strWS;
        SubInfo subInfo;
        Boolean bool;
        PrivilegeDetailViewModel privilegeDetailViewModelFS;
        String strXQ2;
        C508400Jwk c508400Jwk;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = this.LL.LLILZIL;
        if (subscriptionPrivilegeDetailFragment4 != null) {
            subscriptionPrivilegeDetailFragment4.hS(this.LLILLJJLI.LIZ, C2097608Jq.LJ());
        }
        FragmentManager fragmentManager = this.LLILLL;
        Bundle bundle = new Bundle();
        GetSubPrivilegeDetailResponse.Data data = this.LLILZIL;
        C507650JvX c507650JvX = this.LL;
        User user = data.anchorDetail;
        String str3 = "";
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        C786410Ut5.LJJJI("creator_id", idStr, bundle);
        User user2 = data.anchorDetail;
        if (user2 == null || (secUid = user2.getSecUid()) == null) {
            secUid = "";
        }
        C786410Ut5.LJJJI("sec_user_id", secUid, bundle);
        if (c507650JvX == null || (subscriptionPrivilegeDetailFragment3 = c507650JvX.LLILZIL) == null || (str = subscriptionPrivilegeDetailFragment3.LLLI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        if (c507650JvX == null || (subscriptionPrivilegeDetailFragment2 = c507650JvX.LLILZIL) == null || (str2 = subscriptionPrivilegeDetailFragment2.LLILZIL) == null) {
            str2 = "";
        }
        C786410Ut5.LJJJI("show_entrance", str2, bundle);
        if (c507650JvX == null || (subscriptionPrivilegeDetailFragment = c507650JvX.LLILZIL) == null || (strWS = subscriptionPrivilegeDetailFragment.wS()) == null) {
            strWS = "";
        }
        C786410Ut5.LJJJI("back_url", strWS, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c507650JvX.LLILZIL;
        boolean zBooleanValue = false;
        bundle.putBoolean("preview_mode", (subscriptionPrivilegeDetailFragment5 == null || (c508400Jwk = subscriptionPrivilegeDetailFragment5.LLJJIII) == null) ? false : c508400Jwk.LIZ());
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = c507650JvX.LLILZIL;
        if (subscriptionPrivilegeDetailFragment6 != null && (privilegeDetailViewModelFS = subscriptionPrivilegeDetailFragment6.FS()) != null && (strXQ2 = privilegeDetailViewModelFS.xQ2()) != null) {
            str3 = strXQ2;
        }
        C786410Ut5.LJJJI("package_price", str3, bundle);
        GetSubPrivilegeDetailResponse.Data data2 = c507650JvX.LLILZ;
        if (data2 != null && (subInfo = data2.subInfo) != null && (bool = subInfo.isSubscribing) != null) {
            zBooleanValue = bool.booleanValue();
        }
        C786410Ut5.LJJJI("is_subscribing", String.valueOf(zBooleanValue), bundle);
        bundle.putBoolean("hide_bottom_button", C507390Jv7.LJFF(data));
        C19322110iZ.LIZLLL(fragmentManager, PrivilegeDiscordItemDetailFragment.class, "sub_privilege_discord_item_detail_dialog", null, bundle);
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
