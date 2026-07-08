package X;

import defpackage.r2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$batchUpdateMessage$1", f = "MessageOperatorHandler.kt", l = {3683}, m = "invokeSuspend")
public final class C322000Cjm extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ r2 LLILZ;
    public final /* synthetic */ C1863280yaU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322000Cjm(r2 r2Var, C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C322000Cjm> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZ = r2Var;
        this.LLILZIL = c1863280yaU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322000Cjm(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "MessageOperatorHandler@b589.batchUpdateMessage$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r5 = 1
            if (r0 == 0) goto L50
            if (r0 != r5) goto Lc0
            X.00zU r0 = r9.LLILLJJLI
            X.00zU r4 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L17:
            r0.element = r10
        L19:
            r2 r0 = r9.LLILZ
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage> r0 = r0.LJIJJ
            X.0yaU r5 = r9.LLILZIL
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage r0 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage) r0
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r2 = r0.LIZ
            T r0 = r4.element
            com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse r0 = (com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse) r0
            java.util.List<java.lang.String> r1 = r0.failMsgIds
            if (r1 != 0) goto L3b
            X.13BV r1 = X.C13BV.INSTANCE
        L3b:
            java.lang.String r0 = r2.msgId
            boolean r1 = r1.contains(r0)
            r0 = 6
            if (r1 == 0) goto L4d
            r0 = 12
            r2.LIZIZ = r0
        L48:
            r0 = 0
            r5.LJJJLIIL(r2, r0, r0)
            goto L23
        L4d:
            r2.LIZIZ = r0
            goto L48
        L50:
            X.C155000ia.LIZIZ(r10)
            X.00zU r4 = new X.00zU
            r4.<init>()
            com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse r1 = new com.ss.android.ugc.aweme.tako.ccl.net.BatchUpdateMessageResponse
            r0 = 0
            r1.<init>(r0, r5, r0)
            r4.element = r1
            r2 r0 = r9.LLILZ
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage> r0 = r0.LJIJJ
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r0.iterator()
        L6d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage r1 = (com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage) r1
            java.lang.String r0 = r1.msgId
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L6d
            java.lang.String r1 = r1.msgId
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6d
            r7.add(r2)
            goto L6d
        L90:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L19
            r2 r0 = r9.LLILZ
            X.0yaU r3 = r9.LLILZIL
            X.0ybc r2 = X.C1863980ybc.LIZ
            X.0yae r0 = r0.LJIILLIIL
            java.lang.String r1 = r0.LJ
            u2 r0 = r3.LJII
            java.lang.String r0 = r0.LIZIZ
            r9.LL = r4
            r9.LLILLJJLI = r4
            r9.LLILLL = r5
            java.lang.Object r10 = r2.LIZIZ(r7, r1, r0, r9)
            if (r10 != r6) goto Lb6
            X.C1C7U.LIZIZ(r8)
            return r6
        Lb6:
            r0 = r4
            r4 = r0
            goto L17
        Lba:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322000Cjm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
