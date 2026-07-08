package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.InboxSkylightStoryDataCenter$tryInitDiskCacheData$1", f = "SkylightStoryDataCenter.kt", l = {527, 528, 533}, m = "invokeSuspend")
public final class C325201Ny extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1600200rkA LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325201Ny(C1600200rkA c1600200rkA, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1600200rkA;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325201Ny(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightStoryDataCenter", "tryInitDiskCacheData error", e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C325101Nx c325101Nx = new C325101Nx(this.LLILLL, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c325101Nx) == objLJFF) {
                C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1600200rkA c1600200rkA = this.LLILLJJLI;
            this.LL = 1;
            if (c1600200rkA.LJFF(this) == objLJFF) {
                C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C325301Nz c325301Nz = new C325301Nz(this.LLILLJJLI, null, this.LLILLL);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c325301Nz) == objLJFF) {
            C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightStoryDataCenter@fba4.tryInitDiskCacheData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
