package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.facebook.FacebookSdk;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BJN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJN {
    public static final Map<C1EPD, String[]> LIZ = new HashMap();

    public static boolean LIZIZ(C1EPD c1epd) {
        boolean z;
        HashMap map;
        ConcurrentHashMap<String, C1BKK> concurrentHashMap;
        Boolean bool;
        switch (C1EPF.LIZ[c1epd.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 22:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 26:
            case 27:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        C1BJM c1bjm = C1BJM.LIZ;
        String key = c1epd.toKey();
        String strLIZLLL = FacebookSdk.LIZLLL();
        C1BJM.LIZ.getClass();
        C1BJM.LIZIZ(null);
        if (!((ConcurrentHashMap) C1BJM.LIZLLL).containsKey(strLIZLLL)) {
            map = new HashMap();
        } else {
            C2189851An9 c2189851An9 = C1BJM.LJFF;
            if (c2189851An9 != null && (concurrentHashMap = c2189851An9.LIZ.get(strLIZLLL)) != null) {
                ArrayList<C1BKK> arrayList = new ArrayList(concurrentHashMap.size());
                Iterator<Map.Entry<String, C1BKK>> it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getValue());
                }
                map = new HashMap();
                for (C1BKK c1bkk : arrayList) {
                    map.put(c1bkk.LIZ, Boolean.valueOf(c1bkk.LIZIZ));
                }
            } else {
                map = new HashMap();
                JSONObject jSONObject = (JSONObject) ((ConcurrentHashMap) C1BJM.LIZLLL).get(strLIZLLL);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                C2189851An9 c2189851An92 = C1BJM.LJFF;
                if (c2189851An92 == null) {
                    c2189851An92 = new C2189851An9();
                }
                ArrayList<C1BKK> arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList2.add(new C1BKK((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap<String, C1BKK> concurrentHashMap2 = new ConcurrentHashMap<>();
                for (C1BKK c1bkk2 : arrayList2) {
                    concurrentHashMap2.put(c1bkk2.LIZ, c1bkk2);
                }
                c2189851An92.LIZ.put(strLIZLLL, concurrentHashMap2);
                C1BJM.LJFF = c2189851An92;
            }
        }
        if (map.containsKey(key) && (bool = (Boolean) map.get(key)) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static final boolean LIZJ(C1EPD c1epd) {
        if (C1EPD.Unknown == c1epd) {
            return false;
        }
        if (C1EPD.Core == c1epd) {
            return true;
        }
        String string = C810670Vr7.LIZJ(FacebookSdk.LIZJ(), 0, "com.facebook.internal.FEATURE_MANAGER").getString(c1epd.toKey(), null);
        if (string != null) {
            C786410Ut5.E2();
            if (Intrinsics.LJFF(string, "17.0.0")) {
                return false;
            }
        }
        C1EPD parent = c1epd.getParent();
        if (parent == c1epd) {
            return LIZIZ(c1epd);
        }
        if (!LIZJ(parent) || !LIZIZ(c1epd)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BJl] */
    public static final void LIZ(final C1BKH c1bkh, final C1EPD c1epd) {
        C1BJM.LIZIZ(new C1BKI() { // from class: X.1BJl
            @Override // X.C1BKI
            public final void LIZ() {
                c1bkh.LIZ(C1BJN.LIZJ(c1epd));
            }
        });
    }
}
