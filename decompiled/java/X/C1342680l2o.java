package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0l2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342680l2o extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1340200kyo LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342680l2o(Aweme aweme, Comment comment, String str, String str2, C1340200kyo c1340200kyo, String str3) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = comment;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1340200kyo;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme = this.LL;
        Comment comment = this.LLILLJJLI;
        String str = this.LLILLL;
        C1350920lG6.LJJZZIII(aweme, comment, str, str, "close", "ori_comment", this.LLILZ);
        this.LLILZIL.LJ(true);
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null) {
            iTextToImageService.LJIILJJIL(this.LLILZLL);
        }
        C1342740l2u c1342740l2u = C1342740l2u.LIZ;
        String str2 = this.LLILZLL;
        c1342740l2u.getClass();
        C1342740l2u.LIZ(str2);
        this.LLILZIL.LIZIZ();
        return Unit.LIZ;
    }
}
