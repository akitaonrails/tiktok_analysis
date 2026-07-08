package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354610lM3 extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ Comment LL;
    public final /* synthetic */ C0MNH LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C0ML2, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1354610lM3(Comment comment, C0MNH c0mnh, String str, Context context, Aweme aweme, String str2, Function1<? super C0ML2, Unit> function1) {
        super(1);
        this.LL = comment;
        this.LLILLJJLI = c0mnh;
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = aweme;
        this.LLILZLL = str2;
        this.LLIZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        C1354600lM2.LJI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, bitmap);
        return Unit.LIZ;
    }
}
