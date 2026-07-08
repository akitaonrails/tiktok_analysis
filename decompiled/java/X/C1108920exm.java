package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0exm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108920exm extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ double LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ double LLILLL;
    public final /* synthetic */ double LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108920exm(double d, double d2, double d3, double d4) {
        super(1);
        this.LL = d;
        this.LLILLJJLI = d2;
        this.LLILLL = d3;
        this.LLILZ = d4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        sparkContext2.LJJJLL(this.LL, "container_width");
        sparkContext2.LJJJLL(this.LLILLJJLI, "container_height");
        sparkContext2.LJJJLL(this.LLILLL, "x_margin");
        sparkContext2.LJJJLL(this.LLILZ, "y_margin");
        sparkContext2.LJJJLZIJ(1, "is_landscape");
        return Unit.LIZ;
    }
}
