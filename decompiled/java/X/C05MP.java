package X;

import com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl$updateAigcLabelStatus$1", f = "AIGCLabelServiceImpl.kt", l = {55}, m = "invokeSuspend")
public final class C05MP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCLabelServiceImpl LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05MP(AIGCLabelServiceImpl aIGCLabelServiceImpl, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C05MP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIGCLabelServiceImpl;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MP c05mp = new C05MP(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05mp.LLILLJJLI = obj;
        return c05mp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$1");
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
            if (!C2296808zG.LJI((InterfaceC497601wk) this.LLILLJJLI)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$1");
                return unit;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            C05MQ c05mq = new C05MQ(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c05mq) == objLJFF) {
                C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCLabelServiceImpl@f9f4.updateAigcLabelStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
