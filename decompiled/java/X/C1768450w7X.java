package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0w7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.tools.MixMallUtils$preloadSparkAndLynxWhenClickTab$2", f = "MixMallUtils.kt", l = {}, m = "invokeSuspend")
public final class C1768450w7X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1768450w7X(InterfaceC1364105Vn<? super C1768450w7X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768450w7X(interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        java.lang.Boolean.valueOf(r3.add(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0024 A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "MixMallUtils@2261.preloadSparkAndLynxWhenClickTab$2"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.0w9j r0 = X.C1769810w9j.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model r0 = X.C1769810w9j.LIZ()
            r4 = 0
            if (r0 == 0) goto L8c
            java.util.List<java.lang.String> r0 = r0.enterMallAsyncPreDecodeList
            if (r0 == 0) goto L8c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r0.iterator()
        L24:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r5 = r6.next()
            X.0wBU r0 = X.C1770900wBU.LIZ
            r0.getClass()
            java.util.List r0 = X.C1770900wBU.LJ()
            if (r0 == 0) goto L54
            java.util.Iterator r1 = r0.iterator()
        L3d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig r0 = (com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig) r0
            java.lang.String r0 = r0.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L3d
            if (r2 != 0) goto L7a
        L54:
            X.0wBU r0 = X.C1770900wBU.LIZ
            r0.getClass()
            java.util.List r0 = X.C1770900wBU.LJFF()
            if (r0 == 0) goto L24
            java.util.Iterator r1 = r0.iterator()
        L63:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig r0 = (com.ss.android.ugc.aweme.ecommerce.mall.settings.ECMixMallCardConfig) r0
            java.lang.String r0 = r0.type
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L63
            if (r2 == 0) goto L24
        L7a:
            boolean r0 = r3.add(r2)
            java.lang.Boolean.valueOf(r0)
            goto L24
        L82:
            X.0wBU r1 = X.C1770900wBU.LIZ
            X.0w7Z r0 = X.EnumC1768470w7Z.CLICK_TAB
            r1.getClass()
            X.C1770900wBU.LJIILLIIL(r3, r0, r4)
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768450w7X.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1768450w7X(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
