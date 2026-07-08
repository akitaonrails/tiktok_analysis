package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957607le {
    public static final C1957607le LIZ = new C1957607le();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1674));

    public static void LIZ() {
        PoiReTagEntranceOptExperiment.LIZ.getClass();
        if (PoiReTagEntranceOptExperiment.LIZIZ()) {
            LIZIZ().storeInt(LJFF("key_poi_re_tag_entrance_not_click_time"), LIZIZ().getInt(LJFF("key_poi_re_tag_entrance_not_click_time"), 0) + 1);
        }
    }

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static int LIZJ() {
        Object obj = ((LinkedHashMap) LIZLLL()).get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (obj == null) {
            obj = 0;
        }
        return ((Number) obj).intValue();
    }

    public static Map LIZLLL() {
        String string = LIZIZ().getString("key_poi_re_tag_show_entrance_count", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject.opt(next));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static void LJ(String str) {
        Set<String> stringSet = LIZIZ().getStringSet("key_poi_re_tag_aid", new LinkedHashSet());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(stringSet);
        linkedHashSet.add(str);
        LIZ.getClass();
        LIZIZ().storeStringSet("key_poi_re_tag_aid", linkedHashSet);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
