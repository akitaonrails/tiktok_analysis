package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041520dD4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1041510dD3 LL;
    public final /* synthetic */ SparkContext LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041520dD4(C1041510dD3 c1041510dD3, SparkContext sparkContext, int i, String str) {
        super(0);
        this.LL = c1041510dD3;
        this.LLILLJJLI = sparkContext;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ().hv(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
