package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMetaMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00it, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C156900it {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZLLL() {
        Map<Integer, AnchorGiftModeMap> map;
        AnchorGiftModeMap anchorGiftModeMap;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
        if (multiMatchPrepareResponse == null || (map = multiMatchPrepareResponse.anchorGiftModeMapByType) == null || (anchorGiftModeMap = map.get(2)) == null) {
            return null;
        }
        return anchorGiftModeMap.anchorGiftModes;
    }

    public static boolean LIZ() {
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if (arrayList.size() <= 1) {
            return false;
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!LJIIIIZZ(((Number) it3.next()).longValue())) {
                return false;
            }
        }
        return true;
    }

    public static final GiftModeMetaV2 LIZJ() {
        Map mapLIZLLL = LIZLLL();
        if (mapLIZLLL == null || mapLIZLLL.isEmpty()) {
            return null;
        }
        AnchorGiftModeMetaMap anchorGiftModeMetaMap = new AnchorGiftModeMetaMap();
        for (Map.Entry entry : mapLIZLLL.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            GiftModeList giftModeList = (GiftModeList) entry.getValue();
            GiftModeMetaList giftModeMetaList = new GiftModeMetaList();
            for (GiftMode giftMode : giftModeList.giftMode) {
                if (giftMode.giftId > 0) {
                    GiftModeMeta giftModeMeta = new GiftModeMeta();
                    giftModeMeta.giftId = giftMode.giftId;
                    String str = giftMode.giftName;
                    if (str == null) {
                        str = "";
                    }
                    giftModeMeta.giftNameKey = str;
                    giftModeMeta.giftIconImage = giftMode.giftIconImage;
                    giftModeMetaList.giftModeMeta.add(giftModeMeta);
                }
            }
            if (!giftModeMetaList.giftModeMeta.isEmpty()) {
                anchorGiftModeMetaMap.anchorGiftModeMetas.put(Long.valueOf(jLongValue), giftModeMetaList);
            }
        }
        if (anchorGiftModeMetaMap.anchorGiftModeMetas.isEmpty()) {
            return null;
        }
        GiftModeMetaV2 giftModeMetaV2 = new GiftModeMetaV2();
        giftModeMetaV2.anchorGiftModeMetaByType.put(2L, anchorGiftModeMetaMap);
        return giftModeMetaV2;
    }

    public static List LJFF() {
        List<String> listLIZ;
        GiftMode giftMode = (GiftMode) C13LP.LJJJLL(LJII(LJI()));
        if (giftMode == null) {
            return C13BV.INSTANCE;
        }
        ImageModel imageModel = giftMode.giftIconImage;
        if (imageModel == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : listLIZ) {
            if (!a0.LJJJIL(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static long LJI() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    public static boolean LJIIJ() {
        return LJIIIIZZ(LJI());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    public static final int LJ(boolean z) {
        ?? linkedHashMap;
        int i;
        long jLJI = LJI();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        if (arrayList.size() <= 1) {
            linkedHashMap = C2097608Jq.LJ();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!LJIIIIZZ(((Number) obj).longValue())) {
                    arrayList2.add(obj);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : arrayList2) {
                List listLJII = LJII(((Number) obj2).longValue());
                if (listLJII.isEmpty()) {
                    i = 0;
                } else {
                    i = ((GiftMode) C13LP.LJJJJZI(listLJII)).giftDisplayState;
                }
                linkedHashMap.put(obj2, Integer.valueOf(i));
            }
        }
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                int iIntValue = ((Number) entry.getValue()).intValue();
                if (jLongValue != jLJI && iIntValue == 3) {
                    return 2131856757;
                }
            }
        }
        if (z) {
            return 2131853781;
        }
        return 2131853730;
    }

    public static List LJII(long j) {
        GiftModeList giftModeList;
        Map mapLIZLLL = LIZLLL();
        if (mapLIZLLL != null && (giftModeList = (GiftModeList) mapLIZLLL.get(Long.valueOf(j))) != null) {
            List<GiftMode> list = giftModeList.giftMode;
            ArrayList arrayList = new ArrayList();
            for (GiftMode giftMode : list) {
                if (giftMode.giftId > 0) {
                    arrayList.add(giftMode);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJIIIIZZ(long j) {
        List listLJII = LJII(j);
        if (listLJII.isEmpty() || ((GiftMode) ListProtector.get(listLJII, 0)).giftDisplayState != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(GiftModeMetaV2 giftModeMetaV2) {
        AnchorGiftModeMetaMap anchorGiftModeMetaMap;
        if (giftModeMetaV2 == null || (anchorGiftModeMetaMap = giftModeMetaV2.anchorGiftModeMetaByType.get(2L)) == null) {
            return false;
        }
        return !anchorGiftModeMetaMap.anchorGiftModeMetas.isEmpty();
    }

    public static final boolean LJIIJJI(long j) {
        if (j <= 0) {
            return false;
        }
        List listLJII = LJII(LJI());
        if (!(listLJII instanceof Collection) || !listLJII.isEmpty()) {
            Iterator it2 = listLJII.iterator();
            while (it2.hasNext()) {
                if (((GiftMode) it2.next()).giftId == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Pair LIZIZ(int i, long j) {
        if (i != 1) {
            return new Pair(0, null);
        }
        if (j <= 0) {
            return new Pair(0, null);
        }
        if (!LJIIJJI(j)) {
            return new Pair(1, null);
        }
        Map mapLIZLLL = LIZLLL();
        if (mapLIZLLL != null && !mapLIZLLL.isEmpty()) {
            C13DA c13da = new C13DA();
            for (Map.Entry entry : mapLIZLLL.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                List<GiftMode> list = ((GiftModeList) entry.getValue()).giftMode;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<GiftMode> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().giftId));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).longValue() > 0) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Long lValueOf = Long.valueOf(jLongValue);
                    GiftList giftList = new GiftList();
                    giftList.giftId.addAll(arrayList2);
                    c13da.put(lValueOf, giftList);
                }
            }
            Map mapBuild = c13da.build();
            if (mapBuild.isEmpty()) {
                return new Pair(1, null);
            }
            return new Pair(2, GsonProtectorUtils.toJson(new Gson(), mapBuild));
        }
        return new Pair(1, null);
    }
}
