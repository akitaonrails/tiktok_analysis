package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495110JbJ extends C09AY implements Function1<List<SpotlightItem>, Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495110JbJ(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        super(1);
        this.LL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<SpotlightItem> list) {
        String str;
        List urls;
        List<SpotlightItem> list2 = list;
        C0K70.LIZLLL(this.LL.getClass().getSimpleName(), this.LL.getContext());
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
        AnonymousClass0956 anonymousClass0956 = subscriptionSpotlightFragment.LLJJJ;
        String uri = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ((ArrayList) subscriptionSpotlightFragment.LLJILJILJ).clear();
        List<C495170JbP> list3 = subscriptionSpotlightFragment.LLJILJILJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (SpotlightItem spotlightItem : list2) {
            Long lValueOf = Long.valueOf(spotlightItem.id);
            Integer numValueOf = Integer.valueOf(spotlightItem.reviewStatus);
            boolean z = spotlightItem.isPinned;
            ImageModel imageModel = spotlightItem.image;
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) ListProtector.get(urls, 0);
            } else {
                str = uri;
            }
            ImageModel imageModel2 = spotlightItem.image;
            if (imageModel2 != null) {
                uri = imageModel2.getUri();
            }
            arrayList.add(new C495170JbP(lValueOf, null, numValueOf, z, str, uri, Long.valueOf(spotlightItem.createTimeSecond), spotlightItem.auditInfo, 258));
            uri = null;
        }
        ((ArrayList) list3).addAll(new ArrayList(arrayList));
        subscriptionSpotlightFragment.LLJJJIL.LLLI();
        subscriptionSpotlightFragment.WR();
        subscriptionSpotlightFragment.LLJJJ = C500260Jjc.LJJJJJ(subscriptionSpotlightFragment, null, new C465960IPa(subscriptionSpotlightFragment, null), 3);
        SubscriptionSpotlightFragment subscriptionSpotlightFragment2 = this.LL;
        subscriptionSpotlightFragment2.LLJJI = false;
        subscriptionSpotlightFragment2.WR();
        DialogC1389620mGW dialogC1389620mGW = this.LL.LLJJ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        SubscriptionSpotlightFragment subscriptionSpotlightFragment3 = this.LL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_page_show");
        subscriptionSpotlightFragment3.UR(c474500IjALIZ);
        c474500IjALIZ.LJJII(subscriptionSpotlightFragment3.LLJ, "show_entrance");
        c474500IjALIZ.LJJII(this.LL.LLJJIJIL, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(this.LL.LLJJJIL.LLILLJJLI.size()), "picture_quantity");
        c474500IjALIZ.LIZ();
        C0K70.LJ(this.LL.getClass().getSimpleName(), this.LL.requireContext(), EnumC499450JiJ.GENERAL);
        return Unit.LIZ;
    }
}
