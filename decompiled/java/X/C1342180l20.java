package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.cla.CommentTranslationCTABannerCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentInlineBannerOverflowCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentIntentionItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentLynxCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentMoreItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentSecondaryItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.NoPermissionVideoCommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PostModeHeaderCommentCountCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.ReviewFilteredCommentsCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: renamed from: X.0l20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342180l20 extends AbstractC1906720ziY {
    public final void LJJ() {
        this.LLILZLL.LJIIJJI(C13BV.INSTANCE, null);
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(CommentItemCell.class, CommentSecondaryItemCell.class, CommentMoreItemCell.class, NoPermissionVideoCommentItemCell.class, ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZJ().LIZJ(), CommentLynxCell.class, PostModeHeaderCommentCountCell.class, CommentTranslationCTABannerCell.class, CommentInlineBannerOverflowCell.class);
        if (!C306520Bzu.LIZ()) {
            LJIILIIL(ReviewFilteredCommentsCell.class);
        }
        if (C295120BhW.LIZ()) {
            LJIILIIL(CommentIntentionItemCell.class);
        }
    }
}
