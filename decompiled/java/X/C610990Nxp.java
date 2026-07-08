package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler$scheduleCleanup$1$1", f = "SkylightCacheCleanupScheduler.kt", l = {112, 115}, m = "invokeSuspend")
public final class C610990Nxp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ SkylightCacheCleanupScheduler LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610990Nxp(SkylightCacheCleanupScheduler skylightCacheCleanupScheduler, InterfaceC1364105Vn<? super C610990Nxp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = skylightCacheCleanupScheduler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610990Nxp(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610990Nxp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
