package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122250fJH extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122250fJH(String str, C743670TFd c743670TFd) {
        super(1);
        this.LL = c743670TFd;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        final Function1<Boolean, Unit> function1 = this.LL;
        final String str = this.LLILLJJLI;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0fJG
            @Override // X.AbstractC1542100qES
            public final void LJLLJ(SparkContext sparkContext2, C1548490qOl c1548490qOl) {
                boolean z;
                Function1<Boolean, Unit> function12 = function1;
                boolean z2 = true;
                if (function12 != null) {
                    if (c1548490qOl.LIZIZ == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    function12.invoke(Boolean.valueOf(z));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsOnboardingPreload suggested questions preload hit=");
                if (c1548490qOl.LIZIZ != 2) {
                    z2 = false;
                }
                sbLIZ.append(z2);
                sbLIZ.append(", optimizationCode=");
                sbLIZ.append(c1548490qOl.LIZIZ);
                sbLIZ.append(", schema=");
                sbLIZ.append(str);
                C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        return Unit.LIZ;
    }
}
