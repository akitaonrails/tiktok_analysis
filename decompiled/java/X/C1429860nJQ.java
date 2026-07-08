package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0nJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429860nJQ {
    public static InteractionCheckInfo LIZ(PollStruct pollStruct) {
        if (pollStruct == null) {
            return null;
        }
        InteractionCheckInfo interactionCheckInfo = new InteractionCheckInfo();
        LinkedList linkedList = new LinkedList();
        if (pollStruct.getOptions().size() == 2) {
            linkedList.add(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption());
            linkedList.add(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption());
            interactionCheckInfo.setOptions(linkedList);
        }
        interactionCheckInfo.setQuestion(pollStruct.getQuestion());
        return interactionCheckInfo;
    }

    public static NormalTrackTimeStamp LIZIZ(InteractStickerStruct interactStickerStruct) {
        List list;
        try {
            list = (List) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJIIIIZZ(interactStickerStruct.getTrackList(), new TypeToken<List<NormalTrackTimeStamp>>() { // from class: X.0nJR
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        if (C086I.LIZIZ(list)) {
            return null;
        }
        return (NormalTrackTimeStamp) ListProtector.get(list, 0);
    }

    public static C0WIY<String, String> LIZJ(C1429890nJT c1429890nJT) {
        String str;
        String str2;
        HashMap map;
        List<InteractStickerStruct> listLJI = LJI(c1429890nJT, 1, EnumC1428480nHC.TRACK_PAGE_EDIT);
        String str3 = "";
        if (listLJI != null && !listLJI.isEmpty() && !C2093608Ic.LJ(((InteractStickerStruct) ListProtector.get(listLJI, 0)).getAttr())) {
            try {
                map = (HashMap) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJIIIIZZ(listLJI.get(0).getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.0nJP
                }.getType());
            } catch (Exception e) {
                e = e;
                str = "";
            }
            if (map == null) {
                str2 = "";
                return new C0WIY<>(str3, str2);
            }
            if (!map.containsKey("poll_sticker_id")) {
                str = "";
            } else {
                str = (String) map.get("poll_sticker_id");
            }
            try {
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C1632480saE.LIZIZ, "getPollStickerIds error", e);
            }
            if (!map.containsKey("poll_sticker_tab_id")) {
                str2 = "";
            } else {
                str2 = (String) map.get("poll_sticker_tab_id");
            }
            str3 = str;
            return new C0WIY<>(str3, str2);
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C1632480saE.LIZIZ, "getPollStickerIds error", e);
            str2 = "";
            str3 = str;
            return new C0WIY<>(str3, str2);
        }
        return new C0WIY<>("", "");
    }

    public static InteractStickerTracksContext LJII(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        try {
            return ((C1429890nJT) C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson().LJII(str, C1429890nJT.class)).mInteractStickerContext;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Collection<InteractStickerStruct> LIZLLL(BaseShortVideoContext baseShortVideoContext, EnumC1428480nHC... enumC1428480nHCArr) {
        InteractStickerTracksContext interactStickerTracksContextLJII;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            C1429890nJT mainBusinessContext = ((VideoPublishEditModelKt) baseShortVideoContext).getMainBusinessContext();
            if (mainBusinessContext != null) {
                interactStickerTracksContextLJII = mainBusinessContext.mInteractStickerContext;
            }
            return null;
        }
        interactStickerTracksContextLJII = LJII(baseShortVideoContext.getMainBusinessData());
        if (interactStickerTracksContextLJII != null && !interactStickerTracksContextLJII.isEmpty(enumC1428480nHCArr)) {
            List<InteractStickerStruct> stickerStructsByPage = interactStickerTracksContextLJII.getStickerStructsByPage(enumC1428480nHCArr);
            for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
                if (interactStickerStruct.getPollStruct() != null) {
                    PollStruct pollStruct = interactStickerStruct.getPollStruct();
                    if (!C086I.LIZIZ(pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                        if (C2093608Ic.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption())) {
                            ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).setPostOption(C0CHQ.LIZ.getString(2131858399));
                        }
                        if (C2093608Ic.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption())) {
                            ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).setPostOption(C0CHQ.LIZ.getString(2131858400));
                        }
                    }
                }
            }
            return stickerStructsByPage;
        }
        return null;
    }

    public static List<InteractStickerStruct> LJ(C1429890nJT c1429890nJT, EnumC1428480nHC... enumC1428480nHCArr) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (c1429890nJT == null || (interactStickerTracksContext = c1429890nJT.mInteractStickerContext) == null || interactStickerTracksContext.isEmpty(enumC1428480nHCArr)) {
            return null;
        }
        List<InteractStickerStruct> stickerStructsByPage = interactStickerTracksContext.getStickerStructsByPage(enumC1428480nHCArr);
        for (InteractStickerStruct interactStickerStruct : stickerStructsByPage) {
            if (interactStickerStruct.getPollStruct() != null) {
                PollStruct pollStruct = interactStickerStruct.getPollStruct();
                if (!C086I.LIZIZ(pollStruct.getOptions()) && pollStruct.getOptions().size() >= 2) {
                    if (C2093608Ic.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).getPostOption())) {
                        ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 0)).setPostOption(C0CHQ.LIZ.getString(2131858399));
                    }
                    if (C2093608Ic.LJ(((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).getPostOption())) {
                        ((PollStruct.OptionsBean) ListProtector.get(pollStruct.getOptions(), 1)).setPostOption(C0CHQ.LIZ.getString(2131858400));
                    }
                }
            }
        }
        return stickerStructsByPage;
    }

    public static List<InteractStickerStruct> LJIIIIZZ(String str, EnumC1428480nHC enumC1428480nHC) {
        InteractStickerTracksContext interactStickerTracksContextLJII = LJII(str);
        if (interactStickerTracksContextLJII == null) {
            return null;
        }
        return interactStickerTracksContextLJII.getStickerStructsByPage(enumC1428480nHC);
    }

    public static List<InteractStickerStruct> LJFF(BaseShortVideoContext baseShortVideoContext, int i, EnumC1428480nHC enumC1428480nHC) {
        InteractStickerTracksContext interactStickerTracksContextLJII;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            C1429890nJT mainBusinessContext = ((VideoPublishEditModelKt) baseShortVideoContext).getMainBusinessContext();
            if (mainBusinessContext != null) {
                interactStickerTracksContextLJII = mainBusinessContext.mInteractStickerContext;
            }
            return null;
        }
        interactStickerTracksContextLJII = LJII(baseShortVideoContext.getMainBusinessData());
        if (interactStickerTracksContextLJII != null) {
            return interactStickerTracksContextLJII.getStickerStructByPageAndType(Integer.valueOf(i), enumC1428480nHC);
        }
        return null;
    }

    public static List<InteractStickerStruct> LJI(C1429890nJT c1429890nJT, int i, EnumC1428480nHC enumC1428480nHC) {
        InteractStickerTracksContext interactStickerTracksContext;
        if (c1429890nJT == null || (interactStickerTracksContext = c1429890nJT.mInteractStickerContext) == null) {
            return null;
        }
        return interactStickerTracksContext.getStickerStructByPageAndType(Integer.valueOf(i), enumC1428480nHC);
    }

    public static String LJIIIZ(C1429890nJT c1429890nJT, List<InteractStickerStruct> list, EnumC1428480nHC enumC1428480nHC) {
        if (c1429890nJT == null) {
            c1429890nJT = new C1429890nJT();
        }
        InteractStickerTracksContext interactStickerTracksContext = c1429890nJT.mInteractStickerContext;
        if (interactStickerTracksContext == null) {
            interactStickerTracksContext = new InteractStickerTracksContext();
        }
        interactStickerTracksContext.upDateStickerStructs(list, enumC1428480nHC);
        c1429890nJT.setInteractStickerContext(interactStickerTracksContext);
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson(), c1429890nJT);
    }
}
