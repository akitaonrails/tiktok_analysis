package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS87S1000000_2;

/* JADX INFO: renamed from: X.0pN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508970pN1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ SparkContext LLILZ;
    public final /* synthetic */ C1523810pkx LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508970pN1(C238400w2 c238400w2, String str, String str2, SparkContext sparkContext, C1523810pkx c1523810pkx, String str3) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = sparkContext;
        this.LLILZIL = c1523810pkx;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        new AwS87S1000000_2(this.LLILZLL, 10);
        c1523770pkt.getClass();
        ((Boolean) C1523770pkt.LJI.getValue()).booleanValue();
        this.LL.element = SystemClock.elapsedRealtime();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        SparkContext sparkContext = this.LLILZ;
        sparkContext.LJJLIIJ(str);
        C1537060q6K.LJIIJJI(c1537060q6K, str, str2, sparkContext, this.LLILZIL, false, null, 48);
        return Unit.LIZ;
    }
}
