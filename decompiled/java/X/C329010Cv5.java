package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleRepository$queryBatchAweme$2", f = "TakoNimbleRepository.kt", l = {63, 64}, m = "invokeSuspend")
public final class C329010Cv5 extends C09AX implements Function2<InterfaceC346701Wf<? super BatchDetailList>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C329070CvB LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329010Cv5(C329070CvB c329070CvB, String str, int i, InterfaceC1364105Vn<? super C329010Cv5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c329070CvB;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329010Cv5 c329010Cv5 = new C329010Cv5(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c329010Cv5.LLILLJJLI = obj;
        return c329010Cv5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TakoNimbleRepository@e7fc.queryBatchAweme$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryBatchAweme$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            TakoNimbleApi takoNimbleApi = (TakoNimbleApi) this.LLILLL.LIZ.getValue();
            String str = this.LLILZ;
            int i2 = this.LLILZIL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = takoNimbleApi.queryBatchAweme(str, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryBatchAweme$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryBatchAweme$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleRepository@e7fc.queryBatchAweme$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
