package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl$releaseSlotAsync$2", f = "FcpDecisionEngineImpl.kt", l = {252}, m = "invokeSuspend")
public final class C1442705kn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1178104jD>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1444205l2 LLILLL;
    public final /* synthetic */ C1443005kq LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442705kn(C1443005kq c1443005kq, InterfaceC1444205l2 interfaceC1444205l2, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1444205l2;
        this.LLILZ = c1443005kq;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1442705kn c1442705kn = new C1442705kn(this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC1364105Vn);
        c1442705kn.LLILLJJLI = obj;
        return c1442705kn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<InterfaceC1444205l2> listLIZ = this.LLILLL.LIZ();
            C1443005kq c1443005kq = this.LLILZ;
            List<String> list = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator<InterfaceC1444205l2> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1442605km(c1443005kq, it2.next(), list, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.releaseSlotAsync$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1178104jD>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
