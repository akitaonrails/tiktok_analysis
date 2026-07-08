package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
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

/* JADX INFO: renamed from: X.0dt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.GameLivePartnershipPoiAnchorMakerDelegate$startClickAttributionTimer$1", f = "GameLivePartnershipPoiAnchorMakerDelegate.kt", l = {514}, m = "invokeSuspend")
public final class C1067530dt1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1067520dt0 LLILLL;
    public final /* synthetic */ GameAttrReportThreshold LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067530dt1(int i, C1067520dt0 c1067520dt0, GameAttrReportThreshold gameAttrReportThreshold, InterfaceC1364105Vn<? super C1067530dt1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1067520dt0;
        this.LLILZ = gameAttrReportThreshold;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1067530dt1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String schema;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        Object objLJFF;
        StandardBusinessModel standardBusinessModel2;
        GamePartnership gamePartnership2;
        C1C7U.LIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startClickAttributionTimer$1");
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
                C1C7U.LIZIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startClickAttributionTimer$1");
                return objLJFF2;
            }
        }
        Aweme awemeLIZJ = this.LLILLL.LIZJ();
        AnchorCommonStruct anchorCommonStruct = this.LLILLL.LIZ.LLIZ;
        Object objLJFF3 = "";
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            schema = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(schema), "game_id");
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K42 = iLiveOuterService.k4()) != null) {
            JSONObject jSONObject = new JSONObject();
            C1067520dt0 c1067520dt0 = this.LLILLL;
            GameAttrReportThreshold gameAttrReportThreshold = this.LLILZ;
            jSONObject.put("type", "evta");
            jSONObject.put("step", "trigger_report");
            jSONObject.put("touch_point", 2);
            jSONObject.put("enter_from", c1067520dt0.LIZ.LJIJJLI());
            String aid = awemeLIZJ.getAid();
            if (aid == null) {
                aid = "";
            }
            jSONObject.put("item_id", aid);
            jSONObject.put("game_id", String.valueOf(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
            jSONObject.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
            ContentModel contentModel = awemeLIZJ.getContentModel();
            if (contentModel == null || (standardBusinessModel2 = contentModel.standardBusinessModel) == null || (gamePartnership2 = standardBusinessModel2.getGamePartnership()) == null) {
                objLJFF = "";
            } else {
                objLJFF = C2286608xc.LJFF(gamePartnership2.publisherTaskId);
            }
            jSONObject.put("task_id", objLJFF);
            jSONObject.put("threshold_duration", gameAttrReportThreshold.clickThresholdDuration);
            interfaceC20673515v3K42.LJIL(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        C1067520dt0 c1067520dt02 = this.LLILLL;
        GameAttrReportThreshold gameAttrReportThreshold2 = this.LLILZ;
        jSONObject2.put("enter_from", c1067520dt02.LIZ.LJIJJLI());
        String aid2 = awemeLIZJ.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        jSONObject2.put("item_id", aid2);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        jSONObject2.put("game_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        jSONObject2.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
        ContentModel contentModel2 = awemeLIZJ.getContentModel();
        if (contentModel2 != null && (standardBusinessModel = contentModel2.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null) {
            objLJFF3 = C2286608xc.LJFF(gamePartnership.publisherTaskId);
        }
        jSONObject2.put("task_id", objLJFF3);
        jSONObject2.put("threshold_duration", gameAttrReportThreshold2.clickThresholdDuration);
        jSONObject2.put("log_extra", c1067520dt02.LIZIZ.invoke());
        jSONObject2.put("promote_ad_type", String.valueOf(AwemeExtKt.getPromoteAdTypeForReport(awemeLIZJ)));
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null && (interfaceC20673515v3K4 = iLiveOuterService2.k4()) != null) {
            interfaceC20673515v3K4.LJZ(2, 2, jSONObject2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameLivePartnershipPoiAnchorMakerDelegate@1d8.startClickAttributionTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
