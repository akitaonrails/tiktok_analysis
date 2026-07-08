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
import kotlin.jvm.internal.AwS136S1200000_21;

/* JADX INFO: renamed from: X.0l2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342720l2s extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ C1342730l2t LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CommentInlineBannerOverflowCell LLILZIL;
    public final /* synthetic */ C572370Mcd LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ ForwardMedia LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342720l2s(Aweme aweme, C1342730l2t c1342730l2t, String str, String str2, CommentInlineBannerOverflowCell commentInlineBannerOverflowCell, C572370Mcd c572370Mcd, String str3, boolean z, Context context, ForwardMedia forwardMedia, String str4) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = c1342730l2t;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = commentInlineBannerOverflowCell;
        this.LLILZLL = c572370Mcd;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = context;
        this.LLJI = forwardMedia;
        this.LLJIJIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme = this.LL;
        Comment comment = this.LLILLJJLI.LL;
        String str = this.LLILLL;
        C1350920lG6.LJJZZIII(aweme, comment, str, str, "card_surface", "other_comment", this.LLILZ);
        CommentInlineBannerOverflowCell commentInlineBannerOverflowCell = this.LLILZIL;
        Bundle etParams = this.LLILZLL.getEtParams();
        String str2 = this.LLILZ;
        commentInlineBannerOverflowCell.getClass();
        C572370Mcd c572370McdCopy$default = C572370Mcd.copy$default(this.LLILZLL, null, null, false, null, null, this.LLIZ, null, null, CommentInlineBannerOverflowCell.I5(etParams, "card_surface", str2), null, false, false, false, null, null, null, null, null, null, this.LLIZLLLIL, 523999, null);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        AwS136S1200000_21 awS136S1200000_21 = new AwS136S1200000_21(this.LLILZIL, this.LLJIJIL, this.LLILLJJLI, 7);
        AwS136S1200000_21 awS136S1200000_212 = new AwS136S1200000_21(this.LLILZIL, this.LLJIJIL, this.LLILLJJLI, 6);
        if (iTextToImageService != null && !iTextToImageService.LJII(this.LLJ, this.LLJI, c572370McdCopy$default, this.LLILLJJLI.LLILZIL, awS136S1200000_21, awS136S1200000_212)) {
            iTextToImageService.LJIIIZ(this.LLJ, this.LLJI, c572370McdCopy$default, awS136S1200000_21, awS136S1200000_212);
        }
        return Unit.LIZ;
    }
}
