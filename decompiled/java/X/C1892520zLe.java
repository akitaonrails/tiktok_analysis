package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.live.common.api.LocalServiceForLiveApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.PinedProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.widget.LSLiveProductCardWidget$silenceUpdatePinedProduct$2$response$1", f = "LSLiveProductCardWidget.kt", l = {245}, m = "invokeSuspend")
public final class C1892520zLe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1892560zLi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892520zLe(C1892560zLi c1892560zLi, InterfaceC1364105Vn<? super C1892520zLe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892560zLi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892520zLe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String idStr;
        Long lLJFF;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        Object pinedProducts = obj;
        C1C7U.LIZ("LSLiveProductCardWidget@bae5.silenceUpdatePinedProduct$2$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(pinedProducts);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(pinedProducts);
            LocalServiceForLiveApi.LIZ.getClass();
            LocalServiceForLiveApi localServiceForLiveApiLIZ = C1173130gdL.LIZ();
            Room room = this.LLILLJJLI.LLILZ;
            Boolean boolValueOf3 = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            String value = EnumC1892470zLZ.C_LIVE_PIN_CARD.getValue();
            Room room2 = this.LLILLJJLI.LLILZ;
            if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null) {
                lLJFF = C2286608xc.LJFF(interfaceC2262081DgMAuthor.getId());
            } else {
                lLJFF = null;
            }
            String strValueOf = String.valueOf(lLJFF);
            JSONObject jSONObject = new JSONObject();
            C1892560zLi c1892560zLi = this.LLILLJJLI;
            Room room3 = c1892560zLi.LLILZ;
            if (room3 != null) {
                boolValueOf = Boolean.valueOf(room3.hasTtlsLivePermission);
            } else {
                boolValueOf = null;
            }
            jSONObject.put("has_ttls_live_permission", boolValueOf);
            Room room4 = c1892560zLi.LLILZ;
            if (room4 != null) {
                boolValueOf2 = Boolean.valueOf(room4.existedTtlsGoods);
            } else {
                boolValueOf2 = null;
            }
            jSONObject.put("existed_ttls_goods", boolValueOf2);
            Room room5 = c1892560zLi.LLILZ;
            if (room5 != null) {
                boolValueOf3 = Boolean.valueOf(room5.hasTtlsGoods);
            }
            jSONObject.put("has_ttls_goods", boolValueOf3);
            String strJ3 = C786410Ut5.J3(jSONObject);
            String strLJ = C18JG.LJ(C520160Kac.LIZ(this.LLILLJJLI.LLILLJJLI.getContext()), "c23581.d17715");
            this.LL = 1;
            pinedProducts = localServiceForLiveApiLIZ.getPinedProducts(idStr, null, value, strValueOf, null, strJ3, strLJ, this);
            if (pinedProducts == objLJFF) {
                C1C7U.LIZIZ("LSLiveProductCardWidget@bae5.silenceUpdatePinedProduct$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LSLiveProductCardWidget@bae5.silenceUpdatePinedProduct$2$response$1");
        return pinedProducts;
    }
}
