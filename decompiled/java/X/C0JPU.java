package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPU extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ C259800zU<SparkContext> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPU(C259800zU<SparkContext> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        this.LL.element = sparkContext;
        return Unit.LIZ;
    }
}
