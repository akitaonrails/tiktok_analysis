package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$addCart$2$1", f = "PdpViewModel.kt", l = {2822, 2823}, m = "invokeSuspend")
public final class C454501pn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PdpViewModel LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454501pn(PdpViewModel pdpViewModel, View view, Object obj, View view2, InterfaceC1364105Vn<? super C454501pn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pdpViewModel;
        this.LLILZIL = view;
        this.LLILZLL = obj;
        this.LLIZ = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C454501pn c454501pn = new C454501pn(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c454501pn.LLILLL = obj;
        return c454501pn;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r11 = "PdpViewModel@6cb1.addCart$2$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r10 = X.C099R.LJFF()
            r7 = r19
            int r1 = r7.LLILLJJLI
            r9 = 2
            r8 = 1
            r6 = 0
            if (r1 == 0) goto L60
            if (r1 == r8) goto L90
            if (r1 != r9) goto Lad
            boolean r2 = r7.LL
            X.C155000ia.LIZIZ(r0)
        L1d:
            com.ss.android.ugc.aweme.ecommerce.model.AddItemToCartEvent r0 = (com.ss.android.ugc.aweme.ecommerce.model.AddItemToCartEvent) r0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r12 = r7.LLILZ
            r12.LLJJJ = r8
            boolean r0 = r0.state
            if (r0 == 0) goto L5a
            android.view.View r0 = r7.LLILZIL
            android.content.Context r13 = r0.getContext()
            android.view.View r14 = r7.LLILZIL
            java.lang.Object r3 = r7.LLILZLL
            boolean r1 = r3 instanceof com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState
            if (r1 == 0) goto L46
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState) r0
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r0 = r0.exceptionUX
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent r0 = r0.toastContent
            if (r0 == 0) goto L46
            java.lang.String r15 = r0.message
            if (r15 != 0) goto L48
        L46:
            java.lang.String r15 = ""
        L48:
            if (r1 == 0) goto L51
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState) r0
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r6 = r0.exceptionUX
        L51:
            r18 = r6
            r16 = r3
            r17 = r2
            r12.qR2(r13, r14, r15, r16, r17, r18)
        L5a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L60:
            X.C155000ia.LIZIZ(r0)
            java.lang.Object r5 = r7.LLILLL
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.01pm r4 = new X.01pm
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r2 = r7.LLILZ
            android.view.View r1 = r7.LLILZIL
            android.view.View r0 = r7.LLIZ
            r4.<init>(r2, r1, r0, r6)
            r3 = 3
            X.099G r2 = X.C23250099c.LIZIZ(r5, r6, r6, r4, r3)
            X.01pl r1 = new X.01pl
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r0 = r7.LLILZ
            r1.<init>(r0, r6)
            X.099G r1 = X.C23250099c.LIZIZ(r5, r6, r6, r1, r3)
            r7.LLILLL = r1
            r7.LLILLJJLI = r8
            java.lang.Object r0 = r2.LJLIIIL(r7)
            if (r0 != r10) goto L97
            X.C1C7U.LIZIZ(r11)
            return r10
        L90:
            java.lang.Object r1 = r7.LLILLL
            X.0957 r1 = (X.AnonymousClass0957) r1
            X.C155000ia.LIZIZ(r0)
        L97:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            r7.LLILLL = r6
            r7.LL = r2
            r7.LLILLJJLI = r9
            java.lang.Object r0 = r1.LJLIIIL(r7)
            if (r0 != r10) goto L1d
            X.C1C7U.LIZIZ(r11)
            return r10
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454501pn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
