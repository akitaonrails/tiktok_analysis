package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentCABannerCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.OfflineCommentBannerCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.CommentCareModeBannerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.service.ITUCBizService;
import java.util.Collections;

/* JADX INFO: renamed from: X.0l3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343010l3L extends AbstractC1906720ziY {
    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(CommentCABannerCell.class, CommentCareModeBannerCell.class);
        LJIILIIL(OfflineCommentBannerCell.class);
    }

    public final void LJJ(Aweme aweme) {
        String aid;
        int iLIZJ = ((ITUCBizService) ServiceManager.get().getService(ITUCBizService.class)).LJIIIZ().LIZJ(aweme);
        if (iLIZJ != -1) {
            C20600815jK<InterfaceC1891350zJl> c20600815jK = this.LLILZLL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            c20600815jK.LJIILL(Collections.singletonList(new C748602w8(aid, iLIZJ)), null);
            return;
        }
        if (this.LLILZLL.LJIIIIZZ() <= 0) {
            return;
        }
        this.LLILZLL.LJIIJJI(C13BV.INSTANCE, null);
    }
}
