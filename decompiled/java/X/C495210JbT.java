package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0JbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495210JbT extends C09AY implements InterfaceC1631620sYq<C495170JbP, Integer, List<C495170JbP>, Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495210JbT(SubscriptionSpotlightFragment subscriptionSpotlightFragment, Context context, FragmentManager fragmentManager) {
        super(3);
        this.LL = subscriptionSpotlightFragment;
        this.LLILLJJLI = context;
        this.LLILLL = fragmentManager;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C495170JbP c495170JbP, Integer num, List<C495170JbP> list) {
        FragmentManager supportFragmentManager;
        C495170JbP c495170JbP2 = c495170JbP;
        int iIntValue = num.intValue();
        List<C495170JbP> list2 = list;
        if (c495170JbP2 == null) {
            this.LL.SR(10 - list2.size());
        } else {
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_highlight_more_click");
            subscriptionSpotlightFragment.UR(c474500IjALIZ);
            c474500IjALIZ.LJJII(subscriptionSpotlightFragment.LLJ, "show_entrance");
            c474500IjALIZ.LIZ();
            C1390850mIV c1390850mIV = new C1390850mIV();
            C1247530iZL c1247530iZL = new C1247530iZL();
            c1247530iZL.LIZJ(R.raw.icon_image);
            c1247530iZL.LIZ = this.LL.getString(2131844345);
            c1247530iZL.LIZ(new C495030JbB(c495170JbP2, this.LL, list2));
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LJI = new C421340Gfc(this.LLILLJJLI);
            c1247530iZL2.LIZ = this.LL.getString(2131844346);
            c1247530iZL2.LIZ(new C495160JbO(c495170JbP2, this.LLILLL, this.LL, list2, iIntValue));
            C1247530iZL c1247530iZL3 = new C1247530iZL();
            c1247530iZL3.LIZJ(R.raw.icon_trash_bin_fill);
            c1247530iZL3.LIZ = this.LL.getString(2131844347);
            c1247530iZL3.LIZ(new C495220JbU(this.LL, iIntValue));
            c1247530iZL3.LIZJ = 1;
            c1390850mIV.LIZ(c1247530iZL, c1247530iZL2, c1247530iZL3);
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            C19EG activity = this.LL.getActivity();
            if (activity != null) {
                supportFragmentManager = activity.getSupportFragmentManager();
            } else {
                supportFragmentManager = null;
            }
            tuxActionSheetLIZJ.show(supportFragmentManager, "SubscriptionHighlightFragment");
        }
        return Unit.LIZ;
    }
}
