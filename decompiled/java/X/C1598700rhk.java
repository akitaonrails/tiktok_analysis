package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.ss.android.ugc.aweme.inbox.api.SkylightBizParams;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.forward.ICreativeForwardService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598700rhk implements InterfaceC1598750rhp {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(212));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(213));

    @Override // X.InterfaceC1598750rhp
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1598750rhp
    public final synchronized List<InterfaceC1891350zJl> LJ() {
        if (((AtomicBoolean) this.LIZIZ.getValue()).get()) {
            LJIILLIIL().LIZ();
            Object obj = ((Map) LJIILLIIL().LJ.getValue()).get("SKYLIGHT_DATA_CACHE");
            if (obj == null) {
                obj = null;
            }
            List<InterfaceC1891350zJl> list = (List) obj;
            if (list != null) {
                ((AtomicBoolean) this.LIZIZ.getValue()).set(false);
                return list;
            }
        }
        return LJIILJJIL(false);
    }

    @Override // X.InterfaceC1598750rhp
    public final synchronized SkylightDataResponse LJIIIIZZ() {
        SkylightDataResponse skylightDataResponse;
        List<SkylightData> dataList;
        LJIILLIIL().LIZ();
        Object obj = ((Map) LJIILLIIL().LJ.getValue()).get("SKYLIGHT_TEMPLATE_CACHE");
        Integer numValueOf = null;
        if (obj == null) {
            obj = null;
        }
        skylightDataResponse = (SkylightDataResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchSkylightMufCache, mufCache size: ");
        if (skylightDataResponse != null && (dataList = skylightDataResponse.getDataList()) != null) {
            numValueOf = Integer.valueOf(dataList.size());
        }
        sbLIZ.append(numValueOf);
        C1720106oR.LJI("InboxSkylightPreload", C2188811AlT.LIZIZ(sbLIZ));
        return skylightDataResponse;
    }

    @Override // X.InterfaceC1598750rhp
    public final void LIZJ() {
        C1618440sDa.LIZIZ.LJJIIZI().cancelPreloadTask();
    }

    @Override // X.InterfaceC1598750rhp
    public final Map LJIIJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("live_entrance", "5");
        linkedHashMap.put("req_from", "tiktok_message");
        linkedHashMap.put("is_draw", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("content_type", "3");
        linkedHashMap.put("channel_id", "81");
        linkedHashMap.put("scenario", "2");
        linkedHashMap.put("has_shown_following_popup", "false");
        return linkedHashMap;
    }

    @Override // X.InterfaceC1598750rhp
    public final List<InterfaceC1891350zJl> LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        C1598160rgs.LIZ.getClass();
        InterfaceC1891350zJl interfaceC1891350zJlLJFF = C1598160rgs.LJFF();
        if (interfaceC1891350zJlLJFF != null) {
            arrayList.add(interfaceC1891350zJlLJFF);
        }
        StoryInboxItem storyInboxItemLIZLLL = C1598160rgs.LIZLLL();
        if (storyInboxItemLIZLLL != null) {
            storyInboxItemLIZLLL.getStoryCollection().getAuthor().setStoryStatus(-56831);
            arrayList.add(storyInboxItemLIZLLL);
        }
        return arrayList;
    }

    public final C1902840zcI LJIILLIIL() {
        return (C1902840zcI) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1598750rhp
    public final void LIZLLL() {
        if (C1599180riW.LIZ()) {
            C2252408s6.LIZ(new AwS568S0100000_24(this, 679));
        }
    }

    @Override // X.InterfaceC1598750rhp
    public final boolean LJFF() {
        if (!C1599180riW.LIZ()) {
            return false;
        }
        C1901580zaG.LIZ.getClass();
        return C1901580zaG.LJIIIIZZ();
    }

    @Override // X.InterfaceC1598750rhp
    public final boolean LJI() {
        if (!C1599180riW.LIZ()) {
            return false;
        }
        C1901580zaG.LIZ.getClass();
        long jLJ = C1901580zaG.LJ();
        return jLJ > 0 && System.currentTimeMillis() - jLJ >= ((long) C1901580zaG.LIZJ);
    }

    @Override // X.InterfaceC1598750rhp
    public final boolean LJII() {
        if (!C1599180riW.LIZ()) {
            return true;
        }
        C1598160rgs.LIZ.getClass();
        if (C1598160rgs.LIZ()) {
            return false;
        }
        C1901580zaG.LIZ.getClass();
        return !C1901580zaG.LJIIIIZZ();
    }

    @Override // X.InterfaceC1598750rhp
    public final void LJIIIZ() {
        if (C1599180riW.LIZ()) {
            C2252408s6.LIZ(new AwS568S0100000_24(this, 680));
        }
    }

    @Override // X.InterfaceC1598750rhp
    public final C11NZ LJIIJJI() {
        int i;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        MultiApiManager.API apiLIZ = MultiApiManager.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C1209404oG.LIZ()) {
            linkedHashMap.put("group", 10001);
        } else {
            linkedHashMap.put("group", 10000);
        }
        linkedHashMap.put("count", Integer.MAX_VALUE);
        String strLJ = JsonParseUtils.LJ(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LJIILL("inbox_skylight_friends_list_strategy", String.valueOf(((Number) C1599180riW.LIZ.getValue()).intValue())));
        arrayList.add(LJIILL("creation_inbox_topcell_on_this_day_entrance", String.valueOf(C1599200riY.LIZ())));
        arrayList.add(LJIILL("creation_inbox_topcell_on_this_day_quit", String.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "creation_inbox_topcell_on_this_day_quit", true))));
        arrayList.add(LJIILL("alias_consumption_switch", C343230Dcv.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT));
        arrayList.add(LJIILL("is_skylight_fold_experiment", String.valueOf(C882650Yjv.LIZ())));
        String strLJ2 = JsonParseUtils.LJ(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        Integer numValueOf = null;
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            C844470XAv.LIZ.getClass();
            Map<String, String> mapLLIFFJFJJ = interfaceC20673515v3K4.LLIFFJFJJ(C844470XAv.LIZ());
            if (mapLLIFFJFJJ != null) {
                linkedHashMap2.putAll(mapLLIFFJFJJ);
            }
        }
        linkedHashMap2.putAll(LJIIJ());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("key", "on_this_day_support_recall_multiple_post");
        linkedHashMap3.put("value", ((ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class)).onThisDaySupportRecallMultiPost() ? "1" : CardStruct.IStatusCode.DEFAULT);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("key", "on_this_day_support_recall_story");
        linkedHashMap4.put("value", ((ICreativeForwardService) ServiceManager.get().getService(ICreativeForwardService.class)).onThisDaySupportRecallMultiStory() ? "1" : CardStruct.IStatusCode.DEFAULT);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("key", "on_this_day_retain_skylight_after_publish");
        linkedHashMap5.put("value", ((Boolean) C1599190riX.LIZ.getValue()).booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
        List listLJIIJJI = C1697810uHb.LJIIJJI(linkedHashMap3, linkedHashMap4, linkedHashMap5);
        Map<String, Object> storyCelebrationRequestParam = C1618440sDa.LIZIZ.LJJLIIIJLLLLLLLZ().getStoryCelebrationRequestParam();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new SkylightBizParams(3, JsonParseUtils.LJ(linkedHashMap2)));
        arrayList2.add(new SkylightBizParams(4, JsonParseUtils.LJ(listLJIIJJI)));
        arrayList2.add(new SkylightBizParams(7, JsonParseUtils.LJ(storyCelebrationRequestParam)));
        String strLJ3 = JsonParseUtils.LJ(arrayList2);
        C01VZ.LL.getClass();
        if (C882650Yjv.LJ()) {
            C01VW.LIZ.getClass();
            Keva kevaLIZIZ = C01VW.LIZIZ();
            if (kevaLIZIZ != null && (i = kevaLIZIZ.getInt("pending_fold_strategy", 0)) != 0) {
                numValueOf = (i == 1 && C01VZ.LIZJ()) ? 2 : Integer.valueOf(i);
            }
        }
        return apiLIZ.LIZJ(strLJ, strLJ2, strLJ3, numValueOf);
    }

    @Override // X.InterfaceC1598750rhp
    public final boolean LJIIL() {
        LJIILLIIL().LIZ();
        return ((Map) LJIILLIIL().LJ.getValue()).get("SKYLIGHT_DATA_CACHE") != null;
    }

    public final synchronized List<InterfaceC1891350zJl> LJIILJJIL(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        C1598660rhg.LIZ.getClass();
        C1598730rhn c1598730rhn = C1598660rhg.LIZLLL;
        c1598730rhn.getClass();
        c1598730rhn.LIZJ = System.currentTimeMillis();
        c1598730rhn.LJI = "from_preload";
        C1599560rj8 c1599560rj8 = C1598660rhg.LJ;
        c1599560rj8.LIZJ(1);
        C1598160rgs.LIZ.getClass();
        InterfaceC1891350zJl interfaceC1891350zJlLJFF = C1598160rgs.LJFF();
        if (interfaceC1891350zJlLJFF != null) {
            arrayList.add(interfaceC1891350zJlLJFF);
        }
        StoryInboxItem storyInboxItemLIZLLL = C1598160rgs.LIZLLL();
        if (storyInboxItemLIZLLL != null) {
            User author = storyInboxItemLIZLLL.getStoryCollection().getAuthor();
            if (author != null) {
                author.setStoryStatus(-56831);
            }
            arrayList.add(storyInboxItemLIZLLL);
        }
        if (C1599180riW.LIZ()) {
            C1901580zaG.LIZ.getClass();
            if (C1901580zaG.LJIIIIZZ()) {
                arrayList.addAll(C1598160rgs.LIZJ(C1901580zaG.LJII()));
            }
        }
        if (z) {
            LJIILLIIL().LIZ();
            ((Map) LJIILLIIL().LJ.getValue()).put("SKYLIGHT_DATA_CACHE", arrayList);
            ((AtomicBoolean) this.LIZIZ.getValue()).set(true);
        }
        c1598730rhn.LIZIZ();
        c1599560rj8.LIZIZ(1);
        return arrayList;
    }

    public static Map LJIILL(String str, String str2) {
        return C2097608Jq.LJIIIIZZ(new Pair("key", str), new Pair("value", str2));
    }

    @Override // X.InterfaceC1598750rhp
    public final StoryCacheData LIZ(boolean z, C1598830rhx c1598830rhx) {
        return C614770O9j.LIZIZ.LIZ().LIZLLL(z, c1598830rhx);
    }
}
