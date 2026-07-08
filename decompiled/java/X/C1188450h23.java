package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0h23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188450h23 {
    public static C1188440h22 LIZ(Aweme aweme) {
        boolean zBooleanValue;
        AnchorCommonStruct next;
        C1188440h22 c1188440h22LJ;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                zBooleanValue = false;
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorCommonStruct anchorCommonStruct = next;
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.POI.getTYPE() && anchorCommonStruct.getExtra().length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null) {
                String extra = anchorCommonStruct2.getExtra();
                if (C123100dR.LIZ(extra) && extra != null) {
                    HashMap<String, String> map = PoiCollectStatusViewModel.LLILLJJLI;
                    String str = map.get(extra);
                    if (!C123100dR.LIZ(str) || (c1188440h22LJ = PoiCollectStatusViewModel.LLILLL.get(str)) == null) {
                        C1188460h24.LIZ.getClass();
                        c1188440h22LJ = C1188460h24.LJ(aweme, "feed_bottom", null);
                        if (c1188440h22LJ == null) {
                            return null;
                        }
                        HashMap<String, Boolean> map2 = PoiCollectStatusViewModel.LLILZ;
                        if (map2.containsKey(c1188440h22LJ.getPoiId())) {
                            Boolean bool = (Boolean) C19719512Dh.LIZJ(map2).remove(c1188440h22LJ.getPoiId());
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            }
                            c1188440h22LJ = C1188460h24.LJII(c1188440h22LJ, zBooleanValue);
                        } else {
                            C1188440h22 c1188440h22 = PoiCollectStatusViewModel.LLILLL.get(c1188440h22LJ.getPoiId());
                            if (c1188440h22 != null) {
                                c1188440h22LJ = c1188440h22;
                            }
                            map.put(extra, c1188440h22LJ.getPoiId());
                            PoiCollectStatusViewModel.LLILLL.put(c1188440h22LJ.getPoiId(), c1188440h22LJ);
                        }
                        if (c1188440h22LJ != null) {
                            map.put(extra, c1188440h22LJ.getPoiId());
                            PoiCollectStatusViewModel.LLILLL.put(c1188440h22LJ.getPoiId(), c1188440h22LJ);
                        }
                    }
                    return c1188440h22LJ;
                }
            }
        }
        return null;
    }

    public static Boolean LIZIZ(String str) {
        return PoiCollectStatusViewModel.LLILZIL.LIZIZ(str);
    }

    public static void LIZJ(String str, boolean z) {
        HashMap<String, C1188440h22> map = PoiCollectStatusViewModel.LLILLL;
        C1188440h22 c1188440h22 = map.get(str);
        boolean z2 = z;
        if (c1188440h22 != null) {
            if (z2 != c1188440h22.isCollected()) {
                z2 = z2;
                map.put(str, c1188440h22.copy(c1188440h22.LL, c1188440h22.LLILLJJLI, c1188440h22.LLILLL, c1188440h22.LLILZ, c1188440h22.LLILZIL, c1188440h22.LLILZLL, c1188440h22.LLIZ, c1188440h22.LLIZLLLIL, c1188440h22.LLJ, c1188440h22.LLJI, c1188440h22.LLJIJIL, c1188440h22.LLJILJIL, z2, c1188440h22.LLJILLL, c1188440h22.LLJJ, c1188440h22.LLJJI, c1188440h22.LLJJIII));
            }
        } else {
            PoiCollectStatusViewModel.LLILZ.put(str, Boolean.valueOf(z2));
        }
        PoiCollectStatusViewModel.LLILZIL.LIZLLL(str, Boolean.valueOf(z2));
    }
}
