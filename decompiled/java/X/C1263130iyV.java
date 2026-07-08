package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource$saveToStorage$1", f = "MafUserPagingSource.kt", l = {227}, m = "invokeSuspend")
public final class C1263130iyV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1261860iwS> LLILLJJLI;
    public final /* synthetic */ C1263110iyT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263130iyV(List<C1261860iwS> list, C1263110iyT c1263110iyT, InterfaceC1364105Vn<? super C1263130iyV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1263110iyT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1263130iyV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafUserPagingSource@b859.saveToStorage$1");
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
            List<C1261860iwS> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1261860iwS> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C1263100iyS.LJ(it2.next()));
            }
            InterfaceC2448809ig interfaceC2448809igLIZJ = this.LLILLL.LIZJ.LIZJ();
            EnumC816850W2p enumC816850W2p = EnumC816850W2p.MAF;
            this.LL = 1;
            if (interfaceC2448809igLIZJ.LIZIZ(enumC816850W2p, arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("MafUserPagingSource@b859.saveToStorage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MafUserPagingSource@b859.saveToStorage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
