package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.biz.link.usecase.LeagueMatchCountdownTimerUseCaseImpl$createCountdownFlow$1", f = "LeagueMatchCountdownTimerUseCase.kt", l = {110, 111}, m = "invokeSuspend")
public final class C327601Ow extends C09AX implements Function2<InterfaceC346701Wf<? super Long>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C327801Oy LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327601Ow(long j, C327801Oy c327801Oy, InterfaceC1364105Vn<? super C327601Ow> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c327801Oy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C327601Ow c327601Ow = new C327601Ow(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c327601Ow.LLILLJJLI = obj;
        return c327601Ow;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0054 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "LeagueMatchCountdownTimerUseCaseImpl@3f0e.createCountdownFlow$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L5a
            if (r0 == r5) goto L43
            if (r0 != r6) goto L79
            java.lang.Object r4 = r11.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r12)
        L1a:
            long r2 = r11.LLILLL
            X.01Oy r0 = r11.LLILZ
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r0.LIZJ
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
        L2b:
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L73
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r11.LLILLJJLI = r4
            r11.LL = r5
            java.lang.Object r0 = r4.emit(r0, r11)
            if (r0 != r7) goto L4a
            X.C1C7U.LIZIZ(r10)
            return r7
        L43:
            java.lang.Object r4 = r11.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.C155000ia.LIZIZ(r12)
        L4a:
            r11.LLILLJJLI = r4
            r11.LL = r6
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r7) goto L1a
            X.C1C7U.LIZIZ(r10)
            return r7
        L5a:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r4 = r11.LLILLJJLI
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            long r2 = r11.LLILLL
            X.01Oy r0 = r11.LLILZ
            kotlin.jvm.functions.Function0<java.lang.Long> r0 = r0.LIZJ
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            long r2 = r2 - r0
            goto L2b
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327601Ow.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Long> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
