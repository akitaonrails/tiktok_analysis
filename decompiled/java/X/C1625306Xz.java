package X;

import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem$updateBubbleContainerSize$1$1", f = "FeedSkylightBubbleAssem.kt", l = {}, m = "invokeSuspend")
public final class C1625306Xz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedSkylightBubbleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625306Xz(FeedSkylightBubbleAssem feedSkylightBubbleAssem, InterfaceC1364105Vn<? super C1625306Xz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedSkylightBubbleAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1625306Xz(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "FeedSkylightBubbleAssem@dbba.updateBubbleContainerSize$1$1"
            X.C1C7U.LIZ(r8)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r0 = r9.LL
            X.01GW r0 = r0.LLJJI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            int r7 = r0.getWidth()
            X.00zU r5 = new X.00zU
            r5.<init>()
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r0 = r9.LL
            android.content.Context r2 = r0.getContext()
            r6 = 1
            if (r2 == 0) goto L3f
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r0 = r9.LL
            com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel r0 = r0.ip()
            X.0rbz r1 = r0.FQ2()
            boolean r0 = r1 instanceof X.InterfaceC1595030rbp
            if (r0 == 0) goto L3f
            X.0rbp r1 = (X.InterfaceC1595030rbp) r1
            if (r1 == 0) goto L3f
            java.lang.String r0 = r1.LJIJJ(r2, r6)
            if (r0 != 0) goto L41
        L3f:
            java.lang.String r0 = ""
        L41:
            r5.element = r0
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r0 = r9.LL
            X.01GW r0 = r0.LLJJI
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r1 = r0.getPaint()
            T r0 = r5.element
            java.lang.String r0 = (java.lang.String) r0
            float r0 = r1.measureText(r0)
            int r3 = (int) r0
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r4 = r9.LL
            android.view.View r2 = r4.LJJIJL()
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r7
            r1[r6] = r3
            java.lang.String r0 = "width"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r2, r0, r1)
            com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBubbleAssem r2 = r9.LL
            r0 = 300(0x12c, double:1.48E-321)
            r3.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            Y.ALAdapterS0S0200000_2 r1 = new Y.ALAdapterS0S0200000_2
            r0 = 2
            r1.<init>(r2, r5, r0)
            r3.addListener(r1)
            X.C786410Ut5.Pd(r3)
            r4.LLJJJJ = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1625306Xz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
