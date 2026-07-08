package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel$fetchAnchorSubtitleInfoWithDelay$1", f = "ECommerceAnchorPanelViewModel.kt", l = {1596}, m = "invokeSuspend")
public final class C754940TjQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ ECommerceAnchorPanelViewModel LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754940TjQ(Aweme aweme, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, List<String> list, int i, int i2, InterfaceC1364105Vn<? super C754940TjQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = eCommerceAnchorPanelViewModel;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754940TjQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECommerceAnchorPanelViewModel@ca63.fetchAnchorSubtitleInfoWithDelay$1");
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
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            Aweme aweme = this.LLILLJJLI;
            c21272618Mq.getClass();
            long jLIZ = ((long) C21272618Mq.LIZ(aweme)) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.fetchAnchorSubtitleInfoWithDelay$1");
                return objLJFF;
            }
        }
        this.LLILLL.zQ2(this.LLILZIL, this.LLILZLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.fetchAnchorSubtitleInfoWithDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
