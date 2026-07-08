package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1398805di extends C09AY implements Function1<C1677830tlN<Float, C1677280tkU>, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ InterfaceC1392705cj LLILLL;
    public final /* synthetic */ Function1<Float, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1398805di(float f, C817403Hg c817403Hg, InterfaceC1392705cj interfaceC1392705cj, Function1<? super Float, Unit> function1) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = c817403Hg;
        this.LLILLL = interfaceC1392705cj;
        this.LLILZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C1677830tlN<java.lang.Float, X.C1677280tkU> r6) {
        /*
            r5 = this;
            X.0tlN r6 = (X.C1677830tlN) r6
            java.lang.Object r0 = r6.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            float r0 = r5.LL
            float r4 = X.C20091013jI.LIZLLL(r1, r0)
            X.03Hg r0 = r5.LLILLJJLI
            float r0 = r0.element
            float r3 = r4 - r0
            X.05cj r0 = r5.LLILLL     // Catch: java.util.concurrent.CancellationException -> L1f
            float r2 = r0.LIZJ(r3)     // Catch: java.util.concurrent.CancellationException -> L1f
            goto L27
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6.LIZ()
            r2 = 0
        L27:
            kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> r1 = r5.LLILZ
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.invoke(r0)
            float r3 = r3 - r2
            float r1 = java.lang.Math.abs(r3)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4c
            java.lang.Object r0 = r6.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = 1
        L4a:
            if (r0 != 0) goto L4f
        L4c:
            r6.LIZ()
        L4f:
            X.03Hg r1 = r5.LLILLJJLI
            float r0 = r1.element
            float r0 = r0 + r2
            r1.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L59:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398805di.invoke(java.lang.Object):java.lang.Object");
    }
}
