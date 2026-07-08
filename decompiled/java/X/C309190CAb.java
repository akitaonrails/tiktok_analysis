package X;

import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309190CAb extends C09AY implements Function0<String> {
    public final /* synthetic */ AbsABValueOptimizer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C309190CAb(AbsABValueOptimizer absABValueOptimizer) {
        super(0);
        this.LL = absABValueOptimizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZIZ());
        sbLIZ.append("_ab_value_preload_optimization");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
