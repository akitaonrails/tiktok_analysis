package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.mlbb.MlbbSyncAuthProcessor$invokeSyncApi$1", f = "MlbbSyncAuthProcessor.kt", l = {47, 54, 61}, m = "invokeSuspend")
public final class C1071480dzO extends C09AX implements Function2<InterfaceC346701Wf<? super C1071240dz0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1071500dzQ LLILZIL;
    public final /* synthetic */ C1071220dyy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071480dzO(boolean z, C1071500dzQ c1071500dzQ, C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071480dzO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = c1071500dzQ;
        this.LLILZLL = c1071220dyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071480dzO c1071480dzO = new C1071480dzO(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1071480dzO.LLILLL = obj;
        return c1071480dzO;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1071480dzO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1071240dz0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
