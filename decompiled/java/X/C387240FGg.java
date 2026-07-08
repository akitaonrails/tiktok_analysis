package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.motion.TextMotionCategoryPagerComponent$fetchData$2", f = "TextMotionCategoryPagerComponent.kt", l = {139, 142}, m = "invokeSuspend")
public final class C387240FGg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C387270FGj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387240FGg(C387270FGj c387270FGj, InterfaceC1364105Vn<? super C387240FGg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c387270FGj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387240FGg(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "TextMotionCategoryPagerComponent@fcb5.fetchData$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L4c
            if (r0 != r5) goto L84
            java.lang.Object r6 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L18:
            X.0FGj r1 = r8.LLILLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r6)
            if (r0 == 0) goto L29
            r0 = 78
            kotlin.jvm.internal.AFwS234S0000000_5 r0 = kotlin.jvm.internal.AFwS234S0000000_5.get$arr$(r0)
            r1.i3(r0)
        L29:
            X.C189200o6.m1boximpl(r6)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L32:
            X.C155000ia.LIZIZ(r9)
            X.0FGj r0 = r8.LLILLL
            X.0FDM r2 = r0.Z4()
            if (r2 == 0) goto L2c
            r8.LLILLJJLI = r1
            r1 = 0
            java.lang.String r0 = "text_motion"
            java.lang.Object r6 = r2.LJFF(r0, r1, r8)
            if (r6 != r4) goto L55
            X.C1C7U.LIZIZ(r7)
            return r4
        L4c:
            X.C155000ia.LIZIZ(r9)
            X.00o6 r9 = (X.C189200o6) r9
            java.lang.Object r6 = r9.m10unboximpl()
        L55:
            X.0FGj r3 = r8.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r6)
            if (r0 == 0) goto L18
            r1 = r6
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            java.util.List r0 = X.C0FGP.LIZIZ(r1)
            r3.LLJJIJI = r0
            java.util.List r0 = X.C0FGP.LIZ(r1)
            r3.LLJJIJIIJIL = r0
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0FGh r1 = new X.0FGh
            r0 = 0
            r1.<init>(r3, r0)
            r8.LL = r6
            r8.LLILLJJLI = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r4) goto L18
            X.C1C7U.LIZIZ(r7)
            return r4
        L84:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387240FGg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
