package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.analytics.B2CActionBarAnalyticsDelegate$reportActionBarPerf$1", f = "B2CActionBarAnalyticsDelegate.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1745006sS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1745106sT LLILZ;
    public final /* synthetic */ Exception LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745006sS(long j, C1745106sT c1745106sT, Exception exc, InterfaceC1364105Vn<? super C1745006sS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c1745106sT;
        this.LLILZIL = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745006sS(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String singleChatFromUserId;
        int errorCode;
        String str;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C0XIR c0xir;
        Map map;
        C1C7U.LIZ("B2CActionBarAnalyticsDelegate@21b7.reportActionBarPerf$1");
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
            long j = this.LLILLL;
            C1670506gR.LIZ.getClass();
            long j2 = j - C1670506gR.LIZIZ;
            long j3 = this.LLILLL - C1670506gR.LIZJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1745106sT c1745106sT = this.LLILZ;
            Exception exc = this.LLILZIL;
            linkedHashMap.put("total_duration", String.valueOf(j3));
            linkedHashMap.put("hit_cache", String.valueOf(c1745106sT.LIZIZ));
            boolean z2 = false;
            if (exc == null) {
                z = false;
            } else {
                z = true;
            }
            linkedHashMap.put("has_data", String.valueOf(C308560C7q.LIZ(z)));
            if (exc == null) {
                z2 = true;
            }
            linkedHashMap.put("success", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(z2))));
            String str2 = "";
            if (exc != null) {
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
            linkedHashMap.put("duration_for_click_entry", String.valueOf(j2));
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            map = linkedHashMap;
            if (iIMChatAnalyticsLIZ != null) {
                SessionInfo sessionInfo = c1745106sT.LIZ;
                if (sessionInfo != null && (singleChatFromUserId = sessionInfo.getSingleChatFromUserId()) != null) {
                    str2 = singleChatFromUserId;
                }
                this.LL = linkedHashMap;
                this.LLILLJJLI = 1;
                Object objLJI = iIMChatAnalyticsLIZ.LJI(str2, linkedHashMap, this);
                map = linkedHashMap;
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("B2CActionBarAnalyticsDelegate@21b7.reportActionBarPerf$1");
                    return objLJFF;
                }
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_b2c_action_bar_perf", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("B2CActionBarAnalyticsDelegate@21b7.reportActionBarPerf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
