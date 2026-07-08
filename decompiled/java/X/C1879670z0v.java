package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.model.ReportThreshold;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageHost$startClickAttributionTimer$1", f = "GameDetailMixPageHost.kt", l = {1178}, m = "invokeSuspend")
public final class C1879670z0v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ReportThreshold LLILLL;
    public final /* synthetic */ C1881590z41 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879670z0v(int i, ReportThreshold reportThreshold, C1881590z41 c1881590z41, InterfaceC1364105Vn<? super C1879670z0v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = reportThreshold;
        this.LLILZ = c1881590z41;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879670z0v(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("GameDetailMixPageHost@9f5f.startClickAttributionTimer$1");
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
                C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.startClickAttributionTimer$1");
                return objLJFF;
            }
        }
        JSONObject jSONObject = new JSONObject();
        C1881590z41 c1881590z41 = this.LLILZ;
        ReportThreshold reportThreshold = this.LLILLL;
        jSONObject.put(Scene.SCENE_SERVICE, c1881590z41.LLJLIL);
        jSONObject.put("enter_from", C1882380z5I.LJFF(c1881590z41.LJII(), "enter_from"));
        jSONObject.put("item_id", C1882380z5I.LJFF(c1881590z41.LJII(), "item_id"));
        jSONObject.put("game_id", C1882380z5I.LJFF(c1881590z41.LJII(), "game_id"));
        jSONObject.put("creator_id", C1882380z5I.LJFF(c1881590z41.LJII(), "author_id"));
        jSONObject.put("task_id", C1882380z5I.LJFF(c1881590z41.LJII(), "task_id"));
        jSONObject.put("threshold_duration", reportThreshold.clickThresholdDuration);
        jSONObject.put("promote_ad_type", C1882380z5I.LJFF(c1881590z41.LJII(), "promote_ad_type"));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
        c474500IjALIZ.LJJII("trigger_report", "step");
        c474500IjALIZ.LJJII("evta", "type");
        c474500IjALIZ.LJJII(C2286608xc.LJ(4), "touch_point");
        c474500IjALIZ.LJJII(C2286608xc.LJ(this.LLILLL.clickThresholdDuration), "threshold_duration");
        c474500IjALIZ.LJJIIJZLJL(this.LLILZ.LJIL());
        c474500IjALIZ.LIZ();
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && iGamePartnershipService.Je0() != null) {
            C843920X8s.LIZLLL(4, 2, jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.startClickAttributionTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
