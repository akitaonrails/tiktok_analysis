package X;

import android.animation.Animator;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.live.TopLiveProductViewNew$setPriceWithAnim$1", f = "TopLiveProductViewNew.kt", l = {491}, m = "invokeSuspend")
public final class C665900QAa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0QAZ LLILLJJLI;
    public final /* synthetic */ Product LLILLL;
    public final /* synthetic */ Animator LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C665900QAa(C0QAZ c0qaz, Product product, Animator animator, InterfaceC1364105Vn<? super C665900QAa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0qaz;
        this.LLILLL = product;
        this.LLILZ = animator;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665900QAa(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopLiveProductViewNew@8093.setPriceWithAnim$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPriceWithAnim$1");
                return objLJFF;
            }
        }
        C0QAZ c0qaz = this.LLILLJJLI;
        Product product = this.LLILLL;
        LinearLayout linearLayout = c0qaz.LLJJJIL;
        if (linearLayout == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPriceWithAnim$1");
            return unit;
        }
        LinearLayout linearLayout2 = c0qaz.LLJJIJIL;
        if (linearLayout2 == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPriceWithAnim$1");
            return unit2;
        }
        c0qaz.LIZJ(product, linearLayout, linearLayout2);
        this.LLILZ.start();
        C0QAZ c0qaz2 = this.LLILLJJLI;
        LinearLayout linearLayout3 = c0qaz2.LLJJJ;
        c0qaz2.LLJJJ = c0qaz2.LLJJIJIL;
        c0qaz2.LLJJIJIL = linearLayout3;
        LinearLayout linearLayout4 = c0qaz2.LLJJJJ;
        c0qaz2.LLJJJJ = c0qaz2.LLJJJIL;
        c0qaz2.LLJJJIL = linearLayout4;
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveProductViewNew@8093.setPriceWithAnim$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
