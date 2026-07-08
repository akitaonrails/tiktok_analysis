package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05I7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.util.StoryHighlightsCoverUploader$start$2", f = "StoryHighlightsCoverUploader.kt", l = {165}, m = "invokeSuspend")
public final class C05I7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;
    public final /* synthetic */ C0Z6I LLILZ;
    public final /* synthetic */ C0Z7T LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05I7(C238400w2 c238400w2, C0Z6I c0z6i, C0Z7T c0z7t, InterfaceC1364105Vn<? super C05I7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c238400w2;
        this.LLILZ = c0z6i;
        this.LLILZIL = c0z7t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05I7 c05i7 = new C05I7(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c05i7.LLILLJJLI = obj;
        return c05i7;
    }

    /* JADX WARN: Path cross not found for [B:17:0x004b, B:8:0x0026], limit reached: 37 */
    /* JADX WARN: Path cross not found for [B:8:0x0026, B:17:0x004b], limit reached: 37 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "StoryHighlightsCoverUploader@9130.start$2"
            X.C1C7U.LIZ(r0)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LL
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L76
            java.lang.Object r2 = r9.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r10)
        L17:
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.00w2 r0 = r9.LLILLL
            long r0 = r0.element
            long r7 = r7 - r0
            r5 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L4b
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            X.C844470XAv.LIZ()
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L35
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L35
            goto L3a
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
        L3a:
            if (r0 != 0) goto L4b
            X.0Z6I r3 = r9.LLILZ
            X.0Z7T r2 = r9.LLILZIL
            java.lang.Object r1 = r3.LIZJ
            monitor-enter(r1)
            goto L63
        L44:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r2 = r9.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
        L4b:
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L7f
            r9.LLILLJJLI = r2
            r9.LL = r4
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r3) goto L17
            java.lang.String r0 = "StoryHighlightsCoverUploader@9130.start$2"
            X.C1C7U.LIZIZ(r0)
            return r3
        L63:
            boolean r0 = r3.LIZLLL     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L7e
            r3.LIZLLL = r4     // Catch: java.lang.Throwable -> L70
            r2.LIZ()     // Catch: java.lang.Throwable -> L70
            r3.LIZ()     // Catch: java.lang.Throwable -> L70
            goto L7e
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r1)
            throw r0
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7e:
            monitor-exit(r1)
        L7f:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "StoryHighlightsCoverUploader@9130.start$2"
            X.C1C7U.LIZIZ(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05I7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
