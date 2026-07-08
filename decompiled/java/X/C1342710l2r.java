package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentInlineBannerOverflowCell;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0l2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342710l2r extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1342730l2t LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C572370Mcd LLILZIL;
    public final /* synthetic */ CommentInlineBannerOverflowCell LLILZLL;
    public final /* synthetic */ ForwardMedia LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ C1340200kyo LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342710l2r(Aweme aweme, C1342730l2t c1342730l2t, String str, String str2, C572370Mcd c572370Mcd, CommentInlineBannerOverflowCell commentInlineBannerOverflowCell, ForwardMedia forwardMedia, String str3, Context context, C1340200kyo c1340200kyo) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = c1342730l2t;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c572370Mcd;
        this.LLILZLL = commentInlineBannerOverflowCell;
        this.LLIZ = forwardMedia;
        this.LLIZLLLIL = str3;
        this.LLJ = context;
        this.LLJI = c1340200kyo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme = this.LL;
        Comment comment = this.LLILLJJLI.LL;
        String str = this.LLILLL;
        C1350920lG6.LJJZZIII(aweme, comment, str, str, "post_now", "other_comment", this.LLILZ);
        C572370Mcd c572370Mcd = this.LLILZIL;
        CommentInlineBannerOverflowCell commentInlineBannerOverflowCell = this.LLILZLL;
        Bundle etParams = c572370Mcd.getEtParams();
        String str2 = this.LLILZ;
        commentInlineBannerOverflowCell.getClass();
        C572370Mcd c572370McdCopy$default = C572370Mcd.copy$default(c572370Mcd, null, null, false, null, null, null, null, null, CommentInlineBannerOverflowCell.I5(etParams, "post_now", str2), null, false, false, false, null, null, null, null, null, null, false, 1048319, null);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            iTextToImageService.LJIIJ(this.LLIZ, c572370McdCopy$default);
        }
        CommentInlineBannerOverflowCell commentInlineBannerOverflowCell2 = this.LLILZLL;
        String str3 = this.LLIZLLLIL;
        Comment comment2 = this.LLILLJJLI.LL;
        commentInlineBannerOverflowCell2.getClass();
        CommentInlineBannerOverflowCell.L5(comment2, str3);
        if (iTextToImageService != null && (iTextToImageService.LJJIIJZLJL(this.LLJ, this.LLILLJJLI.LLILZIL, c572370McdCopy$default.getEtParams()) || iTextToImageService.LJIJI(this.LLJ, this.LLIZLLLIL, c572370McdCopy$default.getEtParams()))) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLJI);
            c1389890mGx.LJIIIZ(2131838833);
            c1389890mGx.LJIIJJI();
            ITextToImageService iTextToImageService2 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
            if (iTextToImageService2 != null) {
                iTextToImageService2.LJIILJJIL(this.LLIZLLLIL);
            }
            C1342740l2u c1342740l2u = C1342740l2u.LIZ;
            String str4 = this.LLIZLLLIL;
            c1342740l2u.getClass();
            C1342740l2u.LIZ(str4);
            C1342740l2u.LIZLLL(this.LLIZLLLIL);
        }
        return Unit.LIZ;
    }
}
