package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS148S0101000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Ldo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.quota.AIGCQuotaManager$refreshQuota$1", f = "AIGCQuotaManager.kt", l = {149}, m = "invokeSuspend")
public final class C547620Ldo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Source LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C547620Ldo(Source source, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C547620Ldo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = source;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C547620Ldo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCQuotaManager@7d8a.refreshQuota$1");
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
            C547610Ldn c547610Ldn = C547610Ldn.LIZ;
            Source source = this.LLILLJJLI;
            this.LL = 1;
            c547610Ldn.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C547600Ldm(source, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCQuotaManager@7d8a.refreshQuota$1");
                return objLJFF;
            }
        }
        C0CNO.LIZLLL(0L, new AwS148S0101000_8(((Number) obj).intValue(), this.LLILLL, 11));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCQuotaManager@7d8a.refreshQuota$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
