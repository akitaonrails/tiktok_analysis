package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM$queryBatchAweme$1$2", f = "TakoNimbleVM.kt", l = {54, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C329030Cv7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoNimbleVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329030Cv7(TakoNimbleVM takoNimbleVM, String str, InterfaceC1364105Vn<? super C329030Cv7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoNimbleVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329030Cv7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNimbleVM@c644.queryBatchAweme$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoNimbleVM@c644.queryBatchAweme$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C329070CvB c329070CvB = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            this.LL = 1;
            c329070CvB.getClass();
            obj = new C095D(new C329010Cv5(c329070CvB, str, 0, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoNimbleVM@c644.queryBatchAweme$1$2");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C329040Cv8(this.LLILLJJLI, null), (InterfaceC346201Wa) obj, 0);
        AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 47);
        this.LL = 2;
        if (c2501109r7.collect(agS285S0100000_4, this) == objLJFF) {
            C1C7U.LIZIZ("TakoNimbleVM@c644.queryBatchAweme$1$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleVM@c644.queryBatchAweme$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
