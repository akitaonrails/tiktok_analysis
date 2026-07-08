package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinLottieImageWidget$showLottieImage$2$4", f = "BulletinLottieImageWidget.kt", l = {}, m = "invokeSuspend")
public final class C2480509nn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2481009ns LL;
    public final /* synthetic */ BulletinGeckoResourceModel LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480509nn(C2481009ns c2481009ns, BulletinGeckoResourceModel bulletinGeckoResourceModel, Function0<Unit> function0, InterfaceC1364105Vn<? super C2480509nn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2481009ns;
        this.LLILLJJLI = bulletinGeckoResourceModel;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2480509nn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinLottieImageWidget@f8b2.showLottieImage$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showLottieImage$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
