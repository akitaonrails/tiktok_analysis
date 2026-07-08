package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLT extends C09AY implements Function1<C0RTH, Unit> {
    public final /* synthetic */ FeedCommerceAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLT(FeedCommerceAssem feedCommerceAssem) {
        super(1);
        this.LL = feedCommerceAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0RTH c0rth) {
        C0RTH c0rth2 = c0rth;
        c0rth2.LLILLL = this.LL.ep().LJIJJLI();
        c0rth2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
