package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler$cleanupExpiredRowsIfNeeded$2", f = "SkylightCacheCleanupScheduler.kt", l = {129}, m = "invokeSuspend")
public final class C611030Nxt extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611030Nxt(long j, InterfaceC1364105Vn<? super C611030Nxt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611030Nxt c611030Nxt = new C611030Nxt(this.LLILLL, interfaceC1364105Vn);
        c611030Nxt.LLILLJJLI = obj;
        return c611030Nxt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$2");
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
            InterfaceC611050Nxv interfaceC611050NxvLIZ = ((SkylightUnifiedDB) this.LLILLJJLI).LIZ();
            long j = this.LLILLL;
            this.LL = 1;
            if (interfaceC611050NxvLIZ.LIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
