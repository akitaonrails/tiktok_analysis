package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectTestHelper$updateFilter$1", f = "LiveEffectTestHelper.kt", l = {97, 103}, m = "invokeSuspend")
public final class C760540TsS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760540TsS(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760540TsS(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r2 = r18
            java.lang.String r6 = "LiveEffectTestHelper@73b1.updateFilter$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            r11 = r17
            int r0 = r11.LL
            java.lang.String r3 = "livefiltercomposer"
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L59
            if (r0 != r5) goto L80
            X.C155000ia.LIZIZ(r2)
        L1c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L29
            java.lang.String r0 = "update makeup fail"
            X.C766270U4b.LJIIJJI(r0)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.0U8T r7 = X.C0U8T.LIZ
            java.lang.String r0 = r11.LLILLJJLI
            boolean r0 = r7.LJIIIIZZ(r0, r3)
            if (r0 != 0) goto L69
            java.lang.String r8 = r11.LLILLJJLI
            java.lang.String r9 = "livefiltercomposer"
            java.lang.String r10 = ""
            r13 = 0
            r11.LL = r1
            r0 = 476(0x1dc, float:6.67E-43)
            kotlin.jvm.internal.AFwS199S0000000_12 r12 = kotlin.jvm.internal.AFwS199S0000000_12.get$arr$(r0)
            r15 = 1
            r16 = 0
            r14 = r13
            java.lang.Object r2 = r7.LJFF(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r2 != r4) goto L5c
            X.C1C7U.LIZIZ(r6)
            return r4
        L59:
            X.C155000ia.LIZIZ(r2)
        L5c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L69
            java.lang.String r0 = "set makeup fail"
            X.C766270U4b.LJIIJJI(r0)
        L69:
            X.0U8T r0 = X.C0U8T.LIZ
            java.lang.String r2 = r11.LLILLJJLI
            int r1 = r11.LLILLL
            r11.LL = r5
            r0.getClass()
            java.lang.String r0 = ""
            java.lang.Object r2 = X.C0U8T.LJIJI(r1, r2, r3, r0, r11)
            if (r2 != r4) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r4
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C760540TsS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
