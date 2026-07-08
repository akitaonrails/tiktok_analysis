package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FGK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.style.TextStyleCategoryPagerComponent$fetchData$2", f = "TextStyleCategoryPagerComponent.kt", l = {155, 159}, m = "invokeSuspend")
public final class C0FGK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0FGO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FGK(C0FGO c0fgo, InterfaceC1364105Vn<? super C0FGK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0fgo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FGK(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "TextStyleCategoryPagerComponent@4920.fetchData$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 == r1) goto L55
            if (r0 != r7) goto Lb8
            java.lang.Object r5 = r9.LL
            X.C155000ia.LIZIZ(r10)
            X.00o6 r10 = (X.C189200o6) r10
            java.lang.Object r0 = r10.m10unboximpl()
        L1e:
            X.C189200o6.m1boximpl(r0)
        L21:
            X.0FGO r1 = r9.LLILLL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r5)
            if (r0 == 0) goto L32
            r0 = 90
            kotlin.jvm.internal.AFwS234S0000000_5 r0 = kotlin.jvm.internal.AFwS234S0000000_5.get$arr$(r0)
            r1.i3(r0)
        L32:
            X.C189200o6.m1boximpl(r5)
        L35:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L3b:
            X.C155000ia.LIZIZ(r10)
            X.0FGO r0 = r9.LLILLL
            X.0FDM r2 = r0.d5()
            if (r2 == 0) goto L35
            r9.LLILLJJLI = r1
            r1 = 0
            java.lang.String r0 = "editor_pro_text_style_panel"
            java.lang.Object r5 = r2.LJFF(r0, r1, r9)
            if (r5 != r6) goto L5e
            X.C1C7U.LIZIZ(r8)
            return r6
        L55:
            X.C155000ia.LIZIZ(r10)
            X.00o6 r10 = (X.C189200o6) r10
            java.lang.Object r5 = r10.m10unboximpl()
        L5e:
            X.0FGO r2 = r9.LLILLL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r5)
            if (r0 == 0) goto L21
            r1 = r5
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            java.util.List r0 = X.C0FGP.LIZIZ(r1)
            java.util.List r0 = r2.O4(r0)
            r2.LLJJJJ = r0
            java.util.List r0 = X.C0FGP.LIZ(r1)
            java.util.List r0 = r2.K4(r0)
            r2.LLJJJJJIL = r0
            r2.r4()
            X.0FDM r4 = r2.d5()
            if (r4 == 0) goto L21
            java.util.List r0 = r1.getAll_category_effects()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L93:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            boolean r0 = X.C362890EKp.LIZ(r0)
            if (r0 == 0) goto L93
            r3.add(r1)
            goto L93
        Laa:
            r9.LL = r5
            r9.LLILLJJLI = r7
            java.lang.Object r0 = r4.LIZLLL(r3, r9)
            if (r0 != r6) goto L1e
            X.C1C7U.LIZIZ(r8)
            return r6
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FGK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
