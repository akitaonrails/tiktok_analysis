package X;

import com.ss.android.ugc.aweme.publish.service.PublishGuideDraftServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05J6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.service.PublishGuideDraftServiceImpl$getSocialAffinityUserInfo$7", f = "PublishGuideDraftServiceImpl.kt", l = {60, 61, 67}, m = "invokeSuspend")
public final class C05J6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ PublishGuideDraftServiceImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<List<C1345005Oe>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05J6(PublishGuideDraftServiceImpl publishGuideDraftServiceImpl, int i, Function1<? super List<C1345005Oe>, Unit> function1, InterfaceC1364105Vn<? super C05J6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = publishGuideDraftServiceImpl;
        this.LLILZ = i;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05J6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PublishGuideDraftServiceImpl@4ca.getSocialAffinityUserInfo$7"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r7 = 3
            r4 = 2
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L25
            if (r0 == r3) goto L20
            if (r0 == r4) goto L52
            if (r0 != r7) goto L9f
            X.C155000ia.LIZIZ(r11)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            java.lang.Object r2 = r10.LL
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            goto L39
        L25:
            X.C155000ia.LIZIZ(r11)
            com.ss.android.ugc.aweme.publish.service.PublishGuideDraftServiceImpl r1 = r10.LLILLL
            int r0 = r10.LLILZ
            kotlin.jvm.functions.Function1<java.util.List<X.05Oe>, kotlin.Unit> r2 = r10.LLILZIL
            r10.LL = r2     // Catch: java.lang.Throwable -> L5b
            r10.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r11 = r1.LIZLLL(r0)     // Catch: java.lang.Throwable -> L5b
            if (r11 != r6) goto L3c
            goto La7
        L39:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L5b
        L3c:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L5b
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L5b
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L5b
            X.05J5 r0 = new X.05J5     // Catch: java.lang.Throwable -> L5b
            r0.<init>(r11, r5, r2)     // Catch: java.lang.Throwable -> L5b
            r10.LL = r5     // Catch: java.lang.Throwable -> L5b
            r10.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)     // Catch: java.lang.Throwable -> L5b
            if (r0 != r6) goto L55
            goto Lab
        L52:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> L5b
        L55:
            kotlin.Unit r8 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5b
            X.C189200o6.m2constructorimpl(r8)     // Catch: java.lang.Throwable -> L5b
            goto L67
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r8 = new X.00Yq
            r8.<init>(r0)
            X.C189200o6.m2constructorimpl(r8)
        L67:
            com.ss.android.ugc.aweme.publish.service.PublishGuideDraftServiceImpl r0 = r10.LLILLL
            kotlin.jvm.functions.Function1<java.util.List<X.05Oe>, kotlin.Unit> r4 = r10.LLILZIL
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r8)
            if (r3 == 0) goto L1a
            X.0MAY r2 = X.C0MAY.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r0.LIZ
            r1.append(r0)
            java.lang.String r0 = " getSocialAffinityUserInfo failed"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJIIJ(r2, r0, r3)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.05J4 r0 = new X.05J4
            r0.<init>(r4, r5)
            r10.LL = r8
            r10.LLILLJJLI = r7
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r6) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r6
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La7:
            X.C1C7U.LIZIZ(r9)
            return r6
        Lab:
            X.C1C7U.LIZIZ(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05J6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
