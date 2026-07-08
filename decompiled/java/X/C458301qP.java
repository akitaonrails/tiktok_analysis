package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.IconPrefetchManager$prefetchUrls$2$1$1", f = "IconPrefetchManager.kt", l = {78, 80}, m = "invokeSuspend")
public final class C458301qP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C095E<String> LLILZ;
    public final /* synthetic */ C0HWB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458301qP(C095E<String> c095e, C0HWB c0hwb, InterfaceC1364105Vn<? super C458301qP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c095e;
        this.LLILZIL = c0hwb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C458301qP c458301qP = new C458301qP(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c458301qP.LLILLL = obj;
        return c458301qP;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:38|7)|36|22|27|(1:31)|11|(2:13|14)|16|(11:18|19|(3:21|32|33)|36|22|27|(2:29|31)|11|(0)|16|(2:34|35)(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:36:0x006b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "IconPrefetchManager@1448.prefetchUrls$2$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 == r4) goto L42
            if (r0 != r5) goto L1d
            X.0WWy r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L73
            goto L6b
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r8.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.095E<java.lang.String> r0 = r8.LLILZ
            X.0WWy r3 = r0.iterator()
        L32:
            r8.LLILLL = r2
            r8.LL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r9 = r3.LIZ(r8)
            if (r9 != r6) goto L4b
            X.C1C7U.LIZIZ(r7)
            return r6
        L42:
            X.0WWy r3 = r8.LL
            java.lang.Object r2 = r8.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r9)
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            X.C2296808zG.LJFF(r2)
            X.0HWB r0 = r8.LLILZIL
            r8.LLILLL = r2     // Catch: java.lang.Throwable -> L71
            r8.LL = r3     // Catch: java.lang.Throwable -> L71
            r8.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.LIZIZ(r1, r8)     // Catch: java.lang.Throwable -> L71
            if (r0 != r6) goto L6b
            goto L8a
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L71
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r1 = move-exception
            goto L74
        L73:
            r1 = move-exception
        L74:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7f:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto L32
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L32
            throw r1
        L8a:
            X.C1C7U.LIZIZ(r7)
            return r6
        L8e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C458301qP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
