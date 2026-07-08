package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0010000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Okx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel$toggleFavorite$2$2$1", f = "TemplateFavoriteViewModel.kt", l = {}, m = "invokeSuspend")
public final class C628490Okx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TemplateFavoriteResponse LL;
    public final /* synthetic */ TemplateFavoriteViewModel LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628490Okx(TemplateFavoriteResponse templateFavoriteResponse, TemplateFavoriteViewModel templateFavoriteViewModel, Fragment fragment, boolean z, InterfaceC1364105Vn<? super C628490Okx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = templateFavoriteResponse;
        this.LLILLJJLI = templateFavoriteViewModel;
        this.LLILLL = fragment;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C628490Okx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TemplateFavoriteViewModel@dc86.toggleFavorite$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL.status_code;
        if (num != null && num.intValue() == 0) {
            this.LLILLJJLI.setState(new AwS24S0010000_9(this.LLILZ, 9));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateFavoriteViewModel@dc86.toggleFavorite$2$2$1");
            return unit;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
        Integer num2 = this.LL.status_code;
        if (num2 != null && num2.intValue() == 1) {
            i = 2131834040;
        } else {
            i = 2131834034;
        }
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
        this.LLILLJJLI.setState(new AwS24S0010000_9(this.LLILZ, 10));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateFavoriteViewModel@dc86.toggleFavorite$2$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
