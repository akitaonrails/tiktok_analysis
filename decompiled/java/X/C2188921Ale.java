package X;

import Y.AAListenerS343S0100000_33;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ale, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188921Ale {
    public final C1295960jpS LIZ;
    public AAListenerS343S0100000_33 LIZIZ;
    public long LIZJ;

    public C2188921Ale(C1295960jpS c1295960jpS) {
        this.LIZ = c1295960jpS;
    }

    public final void LIZIZ(final Function0<Unit> function0) {
        C1294720jnS composition = this.LIZ.getComposition();
        if (composition != null) {
            this.LIZJ = (long) composition.LIZIZ();
            function0.invoke();
        } else {
            this.LIZ.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.1Alf
                @Override // X.InterfaceC1296230jpt
                public final void LIZ(C1294720jnS c1294720jnS) {
                    this.LL.LIZJ = (long) c1294720jnS.LIZIZ();
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
    }

    public final void LIZJ(float f) {
        if (this.LIZJ == 0) {
            LIZIZ(new C2188951Alh(this, f));
        } else if (f >= 0.0f && f <= 1.0f) {
            this.LIZ.setProgress(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C2188921Ale r7, float r8, float r9) {
        /*
            r7.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[playSegmentLoop] startProgress: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", endProgress: "
            r1.append(r0)
            r1.append(r9)
            X.C2188811AlT.LIZIZ(r1)
            long r3 = r7.LIZJ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            X.1Alg r0 = new X.1Alg
            r0.<init>(r7, r8, r9)
            r7.LIZIZ(r0)
        L2a:
            return
        L2b:
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L2a
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L2a
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L2a
            Y.AAListenerS343S0100000_33 r1 = r7.LIZIZ
            if (r1 == 0) goto L43
            X.0jpS r0 = r7.LIZ
            r0.removeAnimatorListener(r1)
        L43:
            float r5 = r9 - r8
            long r1 = r7.LIZJ
            float r0 = (float) r1
            float r5 = r5 * r0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 <= 0) goto La7
            r1 = 500(0x1f4, double:2.47E-321)
            float r4 = (float) r1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto La7
            X.0jpS r3 = r7.LIZ
            float r0 = r5 / r4
            r3.setSpeed(r0)
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[playSegmentLoop] Calculated speed: "
            r3.append(r0)
            X.0jpS r0 = r7.LIZ
            float r0 = r0.getSpeed()
            r3.append(r0)
            java.lang.String r0 = " (originalSegmentDuration: "
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = " ms, desiredDuration: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " ms)"
            r3.append(r0)
            X.C2188811AlT.LIZIZ(r3)
        L85:
            X.0jpS r0 = r7.LIZ
            r0.setMinProgress(r8)
            X.0jpS r0 = r7.LIZ
            r0.setMaxProgress(r9)
            Y.AAListenerS343S0100000_33 r1 = new Y.AAListenerS343S0100000_33
            r0 = 7
            r1.<init>(r7, r0)
            r7.LIZIZ = r1
            X.0jpS r0 = r7.LIZ
            r0.addAnimatorListener(r1)
            X.0jpS r0 = r7.LIZ
            r0.setProgress(r8)
            X.0jpS r0 = r7.LIZ
            r0.playAnimation()
            return
        La7:
            X.0jpS r0 = r7.LIZ
            r0.setSpeed(r3)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2188921Ale.LIZ(X.1Ale, float, float):void");
    }
}
