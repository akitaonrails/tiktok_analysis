package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.music.vm.ReportViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.vm.ReportViewModel$submitReport$1", f = "ReportViewModel.kt", l = {31, 31}, m = "invokeSuspend")
public final class C597740NcS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReportViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597740NcS(ReportViewModel reportViewModel, String str, InterfaceC1364105Vn<? super C597740NcS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reportViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597740NcS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportViewModel@3ce5.submitReport$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ReportViewModel@3ce5.submitReport$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC597750NcT interfaceC597750NcT = (InterfaceC597750NcT) this.LLILLJJLI.LL.getOperator();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC597750NcT.v0(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReportViewModel@3ce5.submitReport$1");
                return objLJFF;
            }
        }
        AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 30);
        this.LL = 2;
        if (((InterfaceC346201Wa) obj).collect(agS290S0100000_9, this) == objLJFF) {
            C1C7U.LIZIZ("ReportViewModel@3ce5.submitReport$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ReportViewModel@3ce5.submitReport$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
