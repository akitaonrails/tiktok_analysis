package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.UsAggregationShopAdapter$initShopNotes$1$1$2$2", f = "UsAggregationShopAdapter.kt", l = {237}, m = "invokeSuspend")
public final class C824803Kc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public TuxTextView LL;
    public int LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ C815203Gk LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C719202rO LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824803Kc(TuxTextView tuxTextView, C815203Gk c815203Gk, boolean z, C719202rO c719202rO, View view, InterfaceC1364105Vn<? super C824803Kc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tuxTextView;
        this.LLILZ = c815203Gk;
        this.LLILZIL = z;
        this.LLILZLL = c719202rO;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824803Kc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "UsAggregationShopAdapter@4608.initShopNotes$1$1$2$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L69
            if (r0 != r3) goto Lab
            com.bytedance.tux.input.TuxTextView r2 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L15:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L46
            boolean r0 = r8.LLILZIL
            if (r0 != 0) goto L31
            com.bytedance.tux.input.TuxTextView r3 = r8.LLILLL
            X.049X r1 = new X.049X
            r1.<init>()
            r0 = 32
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            X.C1748720vbi.LIZLLL(r3, r1, r0)
        L31:
            X.02rO r0 = r8.LLILZLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r0.LLJJJIL
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesEdit
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.text
        L3d:
            r2.setText(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L46:
            boolean r0 = r8.LLILZIL
            if (r0 == 0) goto L5a
            com.bytedance.tux.input.TuxTextView r3 = r8.LLILLL
            X.049X r1 = new X.049X
            r1.<init>()
            r0 = 33
            kotlin.jvm.internal.AFwS228S0000000_1 r0 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            X.C1748720vbi.LIZLLL(r3, r1, r0)
        L5a:
            X.02rO r0 = r8.LLILZLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling r0 = r0.LLJJJIL
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText r0 = r0.orderNotesText
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.text
            goto L3d
        L67:
            r0 = 0
            goto L3d
        L69:
            X.C155000ia.LIZIZ(r9)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            android.view.View r6 = r8.LLIZ
            X.02rO r2 = r8.LLILZLL
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 51
            r1.<init>(r2, r0)
            X.C960603pE.LJFF(r5, r6, r1)
            r0 = 328(0x148, float:4.6E-43)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            java.lang.String r0 = "height"
            r5.putInt(r0, r1)
            com.bytedance.tux.input.TuxTextView r2 = r8.LLILLL
            X.03LF r1 = com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationShopMessageEditFragment.LLJJIII
            X.03Gk r0 = r8.LLILZ
            androidx.fragment.app.Fragment r0 = r0.LLILLL
            r8.LL = r2
            r8.LLILLJJLI = r3
            r1.getClass()
            java.lang.Object r9 = X.C03LF.LIZ(r0, r5, r8)
            if (r9 != r4) goto L15
            X.C1C7U.LIZIZ(r7)
            return r4
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C824803Kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
