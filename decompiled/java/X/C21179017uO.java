package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.VoucherItem;

/* JADX INFO: renamed from: X.17uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21179017uO extends C09AY implements Function1<BaseResponse<Object>, Unit> {
    public final /* synthetic */ C21179117uP LL;
    public final /* synthetic */ AbstractC21196217xA LLILLJJLI;
    public final /* synthetic */ ECommerceMessage LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ PopCardInfo LLILZIL;
    public final /* synthetic */ VoucherItem LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;
    public final /* synthetic */ Function1<String, Unit> LLJILJIL;
    public final /* synthetic */ InterfaceC1685430txd<PopProductResp, String, Boolean, Boolean, ECommerceMessage, Boolean, Unit> LLJILJILJ;
    public final /* synthetic */ Function1<Boolean, Unit> LLJILLL;
    public final /* synthetic */ Function0<Boolean> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21179017uO(C21179117uP c21179117uP, AbstractC21196217xA abstractC21196217xA, ECommerceMessage eCommerceMessage, JSONObject jSONObject, PopCardInfo popCardInfo, VoucherItem voucherItem, int i, boolean z, boolean z2, String str, Map<String, String> map, Function1<? super String, Unit> function1, InterfaceC1685430txd<? super PopProductResp, ? super String, ? super Boolean, ? super Boolean, ? super ECommerceMessage, ? super Boolean, Unit> interfaceC1685430txd, Function1<? super Boolean, Unit> function12, Function0<Boolean> function0) {
        super(1);
        this.LL = c21179117uP;
        this.LLILLJJLI = abstractC21196217xA;
        this.LLILLL = eCommerceMessage;
        this.LLILZ = jSONObject;
        this.LLILZIL = popCardInfo;
        this.LLILZLL = voucherItem;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = str;
        this.LLJIJIL = map;
        this.LLJILJIL = function1;
        this.LLJILJILJ = interfaceC1685430txd;
        this.LLJILLL = function12;
        this.LLJJ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BaseResponse<Object> baseResponse) {
        BaseResponse<Object> baseResponse2 = baseResponse;
        if (baseResponse2 != null && (baseResponse2.getCode() == 0 || baseResponse2.getCode() == 1301106)) {
            C21179117uP c21179117uP = this.LL;
            AbstractC21196217xA abstractC21196217xA = this.LLILLJJLI;
            ECommerceMessage eCommerceMessage = this.LLILLL;
            JSONObject jSONObject = this.LLILZ;
            PopCardInfo popCardInfo = this.LLILZIL;
            VoucherItem voucherItem = this.LLILZLL;
            int i = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            boolean z2 = this.LLJ;
            String str = this.LLJI;
            Map<String, String> map = this.LLJIJIL;
            Function1<String, Unit> function1 = this.LLJILJIL;
            InterfaceC1685430txd<PopProductResp, String, Boolean, Boolean, ECommerceMessage, Boolean, Unit> interfaceC1685430txd = this.LLJILJILJ;
            Function1<Boolean, Unit> function12 = this.LLJILLL;
            Function0<Boolean> function0 = this.LLJJ;
            c21179117uP.getClass();
            C21179117uP.LIZIZ(abstractC21196217xA, eCommerceMessage, jSONObject, popCardInfo, voucherItem, i, z, z2, str, map, function1, interfaceC1685430txd, function12, function0);
        }
        return Unit.LIZ;
    }
}
