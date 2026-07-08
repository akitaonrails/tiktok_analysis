package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Umy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782620Umy extends C09AY implements Function1<SparkContext, Unit> {
    public C782620Umy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        sparkContext2.LJJJZ("trans_status_bar", "1");
        C520710KbV.LIZIZ(sparkContext2);
        return Unit.LIZ;
    }
}
