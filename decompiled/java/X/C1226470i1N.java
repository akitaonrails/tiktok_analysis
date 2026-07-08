package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.creatorgroup.CreatorGroupCTDSProtocol$onRefresh$2", f = "CreatorGroupCTDSProtocol.kt", l = {120, 122}, m = "invokeSuspend")
public final class C1226470i1N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr>, Object> {
    public int LL;
    public final /* synthetic */ C1226500i1Q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226470i1N(C1226500i1Q c1226500i1Q, InterfaceC1364105Vn<? super C1226470i1N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1226500i1Q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1226470i1N(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:23:0x004f, B:24:0x0052, B:26:0x0063, B:27:0x0066, B:29:0x006f, B:30:0x0071, B:18:0x003e, B:19:0x0041, B:10:0x0020, B:12:0x0026, B:14:0x0030), top: B:35:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:23:0x004f, B:24:0x0052, B:26:0x0063, B:27:0x0066, B:29:0x006f, B:30:0x0071, B:18:0x003e, B:19:0x0041, B:10:0x0020, B:12:0x0026, B:14:0x0030), top: B:35:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "CreatorGroupCTDSProtocol@9744.onRefresh$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            if (r0 == r7) goto L3e
            if (r0 != r8) goto L15
            goto L4f
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C155000ia.LIZIZ(r12)
            X.0i1Q r1 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L79
            boolean r0 = r1.LLJ     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L41
            X.0hzr r0 = r1.LLILZIL     // Catch: java.lang.Exception -> L79
            long r5 = r0.LJI     // Catch: java.lang.Exception -> L79
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L41
            r1.LLJ = r2     // Catch: java.lang.Exception -> L79
            r11.LL = r7     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r5, r11)     // Catch: java.lang.Exception -> L79
            if (r0 != r9) goto L41
            X.C1C7U.LIZIZ(r10)
            return r9
        L3e:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L79
        L41:
            X.0i1Q r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L79
            r11.LL = r8     // Catch: java.lang.Exception -> L79
            java.lang.Object r12 = r0.LJJJJIZL(r11)     // Catch: java.lang.Exception -> L79
            if (r12 != r9) goto L52
            X.C1C7U.LIZIZ(r10)
            return r9
        L4f:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L79
        L52:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> L79
            X.0i1Q r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L79
            X.0i1M r0 = r0.LLILZLL     // Catch: java.lang.Exception -> L79
            r0.LIZIZ(r12)     // Catch: java.lang.Exception -> L79
            X.0i1Q r0 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L79
            X.0hyw r0 = r0.LL     // Catch: java.lang.Exception -> L79
            X.0i1R r0 = r0.LIZ     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L66
            r0.LIZLLL()     // Catch: java.lang.Exception -> L79
        L66:
            X.0i1Q r1 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L79
            r0 = 0
            r1.LLIZ = r0     // Catch: java.lang.Exception -> L79
            X.0hwq r1 = new X.0hwq     // Catch: java.lang.Exception -> L79
            if (r12 != 0) goto L71
            X.13BV r12 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L79
        L71:
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)     // Catch: java.lang.Exception -> L79
            r1.<init>(r12, r2, r0)     // Catch: java.lang.Exception -> L79
            goto L82
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0hws r1 = new X.0hws
            r1.<init>(r0)
        L82:
            X.C1C7U.LIZIZ(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226470i1N.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
