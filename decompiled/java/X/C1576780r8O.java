package X;

import Y.ARunnableS57S0300000_24;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlockInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.series.feed.tab.feed.MiniDramaTabCacheWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0r8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576780r8O {
    public static MiniDramaTabCacheWrapper LIZJ;
    public static SkylightBlocks LJ;
    public static final C1576780r8O LIZ = new C1576780r8O();
    public static final C1576980r8i LIZIZ = new C1576980r8i("MiniDramaTabUnConsume");
    public static List<String> LIZLLL = new ArrayList();

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mini_drama_tab_consume_vids_cache_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mini_drama_tab_un_consume_cache_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static MiniDramaTabCacheWrapper LIZJ() {
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper;
        List arrayList;
        List listLL;
        SkylightBlocks skylightBlocks;
        List<? extends Aweme> list;
        List listLL2;
        SkylightBlocks skylightBlocks2;
        List<? extends Aweme> list2;
        if (!C297590BlV.LIZIZ()) {
            return null;
        }
        MiniDramaTabCacheWrapper miniDramaTabCacheWrapper2 = LIZJ;
        List<String> list3 = LIZLLL;
        if (miniDramaTabCacheWrapper2 != null) {
            SeriesFeedResp seriesFeedResp = miniDramaTabCacheWrapper2.resp;
            if (seriesFeedResp == null || (list2 = seriesFeedResp.feedItemList) == null) {
                listLL2 = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Aweme aweme : list2) {
                    if (!((ArrayList) list3).contains(aweme.getAid())) {
                        arrayList2.add(aweme);
                    }
                }
                listLL2 = C13LP.LL(arrayList2, ((Number) C0AQV.LIZ.getValue()).intValue());
            }
            SeriesFeedResp seriesFeedResp2 = miniDramaTabCacheWrapper2.resp;
            List<SkylightBlockInfo> list4 = (seriesFeedResp2 == null || (skylightBlocks2 = seriesFeedResp2.skylightBlocks) == null) ? null : skylightBlocks2.blocks;
            if (listLL2 == null || listLL2.isEmpty() || list4 == null || list4.isEmpty()) {
                return null;
            }
            return MiniDramaTabCacheWrapper.LIZ(miniDramaTabCacheWrapper2, SeriesFeedResp.LIZ(miniDramaTabCacheWrapper2.resp, listLL2, null, null, null, 16382), 0, 5);
        }
        C1576980r8i c1576980r8i = LIZIZ;
        String strLIZ = C1576980r8i.LIZ(c1576980r8i, LIZIZ());
        if (strLIZ != null && (miniDramaTabCacheWrapper = (MiniDramaTabCacheWrapper) C105700ad.LIZ(strLIZ, MiniDramaTabCacheWrapper.class)) != null) {
            String strLIZ2 = C1576980r8i.LIZ(c1576980r8i, LIZ());
            if (strLIZ2 == null || (arrayList = (List) C105700ad.LIZ(strLIZ2, new TypeToken<List<String>>() { // from class: X.0r8P
            }.getType())) == null) {
                arrayList = new ArrayList();
            }
            SeriesFeedResp seriesFeedResp3 = miniDramaTabCacheWrapper.resp;
            if (seriesFeedResp3 == null || (list = seriesFeedResp3.feedItemList) == null) {
                listLL = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Aweme aweme2 : list) {
                    if (!arrayList.contains(aweme2.getAid())) {
                        arrayList3.add(aweme2);
                    }
                }
                listLL = C13LP.LL(arrayList3, ((Number) C0AQV.LIZ.getValue()).intValue());
            }
            SeriesFeedResp seriesFeedResp4 = miniDramaTabCacheWrapper.resp;
            List<SkylightBlockInfo> list5 = (seriesFeedResp4 == null || (skylightBlocks = seriesFeedResp4.skylightBlocks) == null) ? null : skylightBlocks.blocks;
            if (listLL != null && !listLL.isEmpty() && list5 != null && !list5.isEmpty()) {
                return MiniDramaTabCacheWrapper.LIZ(miniDramaTabCacheWrapper, SeriesFeedResp.LIZ(miniDramaTabCacheWrapper.resp, listLL, null, null, null, 16382), 0, 5);
            }
        }
        return null;
    }

    public static void LIZLLL(SeriesFeedResp seriesFeedResp, Long l) {
        List<SkylightBlockInfo> list;
        ArrayList arrayList;
        if (!C297590BlV.LIZIZ()) {
            return;
        }
        SkylightBlocks skylightBlocks = seriesFeedResp.skylightBlocks;
        Integer numValueOf = null;
        if (skylightBlocks != null) {
            list = skylightBlocks.blocks;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            LJ = seriesFeedResp.skylightBlocks;
        }
        List<? extends Aweme> list2 = seriesFeedResp.feedItemList;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (Aweme aweme : list2) {
                if (!aweme.isAd()) {
                    arrayList.add(aweme);
                }
            }
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveUnConsumeData size:");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" timeStamp: ");
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        C11S5.LIZ().LIZIZ(new ARunnableS57S0300000_24(seriesFeedResp, arrayList, l, 0));
    }
}
