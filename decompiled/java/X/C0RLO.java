package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLO extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedCommerceAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLO(FeedCommerceAssem feedCommerceAssem, View view) {
        super(1);
        this.LL = feedCommerceAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.getClass();
        c0rta2.LLILLL = this.LL.ep().LJIJ();
        c0rta2.LLJILJIL = this.LLILLJJLI.findViewById(R.id.a94);
        c0rta2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
