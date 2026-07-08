package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623120OcI extends AbstractC1542200qEc {
    public final Function0<Unit> LLILLJJLI;
    public final Function2<InterfaceC1541990qEH, String, Unit> LLILLL;
    public final Function1<InterfaceC1541990qEH, Unit> LLILZ;
    public final InterfaceC1631620sYq<InterfaceC1541990qEH, String, C1542120qEU, Unit> LLILZIL;
    public final Function1<SparkContext, Unit> LLILZLL;

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        this.LLILLJJLI.invoke();
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LLILZ.invoke(interfaceC1541990qEH);
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        Function1<SparkContext, Unit> function1 = this.LLILZLL;
        if (function1 != null) {
            function1.invoke(sparkContext);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLILLL.invoke(interfaceC1541990qEH, str);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        this.LLILZIL.invoke(interfaceC1541990qEH, str, c1542120qEU);
    }

    public C623120OcI(Function0 function0, Function1 function1, Function1 function12, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LLILLJJLI = function0;
        this.LLILLL = function2;
        this.LLILZ = function1;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = function12;
    }
}
