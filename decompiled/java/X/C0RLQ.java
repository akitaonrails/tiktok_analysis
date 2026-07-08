package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLQ extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedCommerceAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLQ(FeedCommerceAssem feedCommerceAssem) {
        super(1);
        this.LL = feedCommerceAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.getClass();
        c0rta2.LLILLL = this.LL.ep().LJIIL();
        c0rta2.LLJI = R.id.view_rootview;
        c0rta2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
