package X;

import Y.ARunnableS126S0100000_26;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment.AutofillFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ucc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillManager$tryAutofill$1$1$1$2$1", f = "AutofillManager.kt", l = {}, m = "invokeSuspend")
public final class C1710840ucc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AutofillHostContent LLILZ;
    public final /* synthetic */ AutofillApi.CardNumberList LLILZIL;
    public final /* synthetic */ InterfaceC1711360udS LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1710840ucc(C19EG c19eg, String str, String str2, AutofillHostContent autofillHostContent, AutofillApi.CardNumberList cardNumberList, InterfaceC1711360udS interfaceC1711360udS, InterfaceC1364105Vn<? super C1710840ucc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = autofillHostContent;
        this.LLILZIL = cardNumberList;
        this.LLILZLL = interfaceC1711360udS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1710840ucc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutofillManager@bbf4.tryAutofill$1$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AutofillFragment autofillFragment = new AutofillFragment();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        AutofillHostContent autofillHostContent = this.LLILZ;
        AutofillApi.CardNumberList cardNumberList = this.LLILZIL;
        InterfaceC1711360udS interfaceC1711360udS = this.LLILZLL;
        autofillFragment.LLJJJ = new C1710960uco(str, str2, autofillHostContent, cardNumberList, cardNumberList.LIZ);
        autofillFragment.LLJJJJ = interfaceC1711360udS;
        C19EG c19eg = this.LL;
        autofillFragment.LLJI = true;
        autofillFragment.LLJIJIL = false;
        if (autofillFragment.LLIZLLLIL == null) {
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = autofillFragment;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = false;
            c1390920mIc.LJIIIIZZ(0);
            if (autofillFragment.LLJILJIL) {
                c1390920mIc.LIZ.LLLIIIIL = autofillFragment.LLJILLL;
            } else {
                c1390920mIc.LIZ.LLLIIII = autofillFragment.LLJILJILJ;
            }
            autofillFragment.LLIZLLLIL = c1390920mIc.LIZ;
        }
        autofillFragment.LLJJIII = 0;
        TuxSheet tuxSheet2 = autofillFragment.LLIZLLLIL;
        if (tuxSheet2 != null) {
            tuxSheet2.show(c19eg.getSupportFragmentManager(), String.valueOf(autofillFragment.hashCode()));
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJIIIIZZ(autofillFragment, true);
        LifecycleOwnerExtensionsKt.LIZIZ(c19eg, 300L, new ARunnableS126S0100000_26(autofillFragment, 119));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutofillManager@bbf4.tryAutofill$1$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
