package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgRespV2;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.landing.mob.SuggestQuestionBannerPerformanceMobAnalyticsDelegate$reportSuggestQuestionBannerPerf$1", f = "SuggestQuestionBannerPerformanceMobAnalyticsDelegate.kt", l = {58}, m = "invokeSuspend")
public final class C1742606s4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1742506s3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742606s4(long j, C1742506s3 c1742506s3, InterfaceC1364105Vn<? super C1742606s4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c1742506s3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742606s4(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        String str;
        Map mapLJIIJ;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C1C7U.LIZ("SuggestQuestionBannerPerformanceMobAnalyticsDelegate@1e24.reportSuggestQuestionBannerPerf$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 == 1) {
                mapLJIIJ = (Map) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1670506gR.LIZ.getClass();
            long j = C1670506gR.LIZJ;
            long j2 = C1670506gR.LIZIZ;
            long j3 = this.LLILLL;
            long j4 = j3 - j;
            long j5 = j3 - j2;
            C1742506s3 c1742506s3 = this.LLILZ;
            long j6 = c1742506s3.LIZIZ - j;
            long j7 = c1742506s3.LIZJ - j;
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("total_duration", String.valueOf(j4));
            BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV2 = this.LLILZ.LIZ;
            if (businessChatLandingMsgRespV2 != null && businessChatLandingMsgRespV2.extra != null) {
                z = true;
            } else {
                z = false;
            }
            pairArr[1] = new Pair("has_data", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(z))));
            BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV22 = this.LLILZ.LIZ;
            if (businessChatLandingMsgRespV22 != null) {
                i = businessChatLandingMsgRespV22.status_code;
            } else {
                i = 0;
            }
            pairArr[2] = new Pair("request_error_code", String.valueOf(i));
            pairArr[3] = new Pair("start_fetch_duration", String.valueOf(j6));
            pairArr[4] = new Pair("finish_fetch_duration", String.valueOf(j7));
            pairArr[5] = new Pair("duration_for_click_entry", String.valueOf(j5));
            BusinessChatLandingMsgRespV2 businessChatLandingMsgRespV23 = this.LLILZ.LIZ;
            String str2 = "";
            if (businessChatLandingMsgRespV23 == null || (serverTimeExtra = businessChatLandingMsgRespV23.extra) == null || (str = serverTimeExtra.logid) == null) {
                str = "";
            }
            pairArr[6] = new Pair("log_id", str);
            mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            C1742506s3 c1742506s32 = this.LLILZ;
            EnumC1001040c9m enumC1001040c9m = c1742506s32.LIZLLL;
            if (enumC1001040c9m != null) {
                mapLJIIJ.put("preload_type", enumC1001040c9m.getKey());
            }
            mapLJIIJ.put("is_preload_success", String.valueOf(C308560C7q.LIZ(Boolean.valueOf(c1742506s32.LJ))));
            String str3 = c1742506s32.LJI;
            if (str3 != null && str3.length() > 0) {
                mapLJIIJ.put("set_by", str3);
            }
            IIMChatAnalytics.LIZ.getClass();
            IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
            if (iIMChatAnalyticsLIZ != null) {
                String str4 = this.LLILZ.LJFF;
                if (str4 != null) {
                    str2 = str4;
                }
                this.LL = mapLJIIJ;
                this.LLILLJJLI = 1;
                if (iIMChatAnalyticsLIZ.LJI(str2, mapLJIIJ, this) == objLJFF) {
                    C1C7U.LIZIZ("SuggestQuestionBannerPerformanceMobAnalyticsDelegate@1e24.reportSuggestQuestionBannerPerf$1");
                    return objLJFF;
                }
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_suggest_question_banner_perf", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestQuestionBannerPerformanceMobAnalyticsDelegate@1e24.reportSuggestQuestionBannerPerf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
