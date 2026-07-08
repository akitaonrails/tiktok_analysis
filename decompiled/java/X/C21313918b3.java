package X;

import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventReportRules;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.Rule;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughAbilityOptConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughDefaultOptConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18b3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313918b3 {
    public static final List<Rule> LIZ = C1697810uHb.LJIILJJIL(new Rule("poi_video_show", null, null, null, null, null, null, Collections.singletonList("initial_poi_enter_from"), null, 382, null), new Rule("poi_video_click", null, null, null, null, null, null, Collections.singletonList("initial_poi_enter_from"), null, 382, null), new Rule("show_all_reviews_button", null, null, null, null, null, null, Collections.singletonList("initial_poi_enter_from"), null, 382, null), new Rule("click_all_reviews_button", null, null, null, null, null, null, Collections.singletonList("initial_poi_enter_from"), null, 382, null), new Rule("share_poi", null, null, null, null, null, null, C1697810uHb.LJIIJJI("initial_poi_id", "initial_poi_enter_from", "initial_poi_enter_method", "initial_poi_from_group_id"), null, 382, null), new Rule("favourite_poi", null, null, null, null, null, null, C1697810uHb.LJIIJJI("initial_poi_id", "initial_poi_enter_from", "initial_poi_from_group_id"), null, 382, null), new Rule("cancel_favourite_poi", null, null, null, null, null, null, C1697810uHb.LJIIJJI("initial_poi_id", "initial_poi_enter_from", "initial_poi_from_group_id"), null, 382, null));

    public static List LIZ() {
        Object value;
        EventReportRules eventReportRules;
        List<Rule> list;
        String str;
        EventReportRules eventReportRules2;
        List<Rule> list2;
        EventReportRules eventReportRules3;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZ);
        ArrayList<EventParamsConfig> arrayList2 = new ArrayList();
        arrayList2.add(C21314218b6.LIZ());
        boolean z = true;
        arrayList2.add(C0C64.LJIILLIIL().LJJII(EventParamsConfig.class, C21314518b9.LIZ, "local_service_passthrough_params_rules_v2", true));
        C21314418b8.LIZ.getClass();
        if (LSPassThroughDefaultOptConfig.INSTANCE.enable()) {
            C21314118b5 c21314118b5 = C21314118b5.LIZ;
            EventParamsConfig eventParamsConfig = (EventParamsConfig) C21314418b8.LIZJ.getValue();
            c21314118b5.getClass();
            value = C21314118b5.LIZ(eventParamsConfig, "search", "local_service_passthrough_params_rules_x_search.json");
        } else {
            value = C21314418b8.LIZJ.getValue();
        }
        arrayList2.add(value);
        for (EventParamsConfig eventParamsConfig2 : arrayList2) {
            if (LSPassThroughAbilityOptConfig.INSTANCE.enable()) {
                String str2 = (eventParamsConfig2 == null || (eventReportRules3 = eventParamsConfig2.eventReportRules) == null) ? null : eventReportRules3.businessScene;
                ArrayList arrayList3 = new ArrayList();
                if (eventParamsConfig2 != null && (eventReportRules2 = eventParamsConfig2.eventReportRules) != null && (list2 = eventReportRules2.rules) != null) {
                    for (Rule rule : list2) {
                        if (rule.eventNameList != null && (!r0.isEmpty()) == z) {
                            List<String> list3 = rule.eventNameList;
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                            Iterator<String> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(new Rule(it2.next(), null, rule.btm, rule.btmList, rule.dataBtm, rule.dataBtmList, str2 == null ? rule.LIZ : str2, rule.params, rule.unzipParams, 2, null));
                            }
                            arrayList3.addAll(arrayList4);
                        } else if (C1533950q1J.LJ(rule.eventName)) {
                            if (str2 != null && str2.length() > 0) {
                                rule.LIZ = str2;
                            }
                            arrayList3.add(rule);
                            z = true;
                        }
                        z = true;
                    }
                }
                arrayList.addAll(arrayList3);
            } else if (eventParamsConfig2 != null && (eventReportRules = eventParamsConfig2.eventReportRules) != null && (list = eventReportRules.rules) != null) {
                if (C1533950q1J.LJ(eventReportRules.businessScene)) {
                    for (Rule rule2 : list) {
                        EventReportRules eventReportRules4 = eventParamsConfig2.eventReportRules;
                        if (eventReportRules4 == null || (str = eventReportRules4.businessScene) == null) {
                            str = "";
                        }
                        rule2.LIZ = str;
                    }
                }
                arrayList.addAll(list);
            }
            z = true;
        }
        return arrayList;
    }
}
