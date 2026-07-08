package X;

import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCommentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.DescAreaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.detail.FriendsV3CellDetailNavigateAbility;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;

/* JADX INFO: renamed from: X.0SHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnClickListenerC718850SHr implements View.OnClickListener {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ PostModeEntranceMechanism LLILLJJLI;

    public ViewOnClickListenerC718850SHr(C718770SHj c718770SHj, PostModeEntranceMechanism postModeEntranceMechanism) {
        this.LL = c718770SHj;
        this.LLILLJJLI = postModeEntranceMechanism;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Aweme aweme;
        VideoItemParams item;
        Aweme aweme2;
        Aweme aweme3;
        Integer num;
        IAdDescAreaReplaceService iAdDescAreaReplaceServiceLJJIZ = this.LL.LJJIZ();
        int iIntValue = 0;
        if (iAdDescAreaReplaceServiceLJJIZ != null && iAdDescAreaReplaceServiceLJJIZ.LJ()) {
            C718770SHj c718770SHj = this.LL;
            VideoItemParams item2 = c718770SHj.LLILLJJLI.getItem();
            if (item2 != null && (aweme3 = item2.getAweme()) != null) {
                DescAreaInfo descAreaInfo = AwemeExtKt.getDescAreaInfo(aweme3);
                if (descAreaInfo != null && (num = descAreaInfo.jumpType) != null) {
                    iIntValue = num.intValue();
                }
                IAdDescAreaReplaceService iAdDescAreaReplaceServiceLJJIZ2 = c718770SHj.LJJIZ();
                if (iAdDescAreaReplaceServiceLJJIZ2 != null) {
                    iAdDescAreaReplaceServiceLJJIZ2.LJFF(aweme3, true);
                }
                IVideoCommentAbility iVideoCommentAbility = (IVideoCommentAbility) c718770SHj.LLLZI.getValue();
                if (iVideoCommentAbility != null) {
                    iVideoCommentAbility.pl2(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService != null) {
            VideoItemParams item3 = this.LL.LLILLJJLI.getItem();
            if (item3 != null) {
                aweme = item3.getAweme();
            } else {
                aweme = null;
            }
            if (iCommercePromoteService.LJJI(aweme) && ((item = this.LL.LLILLJJLI.getItem()) == null || (aweme2 = item.getAweme()) == null || !AwemeExtKt.isTextMoreAd(aweme2))) {
                this.LL.LLILLJJLI.LQ2();
                return;
            }
        }
        if (this.LL.LJJJJZI().LJJIIJZLJL(this.LL.LLLLIIL, this.LLILLJJLI, null, null)) {
            return;
        }
        boolean z = !this.LL.LJJJZ();
        if (z) {
            str = "";
        } else {
            str = "click_descr";
        }
        C718770SHj c718770SHj2 = this.LL;
        if (c718770SHj2.LJJL() && c718770SHj2.LLJ.getVisibility() != 0 && c718770SHj2.LLLILZ == null && c718770SHj2.LJJJZ() && z != (!c718770SHj2.LLILLJJLI.LLJILJIL)) {
            FriendsV3CellDetailNavigateAbility friendsV3CellDetailNavigateAbility = (FriendsV3CellDetailNavigateAbility) c718770SHj2.LLJJJ.getValue();
            if (friendsV3CellDetailNavigateAbility != null) {
                friendsV3CellDetailNavigateAbility.SH1();
                return;
            }
            return;
        }
        this.LL.LJLJLLL(z, str, this.LLILLJJLI);
    }
}
