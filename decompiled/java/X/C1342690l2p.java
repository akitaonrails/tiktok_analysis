package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS136S1200000_21;
import kotlin.jvm.internal.AwS170S1100000_21;

/* JADX INFO: renamed from: X.0l2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342690l2p extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C572370Mcd LLILZIL;
    public final /* synthetic */ C1340200kyo LLILZLL;
    public final /* synthetic */ ForwardMedia LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342690l2p(Aweme aweme, Comment comment, String str, String str2, C572370Mcd c572370Mcd, C1340200kyo c1340200kyo, ForwardMedia forwardMedia, AwS170S1100000_21 awS170S1100000_21, Context context, String str3, AwS136S1200000_21 awS136S1200000_21) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = comment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c572370Mcd;
        this.LLILZLL = c1340200kyo;
        this.LLIZ = forwardMedia;
        this.LLIZLLLIL = awS170S1100000_21;
        this.LLJ = context;
        this.LLJI = str3;
        this.LLJIJIL = awS136S1200000_21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme = this.LL;
        Comment comment = this.LLILLJJLI;
        String str = this.LLILLL;
        C1350920lG6.LJJZZIII(aweme, comment, str, str, "post_now", "ori_comment", this.LLILZ);
        C572370Mcd c572370Mcd = this.LLILZIL;
        C1340200kyo c1340200kyo = this.LLILZLL;
        Bundle etParams = c572370Mcd.getEtParams();
        String str2 = this.LLILZ;
        c1340200kyo.getClass();
        C572370Mcd c572370McdCopy$default = C572370Mcd.copy$default(c572370Mcd, null, null, false, null, null, null, null, null, C1340200kyo.LIZJ(etParams, "post_now", str2), null, false, false, false, null, null, null, null, null, null, false, 1048319, null);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            iTextToImageService.LJIIJ(this.LLIZ, c572370McdCopy$default);
        }
        this.LLIZLLLIL.invoke();
        if (iTextToImageService != null && !iTextToImageService.LJJIIJZLJL(this.LLJ, this.LLILZLL.LLJJLIIIJLLLLLLLZ, c572370McdCopy$default.getEtParams())) {
            iTextToImageService.LJIJI(this.LLJ, this.LLJI, c572370McdCopy$default.getEtParams());
        }
        this.LLJIJIL.invoke();
        return Unit.LIZ;
    }
}
