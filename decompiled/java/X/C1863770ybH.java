package X;

import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ybH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoFirstFrameUtils$mobTakoFirstFrame$1", f = "TakoFirstFrameUtils.kt", l = {}, m = "invokeSuspend")
public final class C1863770ybH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863770ybH(TakoEnterParams takoEnterParams, long j, boolean z, InterfaceC1364105Vn<? super C1863770ybH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1863770ybH c1863770ybH = new C1863770ybH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1863770ybH.LL = obj;
        return c1863770ybH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        C1863800ybK c1863800ybK;
        C1863790ybJ c1863790ybJ;
        String str;
        Map mapLJ;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        boolean z2;
        boolean z3;
        C1863790ybJ c1863790ybJ2;
        C1863800ybK c1863800ybK2;
        C1C7U.LIZ("TakoFirstFrameUtils@7bcc.mobTakoFirstFrame$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Long l15 = this.LLILLJJLI.enterStartTime;
        if (l15 != null && l15.longValue() > 0) {
            TakoEnterParams takoEnterParams = this.LLILLJJLI;
            long j = this.LLILLL;
            boolean z4 = this.LLILZ;
            long jLongValue = l15.longValue();
            C325210Cox c325210Cox = C325210Cox.LIZ;
            String str2 = takoEnterParams.processId;
            C1867570yhP c1867570yhP = new C1867570yhP(j);
            c325210Cox.getClass();
            C325210Cox.LIZJ(str2, c1867570yhP);
            String str3 = takoEnterParams.processId;
            if (str3 != null && str3.length() != 0 && (c1863800ybK2 = C325210Cox.LIZJ.get(str3)) != null) {
                c1863800ybK = new C1863800ybK(c1863800ybK2.LIZ, c1863800ybK2.LIZIZ, c1863800ybK2.LIZJ, c1863800ybK2.LIZLLL, c1863800ybK2.LJ, c1863800ybK2.LJFF, c1863800ybK2.LJI, c1863800ybK2.LJII, c1863800ybK2.LJIIIIZZ, c1863800ybK2.LJIIIZ, c1863800ybK2.LJIIJ, c1863800ybK2.LJIIJJI, c1863800ybK2.LJIIL, c1863800ybK2.LJIILIIL, c1863800ybK2.LJIILJJIL);
            } else {
                c1863800ybK = null;
            }
            String str4 = takoEnterParams.processId;
            if (str4 != null && str4.length() != 0 && (c1863790ybJ2 = C1863760ybG.LIZIZ.get(str4)) != null) {
                c1863790ybJ = new C1863790ybJ(c1863790ybJ2.LIZ, c1863790ybJ2.LIZIZ, c1863790ybJ2.LIZJ, c1863790ybJ2.LIZLLL, c1863790ybJ2.LJ, c1863790ybJ2.LJFF);
            } else {
                c1863790ybJ = null;
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            long j2 = j - jLongValue;
            String str5 = takoEnterParams.enterFrom;
            String str6 = takoEnterParams.enterMethod;
            boolean z5 = !C1863760ybG.LIZ;
            boolean zIsFromSchema = takoEnterParams.isFromSchema();
            boolean z6 = !Intrinsics.LJFF(takoEnterParams.getScreenType(), "full_screen");
            String strValueOf = String.valueOf(takoEnterParams.botInfo.botId);
            String str7 = takoEnterParams.processId;
            TakoSubConversationData takoSubConversationData = takoEnterParams.subConversationData;
            if (takoSubConversationData == null || (str = takoSubConversationData.subConversationId) == null) {
                str = "";
            }
            String str8 = takoEnterParams.takoChatId;
            if (c1863800ybK != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Long lValueOf = Long.valueOf(jLongValue);
                if (c1863790ybJ != null) {
                    l = c1863790ybJ.LIZ;
                } else {
                    l = null;
                }
                Long lLIZ = C1863760ybG.LIZ(lValueOf, l);
                if (lLIZ != null) {
                    linkedHashMap.put("click_to_fragment_init_start_time", Long.valueOf(lLIZ.longValue()));
                }
                Long lValueOf2 = Long.valueOf(jLongValue);
                if (c1863790ybJ != null) {
                    l2 = c1863790ybJ.LIZIZ;
                } else {
                    l2 = null;
                }
                Long lLIZ2 = C1863760ybG.LIZ(lValueOf2, l2);
                if (lLIZ2 != null) {
                    linkedHashMap.put("click_to_fragment_init_done_time", Long.valueOf(lLIZ2.longValue()));
                }
                Long lLIZ3 = C1863760ybG.LIZ(c1863800ybK.LIZLLL, c1863800ybK.LJI);
                if (lLIZ3 != null) {
                    linkedHashMap.put("click_to_get_sug_cache_time", Long.valueOf(lLIZ3.longValue()));
                }
                Long lValueOf3 = Long.valueOf(jLongValue);
                if (c1863790ybJ != null) {
                    l3 = c1863790ybJ.LIZJ;
                } else {
                    l3 = null;
                }
                Long lLIZ4 = C1863760ybG.LIZ(lValueOf3, l3);
                if (lLIZ4 != null) {
                    linkedHashMap.put("click_to_history_preload_start_time", Long.valueOf(lLIZ4.longValue()));
                }
                if (c1863790ybJ != null) {
                    l4 = c1863790ybJ.LIZJ;
                    l5 = c1863790ybJ.LIZLLL;
                } else {
                    l4 = null;
                    l5 = null;
                }
                Long lLIZ5 = C1863760ybG.LIZ(l4, l5);
                if (lLIZ5 != null) {
                    linkedHashMap.put("history_preload_duration", Long.valueOf(lLIZ5.longValue()));
                }
                if (c1863790ybJ != null) {
                    l6 = c1863790ybJ.LIZLLL;
                } else {
                    l6 = null;
                }
                Long lLIZ6 = C1863760ybG.LIZ(l6, c1863800ybK.LJIIIIZZ);
                if (lLIZ6 != null) {
                    linkedHashMap.put("history_data_received_to_render_complete_time", Long.valueOf(lLIZ6.longValue()));
                }
                Long lLIZ7 = C1863760ybG.LIZ(c1863800ybK.LIZLLL, c1863800ybK.LJ);
                if (lLIZ7 != null) {
                    linkedHashMap.put("click_to_sug_request_start_time", Long.valueOf(lLIZ7.longValue()));
                }
                Long lLIZ8 = C1863760ybG.LIZ(c1863800ybK.LIZLLL, c1863800ybK.LJFF);
                if (lLIZ8 != null) {
                    linkedHashMap.put("click_to_sug_response_time", Long.valueOf(lLIZ8.longValue()));
                }
                Long lLIZ9 = C1863760ybG.LIZ(c1863800ybK.LIZLLL, c1863800ybK.LJIIJ);
                if (lLIZ9 != null) {
                    linkedHashMap.put("click_to_sug_render_complete_time", Long.valueOf(lLIZ9.longValue()));
                }
                Long lLIZ10 = C1863760ybG.LIZ(c1863800ybK.LJ, c1863800ybK.LJFF);
                if (lLIZ10 != null) {
                    linkedHashMap.put("sug_request_start_to_response_time", Long.valueOf(lLIZ10.longValue()));
                }
                Long lLIZ11 = C1863760ybG.LIZ(c1863800ybK.LJI, c1863800ybK.LJIIJ);
                if (lLIZ11 != null) {
                    linkedHashMap.put("sug_response_to_render_complete_time", Long.valueOf(lLIZ11.longValue()));
                }
                if (c1863790ybJ != null) {
                    l7 = c1863790ybJ.LIZIZ;
                } else {
                    l7 = null;
                }
                Long lLIZ12 = C1863760ybG.LIZ(l7, c1863800ybK.LJI);
                if (lLIZ12 != null) {
                    linkedHashMap.put("fragment_init_done_to_sug_consume_start_time", Long.valueOf(lLIZ12.longValue()));
                }
                if (c1863790ybJ != null) {
                    l8 = c1863790ybJ.LIZIZ;
                } else {
                    l8 = null;
                }
                Long lLIZ13 = C1863760ybG.LIZ(l8, c1863800ybK.LJIIIIZZ);
                if (lLIZ13 != null) {
                    linkedHashMap.put("fragment_init_done_to_first_frame_render_complete_time", Long.valueOf(lLIZ13.longValue()));
                }
                if (c1863790ybJ != null) {
                    l9 = c1863790ybJ.LIZIZ;
                    l10 = c1863790ybJ.LIZLLL;
                } else {
                    l9 = null;
                    l10 = null;
                }
                Long lLIZ14 = C1863760ybG.LIZ(l9, l10);
                if (lLIZ14 != null) {
                    linkedHashMap.put("fragment_init_done_to_history_preload_end_time", Long.valueOf(lLIZ14.longValue()));
                }
                if (c1863790ybJ != null) {
                    l11 = c1863790ybJ.LIZ;
                    l12 = c1863790ybJ.LJ;
                } else {
                    l11 = null;
                    l12 = null;
                }
                Long lLIZ15 = C1863760ybG.LIZ(l11, l12);
                if (lLIZ15 != null) {
                    linkedHashMap.put("fragment_on_create_cost", Long.valueOf(lLIZ15.longValue()));
                }
                if (c1863790ybJ != null) {
                    l13 = c1863790ybJ.LJFF;
                    l14 = c1863790ybJ.LIZIZ;
                } else {
                    l13 = null;
                    l14 = null;
                }
                Long lLIZ16 = C1863760ybG.LIZ(l13, l14);
                if (lLIZ16 != null) {
                    linkedHashMap.put("fragment_on_view_created_cost", Long.valueOf(lLIZ16.longValue()));
                }
                Long l16 = c1863800ybK.LJIIIIZZ;
                if (l16 != null) {
                    Long l17 = c1863800ybK.LJI;
                    if (l17 != null && l17.longValue() <= l16.longValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Long l18 = c1863800ybK.LJIIJ;
                    if (l18 != null && l18.longValue() <= l16.longValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    linkedHashMap.put("sug_consumed_in_first_frame", Boolean.valueOf(z2));
                    linkedHashMap.put("sug_visible_in_first_frame", Boolean.valueOf(z3));
                }
                Long lLIZ17 = C1863760ybG.LIZ(c1863800ybK.LJII, c1863800ybK.LJI);
                if (lLIZ17 != null) {
                    linkedHashMap.put("sug_cache_wait_time", Long.valueOf(lLIZ17.longValue()));
                }
                Long lLIZ18 = C1863760ybG.LIZ(c1863800ybK.LJIIIIZZ, c1863800ybK.LJIIJ);
                if (lLIZ18 != null) {
                    linkedHashMap.put("first_frame_to_sug_visible_time", Long.valueOf(lLIZ18.longValue()));
                }
                Long lLIZ19 = C1863760ybG.LIZ(c1863800ybK.LJII, c1863800ybK.LJI);
                if (lLIZ19 != null) {
                    linkedHashMap.put("sug_cache_wait_time", Long.valueOf(lLIZ19.longValue()));
                }
                Long lLIZ20 = C1863760ybG.LIZ(c1863800ybK.LJIIIIZZ, c1863800ybK.LJIIJ);
                mapLJ = linkedHashMap;
                if (lLIZ20 != null) {
                    linkedHashMap.put("first_frame_to_sug_visible_time", Long.valueOf(lLIZ20.longValue()));
                    mapLJ = linkedHashMap;
                }
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_time", j2);
            jSONObject.put("enter_from", str5);
            jSONObject.put("enter_method", str6);
            jSONObject.put("is_cold", z5);
            jSONObject.put("is_from_schema", zIsFromSchema);
            jSONObject.put("is_half_screen", z6);
            jSONObject.put("is_disclaimer", false);
            jSONObject.put("bot_id", strValueOf);
            jSONObject.put("process_id", str7);
            jSONObject.put("is_saf", z4);
            jSONObject.put("tako_session_id", str);
            if (str8 != null && str8.length() > 0) {
                jSONObject.put("tako_chat_id", str8);
            }
            for (Map.Entry entry : mapLJ.entrySet()) {
                String str9 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str9.length() > 0 && value != null) {
                    jSONObject.put(str9, value);
                }
            }
            c20235014FoLIZ.LIZIZ("tikbot_perf_page_first_frame", jSONObject);
            String str10 = takoEnterParams.processId;
            if (str10 != null && str10.length() != 0) {
                C1863760ybG.LIZIZ.remove(str10);
            }
            z = true;
        } else {
            TakoEnterParams takoEnterParams2 = this.LLILLJJLI;
            z = true;
            Npth.reportBizException("tako", new IllegalArgumentException("enterStartTime empty"), "enterStartTime empty", C2097608Jq.LJIIIIZZ(new Pair("enter_from", takoEnterParams2.enterFrom), new Pair("enter_method", takoEnterParams2.enterMethod)));
        }
        C1863760ybG.LIZ = z;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoFirstFrameUtils@7bcc.mobTakoFirstFrame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
