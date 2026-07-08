package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17uL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$checkPrefetchData$1$1", f = "AbsUsECLiveExplanationCardWidget.kt", l = {636}, m = "invokeSuspend")
public final class C21178717uL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<BaseResponse<PopProductResp>> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AbstractC21194117wp LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ OecInitData LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21178717uL(AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957, long j, AbstractC21194117wp abstractC21194117wp, long j2, OecInitData oecInitData, InterfaceC1364105Vn<? super C21178717uL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = j;
        this.LLILZIL = abstractC21194117wp;
        this.LLILZLL = j2;
        this.LLIZ = oecInitData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21178717uL c21178717uL = new C21178717uL(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c21178717uL.LLILLJJLI = obj;
        return c21178717uL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.checkPrefetchData$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = true;
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
                C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.checkPrefetchData$1$1");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) objLJLIIIL;
        if (baseResponse == null) {
            long j = this.LLILZ;
            OecInitData oecInitData = this.LLIZ;
            C1733990vDx.LIZIZ.remove(Long.valueOf(j));
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_FAILED, oecInitData.LIZIZ, C2097908Jt.LIZJ(new Pair("reason", "response is null")));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.checkPrefetchData$1$1");
            return unit;
        }
        C1733990vDx.LIZIZ.remove(Long.valueOf(this.LLILZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILZIL.LLJILJILJ.LJII(jCurrentTimeMillis, "api_end_time");
        this.LLILZIL.LLJILJILJ.LJIIIIZZ("isFirst", CardStruct.IStatusCode.DEFAULT, false);
        PopProductResp popProductResp = (PopProductResp) baseResponse.getData();
        String string = null;
        if (popProductResp != null) {
            OecInitData oecInitData2 = this.LLIZ;
            AbstractC21194117wp abstractC21194117wp = this.LLILZIL;
            long j2 = this.LLILZ;
            popProductResp.LIZLLL = oecInitData2.LIZIZ;
            C21194017wo.LIZ(popProductResp, abstractC21194117wp.LJJIJLIJ());
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C21174917tj(abstractC21194117wp, j2, popProductResp, null), 3);
            if (oecInitData2.cardType == popProductResp.cardType && oecInitData2.popCardId == popProductResp.popCardId) {
                abstractC21194117wp.LJJJJI(popProductResp, true, true, null, true, null);
            } else {
                EnumC21192517wZ enumC21192517wZ = EnumC21192517wZ.DATA_CHECK;
                String strValueOf = String.valueOf(j2);
                String strValueOf2 = String.valueOf(oecInitData2.popCardId);
                Integer numLJ = C2286608xc.LJ(oecInitData2.cardType);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("card not match:");
                sbLIZ.append(oecInitData2.cardType);
                sbLIZ.append(" vs ");
                sbLIZ.append(popProductResp.cardType);
                sbLIZ.append(',');
                sbLIZ.append(oecInitData2.popCardId);
                sbLIZ.append(" vs ");
                sbLIZ.append(popProductResp.popCardId);
                C21192417wY.LJ(enumC21192517wZ, strValueOf, strValueOf2, numLJ, C2188811AlT.LIZIZ(sbLIZ), oecInitData2.LIZIZ);
                AbstractC21194117wp.LJJLI(abstractC21194117wp, true, null, oecInitData2.LIZIZ, true, C2286608xc.LJ(oecInitData2.cardType), 2);
            }
            z2 = true;
            abstractC21194117wp.LJJIIJ(true);
        }
        String strLJJIJ = AbstractC21194117wp.LJJIJ();
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
        boolean z3 = z2;
        boolean z4 = z2;
        String str = string;
        C21198317xV.LIZLLL(strLJJIJ, str, z, jCurrentTimeMillis - this.LLILZLL, baseResponse.getCode(), baseResponse.getMessage(), false, this.LLILZIL.LJJIJIIJIL(), z3, false, "prefetch_pin", z4, this.LLILZIL.LLJJJJ, C2286608xc.LJ(this.LLIZ.cardType));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.checkPrefetchData$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
