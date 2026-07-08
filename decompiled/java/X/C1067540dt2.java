package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GameAttrInfo;
import com.ss.android.ugc.aweme.feed.model.GameAttrReportThreshold;
import com.ss.android.ugc.aweme.feed.model.GamePartnership;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.GameLivePartnershipPoiAnchorMakerDelegate$startViewAttributionTimer$1", f = "GameLivePartnershipPoiAnchorMakerDelegate.kt", l = {460}, m = "invokeSuspend")
public final class C1067540dt2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1067520dt0 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ GameAttrReportThreshold LLILZIL;
    public final /* synthetic */ GameAttrInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067540dt2(int i, C1067520dt0 c1067520dt0, String str, GameAttrReportThreshold gameAttrReportThreshold, GameAttrInfo gameAttrInfo, InterfaceC1364105Vn<? super C1067540dt2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1067520dt0;
        this.LLILZ = str;
        this.LLILZIL = gameAttrReportThreshold;
        this.LLILZLL = gameAttrInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1067540dt2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        Object objLJFF;
        StandardBusinessModel standardBusinessModel2;
        GamePartnership gamePartnership2;
        C1C7U.LIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startViewAttributionTimer$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF2) {
                C1C7U.LIZIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startViewAttributionTimer$1");
                return objLJFF2;
            }
        }
        Aweme awemeLIZJ = this.LLILLL.LIZJ();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        Object objLJFF3 = "";
        if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
            JSONObject jSONObject = new JSONObject();
            C1067520dt0 c1067520dt0 = this.LLILLL;
            String str = this.LLILZ;
            GameAttrReportThreshold gameAttrReportThreshold = this.LLILZIL;
            jSONObject.put("type", "vta");
            jSONObject.put("step", "trigger_report");
            jSONObject.put("touch_point", 2);
            jSONObject.put("enter_from", c1067520dt0.LIZ.LJIJJLI());
            String aid = awemeLIZJ.getAid();
            if (aid == null) {
                aid = "";
            }
            jSONObject.put("item_id", aid);
            jSONObject.put("game_id", String.valueOf(str));
            jSONObject.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
            ContentModel contentModel = awemeLIZJ.getContentModel();
            if (contentModel == null || (standardBusinessModel2 = contentModel.standardBusinessModel) == null || (gamePartnership2 = standardBusinessModel2.getGamePartnership()) == null) {
                objLJFF = "";
            } else {
                objLJFF = C2286608xc.LJFF(gamePartnership2.publisherTaskId);
            }
            jSONObject.put("task_id", objLJFF);
            jSONObject.put("threshold_duration", gameAttrReportThreshold.viewThresholdDuration);
            interfaceC20673515v3K42.LJIL(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        GameAttrInfo gameAttrInfo = this.LLILZLL;
        C1067520dt0 c1067520dt02 = this.LLILLL;
        GameAttrReportThreshold gameAttrReportThreshold2 = this.LLILZIL;
        String str2 = this.LLILZ;
        jSONObject2.put("report_url", gameAttrInfo.viewThroughUrl);
        String str3 = gameAttrInfo.domain;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject2.put("domain", str3);
        String str4 = gameAttrInfo.commonParams;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject2.put("common_params", str4);
        jSONObject2.put("enter_from", c1067520dt02.LIZ.LJIJJLI());
        String aid2 = awemeLIZJ.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        jSONObject2.put("item_id", aid2);
        jSONObject2.put("threshold_duration", gameAttrReportThreshold2.viewThresholdDuration);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put("game_id", str2);
        jSONObject2.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
        ContentModel contentModel2 = awemeLIZJ.getContentModel();
        if (contentModel2 != null && (standardBusinessModel = contentModel2.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null) {
            objLJFF3 = C2286608xc.LJFF(gamePartnership.publisherTaskId);
        }
        jSONObject2.put("task_id", objLJFF3);
        jSONObject2.put("promote_ad_type", String.valueOf(AwemeExtKt.getPromoteAdTypeForReport(awemeLIZJ)));
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
            interfaceC20673515v3K4.LJZ(2, 1, jSONObject2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startViewAttributionTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
