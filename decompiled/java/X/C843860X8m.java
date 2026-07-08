package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipNewAttributionConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.utils.GameAttributionReportHelper$reportC2SIfNecessary$1", f = "GameAttributionReportHelper.kt", l = {}, m = "invokeSuspend")
public final class C843860X8m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843860X8m(String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, String str9, InterfaceC1364105Vn<? super C843860X8m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = i2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i3;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = str8;
        this.LLJILJILJ = str9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C843860X8m c843860X8m = new C843860X8m(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c843860X8m.LL = obj;
        return c843860X8m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Long lLJIILIIL;
        String str;
        C1C7U.LIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        JSONObject jSONObject = new JSONObject();
        int i = this.LLILLL;
        int i2 = this.LLJ;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLJI;
        String str4 = this.LLILZ;
        String str5 = this.LLJIJIL;
        String str6 = this.LLJILJIL;
        jSONObject.put("type", "vta");
        jSONObject.put("touch_point", i);
        jSONObject.put("threshold_duration", i2);
        jSONObject.put("enter_from", str2);
        jSONObject.put("game_id", str3);
        jSONObject.put("item_id", str4);
        jSONObject.put("creator_id", str5);
        jSONObject.put("task_id", str6);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
        c474500IjALIZ.LJJII("duplication_begin", "step");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('-');
        sbLIZ.append(this.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[reportC2SIfNecessary] key=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", scene=");
        sbLIZ2.append(this.LLILZIL);
        sbLIZ2.append(", tp=");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(", ef=");
        sbLIZ2.append(this.LLILLJJLI);
        sbLIZ2.append(", itemId=");
        sbLIZ2.append(this.LLILZ);
        sbLIZ2.append(", trackingUrl=");
        sbLIZ2.append(this.LLILZLL);
        sbLIZ2.append(", domain=");
        sbLIZ2.append(this.LLIZ);
        sbLIZ2.append(", params=");
        sbLIZ2.append(this.LLIZLLLIL);
        C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ2));
        C01GW c01gw = C843880X8o.LIZ;
        if (((C823180WQy) c01gw.getValue()).contains(strLIZIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[reportC2SIfNecessary] ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" is in progress, skip this report");
            C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ3));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_exception");
            c474500IjALIZ2.LJJII(C2286608xc.LJ(104), "code");
            c474500IjALIZ2.LJJII("ignore because of in progress", "msg");
            c474500IjALIZ2.LJJIIJZLJL(jSONObject);
            c474500IjALIZ2.LIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1");
            return unit;
        }
        C0JT6<Map<String, String>> c0jt6 = InterfaceC772390URp.w0;
        int i3 = this.LLILZIL;
        int i4 = this.LLILLL;
        int i5 = this.LLJ;
        String str7 = this.LLILZ;
        String str8 = this.LLJI;
        String str9 = this.LLJILJIL;
        String str10 = this.LLJIJIL;
        String str11 = this.LLILZLL;
        String str12 = this.LLILLJJLI;
        String str13 = this.LLIZ;
        String str14 = this.LLIZLLLIL;
        String str15 = this.LLJILJILJ;
        Map<String, String> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = C2097608Jq.LJ();
        }
        HashMap map = new HashMap(mapLIZ);
        String str16 = (String) map.get(strLIZIZ);
        if (str16 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str16);
        } else {
            lLJIILIIL = null;
        }
        long j = GameLivePartnershipNewAttributionConfig.INSTANCE.getConfig().attrFrequencyLimit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lLJIILIIL != null && !C843880X8o.LIZ(lLJIILIIL.longValue(), jCurrentTimeMillis, j, TimeUnit.SECONDS)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[reportC2SIfNecessary] ");
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" is in the time interval, skip this report. LastTime=");
            sbLIZ4.append(lLJIILIIL);
            sbLIZ4.append(", currentTime=");
            sbLIZ4.append(jCurrentTimeMillis);
            sbLIZ4.append(", interval=");
            sbLIZ4.append(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            sbLIZ4.append("ms");
            C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ4));
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_exception");
            c474500IjALIZ3.LJJII(C2286608xc.LJ(103), "code");
            c474500IjALIZ3.LJJII("ignore because of frequency limit", "msg");
            c474500IjALIZ3.LJJIIJZLJL(jSONObject);
            c474500IjALIZ3.LIZ();
        } else {
            ((C823180WQy) c01gw.getValue()).add(strLIZIZ);
            C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
            c474500IjALIZ4.LJJII("duplication_success", "step");
            c474500IjALIZ4.LJJIIJZLJL(jSONObject);
            c474500IjALIZ4.LIZ();
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C843850X8l(jSONObject, str7, str11, i4, str12, str13, str14, str15, map, strLIZIZ, jCurrentTimeMillis, c0jt6, null), 3);
            if (i3 == 0) {
                str = null;
            } else {
                str = str7;
                str7 = null;
            }
            C474500IjA c474500IjALIZ5 = C0IJT.LIZ("livesdk_gp_mmp_event");
            c474500IjALIZ5.LJIL();
            c474500IjALIZ5.LJJII(String.valueOf(i4), "touch_point");
            c474500IjALIZ5.LJJII(String.valueOf(i5), "threshold_duration");
            c474500IjALIZ5.LJJII(str, "item_id");
            c474500IjALIZ5.LJJII(str7, "room_id");
            c474500IjALIZ5.LJJII(str8, "game_id");
            c474500IjALIZ5.LJJII(str9, "task_id");
            c474500IjALIZ5.LJJII(str10, "anchor_id");
            c474500IjALIZ5.LJJII(Integer.valueOf(i3), Scene.SCENE_SERVICE);
            c474500IjALIZ5.LIZ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
