package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightFriendsStoryDataCenter$tryInitDiskCacheData$1", f = "SkylightFriendsStoryDataCenter.kt", l = {118, 119, 123}, m = "invokeSuspend")
public final class C05AA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1600210rkB LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AA(C1600210rkB c1600210rkB, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1600210rkB;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05AA(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C05A9 c05a9 = new C05A9(this.LLILLL, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c05a9) == objLJFF) {
                C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1600210rkB c1600210rkB = this.LLILLJJLI;
            this.LL = 1;
            if (c1600210rkB.LIZJ(this) == objLJFF) {
                C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C05AB c05ab = new C05AB(this.LLILLJJLI, null, this.LLILLL);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c05ab) == objLJFF) {
            C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.tryInitDiskCacheData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
