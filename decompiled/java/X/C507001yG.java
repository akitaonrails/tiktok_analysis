package X;

import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$doUpload$2$screenshotUris$1", f = "ReportSession.kt", l = {143, 145, 148}, m = "invokeSuspend")
public final class C507001yG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<List<File>> LLILLL;
    public final /* synthetic */ AnonymousClass0957<C1735750vGn> LLILZ;
    public final /* synthetic */ C508401yU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507001yG(C508401yU c508401yU, InterfaceC1364105Vn interfaceC1364105Vn, AnonymousClass0957 anonymousClass0957, AnonymousClass0957 anonymousClass09572) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = anonymousClass09572;
        this.LLILZIL = c508401yU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C507001yG(this.LLILZIL, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[Catch: Exception -> 0x0093, TRY_ENTER, TryCatch #0 {Exception -> 0x0093, blocks: (B:30:0x0076, B:31:0x0079, B:26:0x005d), top: B:41:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ReportSession@cd97.doUpload$2$screenshotUris$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 3
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L30
            if (r0 == r3) goto L52
            if (r0 != r4) goto L17
            goto L76
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r8)
            X.0957<java.util.List<java.io.File>> r0 = r7.LLILLL
            r7.LLILLJJLI = r1
            java.lang.Object r8 = r0.LJLIIIL(r7)
            if (r8 != r5) goto L33
            X.C1C7U.LIZIZ(r6)
            return r5
        L30:
            X.C155000ia.LIZIZ(r8)
        L33:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L42
            X.13BV r0 = X.C13BV.INSTANCE
            X.C1C7U.LIZIZ(r6)
            return r0
        L42:
            X.0957<X.0vGn> r0 = r7.LLILZ
            r7.LL = r2
            r7.LLILLJJLI = r3
            java.lang.Object r8 = r0.LJLIIIL(r7)
            if (r8 != r5) goto L59
            X.C1C7U.LIZIZ(r6)
            return r5
        L52:
            java.lang.Object r2 = r7.LL
            java.util.List r2 = (java.util.List) r2
            X.C155000ia.LIZIZ(r8)
        L59:
            X.0vGn r8 = (X.C1735750vGn) r8
            if (r8 == 0) goto L7c
            X.01yU r0 = r7.LLILZIL     // Catch: java.lang.Exception -> L93
            r1 = 0
            r7.LL = r1     // Catch: java.lang.Exception -> L93
            r7.LLILLJJLI = r4     // Catch: java.lang.Exception -> L93
            r0.getClass()     // Catch: java.lang.Exception -> L93
            X.01yE r0 = new X.01yE     // Catch: java.lang.Exception -> L93
            r0.<init>(r2, r8, r1)     // Catch: java.lang.Exception -> L93
            java.lang.Object r8 = X.C2296808zG.LJ(r0, r7)     // Catch: java.lang.Exception -> L93
            if (r8 != r5) goto L79
            X.C1C7U.LIZIZ(r6)
            return r5
        L76:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L93
        L79:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L93
            goto Lb4
        L7c:
            java.util.Iterator r1 = r2.iterator()
        L80:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L80
        L90:
            X.13BV r8 = X.C13BV.INSTANCE
            goto Lb4
        L93:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "uploadScreenshots failed: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "minis-ReportSession"
            X.C1720106oR.LIZ(r0, r1)
            X.13BV r8 = X.C13BV.INSTANCE
        Lb4:
            X.C1C7U.LIZIZ(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C507001yG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
