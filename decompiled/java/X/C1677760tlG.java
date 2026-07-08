package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxMotionCurve$Start$1$1", f = "TuxMotionCurve.kt", l = {109, 133}, m = "invokeSuspend")
public final class C1677760tlG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C817403Hg LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1677750tlF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677760tlG(C1677750tlF c1677750tlF, InterfaceC1364105Vn<? super C1677760tlG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1677750tlF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1677760tlG c1677760tlG = new C1677760tlG(this.LLILZ, interfaceC1364105Vn);
        c1677760tlG.LLILLL = obj;
        return c1677760tlG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:7:0x001c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:7:0x001c). Please report as a decompilation issue!!! */
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
            java.lang.String r8 = "TuxMotionCurve@b76c.Start$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L66
            if (r0 == r5) goto L34
            if (r0 != r6) goto L77
            X.03Hg r4 = r9.LL
            java.lang.Object r1 = r9.LLILLL
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r10)
        L1c:
            X.0tlF r3 = r9.LLILZ
            Y.AObjectS197S0300000_25 r2 = new Y.AObjectS197S0300000_25
            r0 = 0
            r2.<init>(r3, r4, r1, r0)
            r9.LLILLL = r1
            r9.LL = r4
            r9.LLILLJJLI = r5
            java.lang.Object r0 = X.C1680620tps.LIZ(r9, r2)
            if (r0 != r7) goto L3d
            X.C1C7U.LIZIZ(r8)
            return r7
        L34:
            X.03Hg r4 = r9.LL
            java.lang.Object r1 = r9.LLILLL
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r10)
        L3d:
            float r2 = r4.element
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1c
            X.0tlF r3 = r9.LLILZ
            Y.AObjectS297S0200000_25 r2 = new Y.AObjectS297S0200000_25
            r0 = 2
            r2.<init>(r3, r1, r0)
            X.095D r3 = X.C20028913Yh.LJIIIZ(r2)
            X.01RE r2 = new X.01RE
            r0 = 0
            r2.<init>(r0)
            r9.LLILLL = r1
            r9.LL = r4
            r9.LLILLJJLI = r6
            java.lang.Object r0 = X.C09IC.LJIJ(r3, r9, r2)
            if (r0 != r7) goto L1c
            X.C1C7U.LIZIZ(r8)
            return r7
        L66:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r1 = r9.LLILLL
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.03Hg r4 = new X.03Hg
            r4.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.element = r0
            goto L1c
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677760tlG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
