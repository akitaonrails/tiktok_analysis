package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$checkPrefetchData$1$1", f = "AbsECLiveExplanationCardWidget.kt", l = {640}, m = "invokeSuspend")
public final class C21178417uI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<BaseResponse<PopProductResp>> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AbstractC21194217wq LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ OecInitData LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21178417uI(AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957, long j, AbstractC21194217wq abstractC21194217wq, long j2, OecInitData oecInitData, InterfaceC1364105Vn<? super C21178417uI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = j;
        this.LLILZIL = abstractC21194217wq;
        this.LLILZLL = j2;
        this.LLIZ = oecInitData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21178417uI c21178417uI = new C21178417uI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c21178417uI.LLILLJJLI = obj;
        return c21178417uI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.checkPrefetchData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            Object obj2 = this.LLILLJJLI;
            AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLJLIIIL = anonymousClass0957.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.checkPrefetchData$1$1");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) objLJLIIIL;
        if (baseResponse == null) {
            C1733990vDx.LIZIZ.remove(Long.valueOf(this.LLILZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.checkPrefetchData$1$1");
            return unit;
        }
        C1733990vDx.LIZIZ.remove(Long.valueOf(this.LLILZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZIL.LLJILJILJ.LJII(jCurrentTimeMillis, "api_end_time");
        this.LLILZIL.LLJILJILJ.LJIIIIZZ("isFirst", CardStruct.IStatusCode.DEFAULT, false);
        PopProductResp popProductResp = (PopProductResp) baseResponse.getData();
        String string = null;
        if (popProductResp != null) {
            long j = this.LLILZ;
            AbstractC21194217wq abstractC21194217wq = this.LLILZIL;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C21174717th(abstractC21194217wq, j, popProductResp, null), 3);
            abstractC21194217wq.LJJJJI(popProductResp, popProductResp.LIZIZ, true, true, null, false, false);
            abstractC21194217wq.LJJIIJZLJL(true);
        }
        String strLJJIJ = AbstractC21194217wq.LJJIJ();
        Room room = this.LLILZIL.LLJILLL;
        if (room != null) {
            string = C2286608xc.LJFF(room.getId()).toString();
        }
        PopProductResp popProductResp2 = (PopProductResp) baseResponse.getData();
        if (popProductResp2 != null && C21194717wv.LJ(popProductResp2) != null) {
            z = true;
        } else {
            z = false;
        }
        C21198417xW.LIZLLL(strLJJIJ, string, z, jCurrentTimeMillis - this.LLILZLL, baseResponse.getCode(), baseResponse.getMessage(), false, this.LLILZIL.LJJIJIL(), true, false, "prefetch_pin", true, this.LLILZIL.LLJJJJ, C2286608xc.LJ(this.LLIZ.cardType));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.checkPrefetchData$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
