package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$requestSuggestedReply$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {304, 754}, m = "invokeSuspend")
public final class C1506605v6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public SmartReplySuggestedReplyViewModel LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILZIL;
    public final /* synthetic */ List<C869590Y9l> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1506605v6(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1506605v6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = smartReplySuggestedReplyViewModel;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506605v6(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:18:0x0054, B:20:0x0069, B:21:0x006e), top: B:28:0x0054 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r9.LLILZ
            r0 = 1
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L28
            if (r1 == r0) goto L39
            if (r1 != r2) goto L20
            java.lang.Object r6 = r9.LLILLL
            java.util.List r6 = (java.util.List) r6
            com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel r5 = r9.LLILLJJLI
            X.1DEV r4 = r9.LL
            X.C155000ia.LIZIZ(r10)
            goto L54
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            X.C155000ia.LIZIZ(r10)
            r9.LLILZ = r0
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r7) goto L3c
            X.C1C7U.LIZIZ(r8)
            return r7
        L39:
            X.C155000ia.LIZIZ(r10)
        L3c:
            com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel r5 = r9.LLILZIL
            X.1DEV r4 = r5.LLJ
            java.util.List<X.0Y9l> r6 = r9.LLILZLL
            r9.LL = r4
            r9.LLILLJJLI = r5
            r9.LLILLL = r6
            r9.LLILZ = r2
            java.lang.Object r0 = r4.LIZLLL(r3, r9)
            if (r0 != r7) goto L54
            X.C1C7U.LIZIZ(r8)
            return r7
        L54:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "suggestedReplyRequested = "
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LLILZLL     // Catch: java.lang.Throwable -> L85
            r1.append(r0)     // Catch: java.lang.Throwable -> L85
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L85
            X.0956 r1 = r5.LLJI     // Catch: java.lang.Throwable -> L85
            if (r1 == 0) goto L6e
            java.lang.String r0 = "New request started"
            X.C23118094a.LIZIZ(r0, r3, r1)     // Catch: java.lang.Throwable -> L85
        L6e:
            X.054G r2 = r5.LLIZ     // Catch: java.lang.Throwable -> L85
            X.05v4 r1 = new X.05v4     // Catch: java.lang.Throwable -> L85
            r1.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L85
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)     // Catch: java.lang.Throwable -> L85
            r5.LLJI = r0     // Catch: java.lang.Throwable -> L85
            r4.LIZIZ(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L85
            r4.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1506605v6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
