package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718560SGo {
    public boolean LIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C718560SGo(Function1<? super Boolean, Unit> function1) {
        this.LIZIZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCleanModeChangedEvent(X.C718570SGp r4) {
        /*
            r3 = this;
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r3.LIZIZ
            X.0r8K r0 = X.C690440R6k.LIZ()
            if (r0 == 0) goto L15
            boolean r1 = r0.LIZ
            r0 = 1
            if (r1 != r0) goto L15
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r0)
            return
        L15:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718560SGo.onCleanModeChangedEvent(X.0SGp):void");
    }

    @C14EU
    public final void onFeedClearModeEvent(C714060Rzg c714060Rzg) {
        if (c714060Rzg.LIZ) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZLLL) {
                return;
            }
        }
        this.LIZIZ.invoke(Boolean.valueOf(c714060Rzg.LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRecommendCleanModeEvent(X.C718580SGq r4) {
        /*
            r3 = this;
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r3.LIZIZ
            X.0r8K r0 = X.C690440R6k.LIZ()
            if (r0 == 0) goto L15
            boolean r1 = r0.LIZLLL
            r0 = 1
            if (r1 != r0) goto L15
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r0)
            return
        L15:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718560SGo.onRecommendCleanModeEvent(X.0SGq):void");
    }

    @C14EU
    public final void onShowAdLayout(C988330bpH c988330bpH) {
        this.LIZIZ.invoke(Boolean.valueOf(c988330bpH.LIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoEvent(X.C737030Svd r6) {
        /*
            r5 = this;
            int r2 = r6.LIZ
            r1 = 83
            r0 = 76
            if (r0 == r2) goto La
            if (r1 != r2) goto L3b
        La:
            r4 = 0
            r3 = 1
            if (r1 != r2) goto L1f
            java.lang.Object r1 = r6.LIZIZ
            boolean r0 = r1 instanceof X.C1597406Ng
            if (r0 == 0) goto L3c
            X.06Ng r1 = (X.C1597406Ng) r1
            if (r1 == 0) goto L3c
            boolean r0 = r1.LIZ
            if (r0 != r3) goto L3c
            r0 = 1
        L1d:
            r5.LIZ = r0
        L1f:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r2 = r5.LIZIZ
            boolean r0 = r5.LIZ
            if (r0 != 0) goto L33
            java.lang.Object r1 = r6.LIZIZ
            boolean r0 = r1 instanceof X.C1597406Ng
            if (r0 == 0) goto L34
            X.06Ng r1 = (X.C1597406Ng) r1
            if (r1 == 0) goto L34
            boolean r0 = r1.LIZ
            if (r0 != r3) goto L34
        L33:
            r4 = 1
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.invoke(r0)
        L3b:
            return
        L3c:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718560SGo.onVideoEvent(X.0Svd):void");
    }
}
