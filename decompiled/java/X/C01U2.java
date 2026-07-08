package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01U2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleVM$queryBatchAweme$1", f = "NimbleVM.kt", l = {52, 54, 58}, m = "invokeSuspend")
public final class C01U2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NimbleVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<BatchDetailList, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01U2(NimbleVM nimbleVM, String str, Function1<? super BatchDetailList, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C01U2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nimbleVM;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01U2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NimbleVM@82c8.queryBatchAweme$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C01U0 c01u0 = new C01U0(th, null, this.LLILZIL);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c01u0) == objLJFF) {
                C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C358401aI c358401aI = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            this.LL = 1;
            String str2 = C358401aI.LIZIZ;
            obj = c358401aI.LIZIZ(str, 0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
                return objLJFF;
            }
        }
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (batchDetailList != null) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C01U1 c01u1 = new C01U1(this.LLILZ, batchDetailList, null);
            this.LL = 2;
            obj = C23250099c.LJI(this, abstractC2238408pq2, c01u1);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("NimbleVM@82c8.queryBatchAweme$1");
            return unit22;
        }
        throw new IllegalStateException("queryBatchAweme result is null");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
