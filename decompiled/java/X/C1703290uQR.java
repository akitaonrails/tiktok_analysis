package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0uQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.ChangeRegionClient$fetchEntranceInfoBackground$1", f = "ChangeRegionClient.kt", l = {119, 122}, m = "invokeSuspend")
public final class C1703290uQR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1703340uQW<? extends C1238730iL9> LLILLJJLI;
    public final /* synthetic */ InterfaceC1703280uQQ<? extends C1238730iL9> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703290uQR(AbstractC1703340uQW<? extends C1238730iL9> abstractC1703340uQW, InterfaceC1703280uQQ<? extends C1238730iL9> interfaceC1703280uQQ, InterfaceC1364105Vn<? super C1703290uQR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1703340uQW;
        this.LLILLL = interfaceC1703280uQQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703290uQR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        C1C7U.LIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1703270uQP c1703270uQP = new C1703270uQP(this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1703270uQP);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1");
                return objLJFF;
            }
        }
        C1703300uQS c1703300uQS = (C1703300uQS) obj;
        AbstractC1703340uQW<? extends C1238730iL9> abstractC1703340uQW = this.LLILLJJLI;
        this.LL = 2;
        abstractC1703340uQW.getClass();
        String str = c1703300uQS.LIZIZ;
        Boolean bool = c1703300uQS.LIZLLL;
        C598080Nd0.LIZ(str, c1703300uQS.LJ, c1703300uQS.LIZJ, bool);
        if (!Intrinsics.LJFF(c1703300uQS.LIZLLL, false)) {
            T t = c1703300uQS.LIZ;
            if ((t instanceof C1238730iL9) && t != 0) {
                C1DFH c1dfh = C0PEM.LIZ;
                objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C1703310uQT(t, abstractC1703340uQW, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
            } else {
                objLJI = Unit.LIZ;
            }
        } else {
            objLJI = Unit.LIZ;
        }
        if (objLJI == objLJFF) {
            C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionClient@3114.fetchEntranceInfoBackground$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
