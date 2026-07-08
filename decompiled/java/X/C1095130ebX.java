package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.FansConfig;
import webcast.data.FansLevelShowConfig;
import webcast.data.FansScoreRule;
import webcast.data.FansUpgradeBarrageEffectConfig;
import webcast.data.FansUpgradeDynamicEffectConfig;

/* JADX INFO: renamed from: X.0ebX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095130ebX {
    public static final Map<Integer, FansScoreRule> LIZ = new LinkedHashMap();
    public static final Map<Integer, Integer> LIZIZ = new LinkedHashMap();
    public static final Map<Long, ImageModel> LIZJ = new LinkedHashMap();
    public static final Map<Long, ImageModel> LIZLLL = new LinkedHashMap();
    public static final List<Integer> LJ;
    public static final Map<Integer, String> LJFF;
    public static int LJI;
    public static boolean LJII;

    static {
        new LinkedHashMap();
        LJ = new ArrayList();
        LJFF = new LinkedHashMap();
        LJI = 1;
    }

    public static boolean LIZ() {
        return (LIZIZ.isEmpty() ^ true) && (LIZJ.isEmpty() ^ true);
    }

    public static void LIZIZ(List list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(GsonProtectorUtils.toJson(gson, it2.next()));
        }
        InterfaceC1093910eZZ.LLLLLLLLL.LJFF(arrayList);
    }

    public static void LIZJ(List list) {
        int i;
        FansScoreRule fansScoreRule;
        if (!LJII && list != null && !list.isEmpty()) {
            ((ArrayList) LJ).clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                FansConfig fansConfig = (FansConfig) it2.next();
                Integer numValueOf = null;
                if (fansConfig != null && (fansScoreRule = fansConfig.fansScoreRule) != null) {
                    numValueOf = Integer.valueOf(fansScoreRule.level);
                }
                if (numValueOf != null) {
                    FansScoreRule fansScoreRule2 = fansConfig.fansScoreRule;
                    if (fansScoreRule2 != null) {
                        LIZ.put(Integer.valueOf(fansScoreRule2.level), fansScoreRule2);
                        LJI = Math.max(LJI, fansScoreRule2.level);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (fansConfig == null) {
                    continue;
                }
                FansUpgradeBarrageEffectConfig fansUpgradeBarrageEffectConfig = fansConfig.updateBarrageEffect;
                if (fansUpgradeBarrageEffectConfig != null) {
                    if (Integer.valueOf(fansUpgradeBarrageEffectConfig.level) != null) {
                        FansUpgradeBarrageEffectConfig fansUpgradeBarrageEffectConfig2 = fansConfig.updateBarrageEffect;
                        if (fansUpgradeBarrageEffectConfig2 != null) {
                            LIZIZ.put(Integer.valueOf(fansUpgradeBarrageEffectConfig2.level), Integer.valueOf(fansUpgradeBarrageEffectConfig2.displayConfig));
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (fansConfig == null) {
                        continue;
                    }
                }
                FansLevelShowConfig fansLevelShowConfig = fansConfig.showConfig;
                if (fansLevelShowConfig != null) {
                    if (Long.valueOf(fansLevelShowConfig.level) != null) {
                        FansLevelShowConfig fansLevelShowConfig2 = fansConfig.showConfig;
                        if (fansLevelShowConfig2 != null) {
                            LIZJ.put(Long.valueOf(fansLevelShowConfig2.level), fansLevelShowConfig2.badgeIcon);
                            LIZLLL.put(Long.valueOf(fansLevelShowConfig2.level), fansLevelShowConfig2.leftUpEntranceIcon);
                            if (!TextUtils.isEmpty(fansLevelShowConfig2.fontColorCode)) {
                                LJFF.put(Integer.valueOf((int) fansLevelShowConfig2.level), fansLevelShowConfig2.fontColorCode);
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else if (fansConfig != null) {
                    }
                }
                FansUpgradeDynamicEffectConfig fansUpgradeDynamicEffectConfig = fansConfig.updateDynamicEffect;
                if (fansUpgradeDynamicEffectConfig != null && Integer.valueOf(fansUpgradeDynamicEffectConfig.level) != null) {
                    List<Integer> list2 = LJ;
                    FansUpgradeDynamicEffectConfig fansUpgradeDynamicEffectConfig2 = fansConfig.updateDynamicEffect;
                    if (fansUpgradeDynamicEffectConfig2 != null) {
                        i = fansUpgradeDynamicEffectConfig2.level;
                    } else {
                        i = 0;
                    }
                    ((ArrayList) list2).add(Integer.valueOf(i));
                }
            }
        }
    }
}
