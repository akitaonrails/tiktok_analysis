package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883900z7k extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ Function1<SparkContext, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1883900z7k(Function1<? super SparkContext, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        Function1<SparkContext, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(sparkContext);
        }
        return Unit.LIZ;
    }
}
