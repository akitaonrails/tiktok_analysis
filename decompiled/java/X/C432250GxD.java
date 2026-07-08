package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.TypingIndicatorBubbleAnimator$onBind$1", f = "SingleTypingIndicatorProtocol.kt", l = {257, 259, 261}, m = "invokeSuspend")
public final class C432250GxD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C431950Gwj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432250GxD(C431950Gwj c431950Gwj, InterfaceC1364105Vn<? super C432250GxD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c431950Gwj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432250GxD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:10:0x0023). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "TypingIndicatorBubbleAnimator@c37c.onBind$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r2 = 100
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L20
            if (r0 == r4) goto L3c
            if (r0 == r5) goto L58
            if (r0 == r6) goto L20
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            X.C155000ia.LIZIZ(r10)
        L23:
            X.0Gwj r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LIZJ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C431950Gwj.LIZ(r0)
            r9.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r9)
            if (r0 != r7) goto L3f
            X.C1C7U.LIZIZ(r8)
            return r7
        L3c:
            X.C155000ia.LIZIZ(r10)
        L3f:
            X.0Gwj r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LIZLLL
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C431950Gwj.LIZ(r0)
            r9.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r9)
            if (r0 != r7) goto L5b
            X.C1C7U.LIZIZ(r8)
            return r7
        L58:
            X.C155000ia.LIZIZ(r10)
        L5b:
            X.0Gwj r0 = r9.LLILLJJLI
            X.01GW r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C431950Gwj.LIZ(r0)
            r9.LL = r6
            r0 = 1050(0x41a, double:5.19E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)
            if (r0 != r7) goto L23
            X.C1C7U.LIZIZ(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C432250GxD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
