package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$2", f = "QuickProductSlot.kt", l = {149}, m = "invokeSuspend")
public final class C1147860fya extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C14GT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147860fya(C14GT c14gt, InterfaceC1364105Vn<? super C1147860fya> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c14gt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147860fya(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("QuickProductSlot@467f.onCreate$3$2");
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
            AnonymousClass1880 anonymousClass1880 = EcAnchorApi.LIZ;
            Room room = this.LLILLJJLI.LLJIJIL;
            if (room != null) {
                lLJFF = C2286608xc.LJFF(room.getId());
            } else {
                lLJFF = null;
            }
            String strValueOf = String.valueOf(lLJFF);
            this.LL = 1;
            obj = anonymousClass1880.LIZ(strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("QuickProductSlot@467f.onCreate$3$2");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLJJLI.LLJJI;
        if (slotViewModel == null) {
            slotViewModel = null;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slotViewModel), (AbstractC23273099z) this.LLILLJJLI.LLJJ.getValue(), null, new C1147870fyb(baseResponse, this.LLILLJJLI, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickProductSlot@467f.onCreate$3$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
