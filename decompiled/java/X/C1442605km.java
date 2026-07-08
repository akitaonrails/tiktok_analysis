package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl$releaseSlotAsync$2$1$1", f = "FcpDecisionEngineImpl.kt", l = {251}, m = "invokeSuspend")
public final class C1442605km extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1178104jD>, Object> {
    public int LL;
    public final /* synthetic */ C1443005kq LLILLJJLI;
    public final /* synthetic */ InterfaceC1444205l2 LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442605km(C1443005kq c1443005kq, InterfaceC1444205l2 interfaceC1444205l2, List<String> list, InterfaceC1364105Vn<? super C1442605km> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1443005kq;
        this.LLILLL = interfaceC1444205l2;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1442605km(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2$1$1");
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
            C1443005kq c1443005kq = this.LLILLJJLI;
            InterfaceC1444205l2 interfaceC1444205l2 = this.LLILLL;
            List<String> list = this.LLILZ;
            this.LL = 1;
            obj = c1443005kq.LJI(interfaceC1444205l2, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1178104jD> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
