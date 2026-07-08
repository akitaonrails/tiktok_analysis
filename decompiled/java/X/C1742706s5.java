package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.mob.IMLandingMsgPerfAnalytics$reportLandingMsgPerf$1", f = "IMLandingMsgPerfAnalytics.kt", l = {75}, m = "invokeSuspend")
public final class C1742706s5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1743206sA LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742706s5(C1743206sA c1743206sA, long j, InterfaceC1364105Vn<? super C1742706s5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1743206sA;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742706s5(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int errorCode;
        String str;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C0XIR c0xir;
        String singleChatFromUserId;
        String enterFromForMob;
        String enterMethod;
        Map map;
        C1C7U.LIZ("IMLandingMsgPerfAnalytics@da0e.reportLandingMsgPerf$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Map map2 = (Map) this.LL;
                C155000ia.LIZIZ(obj);
                map = map2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1742806s6 c1742806s6 = this.LLILLL.LIZ;
            if (c1742806s6 != null) {
                long j = this.LLILZ;
                long j2 = c1742806s6.LIZ;
                C1670506gR.LIZ.getClass();
                long j3 = C1670506gR.LIZJ;
                long j4 = j2 - j3;
                long j5 = c1742806s6.LIZIZ - j3;
                long j6 = j - j3;
                long j7 = j - C1670506gR.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Exception exc = c1742806s6.LJII;
                String str2 = "";
                if (exc == null) {
                    C909290Zln c909290Zln = c1742806s6.LIZLLL;
                    if (c909290Zln == null || (enterFromForMob = c909290Zln.getEnterFromForMob()) == null) {
                        enterFromForMob = "";
                    }
                    linkedHashMap.put("enter_from", enterFromForMob);
                    C909290Zln c909290Zln2 = c1742806s6.LIZLLL;
                    if (c909290Zln2 == null || (enterMethod = c909290Zln2.getEnterMethod()) == null) {
                        enterMethod = "";
                    }
                    linkedHashMap.put("enter_method", enterMethod);
                    linkedHashMap.put("duration_for_click_entry", String.valueOf(j7));
                    linkedHashMap.put("total_duration", String.valueOf(j6));
                    linkedHashMap.put("start_fetch_duration", String.valueOf(j4));
                    linkedHashMap.put("finish_fetch_duration", String.valueOf(j5));
                    linkedHashMap.put("has_data", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(c1742806s6.LIZJ))));
                    EnumC1001040c9m enumC1001040c9m = c1742806s6.LJ;
                    if (enumC1001040c9m != null) {
                        linkedHashMap.put("preload_type", enumC1001040c9m.getKey());
                    }
                    linkedHashMap.put("is_preload_success", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(c1742806s6.LJFF))));
                    C909290Zln c909290Zln3 = c1742806s6.LIZLLL;
                    if (c909290Zln3 != null) {
                        linkedHashMap.put("traffic_type", c909290Zln3.getTrafficType());
                    }
                    String str3 = c1742806s6.LJI;
                    if (str3 != null) {
                        linkedHashMap.put("set_by", str3);
                    }
                } else {
                    Object rawResponse = null;
                    if ((exc instanceof C0XIR) && (c0xir = (C0XIR) exc) != null) {
                        errorCode = c0xir.getErrorCode();
                        rawResponse = c0xir.getRawResponse();
                    } else {
                        errorCode = -1;
                    }
                    if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (serverTimeExtra = baseResponse.extra) == null || (str = serverTimeExtra.logid) == null) {
                        str = "";
                    }
                    linkedHashMap.put("error_code", String.valueOf(errorCode));
                    linkedHashMap.put("log_id", str);
                }
                IIMChatAnalytics.LIZ.getClass();
                IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
                map = linkedHashMap;
                if (iIMChatAnalyticsLIZ != null) {
                    C909290Zln c909290Zln4 = c1742806s6.LIZLLL;
                    if (c909290Zln4 != null && (singleChatFromUserId = c909290Zln4.getSingleChatFromUserId()) != null) {
                        str2 = singleChatFromUserId;
                    }
                    this.LL = linkedHashMap;
                    this.LLILLJJLI = 1;
                    Object objLJI = iIMChatAnalyticsLIZ.LJI(str2, linkedHashMap, this);
                    map = linkedHashMap;
                    if (objLJI == objLJFF) {
                        C1C7U.LIZIZ("IMLandingMsgPerfAnalytics@da0e.reportLandingMsgPerf$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMLandingMsgPerfAnalytics@da0e.reportLandingMsgPerf$1");
            return unit;
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_landing_message_perf", map);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMLandingMsgPerfAnalytics@da0e.reportLandingMsgPerf$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
