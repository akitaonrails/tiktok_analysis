package X;

import com.ss.android.ugc.aweme.explore.data.ExploreCardInsertResultStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupInsertCard;
import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicsInsertCard;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20529615Uw {
    public static List LIZIZ(ExploreCardInsertResultStruct exploreCardInsertResultStruct) {
        ExploreChatGroupInsertCard exploreChatGroupInsertCard;
        if (exploreCardInsertResultStruct.getCardStatus() == EnumC20529815Uy.EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS && exploreCardInsertResultStruct.getCardType() == EnumC20529715Ux.EXPLORE_INSERT_CARD_TYPE_CHAT_GROUP && (exploreChatGroupInsertCard = exploreCardInsertResultStruct.chatGroupCard) != null) {
            List<ExploreChatGroupStruct> list = exploreChatGroupInsertCard.exploreChatGroups;
            ArrayList arrayList = new ArrayList();
            for (ExploreChatGroupStruct exploreChatGroupStruct : list) {
                if (exploreChatGroupStruct.groupId != null) {
                    arrayList.add(exploreChatGroupStruct);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LIZJ(ExploreCardInsertResultStruct exploreCardInsertResultStruct) {
        ExploreCustomTopicsInsertCard exploreCustomTopicsInsertCard;
        if (exploreCardInsertResultStruct.getCardStatus() == EnumC20529815Uy.EXPLORE_INSERT_CARD_STATUS_TYPE_SUCCESS && exploreCardInsertResultStruct.getCardType() == EnumC20529715Ux.EXPLORE_INSERT_CARD_TYPE_CUSTOMTOPICS && (exploreCustomTopicsInsertCard = exploreCardInsertResultStruct.userCustomTopicsCard) != null) {
            List<ExploreCustomTopicStruct> list = exploreCustomTopicsInsertCard.exploreCustomTopics;
            ArrayList arrayList = new ArrayList();
            for (ExploreCustomTopicStruct exploreCustomTopicStruct : list) {
                ExploreCustomTopicStruct exploreCustomTopicStruct2 = exploreCustomTopicStruct;
                if (exploreCustomTopicStruct2.topicId != null && exploreCustomTopicStruct2.topicName != null) {
                    arrayList.add(exploreCustomTopicStruct);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ExploreCardInsertResultStruct exploreCardInsertResultStruct = (ExploreCardInsertResultStruct) it2.next();
            ExploreCardInsertResultStruct.Companion.getClass();
            C19719612Di.LJJI(LIZJ(exploreCardInsertResultStruct), arrayList);
        }
        return arrayList;
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ExploreCardInsertResultStruct exploreCardInsertResultStruct = (ExploreCardInsertResultStruct) it2.next();
            ExploreCardInsertResultStruct.Companion.getClass();
            C19719612Di.LJJI(LIZIZ(exploreCardInsertResultStruct), arrayList);
        }
        return arrayList;
    }

    public static void LIZ(List list, String str, LogPbBean logPbBean) {
        List<ExploreChatGroupStruct> list2;
        List<ExploreCustomTopicStruct> list3;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ExploreCardInsertResultStruct exploreCardInsertResultStruct = (ExploreCardInsertResultStruct) it2.next();
            exploreCardInsertResultStruct.setRequestId(str);
            ExploreCustomTopicsInsertCard exploreCustomTopicsInsertCard = exploreCardInsertResultStruct.userCustomTopicsCard;
            if (exploreCustomTopicsInsertCard != null) {
                exploreCustomTopicsInsertCard.setRequestId(str);
            }
            exploreCardInsertResultStruct.setLogPbBean(logPbBean);
            ExploreCustomTopicsInsertCard exploreCustomTopicsInsertCard2 = exploreCardInsertResultStruct.userCustomTopicsCard;
            if (exploreCustomTopicsInsertCard2 != null) {
                exploreCustomTopicsInsertCard2.setLogPbBean(logPbBean);
            }
            ExploreCustomTopicsInsertCard exploreCustomTopicsInsertCard3 = exploreCardInsertResultStruct.userCustomTopicsCard;
            if (exploreCustomTopicsInsertCard3 != null && (list3 = exploreCustomTopicsInsertCard3.exploreCustomTopics) != null) {
                for (ExploreCustomTopicStruct exploreCustomTopicStruct : list3) {
                    exploreCustomTopicStruct.setRequestId(str);
                    exploreCustomTopicStruct.setLogPbBean(logPbBean);
                }
            }
            ExploreChatGroupInsertCard exploreChatGroupInsertCard = exploreCardInsertResultStruct.chatGroupCard;
            if (exploreChatGroupInsertCard != null) {
                exploreChatGroupInsertCard.setRequestId(str);
            }
            ExploreChatGroupInsertCard exploreChatGroupInsertCard2 = exploreCardInsertResultStruct.chatGroupCard;
            if (exploreChatGroupInsertCard2 != null) {
                exploreChatGroupInsertCard2.setLogPbBean(logPbBean);
            }
            ExploreChatGroupInsertCard exploreChatGroupInsertCard3 = exploreCardInsertResultStruct.chatGroupCard;
            if (exploreChatGroupInsertCard3 != null && (list2 = exploreChatGroupInsertCard3.exploreChatGroups) != null) {
                for (ExploreChatGroupStruct exploreChatGroupStruct : list2) {
                    exploreChatGroupStruct.setRequestId(str);
                    exploreChatGroupStruct.setLogPbBean(logPbBean);
                }
            }
        }
    }
}
