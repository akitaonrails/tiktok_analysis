package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$doUpload$2$perfUri$1", f = "ReportSession.kt", l = {160, 162, 162}, m = "invokeSuspend")
public final class C507101yH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C1735750vGn LL;
    public C508401yU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AnonymousClass0957<C1735750vGn> LLILZ;
    public final /* synthetic */ C508401yU LLILZIL;
    public final /* synthetic */ AnonymousClass0957<File> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507101yH(C508401yU c508401yU, InterfaceC1364105Vn interfaceC1364105Vn, AnonymousClass0957 anonymousClass0957, AnonymousClass0957 anonymousClass09572) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = c508401yU;
        this.LLILZLL = anonymousClass09572;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C507101yH(this.LLILZIL, interfaceC1364105Vn, this.LLILZ, this.LLILZLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "ReportSession@cd97.doUpload$2$perfUri$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r5 = 3
            r4 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L25
            if (r0 == r1) goto L36
            if (r0 == r4) goto L20
            if (r0 != r5) goto L18
            goto L69
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.01yU r2 = r8.LLILLJJLI
            X.0vGn r1 = r8.LL
            goto L54
        L25:
            X.C155000ia.LIZIZ(r9)
            X.0957<X.0vGn> r0 = r8.LLILZ     // Catch: java.lang.Exception -> L70
            r8.LLILLL = r1     // Catch: java.lang.Exception -> L70
            java.lang.Object r9 = r0.LJLIIIL(r8)     // Catch: java.lang.Exception -> L70
            if (r9 != r6) goto L39
            X.C1C7U.LIZIZ(r7)
            return r6
        L36:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L70
        L39:
            X.0vGn r9 = (X.C1735750vGn) r9     // Catch: java.lang.Exception -> L70
            if (r9 == 0) goto L8f
            X.01yU r2 = r8.LLILZIL     // Catch: java.lang.Exception -> L70
            X.0957<java.io.File> r0 = r8.LLILZLL     // Catch: java.lang.Exception -> L70
            r8.LL = r9     // Catch: java.lang.Exception -> L70
            r8.LLILLJJLI = r2     // Catch: java.lang.Exception -> L70
            r8.LLILLL = r4     // Catch: java.lang.Exception -> L70
            java.lang.Object r0 = r0.LJLIIIL(r8)     // Catch: java.lang.Exception -> L70
            if (r0 != r6) goto L51
            X.C1C7U.LIZIZ(r7)
            return r6
        L51:
            r1 = r9
            r9 = r0
            goto L57
        L54:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L70
        L57:
            java.io.File r9 = (java.io.File) r9     // Catch: java.lang.Exception -> L70
            r8.LL = r3     // Catch: java.lang.Exception -> L70
            r8.LLILLJJLI = r3     // Catch: java.lang.Exception -> L70
            r8.LLILLL = r5     // Catch: java.lang.Exception -> L70
            java.lang.Object r9 = r2.LJII(r1, r9, r8)     // Catch: java.lang.Exception -> L70
            if (r9 != r6) goto L6c
            X.C1C7U.LIZIZ(r7)
            return r6
        L69:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L70
        L6c:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L70
            r3 = r9
            goto L8f
        L70:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "uploadPerformanceData failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "minis-ReportSession"
            X.C1720106oR.LIZ(r0, r1)
        L8f:
            X.C1C7U.LIZIZ(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C507101yH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
