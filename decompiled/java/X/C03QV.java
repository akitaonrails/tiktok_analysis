package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03QV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.strategy.AbstractPreloadStrategy$preloadBillInfo$1$1", f = "AbstractPreloadStrategy.kt", l = {BaseNotice.CREATOR, 64}, m = "invokeSuspend")
public final class C03QV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BillInfoResponse>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C03R4 LLILLL;
    public final /* synthetic */ C03WX LLILZ;
    public final /* synthetic */ C03R6 LLILZIL;
    public final /* synthetic */ InterfaceC1748810vbr LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ C03RX LLIZLLLIL;
    public final /* synthetic */ C03RW LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ EnumC840403Qc LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QV(long j, C03R4 c03r4, C03WX c03wx, C03R6 c03r6, InterfaceC1748810vbr interfaceC1748810vbr, Integer num, C03RX c03rx, C03RW c03rw, String str, Integer num2, EnumC840403Qc enumC840403Qc, InterfaceC1364105Vn<? super C03QV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c03r4;
        this.LLILZ = c03wx;
        this.LLILZIL = c03r6;
        this.LLILZLL = interfaceC1748810vbr;
        this.LLIZ = num;
        this.LLIZLLLIL = c03rx;
        this.LLJ = c03rw;
        this.LLJI = str;
        this.LLJIJIL = num2;
        this.LLJILJIL = enumC840403Qc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03QV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("AbstractPreloadStrategy@d7.preloadBillInfo$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    C1C7U.LIZIZ("AbstractPreloadStrategy@d7.preloadBillInfo$1$1");
                    return objLIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("AbstractPreloadStrategy@d7.preloadBillInfo$1$1");
                    return objLJFF;
                }
            }
        }
        C03R4 c03r4 = this.LLILLL;
        C03WX c03wx = this.LLILZ;
        C03R6 c03r6 = this.LLILZIL;
        InterfaceC1748810vbr interfaceC1748810vbr = this.LLILZLL;
        Integer num = this.LLIZ;
        C03RX c03rx = this.LLIZLLLIL;
        C03RW c03rw = this.LLJ;
        String str = this.LLJI;
        Integer num2 = this.LLJIJIL;
        EnumC840403Qc enumC840403Qc = this.LLJILJIL;
        this.LL = 2;
        objLIZ = c03r4.LIZ(c03wx, c03r6, interfaceC1748810vbr, num, c03rx, c03rw, str, num2, enumC840403Qc, this);
        if (objLIZ == objLJFF) {
            C1C7U.LIZIZ("AbstractPreloadStrategy@d7.preloadBillInfo$1$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("AbstractPreloadStrategy@d7.preloadBillInfo$1$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BillInfoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
