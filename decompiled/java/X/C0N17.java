package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N17, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N17<T> implements C092O {
    public final /* synthetic */ Function0<FeedItemList> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0N17(Function0<? extends FeedItemList> function0) {
        this.LIZ = function0;
    }

    @Override // X.C092O
    public final void accept(Object obj) {
        C786410Ut5.LJLIIL(6000L, C799570VYd.LIZIZ(), new ARunnableS109S0100000_9(this.LIZ, 229));
    }
}
