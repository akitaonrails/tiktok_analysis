package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.routing.CommonFlowRouteAction$callSafeEnv$1", f = "CommonFlowRouteAction.kt", l = {166, 167, 170}, m = "invokeSuspend")
public final class C852560XcU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SafeEnvV2Response LL;
    public int LLILLJJLI;
    public final /* synthetic */ EnumC852630Xcb LLILLL;
    public final /* synthetic */ DialogC1389620mGW LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ Function1<SafeEnvData, Unit> LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C852560XcU(EnumC852630Xcb enumC852630Xcb, DialogC1389620mGW dialogC1389620mGW, Bundle bundle, Function1<? super SafeEnvData, Unit> function1, Activity activity, InterfaceC1364105Vn<? super C852560XcU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC852630Xcb;
        this.LLILZ = dialogC1389620mGW;
        this.LLILZIL = bundle;
        this.LLILZLL = function1;
        this.LLIZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C852560XcU(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "CommonFlowRouteAction@d4c5.callSafeEnv$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLJJLI
            r12 = 0
            r4 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L33
            if (r0 == r5) goto L52
            if (r0 != r4) goto L74
            X.C155000ia.LIZIZ(r14)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L20:
            X.C155000ia.LIZIZ(r14)
            X.0XcZ r1 = X.InterfaceC852600XcY.LIZ
            X.0Xcb r0 = r13.LLILLL
            r13.LLILLJJLI = r2
            java.lang.Object r14 = r1.LIZIZ(r0, r13)
            if (r14 != r3) goto L36
            X.C1C7U.LIZIZ(r6)
            return r3
        L33:
            X.C155000ia.LIZIZ(r14)
        L36:
            r8 = r14
            com.ss.android.ugc.aweme.account.model.SafeEnvV2Response r8 = (com.ss.android.ugc.aweme.account.model.SafeEnvV2Response) r8
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CYV r1 = new X.0CYV
            X.0mGW r0 = r13.LLILZ
            r1.<init>(r0, r12)
            r13.LL = r8
            r13.LLILLJJLI = r5
            java.lang.Object r0 = X.C23250099c.LJI(r13, r2, r1)
            if (r0 != r3) goto L57
            X.C1C7U.LIZIZ(r6)
            return r3
        L52:
            com.ss.android.ugc.aweme.account.model.SafeEnvV2Response r8 = r13.LL
            X.C155000ia.LIZIZ(r14)
        L57:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0XcV r7 = new X.0XcV
            android.os.Bundle r9 = r13.LLILZIL
            kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.account.model.SafeEnvData, kotlin.Unit> r10 = r13.LLILZLL
            android.app.Activity r11 = r13.LLIZ
            r7.<init>(r8, r9, r10, r11, r12)
            r13.LL = r12
            r13.LLILLJJLI = r4
            java.lang.Object r0 = X.C23250099c.LJI(r13, r0, r7)
            if (r0 != r3) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r3
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C852560XcU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
