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
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0l2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342700l2q extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1340200kyo LLILZIL;
    public final /* synthetic */ C572370Mcd LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ ForwardMedia LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;
    public final /* synthetic */ Function0<Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342700l2q(Aweme aweme, Comment comment, String str, String str2, C1340200kyo c1340200kyo, C572370Mcd c572370Mcd, String str3, boolean z, Context context, ForwardMedia forwardMedia, AwS170S1100000_21 awS170S1100000_21, AwS136S1200000_21 awS136S1200000_21) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = comment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1340200kyo;
        this.LLILZLL = c572370Mcd;
        this.LLIZ = str3;
        this.LLIZLLLIL = z;
        this.LLJ = context;
        this.LLJI = forwardMedia;
        this.LLJIJIL = awS170S1100000_21;
        this.LLJILJIL = awS136S1200000_21;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme = this.LL;
        Comment comment = this.LLILLJJLI;
        String str = this.LLILLL;
        C1350920lG6.LJJZZIII(aweme, comment, str, str, "card_surface", "ori_comment", this.LLILZ);
        C1340200kyo c1340200kyo = this.LLILZIL;
        Bundle etParams = this.LLILZLL.getEtParams();
        String str2 = this.LLILZ;
        c1340200kyo.getClass();
        C572370Mcd c572370McdCopy$default = C572370Mcd.copy$default(this.LLILZLL, null, null, false, null, null, this.LLIZ, null, null, C1340200kyo.LIZJ(etParams, "card_surface", str2), null, false, false, false, null, null, null, null, null, null, this.LLIZLLLIL, 523999, null);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this.LLJIJIL, this.LLJILJIL, (Function0<Unit>) 95);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this.LLJIJIL, (Function0<Unit>) 1338);
        if (iTextToImageService != null && !iTextToImageService.LJII(this.LLJ, this.LLJI, c572370McdCopy$default, this.LLILZIL.LLJJLIIIJLLLLLLLZ, awS422S0200000_21, awS565S0100000_21)) {
            iTextToImageService.LJIIIZ(this.LLJ, this.LLJI, c572370McdCopy$default, awS422S0200000_21, awS565S0100000_21);
        }
        return Unit.LIZ;
    }
}
