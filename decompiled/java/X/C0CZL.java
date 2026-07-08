package X;

import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel$unloggedInLoad$2$carouselDeferred$1", f = "AIPortraitTabViewModel.kt", l = {629}, m = "invokeSuspend")
public final class C0CZL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends PortraitStyleItem>>, Object> {
    public int LL;
    public final /* synthetic */ AIPortraitTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZL(AIPortraitTabViewModel aIPortraitTabViewModel, InterfaceC1364105Vn<? super C0CZL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIPortraitTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitTabViewModel@fa0d.unloggedInLoad$2$carouselDeferred$1");
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
            C1687000u0A c1687000u0A = this.LLILLJJLI.LL;
            this.LL = 1;
            obj = c1687000u0A.LIZJ(20, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.unloggedInLoad$2$carouselDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIPortraitTabViewModel@fa0d.unloggedInLoad$2$carouselDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends PortraitStyleItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
