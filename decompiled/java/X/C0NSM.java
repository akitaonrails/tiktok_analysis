package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.view.HorizontalPopCardViewV0$loadCoverImage$1", f = "HorizontalPopCardViewV0.kt", l = {1490}, m = "invokeSuspend")
public final class C0NSM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<Unit> LLILLJJLI;
    public final /* synthetic */ AnonymousClass1853 LLILLL;
    public final /* synthetic */ PopupCardVO LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NSM(C05XL<Unit> c05xl, AnonymousClass1853 anonymousClass1853, PopupCardVO popupCardVO, boolean z, String str, InterfaceC1364105Vn<? super C0NSM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
        this.LLILLL = anonymousClass1853;
        this.LLILZ = popupCardVO;
        this.LLILZIL = z;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NSM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalPopCardViewV0@5657.loadCoverImage$1");
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
            C05XL<Unit> c05xl = this.LLILLJJLI;
            if (c05xl != null) {
                this.LL = 1;
                if (c05xl.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("HorizontalPopCardViewV0@5657.loadCoverImage$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.E0(this.LLILZ, this.LLILZIL, this.LLILZLL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalPopCardViewV0@5657.loadCoverImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
