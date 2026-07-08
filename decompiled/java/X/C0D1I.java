package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D1I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.ColorExtractionComponentImpl$launchWorkersV2$1", f = "ColorExtractionComponent.kt", l = {89, 232, 91}, m = "invokeSuspend")
public final class C0D1I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public Object LLILLJJLI;
    public InterfaceC1337805Lk LLILLL;
    public C0D1M LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C0D1M LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D1I(C0D1M c0d1m, InterfaceC1364105Vn<? super C0D1I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0d1m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D1I(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:27:0x0094). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r10 = "ColorExtractionComponentImpl@edcb.launchWorkersV2$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r6 = 0
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 == r3) goto L52
            if (r0 == r4) goto L29
            if (r0 != r5) goto L21
            java.lang.Object r8 = r11.LLILLJJLI
            X.05Lk r8 = (X.InterfaceC1337805Lk) r8
            X.0WWy r2 = r11.LL
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> La1
            goto L94
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L29:
            X.0D1M r9 = r11.LLILZ
            X.05Lk r8 = r11.LLILLL
            java.lang.Object r1 = r11.LLILLJJLI
            java.lang.String r1 = (java.lang.String) r1
            X.0WWy r2 = r11.LL
            X.C155000ia.LIZIZ(r12)
            goto L81
        L37:
            X.C155000ia.LIZIZ(r12)
            X.0D1M r0 = r11.LLILZLL
            X.095E<java.lang.String> r0 = r0.LLILZIL
            X.0WWy r2 = r0.iterator()
        L42:
            r11.LL = r2
            r11.LLILLJJLI = r6
            r11.LLILZIL = r3
            java.lang.Object r12 = r2.LIZ(r11)
            if (r12 != r7) goto L57
            X.C1C7U.LIZIZ(r10)
            return r7
        L52:
            X.0WWy r2 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L57:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto La7
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0D1M r0 = r11.LLILZLL
            X.05Lk r8 = r0.G2()
            X.0D1M r9 = r11.LLILZLL
            r11.LL = r2
            r11.LLILLJJLI = r1
            r11.LLILLL = r8
            r11.LLILZ = r9
            r11.LLILZIL = r4
            java.lang.Object r0 = r8.LIZ(r11)
            if (r0 != r7) goto L81
            X.C1C7U.LIZIZ(r10)
            return r7
        L81:
            java.lang.String r0 = "LOW"
            r11.LL = r2     // Catch: java.lang.Throwable -> L9c
            r11.LLILLJJLI = r8     // Catch: java.lang.Throwable -> L9c
            r11.LLILLL = r6     // Catch: java.lang.Throwable -> L9c
            r11.LLILZ = r6     // Catch: java.lang.Throwable -> L9c
            r11.LLILZIL = r5     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r9.q3(r1, r0, r11)     // Catch: java.lang.Throwable -> L9c
            if (r0 != r7) goto L94
            goto L98
        L94:
            r8.release()
            goto L42
        L98:
            X.C1C7U.LIZIZ(r10)
            return r7
        L9c:
            r0 = move-exception
        L9d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r0 = move-exception
            goto L9d
        La3:
            r8.release()
            throw r0
        La7:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D1I.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
