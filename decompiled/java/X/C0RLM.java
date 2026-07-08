package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RLM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLM extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLM(FeedVideoAssem feedVideoAssem) {
        super(1);
        this.LL = feedVideoAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.LQ2(this.LL, new C0RLN());
        return Unit.LIZ;
    }
}
