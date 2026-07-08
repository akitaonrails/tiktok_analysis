package X;

import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.NewArchDelegate$tryInsertRealTimeRecommend$1", f = "NewArchDelegate.kt", l = {248}, m = "invokeSuspend")
public final class C1129100fUK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftPanelCoordinatorViewModel LLILLJJLI;
    public final /* synthetic */ C1129280fUc LLILLL;
    public final /* synthetic */ Function1<C1886107a7, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1129100fUK(GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel, C1129280fUc c1129280fUc, Function1<? super C1886107a7, Unit> function1, InterfaceC1364105Vn<? super C1129100fUK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftPanelCoordinatorViewModel;
        this.LLILLL = c1129280fUc;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1129100fUK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewArchDelegate@8bab.tryInsertRealTimeRecommend$1");
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
            GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LLILLJJLI;
            C1129280fUc c1129280fUc = this.LLILLL;
            this.LL = 1;
            obj = giftPanelCoordinatorViewModel.wQ2(c1129280fUc, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NewArchDelegate@8bab.tryInsertRealTimeRecommend$1");
                return objLJFF;
            }
        }
        this.LLILZ.invoke((C1886107a7) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewArchDelegate@8bab.tryInsertRealTimeRecommend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
