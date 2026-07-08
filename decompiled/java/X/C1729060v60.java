package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel$showTemplateMultiDisplaySheet$1", f = "TemplateListViewModel.kt", l = {430, 431}, m = "invokeSuspend")
public final class C1729060v60 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ TemplateItem LLILLL;
    public final /* synthetic */ TemplateListViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729060v60(ViewGroup viewGroup, TemplateItem templateItem, TemplateListViewModel templateListViewModel, InterfaceC1364105Vn<? super C1729060v60> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewGroup;
        this.LLILLL = templateItem;
        this.LLILZ = templateListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729060v60(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "TemplateListViewModel@ac46.showTemplateMultiDisplaySheet$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L53
            if (r0 == r3) goto L68
            if (r0 != r4) goto L92
            X.C155000ia.LIZIZ(r9)
        L16:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 != 0) goto L29
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel r2 = r8.LLILZ
            android.view.ViewGroup r1 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r0 = r8.LLILLL
            r2.vQ2(r1, r0)
        L23:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L29:
            android.view.ViewGroup r0 = r8.LLILLJJLI
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L23
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentManager r6 = r0.getSupportFragmentManager()
            if (r6 == 0) goto L23
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel r5 = r8.LLILZ
            android.view.ViewGroup r4 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r3 = r8.LLILLL
            X.0v5z r2 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateMultiDisplayFragment.LLJI
            kotlin.jvm.internal.AwS270S0300000_26 r1 = new kotlin.jvm.internal.AwS270S0300000_26
            r0 = 126(0x7e, float:1.77E-43)
            r1.<init>(r5, r4, r3, r0)
            r2.getClass()
            X.C1729050v5z.LIZ(r6, r9, r1)
            goto L23
        L53:
            X.C155000ia.LIZIZ(r9)
            X.0v9i r2 = X.C1731360v9i.LIZ
            android.view.ViewGroup r1 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r0 = r8.LLILLL
            r8.LL = r3
            java.lang.Object r0 = r2.LJIIIIZZ(r1, r0, r8)
            if (r0 != r5) goto L6b
            X.C1C7U.LIZIZ(r7)
            return r5
        L68:
            X.C155000ia.LIZIZ(r9)
        L6b:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel r0 = r8.LLILZ
            X.0v7X r3 = r0.LLILLL
            android.view.ViewGroup r0 = r8.LLILLJJLI
            android.content.Context r2 = r0.getContext()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel r0 = r8.LLILZ
            X.0v7D r0 = r0.LLILZIL
            if (r0 == 0) goto L90
            X.0v5t r1 = r0.Um1()
        L7f:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem r0 = r8.LLILLL
            r8.LL = r4
            r3.getClass()
            java.lang.Object r9 = X.C1730010v7X.LJII(r2, r1, r0, r8)
            if (r9 != r5) goto L16
            X.C1C7U.LIZIZ(r7)
            return r5
        L90:
            r1 = 0
            goto L7f
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729060v60.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
