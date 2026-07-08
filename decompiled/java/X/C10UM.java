package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10UM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.nuj.framework.strategy.NUStrategyABExposeManager$tryFullExposeVid$1", f = "NUStrategyABExposeManager.kt", l = {}, m = "invokeSuspend")
public final class C10UM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10UM(String str, Integer num, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10UM(this.LLILLJJLI, this.LL, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "NUStrategyABExposeManager@4343.tryFullExposeVid$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.10UN r0 = X.C10UN.LIZ
            java.lang.Integer r4 = r8.LL
            java.lang.String r6 = r8.LLILLJJLI
            java.lang.String r2 = r8.LLILLL
            r0.getClass()
            r5 = 0
            if (r4 == 0) goto L1a
            goto L1c
        L1a:
            r1 = r5
            goto L37
        L1c:
            int r3 = r4.intValue()     // Catch: java.lang.Throwable -> L70
            X.10QX r0 = X.C10QU.Companion     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            java.util.Map<java.lang.Integer, X.10QU> r1 = X.C10QU.idToSceneMap     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L70
            X.10QU r0 = (X.C10QU) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L1a
            X.10QV r1 = r0.getType()     // Catch: java.lang.Throwable -> L70
        L37:
            X.10QV r0 = X.C10QV.CONFIG     // Catch: java.lang.Throwable -> L70
            if (r1 != r0) goto L6a
            if (r6 == 0) goto L52
            X.13IV r1 = X.C19253410Ua.LIZ     // Catch: java.lang.Throwable -> L70
            r1.getClass()     // Catch: java.lang.Throwable -> L70
            X.10VK r0 = X.C10VJ.Companion     // Catch: java.lang.Throwable -> L70
            X.13HG r0 = r0.serializer()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r1.LIZIZ(r0, r6)     // Catch: java.lang.Throwable -> L70
            X.10VJ r0 = (X.C10VJ) r0     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L52
            java.lang.String r5 = r0.LIZ     // Catch: java.lang.Throwable -> L70
        L52:
            X.00st r0 = X.EnumC218900st.FULL_EXPOSE     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.getValue()     // Catch: java.lang.Throwable -> L70
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6a
            if (r2 == 0) goto L6a
            X.0C5P r0 = X.C0C5P.LIZJ()     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            X.C0C5P.LIZ(r2)     // Catch: java.lang.Throwable -> L70
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L7c:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r3 == 0) goto La8
            X.0yeS r2 = X.C1865740yeS.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tryFullExposeVid --- scene:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " onFailure:"
            r1.append(r0)
            java.lang.String r0 = X.C13SZ.LIZIZ(r3)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            java.lang.String r0 = "kmp_content_language"
            X.C1865740yeS.LIZJ(r0, r1)
        La8:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10UM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
