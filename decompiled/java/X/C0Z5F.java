package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z5F, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.GroupChatKeywordFilterManager$getKeywords$1", f = "GroupChatKeywordFilterManager.kt", l = {75}, m = "invokeSuspend")
public final class C0Z5F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C0Z5F(InterfaceC1364105Vn<? super C0Z5F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z5F(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "GroupChatKeywordFilterManager@97a1.getKeywords$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L6e
            java.lang.Object r2 = r5.LL
            java.lang.String r2 = (java.lang.String) r2
            X.C155000ia.LIZIZ(r6)
        L17:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L1d
        L1b:
            X.13BV r6 = X.C13BV.INSTANCE
        L1d:
            java.util.concurrent.atomic.AtomicReference<java.util.List<X.0Z5H>> r1 = X.C0Z5G.LLILLJJLI
            X.0Z5G r0 = X.C0Z5G.LL
            r0.getClass()
            java.util.List r0 = X.C0Z5G.LIZJ(r6)
            r1.set(r0)
            boolean r0 = X.C296690Bk3.LIZ()
            if (r0 == 0) goto L68
            goto L55
        L32:
            X.C155000ia.LIZIZ(r6)
            X.0YjW r0 = X.C882400YjW.LIZ
            r0.getClass()
            X.C882400YjW.LIZ()
            X.0Ykt r0 = X.C883250Ykt.LL
            java.lang.String r2 = X.C461720I8s.LIZIZ()
            com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService r0 = X.C0Z5G.LLILZIL
            if (r0 == 0) goto L1b
            r5.LL = r2
            r5.LLILLJJLI = r1
            java.lang.Object r6 = r0.LIZIZ(r5)
            if (r6 != r3) goto L17
            X.C1C7U.LIZIZ(r4)
            return r3
        L55:
            com.bytedance.keva.Keva r1 = X.C0Z5G.LLILZLL     // Catch: java.lang.Exception -> L64
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L64
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch: java.lang.Exception -> L64
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Exception -> L64
            r1.storeStringArray(r2, r0)     // Catch: java.lang.Exception -> L64
            goto L68
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L68:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z5F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0Z5F(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
