package X;

import com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent$onCreate$4$1", f = "FcpStandardPreloadComponent.kt", l = {90}, m = "invokeSuspend")
public final class C494401wE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FcpStandardPreloadComponent LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494401wE(FcpStandardPreloadComponent fcpStandardPreloadComponent, long j, InterfaceC1364105Vn<? super C494401wE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fcpStandardPreloadComponent;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C494401wE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0028 -> B:6:0x0013). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "FcpStandardPreloadComponent@f391.onCreate$4$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L47
            X.C155000ia.LIZIZ(r9)
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent r6 = r8.LLILLJJLI
            long r0 = r8.LLILLL
            long r2 = r2 - r0
            double r0 = (double) r2
            r6.Eo(r0)
        L20:
            r8.LL = r4
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r7)
            return r5
        L2e:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent r0 = r8.LLILLJJLI
            X.01GW r0 = r0.LLJJJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C494401wE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
