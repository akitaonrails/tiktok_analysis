package X;

import com.lynx.tasm.TemplateData;
import java.util.List;

/* JADX INFO: renamed from: X.0kX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322970kX1 {
    public static final void LIZ(TemplateData templateData, List<String> list) {
        String strLJJLIIIJ;
        Object aBParamsValue;
        if (list != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62)) != null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null) {
                aBParamsValue = c1538050q7v.getABParamsValue(strLJJLIIIJ);
            } else {
                aBParamsValue = null;
            }
            templateData.LJIILIIL("abParams", aBParamsValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.lynx.tasm.TemplateData r3, java.util.List r4, com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility r5) {
        /*
            if (r4 == 0) goto L37
            java.util.Iterator r2 = r4.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r5 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L21
        L17:
            java.util.Map r0 = r5.G5()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
        L21:
            r3.LJIILIIL(r1, r0)     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L2a
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L2a
            goto L6
        L2a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L6
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322970kX1.LIZIZ(com.lynx.tasm.TemplateData, java.util.List, com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleLynxDependAbility):void");
    }
}
