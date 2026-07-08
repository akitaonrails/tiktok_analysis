package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.NextActionInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.17uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$prepareFlipCardToNextAction$1", f = "AbsECLiveExplanationCardWidget.kt", l = {2420, 2424}, m = "invokeSuspend")
public final class C21182317uv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC21194217wq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21182317uv(long j, AbstractC21194217wq abstractC21194217wq, InterfaceC1364105Vn<? super C21182317uv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = abstractC21194217wq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21182317uv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PopupCardVO popupCardVO;
        String idStr;
        NextActionInfo nextActionInfo;
        C0X52 c0x52;
        BaseResponse baseResponse;
        GetMoreActionResp getMoreActionResp;
        PopupCardVO popupCardVO2;
        PopupCardVO popupCardVO3;
        BaseResponse baseResponse2;
        GetMoreActionResp getMoreActionResp2;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.prepareFlipCardToNextAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    c0x52 = (C0X52) obj;
                    if (c0x52 != null && c0x52.LIZJ() && (baseResponse = (BaseResponse) c0x52.LIZIZ) != null && (getMoreActionResp = (GetMoreActionResp) baseResponse.getData()) != null && Intrinsics.LJFF(getMoreActionResp.support, true) && (((popupCardVO2 = this.LLILLL.LJJIJIIJI().LL) == null || popupCardVO2.flashSaleAtmosphereInfo == null) && (popupCardVO3 = this.LLILLL.LJJIJIIJI().LL) != null && Intrinsics.LJFF(popupCardVO3.advancedFlashSale, false) && (baseResponse2 = (BaseResponse) c0x52.LIZIZ) != null && (getMoreActionResp2 = (GetMoreActionResp) baseResponse2.getData()) != null)) {
                        this.LLILLL.LJJIJIIJI().LJIIJJI(getMoreActionResp2, AFwS223S0000000_32.get$arr$(138));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.prepareFlipCardToNextAction$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.prepareFlipCardToNextAction$1");
                return objLJFF;
            }
        }
        PopupCardVO popupCardVO4 = this.LLILLL.LJJIJIIJI().LL;
        if ((popupCardVO4 == null || popupCardVO4.flashSaleAtmosphereInfo == null) && (popupCardVO = this.LLILLL.LJJIJIIJI().LL) != null && Intrinsics.LJFF(popupCardVO.advancedFlashSale, false)) {
            PopupCardVO popupCardVO5 = this.LLILLL.LJJIJIIJI().LL;
            if (popupCardVO5 != null && (nextActionInfo = popupCardVO5.nextActionInfo) != null) {
                str = nextActionInfo.traceData;
            }
            AbstractC21194217wq abstractC21194217wq = this.LLILLL;
            C598800NeA c598800NeA = abstractC21194217wq.LLLIL;
            Room room = abstractC21194217wq.LLJILLL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            String str2 = this.LLILLL.LLLFFI;
            this.LL = 2;
            obj = c598800NeA.LIZ(idStr, str2, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.prepareFlipCardToNextAction$1");
                return objLJFF;
            }
            c0x52 = (C0X52) obj;
            if (c0x52 != null) {
                this.LLILLL.LJJIJIIJI().LJIIJJI(getMoreActionResp2, AFwS223S0000000_32.get$arr$(138));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.prepareFlipCardToNextAction$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
