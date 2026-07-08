package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.core.linkmic.timer.link.countdown.MultiHostCountDownTimerImpl$start$1", f = "MultiHostCountDownTimerImpl.kt", l = {28}, m = "invokeSuspend")
public final class C382401eA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C382701eD LLILZ;
    public final /* synthetic */ InterfaceC382501eB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C382401eA(long j, C382701eD c382701eD, InterfaceC382501eB interfaceC382501eB, InterfaceC1364105Vn<? super C382401eA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c382701eD;
        this.LLILZIL = interfaceC382501eB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C382401eA c382401eA = new C382401eA(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c382401eA.LLILLJJLI = obj;
        return c382401eA;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0047 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "MultiHostCountDownTimerImpl@c361.start$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LL
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L4d
            if (r0 != r5) goto L67
            java.lang.Object r2 = r10.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r11)
        L19:
            long r3 = r10.LLILLL
            X.01eD r0 = r10.LLILZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L2e
            X.01eB r0 = r10.LLILZIL
            r0.LIZ()
        L2e:
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L61
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L61
            X.01eB r0 = r10.LLILZIL
            r0.LJLI(r3)
            r10.LLILLJJLI = r2
            r10.LL = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r9)
            return r6
        L4d:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r2 = r10.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            long r3 = r10.LLILLL
            X.01eD r0 = r10.LLILZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            goto L2e
        L61:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382401eA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
