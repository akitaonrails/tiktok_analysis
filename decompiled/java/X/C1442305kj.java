package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl$applySlotAsync$childWinners$1", f = "FcpDecisionEngineImpl.kt", l = {83}, m = "invokeSuspend")
public final class C1442305kj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1444205l2> LLILLL;
    public final /* synthetic */ C1443005kq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1442305kj(List<? extends InterfaceC1444205l2> list, C1443005kq c1443005kq, InterfaceC1364105Vn<? super C1442305kj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1443005kq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1442305kj c1442305kj = new C1442305kj(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1442305kj.LLILLJJLI = obj;
        return c1442305kj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.applySlotAsync$childWinners$1");
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
            List<InterfaceC1444205l2> list = this.LLILLL;
            C1443005kq c1443005kq = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC1444205l2> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1442405kk(c1443005kq, it2.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.applySlotAsync$childWinners$1");
                return objLJFF;
            }
        }
        List listLJJJJLI = C13LP.LJJJJLI((Iterable) obj);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) listLJJJJLI).iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((C1178104jD) it3.next()).LIZIZ, arrayList2);
        }
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.applySlotAsync$childWinners$1");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
