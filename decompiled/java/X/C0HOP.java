package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HOP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem$onViewCreated$30$2$1$4", f = "MixStudioHomePageAssem.kt", l = {}, m = "invokeSuspend")
public final class C0HOP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixStudioHomePageAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0HOC LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOP(MixStudioHomePageAssem mixStudioHomePageAssem, boolean z, C0HOC c0hoc, InterfaceC1364105Vn<? super C0HOP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixStudioHomePageAssem;
        this.LLILLJJLI = z;
        this.LLILLL = c0hoc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HOP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e A[PHI: r2
      0x005e: PHI (r2v4 android.view.ViewGroup$MarginLayoutParams) = (r2v2 android.view.ViewGroup$MarginLayoutParams), (r2v6 android.view.ViewGroup$MarginLayoutParams) binds: [B:34:0x005b, B:25:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MixStudioHomePageAssem@94b0.onViewCreated$30$2$1$4"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem r3 = r7.LL
            boolean r5 = r7.LLILLJJLI
            X.0HOC r0 = r7.LLILLL
            r2 = 0
            if (r0 == 0) goto Laf
            X.0HNn r0 = r0.LIZ
        L16:
            boolean r0 = r0 instanceof X.C0HGK
            if (r0 == 0) goto Lac
            boolean r0 = X.C440480HPa.LIZJ()
            if (r0 != 0) goto Lac
            r4 = 1
        L21:
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJJJJLIIL
            if (r0 == 0) goto La9
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L29:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L47
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L47
            boolean r0 = X.C440480HPa.LIZJ()
            if (r0 == 0) goto L4d
            android.widget.FrameLayout r0 = r3.LLJL
            if (r0 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L3f:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L47
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 != 0) goto L5e
        L47:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L4d:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.LLJLIL
            if (r0 == 0) goto L55
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L55:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L47
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 != 0) goto L5e
            goto L47
        L5e:
            if (r5 == 0) goto L75
            X.01GW r0 = r3.LLLLIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.bottomMargin = r0
            int r0 = r3.zp()
            r1.bottomMargin = r0
            goto L47
        L75:
            if (r4 == 0) goto L94
            X.01GW r0 = r3.LLLLIIIILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.bottomMargin = r0
            X.01GW r0 = r3.LLLILZLLLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.bottomMargin = r0
            goto L47
        L94:
            X.01GW r0 = r3.LLLLIILL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.bottomMargin = r0
            int r0 = r3.zp()
            r1.bottomMargin = r0
            goto L47
        La9:
            r1 = r2
            goto L29
        Lac:
            r4 = 0
            goto L21
        Laf:
            r0 = r2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HOP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
