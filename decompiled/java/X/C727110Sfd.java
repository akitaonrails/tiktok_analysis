package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.HybridLabelTagType;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727110Sfd {
    public static final void LIZJ(Aweme aweme, String str, boolean z) {
        boolean z2;
        User author;
        int currentPosition;
        List<AwemeHybridLabelModel> hybridLabels;
        List<Aweme> stories;
        Aweme aweme2;
        EnumC727130Sff enumC727130Sff;
        User author2;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        UserStory userStory2;
        if (z && (userStory = aweme.getUserStory()) != null && !userStory.getFakeAwemeShell() && (userStory2 = aweme.getUserStory()) != null && !userStory2.getFakeSelfStoryCollection()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJFF = Intrinsics.LJFF(aweme.getAid(), "reveal_story");
        if (aweme.getAid() == null) {
            aweme.setAid("");
        }
        Aweme awemeCurrentStory = null;
        if (aweme.getAuthor() == null) {
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 != null && (stories2 = userStory3.getStories()) != null && (aweme3 = (Aweme) C13LP.LJJJLL(stories2)) != null) {
                author2 = aweme3.getAuthor();
            } else {
                author2 = null;
            }
            aweme.setAuthor(author2);
        }
        if (zLJFF) {
            aweme.setAuthor(C727450SgB.LIZIZ(C13BV.INSTANCE));
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            UserStory userStory4 = aweme.getUserStory();
            if (userStory4 != null && userStory4.getAllViewed()) {
                enumC727130Sff = EnumC727130Sff.ALL_VIEWED;
            } else {
                enumC727130Sff = EnumC727130Sff.HAS_UNREAD;
            }
            author3.setStoryStatus(enumC727130Sff.getStatus());
        }
        if (aweme.getHybridLabels() == null) {
            UserStory userStory5 = aweme.getUserStory();
            if (userStory5 != null && (stories = userStory5.getStories()) != null && (aweme2 = (Aweme) C13LP.LJJJLL(stories)) != null) {
                hybridLabels = aweme2.getHybridLabels();
            } else {
                hybridLabels = null;
            }
            aweme.setHybridLabels(hybridLabels);
        }
        UserStory userStory6 = aweme.getUserStory();
        if (userStory6 != null) {
            List<Aweme> stories3 = userStory6.getStories();
            if (zLJFF) {
                author = null;
            } else {
                author = aweme.getAuthor();
            }
            LIZ(stories3, str, author, null, null, null);
            Integer numCurrentIndex = UserStoryKt.currentIndex(userStory6);
            if (numCurrentIndex != null) {
                currentPosition = numCurrentIndex.intValue();
            } else {
                currentPosition = (int) userStory6.getCurrentPosition();
            }
            Integer numValueOf = Integer.valueOf(currentPosition);
            if (userStory6.getStories().size() > 0 && (awemeCurrentStory = UserStoryKt.currentStory(userStory6)) == null) {
                awemeCurrentStory = (Aweme) ListProtector.get(userStory6.getStories(), 0);
            }
            userStory6.setCurrentInfo(new UserStoryCurrentInfo(numValueOf, awemeCurrentStory, 0));
            if (z2) {
                userStory6.setOriginTotalCount(userStory6.getTotalCount());
            }
            userStory6.setFromRemote(z);
        }
        if (str != null) {
            aweme.setRequestId(str);
        }
        AwemeBizExtKt.setStoryPacked(aweme, true);
    }

    public static final List<Aweme> LIZ(List<Aweme> list, String str, User user, MutualStruct mutualStruct, AwemeRelationRecommendModel awemeRelationRecommendModel, List<AwemeHybridLabelModel> list2) {
        ArrayList<Aweme> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Aweme aweme : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ListProtector.set(list, i, C2280641EOo.LIZIZ.LLILLL(aweme));
                arrayList.add(ListProtector.get(list, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        for (Aweme aweme2 : arrayList) {
            if (user != null) {
                aweme2.setAuthor(user);
            }
            if (str != null) {
                aweme2.setRequestId(str);
            }
            aweme2.setUserStory(null);
            if (mutualStruct != null) {
                aweme2.setMutualRelation(mutualStruct);
            }
            if (awemeRelationRecommendModel != null) {
                aweme2.setRelationRecommendInfo(awemeRelationRecommendModel);
            }
            if (list2 != null) {
                for (AwemeHybridLabelModel awemeHybridLabelModel : list2) {
                    if (awemeHybridLabelModel.labelType == HybridLabelTagType.FRIEND.getValue() || awemeHybridLabelModel.labelType == HybridLabelTagType.FOLLOWING.getValue()) {
                        aweme2.setHybridLabels(Collections.singletonList(awemeHybridLabelModel));
                    }
                }
            }
        }
        return arrayList;
    }
}
