package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.localservice.live.common.api.LocalServiceForLiveApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.PinedProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.feed.LSLiveProductCard$showCardIfNeeded$1$response$1", f = "LSLiveProductCard.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1892460zLY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse>, Object> {
    public int LL;
    public final /* synthetic */ LiveRoomStruct LLILLJJLI;
    public final /* synthetic */ C1887790zE1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892460zLY(LiveRoomStruct liveRoomStruct, C1887790zE1 c1887790zE1, InterfaceC1364105Vn<? super C1892460zLY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRoomStruct;
        this.LLILLL = c1887790zE1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892460zLY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String string;
        String string2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        PageFinder pageFinderInvoke;
        Object pinedProducts = obj;
        C1C7U.LIZ("LSLiveProductCard@f18f.showCardIfNeeded$1$response$1");
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
            LiveRoomStruct liveRoomStruct = this.LLILLJJLI;
            String strLJ = null;
            if (liveRoomStruct != null) {
                string = C2286608xc.LJFF(liveRoomStruct.id).toString();
            } else {
                string = null;
            }
            String value = EnumC1892470zLZ.FYP_LIVE_CARD.getValue();
            LiveRoomStruct liveRoomStruct2 = this.LLILLJJLI;
            if (liveRoomStruct2 != null) {
                string2 = C2286608xc.LJFF(liveRoomStruct2.getAnchorId()).toString();
            } else {
                string2 = null;
            }
            JSONObject jSONObject = new JSONObject();
            LiveRoomStruct liveRoomStruct3 = this.LLILLJJLI;
            if (liveRoomStruct3 != null) {
                boolValueOf = Boolean.valueOf(liveRoomStruct3.hasTtlsLivePermission);
            } else {
                boolValueOf = null;
            }
            jSONObject.put("has_ttls_live_permission", boolValueOf);
            if (liveRoomStruct3 != null) {
                boolValueOf2 = Boolean.valueOf(liveRoomStruct3.existedTtlsGoods);
            } else {
                boolValueOf2 = null;
            }
            jSONObject.put("existed_ttls_goods", boolValueOf2);
            if (liveRoomStruct3 != null) {
                boolValueOf3 = Boolean.valueOf(liveRoomStruct3.hasTtlsGoods);
            } else {
                boolValueOf3 = null;
            }
            jSONObject.put("has_ttls_goods", boolValueOf3);
            String strJ3 = C786410Ut5.J3(jSONObject);
            Function0<? extends PageFinder> function0 = this.LLILLL.LLILZLL;
            if (function0 != null && (pageFinderInvoke = function0.invoke()) != null) {
                strLJ = C18JG.LJ(pageFinderInvoke, "c7998.d14810");
            }
            this.LL = 1;
            pinedProducts = localServiceForLiveApiLIZ.getPinedProducts(string, null, value, string2, null, strJ3, strLJ, this);
            if (pinedProducts == objLJFF) {
                C1C7U.LIZIZ("LSLiveProductCard@f18f.showCardIfNeeded$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LSLiveProductCard@f18f.showCardIfNeeded$1$response$1");
        return pinedProducts;
    }
}
