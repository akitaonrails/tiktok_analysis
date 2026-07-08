package X;

import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMeaningfulMonitorNewStandardSettings;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.MallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758210vr1 {
    public final String LIZ;
    public HashMap<String, Object> LIZJ;
    public List<C1758260vr6> LIZLLL;
    public String LJFF;
    public EnumC1758240vr4 LIZIZ = EnumC1758240vr4.LAUNCH;
    public long LJ = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public EnumC1756020vnU LJIIIZ = EnumC1756020vnU.UNDEFINE;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public long LJIIL = -1;
    public long LJIILIIL = -1;

    public final void LIZ() {
        long j = this.LJ;
        if (j == -1) {
            long j2 = this.LJI;
            if (j2 != -1) {
                this.LJ = j2;
                this.LIZIZ = EnumC1758240vr4.INTERCEPTOR;
            }
        } else if (this.LJI == -1 && j != -1) {
            this.LJI = j;
        }
        if (this.LJII == -1 && LIZIZ()) {
            this.LJII = this.LJIIIIZZ;
        }
        long j3 = this.LJII;
        long j4 = this.LJIIIIZZ;
        if (j3 > j4) {
            this.LJII = j4;
        }
    }

    public final boolean LIZIZ() {
        return this.LJIIIIZZ != -1;
    }

    public final void LJFF() throws JSONException {
        Object obj;
        HashMap<String, Object> map = this.LIZJ;
        Object obj2 = map != null ? map.get("previous_page") : null;
        HashMap<String, Object> map2 = this.LIZJ;
        Object obj3 = map2 != null ? map2.get("entrance_form") : null;
        HashMap<String, Object> map3 = this.LIZJ;
        Object obj4 = map3 != null ? map3.get("enter_from_info") : null;
        HashMap<String, Object> map4 = this.LIZJ;
        if (map4 == null || (obj = map4.get("biz_type")) == null) {
            obj = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rd_tiktokec_meaningful_duration_");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_duration", this.LJIIIIZZ - this.LJII);
        jSONObject.put("render_duration", this.LJIIJ - this.LJIIIIZZ);
        jSONObject.put("duration", System.currentTimeMillis() - this.LJ);
        jSONObject.put("page_name", this.LIZ);
        if (obj2 != null) {
            jSONObject.put("previous_page", obj2);
        }
        if (obj3 != null) {
            jSONObject.put("enter_from", obj3);
        }
        if (obj4 != null) {
            jSONObject.put("enter_from_info", obj4);
        }
        jSONObject.put("biz_type", obj);
        LIZJ(strLIZIZ, jSONObject);
    }

    public final void LJI() {
        Object c098200Yq;
        try {
            if (this.LJIIJ == -1 && LIZIZ()) {
                this.LJIIJ = System.currentTimeMillis();
                LIZ();
                if (!EcMeaningfulMonitorNewStandardSettings.LIZ().enable) {
                    LJII();
                } else if (EcMeaningfulMonitorNewStandardSettings.LIZ().multiReport && LIZLLL()) {
                    LJFF();
                    LJII();
                } else if (LIZLLL()) {
                    LJFF();
                } else {
                    LJII();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    public final void LJII() throws JSONException {
        Object obj;
        AnonymousClass0317 anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin;
        InterfaceC1758280vr8 interfaceC1758280vr8;
        HashMap<String, Object> map = this.LIZJ;
        Object obj2 = map != null ? map.get("previous_page") : null;
        HashMap<String, Object> map2 = this.LIZJ;
        Object obj3 = map2 != null ? map2.get("entrance_form") : null;
        HashMap<String, Object> map3 = this.LIZJ;
        Object obj4 = map3 != null ? map3.get("enter_from_info") : null;
        HashMap<String, Object> map4 = this.LIZJ;
        if (map4 == null || (obj = map4.get("biz_type")) == null) {
            obj = "";
        }
        HashMap<String, Object> map5 = this.LIZJ;
        Object obj5 = map5 != null ? map5.get("source_page_type") : null;
        HashMap<String, Object> map6 = this.LIZJ;
        Object obj6 = map6 != null ? map6.get("sku_num") : null;
        HashMap<String, Object> map7 = this.LIZJ;
        Object obj7 = map7 != null ? map7.get("checkout_type") : null;
        HashMap<String, Object> map8 = this.LIZJ;
        Object obj8 = map8 != null ? map8.get("click_from") : null;
        HashMap<String, Object> map9 = this.LIZJ;
        Object obj9 = map9 != null ? map9.get("node_count") : null;
        HashMap<String, Object> map10 = this.LIZJ;
        Object obj10 = map10 != null ? map10.get("node_list") : null;
        HashMap<String, Object> map11 = this.LIZJ;
        Object obj11 = map11 != null ? map11.get("myna_node_count") : null;
        HashMap<String, Object> map12 = this.LIZJ;
        Object obj12 = map12 != null ? map12.get("myna_node_list") : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("init_stage_cost", this.LJII - this.LJ);
        jSONObject.put("data_mount_stage_cost", this.LJIIIIZZ - this.LJII);
        jSONObject.put("data_mount_cache_type", this.LJIIIZ.getType());
        jSONObject.put("render_stage_cost", this.LJIIJ - this.LJIIIIZZ);
        jSONObject.put("fp_cost", this.LJIIJ - this.LJ);
        jSONObject.put("start_time", this.LJ);
        jSONObject.put("page_name", this.LIZ);
        jSONObject.put("start_type", this.LIZIZ.getType());
        jSONObject.put("start_to_now", System.currentTimeMillis() - this.LJ);
        jSONObject.put("biz_type", obj);
        if (obj2 != null) {
            jSONObject.put("previous_page", obj2);
        }
        if (obj3 != null) {
            jSONObject.put("enter_from", obj3);
        }
        if (obj4 != null) {
            jSONObject.put("enter_from_info", obj4);
        }
        if (obj5 != null) {
            jSONObject.put("source_page_type", obj5);
        }
        if (obj6 != null) {
            jSONObject.put("sku_num", obj6);
        }
        if (obj7 != null) {
            jSONObject.put("checkout_type", obj7);
        }
        if (obj8 != null) {
            jSONObject.put("click_from", obj8);
        }
        if (obj9 != null) {
            jSONObject.put("node_count", obj9);
        }
        if (obj10 != null) {
            jSONObject.put("node_list", obj10);
        }
        if (obj11 != null) {
            jSONObject.put("myna_node_count", obj11);
        }
        if (obj12 != null) {
            jSONObject.put("myna_node_list", obj12);
        }
        LIZJ("rd_tiktokec_meaningful_rendered", jSONObject);
        if (Intrinsics.LJFF(this.LIZ, "product_detail") && (interfaceC1758280vr8 = (InterfaceC1758280vr8) PluggableExtentionKt.pluggableSpi$default(InterfaceC1758280vr8.class, false, false, false, 14, null)) != null) {
            interfaceC1758280vr8.LIZ();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = MallLandingPerfTrackerDependencyService.createIMallLandingPerfTrackerDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IMallLandingPerfTrackerDependencyService.class.getName(), anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IMallLandingPerfTrackerDependencyService.class);
        }
        ((IMallLandingPerfTrackerDependencyService) anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin).onLandingFinished(this.LJFF, "rd_tiktokec_meaningful_rendered", C051S.LIZJ(jSONObject), 2);
    }

    public final void LJIIIIZZ() throws JSONException {
        Object obj;
        HashMap<String, Object> map = this.LIZJ;
        Object obj2 = map != null ? map.get("previous_page") : null;
        HashMap<String, Object> map2 = this.LIZJ;
        Object obj3 = map2 != null ? map2.get("entrance_form") : null;
        HashMap<String, Object> map3 = this.LIZJ;
        Object obj4 = map3 != null ? map3.get("enter_from_info") : null;
        HashMap<String, Object> map4 = this.LIZJ;
        if (map4 == null || (obj = map4.get("biz_type")) == null) {
            obj = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rd_tiktokec_full_page_meaningful_duration_");
        sbLIZ.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_duration", this.LJIIIIZZ - this.LJII);
        jSONObject.put("render_duration", this.LJIIJ - this.LJIIIIZZ);
        jSONObject.put("duration", this.LJIIJ - this.LJ);
        jSONObject.put("full_page_render_duration", this.LJIILIIL - this.LJIIL);
        jSONObject.put("full_data_api_duration", this.LJIIL - this.LJII);
        jSONObject.put("full_page_duration", System.currentTimeMillis() - this.LJ);
        jSONObject.put("page_name", this.LIZ);
        if (obj2 != null) {
            jSONObject.put("previous_page", obj2);
        }
        if (obj3 != null) {
            jSONObject.put("enter_from", obj3);
        }
        if (obj4 != null) {
            jSONObject.put("enter_from_info", obj4);
        }
        jSONObject.put("biz_type", obj);
        LIZJ(strLIZIZ, jSONObject);
    }

    public final void LJIIIZ() {
        Object c098200Yq;
        try {
            if (this.LJIILIIL == -1 && this.LJIIL != -1) {
                this.LJIILIIL = System.currentTimeMillis();
                LIZ();
                if (!EcMeaningfulMonitorNewStandardSettings.LIZ().enable) {
                    LJIIJ();
                } else if (EcMeaningfulMonitorNewStandardSettings.LIZ().multiReport && LIZLLL()) {
                    LJIIIIZZ();
                    LJIIJ();
                } else if (LIZLLL()) {
                    LJIIIIZZ();
                } else {
                    LJIIJ();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    public final void LJIIJ() throws JSONException {
        Object obj;
        HashMap<String, Object> map = this.LIZJ;
        Object obj2 = map != null ? map.get("previous_page") : null;
        HashMap<String, Object> map2 = this.LIZJ;
        Object obj3 = map2 != null ? map2.get("entrance_form") : null;
        HashMap<String, Object> map3 = this.LIZJ;
        Object obj4 = map3 != null ? map3.get("enter_from_info") : null;
        HashMap<String, Object> map4 = this.LIZJ;
        if (map4 == null || (obj = map4.get("biz_type")) == null) {
            obj = "";
        }
        HashMap<String, Object> map5 = this.LIZJ;
        Object obj5 = map5 != null ? map5.get("source_page_type") : null;
        HashMap<String, Object> map6 = this.LIZJ;
        Object obj6 = map6 != null ? map6.get("sku_num") : null;
        HashMap<String, Object> map7 = this.LIZJ;
        Object obj7 = map7 != null ? map7.get("checkout_type") : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("init_stage_cost", this.LJII - this.LJ);
        jSONObject.put("data_mount_stage_cost", this.LJIIIIZZ - this.LJII);
        jSONObject.put("data_mount_cache_type", this.LJIIIZ.getType());
        jSONObject.put("render_stage_cost", this.LJIIJ - this.LJIIIIZZ);
        jSONObject.put("fp_cost", this.LJIIJ - this.LJ);
        jSONObject.put("full_data_mount_stage_cost", this.LJIIL - this.LJII);
        jSONObject.put("full_page_render_stage_cost", this.LJIILIIL - this.LJIIL);
        jSONObject.put("full_page_fp_cost", this.LJIILIIL - this.LJ);
        jSONObject.put("start_to_now", System.currentTimeMillis() - this.LJ);
        jSONObject.put("start_time", this.LJ);
        jSONObject.put("page_name", this.LIZ);
        jSONObject.put("start_type", this.LIZIZ.getType());
        jSONObject.put("biz_type", obj);
        if (obj2 != null) {
            jSONObject.put("previous_page", obj2);
        }
        if (obj3 != null) {
            jSONObject.put("enter_from", obj3);
        }
        if (obj4 != null) {
            jSONObject.put("enter_from_info", obj4);
        }
        if (obj5 != null) {
            jSONObject.put("source_page_type", obj5);
        }
        if (obj6 != null) {
            jSONObject.put("sku_num", obj6);
        }
        if (obj7 != null) {
            jSONObject.put("checkout_type", obj7);
        }
        LIZJ("rd_tiktokec_full_page_meaningful_rendered", jSONObject);
    }

    public final boolean LIZLLL() {
        return EcMeaningfulMonitorNewStandardSettings.LIZ().enable && EcMeaningfulMonitorNewStandardSettings.LIZ().useNewEvent.contains(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PagePerfInfo(pageName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', launch=");
        sbLIZ.append(this.LJI - this.LJ);
        sbLIZ.append(", create=");
        sbLIZ.append(this.LJII - this.LJI);
        sbLIZ.append(", render=");
        sbLIZ.append(this.LJIIJ - this.LJIIIIZZ);
        sbLIZ.append(", mounted=");
        sbLIZ.append(this.LJIIIIZZ - this.LJII);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LJIIJ - this.LJ);
        sbLIZ.append(", start_type: ");
        sbLIZ.append(this.LIZIZ.name());
        sbLIZ.append(", cache_type: ");
        sbLIZ.append(this.LJIIIZ.name());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1758210vr1(String str) {
        this.LIZ = str;
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_perf_async_report", false)) {
            try {
                String strLIZLLL = C1280004ze.LIZLLL(jSONObject);
                if (strLIZLLL == null) {
                    return;
                }
                C1018703yb.LJFF(str, new JSONObject(strLIZLLL));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    public final void LJ(final Function0<Unit> function0, final Function0<Unit> function02) {
        if (EcMeaningfulMonitorNewStandardSettings.LIZ().enable) {
            C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: X.0vr3
                public int LL;
                public final /* synthetic */ C1758210vr1 LLILLL;

                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    int iIntValue;
                    int i = this.LL + 1;
                    this.LL = i;
                    Integer num = EcMeaningfulMonitorNewStandardSettings.LIZ().endFrameFp;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (i >= iIntValue - 1) {
                        Function0<Unit> function03 = function0;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        this.LLILLL.LJI();
                        Function0<Unit> function04 = function02;
                        if (function04 != null) {
                            function04.invoke();
                            return;
                        }
                        return;
                    }
                    C786410Ut5.v2().postFrameCallback(this);
                }

                {
                    this.LLILLL = this;
                    System.currentTimeMillis();
                }
            });
            return;
        }
        if (function0 != null) {
            function0.invoke();
        }
        LJI();
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }

    public final void LJIIJJI(String str, Long l, HashMap map) {
        Object c098200Yq;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        try {
            if (this.LJI == -1) {
                if (map != null && this.LIZJ == null) {
                    this.LIZJ = new HashMap<>(map);
                }
                if (l != null && l.longValue() > 0) {
                    this.LJI = l.longValue();
                } else {
                    this.LJI = System.currentTimeMillis();
                }
                LIZ();
                HashMap<String, Object> map2 = this.LIZJ;
                Object obj6 = null;
                if (map2 == null) {
                    obj = null;
                } else {
                    obj = map2.get("previous_page");
                }
                HashMap<String, Object> map3 = this.LIZJ;
                if (map3 != null) {
                    obj2 = map3.get("entrance_form");
                } else {
                    obj2 = null;
                }
                HashMap<String, Object> map4 = this.LIZJ;
                if (map4 == null) {
                    obj3 = null;
                } else {
                    obj3 = map4.get("enter_from_info");
                }
                HashMap<String, Object> map5 = this.LIZJ;
                if (map5 == null) {
                    obj4 = null;
                } else {
                    obj4 = map5.get("start_to_now");
                }
                HashMap<String, Object> map6 = this.LIZJ;
                if (map6 != null) {
                    obj6 = map6.get("source_page_type");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_name", this.LIZ);
                if (C770702zh.LIZIZ(str)) {
                    jSONObject.put("subpage_name", str);
                }
                jSONObject.put("start_type", this.LIZIZ.getType());
                if (obj != null) {
                    jSONObject.put("previous_page", obj);
                }
                if (obj2 != null) {
                    jSONObject.put("enter_from", obj2);
                }
                if (obj3 != null) {
                    jSONObject.put("enter_from_info", obj3);
                }
                if (obj4 != null) {
                    jSONObject.put("start_to_now", obj4);
                }
                if (obj6 != null) {
                    jSONObject.put("source_page_type", obj6);
                }
                HashMap<String, Object> map7 = this.LIZJ;
                if (map7 != null && (obj5 = map7.get("is_self")) != null) {
                    jSONObject.put("is_self", obj5);
                }
                LIZJ("rd_tiktokec_meaningful_intercept", jSONObject);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }
}
