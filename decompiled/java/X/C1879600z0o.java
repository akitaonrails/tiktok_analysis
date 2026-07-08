package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.model.GameAttrReportThreshold;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.TaskAttributionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.partnership.ToolbarAudiencePartnershipBehavior$startViewAttributionTimer$1", f = "ToolbarAudiencePartnershipBehavior.kt", l = {469}, m = "invokeSuspend")
public final class C1879600z0o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ GameAttrReportThreshold LLILLL;
    public final /* synthetic */ C1878450yyx LLILZ;
    public final /* synthetic */ PartnershipTask LLILZIL;
    public final /* synthetic */ TaskAttributionInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879600z0o(int i, GameAttrReportThreshold gameAttrReportThreshold, C1878450yyx c1878450yyx, PartnershipTask partnershipTask, TaskAttributionInfo taskAttributionInfo, InterfaceC1364105Vn<? super C1879600z0o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = gameAttrReportThreshold;
        this.LLILZ = c1878450yyx;
        this.LLILZIL = partnershipTask;
        this.LLILZLL = taskAttributionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879600z0o(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String string;
        String string2;
        String string3;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        String string4;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor2;
        C1C7U.LIZ("ToolbarAudiencePartnershipBehavior@e33b.startViewAttributionTimer$1");
        Object objLJFF = C099R.LJFF();
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
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ToolbarAudiencePartnershipBehavior@e33b.startViewAttributionTimer$1");
                return objLJFF;
            }
        }
        JSONObject jSONObject = new JSONObject();
        TaskAttributionInfo taskAttributionInfo = this.LLILZLL;
        C1878450yyx c1878450yyx = this.LLILZ;
        GameAttrReportThreshold gameAttrReportThreshold = this.LLILLL;
        PartnershipTask partnershipTask = this.LLILZIL;
        jSONObject.put("report_url", taskAttributionInfo.viewThroughUrl);
        jSONObject.put("domain", taskAttributionInfo.domain);
        jSONObject.put("common_params", taskAttributionInfo.commonParams);
        Room room = c1878450yyx.LLILZLL;
        String str = "";
        if (room == null || (string = C2286608xc.LJFF(room.getId()).toString()) == null) {
            string = "";
        }
        jSONObject.put("item_id", string);
        jSONObject.put("threshold_duration", gameAttrReportThreshold.viewThresholdDuration);
        String str2 = partnershipTask.gameIdStr;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("game_id", str2);
        String str3 = partnershipTask.idStr;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("task_id", str3);
        Room room2 = c1878450yyx.LLILZLL;
        if (room2 == null || (interfaceC2262081DgMAuthor2 = room2.author()) == null || (string2 = C2286608xc.LJFF(interfaceC2262081DgMAuthor2.getId()).toString()) == null) {
            string2 = "";
        }
        jSONObject.put("creator_id", string2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
        c474500IjALIZ.LJJII("trigger_report", "step");
        c474500IjALIZ.LJJII("vta", "type");
        c474500IjALIZ.LJJII(C2286608xc.LJ(6), "touch_point");
        c474500IjALIZ.LJJII(C2286608xc.LJ(this.LLILLL.viewThresholdDuration), "threshold_duration");
        Room room3 = this.LLILZ.LLILZLL;
        if (room3 == null || (string3 = C2286608xc.LJFF(room3.getId()).toString()) == null) {
            string3 = "";
        }
        c474500IjALIZ.LJJII(string3, "item_id");
        String str4 = this.LLILZIL.gameIdStr;
        if (str4 == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJII(str4, "game_id");
        String str5 = this.LLILZIL.idStr;
        if (str5 == null) {
            str5 = "";
        }
        c474500IjALIZ.LJJII(str5, "task_id");
        Room room4 = this.LLILZ.LLILZLL;
        if (room4 != null && (interfaceC2262081DgMAuthor = room4.author()) != null && (string4 = C2286608xc.LJFF(interfaceC2262081DgMAuthor.getId()).toString()) != null) {
            str = string4;
        }
        c474500IjALIZ.LJJII(str, "creator_id");
        c474500IjALIZ.LIZ();
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && iGamePartnershipService.Je0() != null) {
            C843920X8s.LIZLLL(6, 1, jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarAudiencePartnershipBehavior@e33b.startViewAttributionTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
