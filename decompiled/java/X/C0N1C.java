package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N1C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1C extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function0<FeedItemList> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0N1C(Function0<? extends FeedItemList> function0) {
        super(0);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2368609Pw<AbstractC1387200mCc> c2368609PwLJI = C1906580ziK.LIZJ().LJI();
        final Function0<FeedItemList> function0 = this.LL;
        C0N1B.LIZIZ = (C11JF) c2368609PwLJI.LJJLJLI(new C09JN() { // from class: X.0N16
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("HighRecScoreCacheHelper@347b.pickVideoInAppBackground$1$1");
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS109S0100000_9(function0, 231));
                C1C7U.LIZIZ("HighRecScoreCacheHelper@347b.pickVideoInAppBackground$1$1");
            }
        });
        return Unit.LIZ;
    }
}
