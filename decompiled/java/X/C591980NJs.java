package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.utils.FetchHandler$activate$1", f = "FetchHandler.kt", l = {48, 164}, m = "invokeSuspend")
public final class C591980NJs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C592050NJz LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C592050NJz LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591980NJs(C592050NJz c592050NJz, InterfaceC1364105Vn<? super C591980NJs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c592050NJz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C591980NJs c591980NJs = new C591980NJs(this.LLILZIL, interfaceC1364105Vn);
        c591980NJs.LLILZ = obj;
        return c591980NJs;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0062 -> B:31:0x0068). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "FetchHandler@8189.activate$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r7 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 == r5) goto L4b
            if (r0 != r6) goto L20
            X.0NJz r1 = r10.LLILLJJLI
            X.1DEV r2 = r10.LL
            java.lang.Object r4 = r10.LLILZ
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r11)
            goto L68
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r4 = r10.LLILZ
            X.01wk r4 = (X.InterfaceC497601wk) r4
        L2f:
            boolean r0 = X.C2296808zG.LJI(r4)
            if (r0 == 0) goto L93
            X.0NJz r0 = r10.LLILZIL
            long r0 = r0.LJ
            r10.LLILZ = r4
            r10.LL = r7
            r10.LLILLJJLI = r7
            r10.LLILLL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r8) goto L52
            X.C1C7U.LIZIZ(r9)
            return r8
        L4b:
            java.lang.Object r4 = r10.LLILZ
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r11)
        L52:
            X.0NJz r1 = r10.LLILZIL
            X.1DEV r2 = r1.LJIIIZ
            r10.LLILZ = r4
            r10.LL = r2
            r10.LLILLJJLI = r1
            r10.LLILLL = r6
            java.lang.Object r0 = r2.LIZLLL(r7, r10)
            if (r0 != r8) goto L68
            X.C1C7U.LIZIZ(r9)
            return r8
        L68:
            java.util.List<java.lang.String> r0 = r1.LJIIIIZZ     // Catch: java.lang.Throwable -> L8b
            java.util.List r3 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.List<java.lang.String> r0 = r1.LJIIIIZZ     // Catch: java.lang.Throwable -> L8b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L8b
            r0.clear()     // Catch: java.lang.Throwable -> L8b
            r2.LIZIZ(r7)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2f
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0NJt r1 = new X.0NJt
            X.0NJz r0 = r10.LLILZIL
            r1.<init>(r0, r3, r7)
            X.C23250099c.LIZLLL(r4, r2, r7, r1, r6)
            goto L2f
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8b
            r2.LIZIZ(r7)
            throw r0
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C591980NJs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
