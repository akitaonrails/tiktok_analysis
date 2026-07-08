package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKPageDataOperator$initObserver$1", f = "ECMMKDataOperator.kt", l = {773, 785}, m = "invokeSuspend")
public final class C1772210wDb extends C09AX implements Function2<AbstractC1772230wDd, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1772620wEG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772210wDb(C1772620wEG c1772620wEG, InterfaceC1364105Vn<? super C1772210wDb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1772620wEG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1772210wDb c1772210wDb = new C1772210wDb(this.LLILLL, interfaceC1364105Vn);
        c1772210wDb.LLILLJJLI = obj;
        return c1772210wDb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1772230wDd abstractC1772230wDd;
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.initObserver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    abstractC1772230wDd = (AbstractC1772230wDd) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    C1772880wEg.LJ(EnumC1771830wCz.LOAD_MORE, abstractC1772230wDd.LIZ.LIZ, ((C1772220wDc) abstractC1772230wDd).LIZIZ.LIZJ);
                }
            } else {
                C155000ia.LIZIZ(obj);
                abstractC1772230wDd = (AbstractC1772230wDd) this.LLILLJJLI;
                if (abstractC1772230wDd instanceof C1772140wDU) {
                    C1772620wEG c1772620wEG = this.LLILLL;
                    c1772620wEG.LJIIL((C1772140wDU) abstractC1772230wDd, c1772620wEG.LIZ.LJIIL);
                    this.LLILLL.LJIILIIL((C1772140wDU) abstractC1772230wDd);
                    this.LLILLL.LIZJ((C1772140wDU) abstractC1772230wDd);
                    this.LLILLL.LJIIIZ(true, abstractC1772230wDd, ((C1772140wDU) abstractC1772230wDd).LIZLLL);
                } else if (abstractC1772230wDd instanceof C1772150wDV) {
                    this.LLILLL.LJIILJJIL((C1772150wDV) abstractC1772230wDd);
                    C1515950pYH c1515950pYHLIZIZ = C1515940pYG.LIZIZ(abstractC1772230wDd.LIZ.LJIIJJI, ((C1772150wDV) abstractC1772230wDd).LIZIZ.LJIIL);
                    if (c1515950pYHLIZIZ != null) {
                        c1515950pYHLIZIZ.LJIIIIZZ = System.currentTimeMillis();
                        c1515950pYHLIZIZ.LJIIJJI = true;
                        C1515940pYG.LIZJ(C2286608xc.LJFF(c1515950pYHLIZIZ.LIZ), null);
                    }
                    this.LLILLL.LJIIIZ(true, abstractC1772230wDd, ((C1772150wDV) abstractC1772230wDd).LIZLLL);
                } else if (abstractC1772230wDd instanceof C1772220wDc) {
                    this.LLILLL.LJI((C1772220wDc) abstractC1772230wDd);
                    this.LLILLL.LJIIIIZZ(true, abstractC1772230wDd);
                    C2252321DDq c2252321DDq = this.LLILLL.LIZIZ.LLJJI;
                    C1772350wDp c1772350wDp = new C1772350wDp(abstractC1772230wDd.LIZ);
                    this.LLILLJJLI = abstractC1772230wDd;
                    this.LL = 1;
                    c2252321DDq.setValue(c1772350wDp);
                    if (Unit.LIZ == objLJFF) {
                        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.initObserver$1");
                        return objLJFF;
                    }
                    C1772880wEg.LJ(EnumC1771830wCz.LOAD_MORE, abstractC1772230wDd.LIZ.LIZ, ((C1772220wDc) abstractC1772230wDd).LIZIZ.LIZJ);
                } else if (abstractC1772230wDd instanceof C1773060wEy) {
                    this.LLILLL.LIZ((C1773060wEy) abstractC1772230wDd);
                } else if (abstractC1772230wDd instanceof C1772200wDa) {
                    this.LLILLL.getClass();
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAllDataError: ");
                    sbLIZ.append(((C1772200wDa) abstractC1772230wDd).LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZIZ();
                    this.LLILLL.LJIIIZ(false, abstractC1772230wDd, ((C1772200wDa) abstractC1772230wDd).LIZJ);
                    C2252321DDq c2252321DDq2 = this.LLILLL.LIZIZ.LLJJIJI;
                    C1774390wH7 c1774390wH7 = C1774390wH7.LIZ;
                    this.LL = 2;
                    c2252321DDq2.setValue(c1774390wH7);
                    if (Unit.LIZ == objLJFF) {
                        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.initObserver$1");
                        return objLJFF;
                    }
                } else if (abstractC1772230wDd instanceof C1772190wDZ) {
                    this.LLILLL.LJII((C1772190wDZ) abstractC1772230wDd);
                    this.LLILLL.LJIIIIZZ(false, abstractC1772230wDd);
                } else if (abstractC1772230wDd instanceof C1773050wEx) {
                    this.LLILLL.LJ((C1773050wEx) abstractC1772230wDd);
                } else {
                    C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update data error: unknown intent: ");
                    sbLIZ2.append(abstractC1772230wDd);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c599820Nfo2.getClass();
                    C599820Nfo.LIZIZ();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1768370w7P.LIZ(th, EnumC1771210wBz.DATA_INTENT, "ECMMKPageDataOperator:dataIntent.onEach", null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.initObserver$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1772230wDd abstractC1772230wDd, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1772230wDd, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
