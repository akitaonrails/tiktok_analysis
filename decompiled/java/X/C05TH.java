package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.pages.fundraiser.FundraiserPageComposeKt$AnimatedTextRotation$2$1", f = "FundraiserPageCompose.kt", l = {873}, m = "invokeSuspend")
public final class C05TH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1665500tRU<String> LLILLJJLI;
    public final /* synthetic */ InterfaceC1676320tiw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TH(InterfaceC1665500tRU<String> interfaceC1665500tRU, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C05TH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002d -> B:6:0x0013). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "FundraiserPageComposeKt@f3c9.AnimatedTextRotation$2$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L37
            X.C155000ia.LIZIZ(r7)
        L13:
            X.0tiw r2 = r6.LLILLL
            int r0 = r2.LIZLLL()
            int r1 = r0 + 1
            X.0tRU<java.lang.String> r0 = r6.LLILLJJLI
            int r0 = r0.size()
            int r1 = r1 % r0
            r2.LJIIJ(r1)
        L25:
            r6.LL = r3
            r0 = 1680(0x690, double:8.3E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r5)
            return r4
        L33:
            X.C155000ia.LIZIZ(r7)
            goto L25
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05TH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
