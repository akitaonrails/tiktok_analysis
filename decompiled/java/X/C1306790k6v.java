package X;

import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.android.starship.strategy.graph.CancelableJobImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306790k6v extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1306760k6s LL;
    public final /* synthetic */ C1306400k6I LLILLJJLI;
    public final /* synthetic */ Function1<C1306060k5k, Unit> LLILLL;
    public final /* synthetic */ CancelableJobImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306790k6v(C1306760k6s c1306760k6s, C1306400k6I c1306400k6I, Function1<? super C1306060k5k, Unit> function1, CancelableJobImpl cancelableJobImpl) {
        super(1);
        this.LL = c1306760k6s;
        this.LLILLJJLI = c1306400k6I;
        this.LLILLL = function1;
        this.LLILZ = cancelableJobImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws Throwable {
        CancelableJobImpl cancelableJobImpl;
        bool.booleanValue();
        CancelableJob cancelableJobRegisterStrategyCallback = this.LL.LIZIZ().registerStrategyCallback(this.LLILLJJLI, this.LLILLL);
        CancelableJobImpl cancelableJobImpl2 = this.LLILZ;
        C09AE job$engine_release = null;
        if ((cancelableJobRegisterStrategyCallback instanceof CancelableJobImpl) && (cancelableJobImpl = (CancelableJobImpl) cancelableJobRegisterStrategyCallback) != null) {
            job$engine_release = cancelableJobImpl.getJob$engine_release();
        }
        cancelableJobImpl2.setProxyJob(job$engine_release);
        return Unit.LIZ;
    }
}
