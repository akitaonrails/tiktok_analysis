package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.waitforreplycell.TypingIndicatorBubbleAnimator$onBind$1", f = "WaitingForReplyProtocol.kt", l = {170, 172, 174}, m = "invokeSuspend")
public final class C21162917rn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass1887 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21162917rn(AnonymousClass1887 anonymousClass1887, InterfaceC1364105Vn<? super C21162917rn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass1887;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21162917rn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009d -> B:10:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "TypingIndicatorBubbleAnimator@947e.onBind$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r2 = 100
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L20
            if (r0 == r4) goto L69
            if (r0 == r5) goto L85
            if (r0 == r6) goto L20
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r10)
        L23:
            X.18T4 r0 = X.C21163117rp.LIZIZ()
            boolean r0 = r0.LJFF()
            if (r0 == 0) goto L50
            X.1887 r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LJI
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C786410Ut5.LJLLLLLL(r0, r1)
            X.1887 r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LJII
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L50:
            X.1887 r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LIZLLL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass1887.LIZ(r0)
            r9.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r9)
            if (r0 != r7) goto L6c
            X.C1C7U.LIZIZ(r8)
            return r7
        L69:
            X.C155000ia.LIZIZ(r10)
        L6c:
            X.1887 r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass1887.LIZ(r0)
            r9.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r9)
            if (r0 != r7) goto L88
            X.C1C7U.LIZIZ(r8)
            return r7
        L85:
            X.C155000ia.LIZIZ(r10)
        L88:
            X.1887 r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LJFF
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass1887.LIZ(r0)
            r9.LL = r6
            r0 = 1050(0x41a, double:5.19E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r7) goto L23
            X.C1C7U.LIZIZ(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21162917rn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
