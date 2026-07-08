package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.domain.usecase.gift.LoadRealTimeRecommendUseCase$insertRealTimeRecommendGift$insertResult$1", f = "LoadRealTimeRecommendUseCase.kt", l = {85}, m = "invokeSuspend")
public final class C594310NSr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1886107a7>, Object> {
    public int LL;
    public final /* synthetic */ C05XL<C1886107a7> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594310NSr(C05XL<C1886107a7> c05xl, InterfaceC1364105Vn<? super C594310NSr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594310NSr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$insertResult$1");
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
            C05XL<C1886107a7> c05xl = this.LLILLJJLI;
            this.LL = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$insertResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LoadRealTimeRecommendUseCase@2db3.insertRealTimeRecommendGift$insertResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1886107a7> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
