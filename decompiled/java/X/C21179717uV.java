package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21179717uV extends C09AY implements Function1<Boolean, Pair<? extends C0X9S<BaseResponse<PopProductResp>>, ? extends String>> {
    public final /* synthetic */ AbstractC21194117wp LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ECommerceMessage LLILZIL;
    public final /* synthetic */ C1563990qnl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21179717uV(AbstractC21194117wp abstractC21194117wp, Integer num, String str, boolean z, ECommerceMessage eCommerceMessage, C1563990qnl c1563990qnl) {
        super(1);
        this.LL = abstractC21194117wp;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = eCommerceMessage;
        this.LLILZLL = c1563990qnl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<? extends C0X9S<BaseResponse<PopProductResp>>, ? extends String> invoke(Boolean bool) {
        String string;
        Integer num;
        String str;
        JSONObject jSONObjectLIZLLL;
        String str2;
        String string2;
        long id;
        Long lLJIILIIL;
        String str3;
        boolean zBooleanValue = bool.booleanValue();
        if (this.LL.LJJIJLIJ()) {
            UsProductListApi usProductListApi = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
            Room room = this.LL.LLJILLL;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(AbstractC21194117wp.LJJIJ());
            Integer num2 = this.LLILLJJLI;
            if (num2 != null && num2.intValue() == 1 && (str3 = this.LLILLL) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str3);
            } else {
                lLJIILIIL = null;
            }
            return new Pair<>(usProductListApi.getPopFromBroadcast(id, lLJIILIIL2, lLJIILIIL), null);
        }
        int iLJJIJIL = this.LL.LJJIJIL(this.LLILZ);
        Room room2 = this.LL.LLJILLL;
        String str4 = "";
        if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
            string = "";
        }
        String strLJFF = C598410NdX.LJFF(string);
        UsProductListApi usProductListApi2 = (UsProductListApi) C0NSL.LIZ().create(UsProductListApi.class);
        Room room3 = this.LL.LLJILLL;
        if (room3 != null && (string2 = Long.valueOf(room3.getId()).toString()) != null) {
            str4 = string2;
        }
        Integer num3 = this.LLILLJJLI;
        if ((num3 != null && num3.intValue() == 1) || ((num = this.LLILLJJLI) != null && num.intValue() == 99)) {
            str = this.LLILLL;
        } else {
            str = null;
        }
        Integer num4 = this.LLILLJJLI;
        String str5 = this.LL.LLLF;
        Integer numValueOf = Integer.valueOf(iLJJIJIL);
        ECommerceMessage eCommerceMessage = this.LLILZIL;
        if (eCommerceMessage != null) {
            C110400bO.LIZ.getClass();
            jSONObjectLIZLLL = C110400bO.LIZLLL(eCommerceMessage);
        } else {
            jSONObjectLIZLLL = null;
        }
        C1563990qnl c1563990qnl = this.LLILZLL;
        UsPopupCardVO usPopupCardVO = this.LL.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            str2 = usPopupCardVO.popMsgCtxStr;
        } else {
            str2 = null;
        }
        return new Pair<>(usProductListApi2.getIntroduceProductV2(strLJFF, str4, str, num4, 1, str5, numValueOf, jSONObjectLIZLLL, 1, zBooleanValue, 0, C21183117v3.LIZJ(c1563990qnl, str2, null)), strLJFF);
    }
}
