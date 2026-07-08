package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment$bindViewModels$3$1", f = "OnestepCheckoutFragment.kt", l = {}, m = "invokeSuspend")
public final class C333490D5n extends C09AX implements Function2<C0D40, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OnestepCheckoutFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333490D5n(OnestepCheckoutFragment onestepCheckoutFragment, InterfaceC1364105Vn<? super C333490D5n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onestepCheckoutFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333490D5n c333490D5n = new C333490D5n(this.LLILLJJLI, interfaceC1364105Vn);
        c333490D5n.LL = obj;
        return c333490D5n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnestepCheckoutFragment@9eff.bindViewModels$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0D40 c0d40 = (C0D40) this.LL;
        OnestepCheckoutFragment onestepCheckoutFragment = this.LLILLJJLI;
        OnestepCheckoutViewModel onestepCheckoutViewModel = onestepCheckoutFragment.LLILLJJLI;
        if (onestepCheckoutViewModel != null && onestepCheckoutViewModel.LLJILLL) {
            onestepCheckoutViewModel.LLJILLL = false;
        } else {
            onestepCheckoutFragment.UR("sku_select", c0d40.LIZ);
        }
        OnestepCheckoutFragment onestepCheckoutFragment2 = this.LLILLJJLI;
        String str = c0d40.LIZ;
        String str2 = c0d40.LIZIZ;
        boolean z = c0d40.LIZJ;
        onestepCheckoutFragment2.OR(onestepCheckoutFragment2.MR());
        C335000DBi c335000DBi = onestepCheckoutFragment2.LLJILLL;
        if (c335000DBi != null) {
            c335000DBi.logAd(C2264961Dl0.LIZ, onestepCheckoutFragment2.ee(), new C0DBA(str, str2, z));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnestepCheckoutFragment@9eff.bindViewModels$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0D40 c0d40, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0d40, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
