package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.ReviewsDto;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.ReviewListViewModel$fetchDataAndUpdateState$1", f = "ReviewListViewModel.kt", l = {91}, m = "invokeSuspend")
public final class C331530Cz9 extends C09AX implements Function1<InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>>, Object> {
    public int LL;
    public final /* synthetic */ ReviewListViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331530Cz9(ReviewListViewModel reviewListViewModel, String str, String str2, InterfaceC1364105Vn<? super C331530Cz9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = reviewListViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331530Cz9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C189200o6<? extends ReviewsDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJII;
        C1C7U.LIZ("ReviewListViewModel@d77b.fetchDataAndUpdateState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJII = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C331730CzT c331730CzT = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            objLJII = c331730CzT.LJII(str, str2, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("ReviewListViewModel@d77b.fetchDataAndUpdateState$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("ReviewListViewModel@d77b.fetchDataAndUpdateState$1");
        return c189200o6M1boximpl;
    }
}
