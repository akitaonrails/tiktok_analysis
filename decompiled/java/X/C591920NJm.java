package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.popcard.ECExplanationWatcherCardWidgetNativeImpl$showAfterAnim$1", f = "ECExplanationWatcherCardWidgetNativeImpl.kt", l = {624}, m = "invokeSuspend")
public final class C591920NJm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C591920NJm(InterfaceC1364105Vn<? super C591920NJm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591920NJm(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:6:0x0017). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ECExplanationWatcherCardWidgetNativeImpl@4b4c.showAfterAnim$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L40
            int r3 = r7.LLILLJJLI
            int r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L17:
            X.0NJo r0 = new X.0NJo
            r0.<init>(r4, r4)
            X.C1440005kM.LIZ(r0)
            int r3 = r3 + 1
            if (r3 < r2) goto L2e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L29:
            X.C155000ia.LIZIZ(r8)
            r3 = 0
            r2 = 3
        L2e:
            r7.LL = r2
            r7.LLILLJJLI = r3
            r7.LLILLL = r4
            r0 = 7000(0x1b58, double:3.4585E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C591920NJm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C591920NJm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
