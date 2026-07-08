package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.RootBroadcastCountDownView$startCountDown$2", f = "RootBroadcastCountDownView.kt", l = {86}, m = "invokeSuspend")
public final class C343201Uw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public C376800Epy LLILLL;
    public int LLILZ;
    public final /* synthetic */ C376800Epy LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343201Uw(C376800Epy c376800Epy, InterfaceC1364105Vn<? super C343201Uw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c376800Epy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343201Uw(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:6:0x0019). Please report as a decompilation issue!!! */
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
            java.lang.String r8 = "RootBroadcastCountDownView@85b3.startCountDown$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r6 = 1
            if (r0 == 0) goto L3e
            if (r0 != r6) goto L5f
            int r5 = r9.LLILLJJLI
            int r4 = r9.LL
            X.0Epy r0 = r9.LLILLL
            X.C155000ia.LIZIZ(r10)
        L19:
            int r1 = r0.LLILLL
            int r1 = r1 + (-1)
            r0.LLILLL = r1
            if (r1 >= r6) goto L23
            r0.LLILLL = r6
        L23:
            r0.invalidate()
            int r5 = r5 + 1
            if (r5 < r4) goto L45
            X.0Epy r0 = r9.LLILZIL
            r0.invalidate()
            X.0Epy r0 = r9.LLILZIL
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.LL
            if (r0 == 0) goto L38
            r0.invoke()
        L38:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L3e:
            X.C155000ia.LIZIZ(r10)
            X.0Epy r0 = r9.LLILZIL
            r4 = 3
            r5 = 0
        L45:
            X.1DFB r3 = X.C0PEM.LIZJ
            X.01Uv r2 = new X.01Uv
            r1 = 0
            r2.<init>(r1)
            r9.LLILLL = r0
            r9.LL = r4
            r9.LLILLJJLI = r5
            r9.LLILZ = r6
            java.lang.Object r1 = X.C23250099c.LJI(r9, r3, r2)
            if (r1 != r7) goto L19
            X.C1C7U.LIZIZ(r8)
            return r7
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343201Uw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
