package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownView$startCountDown$2", f = "BroadcastCountDownView.kt", l = {88, 90}, m = "invokeSuspend")
public final class C343001Uu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public C376790Epx LLILLL;
    public int LLILZ;
    public final /* synthetic */ C376790Epx LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343001Uu(C376790Epx c376790Epx, InterfaceC1364105Vn<? super C343001Uu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c376790Epx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343001Uu(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:20:0x005f). Please report as a decompilation issue!!! */
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
            java.lang.String r9 = "BroadcastCountDownView@6ba4.startCountDown$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 == r6) goto L56
            if (r0 == r7) goto L56
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1b:
            X.C155000ia.LIZIZ(r11)
            X.0Epx r0 = r10.LLILZIL
            r4 = 3
            r5 = 0
        L22:
            boolean r1 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting.enableCoroutineOpt()
            if (r1 == 0) goto L3c
            r10.LLILLL = r0
            r10.LL = r4
            r10.LLILLJJLI = r5
            r10.LLILZ = r6
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r10)
            if (r1 != r8) goto L5f
            X.C1C7U.LIZIZ(r9)
            return r8
        L3c:
            X.1DFB r3 = X.C0PEM.LIZJ
            X.01Ut r2 = new X.01Ut
            r1 = 0
            r2.<init>(r1)
            r10.LLILLL = r0
            r10.LL = r4
            r10.LLILLJJLI = r5
            r10.LLILZ = r7
            java.lang.Object r1 = X.C23250099c.LJI(r10, r3, r2)
            if (r1 != r8) goto L5f
            X.C1C7U.LIZIZ(r9)
            return r8
        L56:
            int r5 = r10.LLILLJJLI
            int r4 = r10.LL
            X.0Epx r0 = r10.LLILLL
            X.C155000ia.LIZIZ(r11)
        L5f:
            int r1 = r0.LLILLL
            int r1 = r1 + (-1)
            r0.LLILLL = r1
            if (r1 >= r6) goto L69
            r0.LLILLL = r6
        L69:
            r0.invalidate()
            int r5 = r5 + 1
            if (r5 < r4) goto L22
            X.0Epx r0 = r10.LLILZIL
            r0.invalidate()
            X.0Epx r0 = r10.LLILZIL
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LL
            if (r0 == 0) goto L7e
            r0.invoke()
        L7e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343001Uu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
