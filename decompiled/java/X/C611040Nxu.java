package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightUnifiedDB;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler$cleanupExpiredRowsIfNeeded$3", f = "SkylightCacheCleanupScheduler.kt", l = {134}, m = "invokeSuspend")
public final class C611040Nxu extends C09AX implements Function2<SkylightUnifiedDB, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611040Nxu(long j, InterfaceC1364105Vn<? super C611040Nxu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C611040Nxu c611040Nxu = new C611040Nxu(this.LLILLL, interfaceC1364105Vn);
        c611040Nxu.LLILLJJLI = obj;
        return c611040Nxu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$3");
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
            InterfaceC611220NyC interfaceC611220NyCLIZIZ = ((SkylightUnifiedDB) this.LLILLJJLI).LIZIZ();
            long j = this.LLILLL;
            this.LL = 1;
            if (interfaceC611220NyCLIZIZ.LIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SkylightUnifiedDB skylightUnifiedDB, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(skylightUnifiedDB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
