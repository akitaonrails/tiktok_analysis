package X;

import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309210CAd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbsABValueOptimizer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C309210CAd(AbsABValueOptimizer absABValueOptimizer) {
        super(0);
        this.LL = absABValueOptimizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws InterruptedException {
        this.LL.LJFF(0);
        return Unit.LIZ;
    }
}
