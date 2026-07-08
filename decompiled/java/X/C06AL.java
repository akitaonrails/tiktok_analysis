package X;

import com.ss.android.ugc.aweme.im.service.DmHelper;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06AL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.DmHelper$markLastPropertyRead$2", f = "DmHelper.kt", l = {139, 142}, m = "invokeSuspend")
public final class C06AL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0Y8T LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06AL(C0Y8T c0y8t, InterfaceC1364105Vn<? super C06AL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06AL(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJIILJJIL;
        C1C7U.LIZ("DmHelper@d68.markLastPropertyRead$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DmHelper@d68.markLastPropertyRead$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mapLJIILJJIL = (Map) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            DmHelper dmHelper = DmHelper.LIZIZ;
            mapLJIILJJIL = dmHelper.LJIILJJIL(this.LLILLL);
            String conversationId = this.LLILLL.getConversationId();
            this.LL = mapLJIILJJIL;
            this.LLILLJJLI = 1;
            if (dmHelper.LJIILIIL(conversationId, mapLJIILJJIL, this) == objLJFF) {
                C1C7U.LIZIZ("DmHelper@d68.markLastPropertyRead$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C06AK c06ak = new C06AK(this.LLILLL, mapLJIILJJIL, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c06ak) == objLJFF) {
            C1C7U.LIZIZ("DmHelper@d68.markLastPropertyRead$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DmHelper@d68.markLastPropertyRead$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
