package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494850Jat extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ C495520Jby LL;
    public final /* synthetic */ C494790Jan LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494850Jat(C495520Jby c495520Jby, C494790Jan c494790Jan, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.LL = c495520Jby;
        this.LLILLJJLI = c494790Jan;
        this.LLILLL = function0;
        this.LLILZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        List<C495540Jc0> list = this.LL.LIZ;
        if (list != null) {
            for (C495540Jc0 c495540Jc0 : (ArrayList) list) {
                if (c495540Jc0 != null && C500260Jjc.LJJIIZ(c495540Jc0.LL) && C500260Jjc.LJJIIZ(c495540Jc0.LLILLJJLI)) {
                    sparkContext2.LJJLIIIJ(c495540Jc0.LLILLJJLI, c495540Jc0.LL);
                }
            }
        }
        final C494790Jan c494790Jan = this.LLILLJJLI;
        final Function0<Unit> function0 = this.LLILLL;
        final Function0<Unit> function02 = this.LLILZ;
        sparkContext2.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0Jas
            @Override // X.AbstractC1542100qES
            public final void LJLJLLL(SparkContext sparkContext3) {
                c494790Jan.LJIIL(true);
                function0.invoke();
            }

            @Override // X.AbstractC1542100qES
            public final void LJLL(SparkContext sparkContext3) {
                c494790Jan.LJIIL(false);
                function02.invoke();
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                c494790Jan.LJIIL(false);
            }
        });
        return Unit.LIZ;
    }
}
