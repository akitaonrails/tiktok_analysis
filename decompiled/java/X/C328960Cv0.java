package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM$syncQueryAweme$2$1", f = "TakoDoubleColumnVideoShareVM.kt", l = {138, 142}, m = "invokeSuspend")
public final class C328960Cv0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoDoubleColumnVideoShareVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<BatchDetailList> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328960Cv0(TakoDoubleColumnVideoShareVM takoDoubleColumnVideoShareVM, String str, InterfaceC20236714Gf<? super BatchDetailList> interfaceC20236714Gf, InterfaceC1364105Vn<? super C328960Cv0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoDoubleColumnVideoShareVM;
        this.LLILLL = str;
        this.LLILZ = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328960Cv0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC329190CvN interfaceC329190CvN = (InterfaceC329190CvN) this.LLILLJJLI.LLIZ.getValue().getOperator();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC329190CvN.queryBatchAweme(str, 0);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C328950Cuz(this.LLILZ, null), (InterfaceC346201Wa) obj, 0);
        AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILZ, 60);
        this.LL = 2;
        if (c2501109r7.collect(agS285S0100000_4, this) == objLJFF) {
            C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.syncQueryAweme$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
