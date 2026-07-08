package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.analytics.IIMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.b2c.event.B2CEventHandleApi;
import com.ss.android.ugc.aweme.im.b2c.event.B2CEventRequestBody;
import com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06m0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.event.IMB2CServerEventAnalytics$reportEnterB2CChatToServer$2", f = "IMB2CServerEventAnalytics.kt", l = {38, 60}, m = "invokeSuspend")
public final class C1705006m0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ IMUser LLILLL;
    public final /* synthetic */ C909290Zln LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705006m0(IMUser iMUser, C909290Zln c909290Zln, InterfaceC1364105Vn<? super C1705006m0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMUser;
        this.LLILZ = c909290Zln;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705006m0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> linkedHashMap;
        String singleChatFromUserId;
        String strOptString;
        LinkedHashMap linkedHashMap2;
        C1C7U.LIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = (Map) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            linkedHashMap = new LinkedHashMap<>();
            IIMChatRoomAnalytics.LIZ.getClass();
            IIMChatRoomAnalytics iIMChatRoomAnalyticsLIZ = C06Q7.LIZ();
            if (iIMChatRoomAnalyticsLIZ != null) {
                IMUser iMUser = this.LLILLL;
                String singleChatFromUserId2 = this.LLILZ.getSingleChatFromUserId();
                this.LL = linkedHashMap;
                this.LLILLJJLI = 1;
                if (iIMChatRoomAnalyticsLIZ.LJ(iMUser, singleChatFromUserId2, linkedHashMap, null, this) == objLJFF) {
                    C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
                    return objLJFF;
                }
            }
        }
        IMUser iMUser2 = this.LLILLL;
        if ((iMUser2 == null || (singleChatFromUserId = iMUser2.getUid()) == null) && (singleChatFromUserId = this.LLILZ.getSingleChatFromUserId()) == null) {
            singleChatFromUserId = "";
        }
        linkedHashMap.put("to_user_id", singleChatFromUserId);
        linkedHashMap.put("enter_from", this.LLILZ.getEnterFromForMob());
        linkedHashMap.put("enter_method", this.LLILZ.getEnterMethod());
        String trafficTypeForMob = this.LLILZ.getTrafficTypeForMob();
        if (trafficTypeForMob != null) {
            linkedHashMap.put("traffic_type", trafficTypeForMob);
        }
        linkedHashMap.put("process_id", this.LLILZ.getUuid());
        linkedHashMap.put("enter_chat_time", String.valueOf(System.currentTimeMillis()));
        if (C123100dR.LIZ(this.LLILZ.getExtrasInfoMobParams())) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = this.LLILZ.getExtrasInfoMobParams();
            JSONObject bizInfoExtraMap = this.LLILZ.getBizInfoExtraMap();
            if (bizInfoExtraMap != null && (strOptString = bizInfoExtraMap.optString("tt_clid")) != null) {
                Map map = (Map) C051M.LIZJ((String) c259800zU.element, new TypeToken<Map<String, ? extends Object>>() { // from class: X.06m1
                }.getType());
                if (map != null) {
                    linkedHashMap2 = new LinkedHashMap(map);
                } else {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put("tt_clid", strOptString);
                c259800zU.element = C051M.LJ(linkedHashMap2, false);
            }
            linkedHashMap.put("extra_info", c259800zU.element);
        }
        String strLJ = C051M.LJ(linkedHashMap, false);
        ConvContext convContext = new ConvContext(this.LLILZ.getConversationId(), this.LLILZ.getEntranceType());
        C0Y8T c0y8tLJIL = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIL(this.LLILZ.getConversationId());
        if (c0y8tLJIL == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
            return unit2;
        }
        B2CEventHandleApi b2CEventHandleApi = B2CEventHandleApi.LIZIZ;
        B2CEventRequestBody b2CEventRequestBody = new B2CEventRequestBody(convContext, 1, strLJ, this.LLILZ.getConversationId(), String.valueOf(c0y8tLJIL.getConversationType()), String.valueOf(c0y8tLJIL.getInboxType()));
        this.LL = null;
        this.LLILLJJLI = 2;
        if (b2CEventHandleApi.reportEvent(b2CEventRequestBody, this) == objLJFF) {
            C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMB2CServerEventAnalytics@be5a.reportEnterB2CChatToServer$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
