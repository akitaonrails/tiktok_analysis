package X;

import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS405S0200000_4;
import njp.a;

/* JADX INFO: renamed from: X.0CoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$checkPreloadAndShow$1$success$1$1$job$1", f = "TakoEnterUtil.kt", l = {767}, m = "invokeSuspend")
public final class C324960CoY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ C1863380yae LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324960CoY(TakoEnterParams takoEnterParams, C1863380yae c1863380yae, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf, InterfaceC1364105Vn<? super C324960CoY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = c1863380yae;
        this.LLILZ = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324960CoY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnterUtil@4341.checkPreloadAndShow$1$success$1$1$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1863760ybG.LJFF(this.LLILLJJLI.processId);
            C1863400yag c1863400yag = C1863400yag.LIZ;
            C1863380yae c1863380yae = this.LLILLL;
            AwS405S0200000_4 awS405S0200000_4 = new AwS405S0200000_4(this.LLILLJJLI, (TakoEnterParams) this.LLILZ, (InterfaceC20236714Gf<? super Unit>) 38);
            this.LL = 1;
            if (C1863400yag.LIZLLL(c1863400yag, c1863380yae, awS405S0200000_4, this, 2) == objLJFF) {
                C1C7U.LIZIZ("TakoEnterUtil@4341.checkPreloadAndShow$1$success$1$1$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEnterUtil@4341.checkPreloadAndShow$1$success$1$1$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
