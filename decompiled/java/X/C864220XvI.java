package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.recallmsg.RecallMsgUseCase$scanAndCleanupRecalledMessages$1", f = "RecallMsgUseCase.kt", l = {141}, m = "invokeSuspend")
public final class C864220XvI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0Y3S LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864220XvI(C0Y3S c0y3s, InterfaceC1364105Vn<? super C864220XvI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0y3s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864220XvI(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        Iterator<Pair<String, String>> it2;
        C1C7U.LIZ("RecallMsgUseCase@ca4d.scanAndCleanupRecalledMessages$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                j = this.LL;
                it2 = (Iterator) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            j = this.LLILZ.LIZ.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZIZ;
            List<Pair<String, String>> listLIZJ = this.LLILZ.LIZJ.LIZJ().LIZJ("recall_time");
            if (listLIZJ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scanAndCleanupRecalledMessages$1");
                return unit;
            }
            C868780Y6i c868780Y6iLIZLLL = this.LLILZ.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scanAndCleanupRecalledMessages: ");
            sbLIZ.append(listLIZJ.size());
            sbLIZ.append(" pending");
            C868780Y6i.LJ(c868780Y6iLIZLLL, "RecallMsgUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
            it2 = listLIZJ.iterator();
        }
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            String first = next.getFirst();
            Long lLJIILIIL = C2095008Iq.LJIILIIL(next.getSecond());
            if (lLJIILIIL == null) {
                this.LLILZ.LIZJ.LIZJ().LLJJIJI(first, "recall_time");
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - lLJIILIIL.longValue();
                if (jCurrentTimeMillis >= j) {
                    C0Y3S c0y3s = this.LLILZ;
                    this.LLILLJJLI = it2;
                    this.LL = j;
                    this.LLILLL = 1;
                    if (c0y3s.LIZLLL(first, this) == objLJFF) {
                        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scanAndCleanupRecalledMessages$1");
                        return objLJFF;
                    }
                } else {
                    this.LLILZ.LJII(j - jCurrentTimeMillis, first);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecallMsgUseCase@ca4d.scanAndCleanupRecalledMessages$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
