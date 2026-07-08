package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailSyncAuthProcessor$invokeSyncApi$1", f = "EmailSyncAuthProcessor.kt", l = {53, 60, 68}, m = "invokeSuspend")
public final class C1071470dzN extends C09AX implements Function2<InterfaceC346701Wf<? super C1071240dz0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1071490dzP LLILZIL;
    public final /* synthetic */ C1071220dyy LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071470dzN(boolean z, C1071490dzP c1071490dzP, C1071220dyy c1071220dyy, InterfaceC1364105Vn<? super C1071470dzN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = c1071490dzP;
        this.LLILZLL = c1071220dyy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071470dzN c1071470dzN = new C1071470dzN(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1071470dzN.LLILLL = obj;
        return c1071470dzN;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1071470dzN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1071240dz0> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
