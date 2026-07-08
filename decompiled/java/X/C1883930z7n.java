package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.MixLayoutUseSparkLiteOptConfig;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883930z7n extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ Function1<SparkContext, Unit> LL;
    public final /* synthetic */ MixLayoutUseSparkLiteOptConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1883930z7n(Function1<? super SparkContext, Unit> function1, MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = mixLayoutUseSparkLiteOptConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        C1538590q8n c1538590q8n = new C1538590q8n();
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfig = this.LLILLJJLI;
        c1538590q8n.LIZ = mixLayoutUseSparkLiteOptConfig.useCachedScreenParameter;
        c1538590q8n.LJI = mixLayoutUseSparkLiteOptConfig.preloadAndDecodeResource;
        sparkContext2.liteLynxConfig = c1538590q8n;
        Function1<SparkContext, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(sparkContext2);
        }
        return Unit.LIZ;
    }
}
