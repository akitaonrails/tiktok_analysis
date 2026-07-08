package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.mob.AutoCutNetworkRequestMobListener$onRequestNLEModelFinish$1", f = "AutoCutNetworkRequestListener.kt", l = {}, m = "invokeSuspend")
public final class C1417880n06 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1417870n05 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417880n06(String str, C1417870n05 c1417870n05, boolean z, int i, int i2, String str2, long j, String str3, String str4, String str5, String str6, boolean z2, InterfaceC1364105Vn<? super C1417880n06> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1417870n05;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = str2;
        this.LLIZ = j;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1417880n06(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r4 = "AutoCutNetworkRequestMobListener@a7af.onRequestNLEModelFinish$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r21)
            r3 = r20
            java.lang.String r2 = r3.LL     // Catch: java.lang.Exception -> L25
            if (r2 == 0) goto L29
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L25
            java.lang.Class<com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse> r0 = com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse.class
            r1.getClass()     // Catch: java.lang.Exception -> L25
            java.lang.Object r0 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: java.lang.Exception -> L25
            com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse r0 = (com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse) r0     // Catch: java.lang.Exception -> L25
            com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponseExtra r0 = r0.extra     // Catch: java.lang.Exception -> L25
            if (r0 == 0) goto L29
            java.lang.String r15 = r0.logId     // Catch: java.lang.Exception -> L25
            goto L2a
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L29:
            r15 = 0
        L2a:
            X.0n05 r0 = r3.LLILLJJLI
            java.lang.String r13 = r0.LIZ
            java.lang.String r14 = r0.LIZIZ
            boolean r5 = r3.LLILLL
            int r6 = r3.LLILZ
            int r7 = r3.LLILZIL
            java.lang.String r8 = r3.LLILZLL
            long r9 = r3.LLIZ
            java.lang.String r11 = r3.LLIZLLLIL
            java.lang.String r12 = r3.LLJ
            java.lang.String r2 = r3.LLJI
            java.lang.String r1 = r3.LLJIJIL
            boolean r0 = r3.LLJILJIL
            r16 = 0
            r17 = r2
            r18 = r1
            r19 = r0
            X.C1417710mzp.LJJII(r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417880n06.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
