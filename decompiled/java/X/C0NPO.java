package X;

import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl$startPolling$1", f = "ActivityStatusAccuracyImpl.kt", l = {174, 177}, m = "invokeSuspend")
public final class C0NPO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ActivityStatusAccuracyImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NPO(ActivityStatusAccuracyImpl activityStatusAccuracyImpl, InterfaceC1364105Vn<? super C0NPO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activityStatusAccuracyImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NPO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:7:0x0018). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "ActivityStatusAccuracyImpl@2ace.startPolling$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r7 = 1000(0x3e8, double:4.94E-321)
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L38
            if (r0 == r6) goto L56
            if (r0 != r4) goto L5f
            X.C155000ia.LIZIZ(r11)
        L18:
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl r0 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl.LIZLLL(r0)
        L1d:
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl r0 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.im.common.setting.ActivityStatusAccuracyPollingConfig r0 = r0.LIZIZ()
            long r2 = r0.pollingInterval
            r0 = 10
            long r0 = java.lang.Math.max(r2, r0)
            long r0 = r0 * r7
            r10.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L18
            X.C1C7U.LIZIZ(r9)
            return r5
        L38:
            X.C155000ia.LIZIZ(r11)
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl r0 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.im.common.setting.ActivityStatusAccuracyPollingConfig r0 = r0.LIZIZ()
            long r2 = r0.initialDelay
            r0 = 1
            long r0 = java.lang.Math.max(r2, r0)
            long r0 = r0 * r7
            r10.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L59
            X.C1C7U.LIZIZ(r9)
            return r5
        L56:
            X.C155000ia.LIZIZ(r11)
        L59:
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl r0 = r10.LLILLJJLI
            com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl.LIZLLL(r0)
            goto L1d
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NPO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
