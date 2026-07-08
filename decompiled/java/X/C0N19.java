package X;

import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0N19, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N19 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Function0<FeedItemList> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0N19(int i, Function0<? extends FeedItemList> function0) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        C0N18 c0n18 = C0N18.BACKGROUND;
        if ((i & c0n18.getType()) == c0n18.getType()) {
            C0N1B.LIZIZ(new C0N1C(this.LLILLJJLI));
        }
        int i2 = this.LL;
        C0N18 c0n182 = C0N18.EXHAUSTED;
        if ((i2 & c0n182.getType()) == c0n182.getType()) {
            C0N1B.LIZIZ(new AwS553S0100000_9(this.LLILLJJLI, (Function0<Unit>) 1840));
        }
        if (C590380NDo.LIZJ()) {
            C0NDH.LIZ();
        }
        return Unit.LIZ;
    }
}
