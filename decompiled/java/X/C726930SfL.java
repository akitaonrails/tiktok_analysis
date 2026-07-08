package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726930SfL {
    public static UserStory LIZ(String str) {
        User author;
        Aweme aweme;
        Aweme aweme2;
        try {
            C1227904rF.LIZ.getClass();
            UserStory userStory = (UserStory) C1227904rF.LIZIZ(str, UserStory.class);
            if (userStory != null) {
                Aweme aweme3 = (Aweme) C13LP.LJJJLL(userStory.getStories());
                if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("userStoryFromJson: user=");
                    sbLIZ.append(author.getNickname());
                    sbLIZ.append(", metadata=");
                    sbLIZ.append(author.getAllStoryMetadata());
                    C2188811AlT.LIZIZ(sbLIZ);
                    for (Aweme aweme4 : userStory.getStories()) {
                        if (aweme4.getAuthor() == null) {
                            aweme4.setAuthor(author);
                        }
                    }
                    UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
                    if (currentInfo != null && (aweme2 = currentInfo.currentStory) != null && aweme2.getAuthor() == null) {
                        aweme2.setAuthor(author);
                    }
                    UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
                    if (maxViewedInfo != null && (aweme = maxViewedInfo.currentStory) != null && aweme.getAuthor() == null) {
                        aweme.setAuthor(author);
                        return userStory;
                    }
                    return userStory;
                }
                return userStory;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("UserStoryTypeConverter", "userStoryFromJson error", e);
        }
        return null;
    }

    public static String LIZIZ(UserStory userStory) {
        User author;
        UserStoryCurrentInfo userStoryCurrentInfoCopy;
        String nickname;
        UserAllStoryMetadata allStoryMetadata;
        User author2;
        User author3;
        Aweme awemeM199clone;
        Aweme aweme;
        Aweme awemeM199clone2;
        Aweme aweme2;
        UserStoryCurrentInfo userStoryCurrentInfoCopy2 = null;
        if (userStory == null) {
            return null;
        }
        if (userStory.getStories().size() == 0) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("UserStoryTypeConverter", "no story");
            return null;
        }
        Aweme aweme3 = (Aweme) C13LP.LJJJLL(userStory.getStories());
        if (aweme3 != null) {
            author = aweme3.getAuthor();
        } else {
            author = null;
        }
        if (author == null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZ("UserStoryTypeConverter", "no author");
            return null;
        }
        UserAllStoryMetadata userAllStoryMetadataLJIJI = C1605650rsx.LIZIZ.LJIJI(EnumC1615506Uf.STORY, author.getUid());
        if (userAllStoryMetadataLJIJI != null && !Intrinsics.LJFF(userAllStoryMetadataLJIJI, author.getAllStoryMetadata())) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LJI("UserStoryTypeConverter", "update user metadata to latest");
            author.setAllStoryMetadata(userAllStoryMetadataLJIJI);
        }
        List<Aweme> listLLIIII = C13LP.LLIIII(userStory.getStories());
        ArrayList arrayList = new ArrayList();
        int i4 = -1;
        for (Aweme awemeM199clone3 : listLLIIII) {
            i4++;
            if (i4 != 0) {
                awemeM199clone3 = awemeM199clone3.m199clone();
                awemeM199clone3.setAuthor(null);
            }
            arrayList.add(awemeM199clone3);
        }
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            UserStoryCurrentInfo currentInfo2 = userStory.getCurrentInfo();
            if (currentInfo2 != null && (aweme2 = currentInfo2.currentStory) != null && (awemeM199clone2 = aweme2.m199clone()) != null) {
                awemeM199clone2.setAuthor(null);
            } else {
                awemeM199clone2 = null;
            }
            userStoryCurrentInfoCopy = currentInfo.copy(currentInfo.currentIndex, awemeM199clone2, currentInfo.dispatchCode);
        } else {
            userStoryCurrentInfoCopy = null;
        }
        UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
        if (maxViewedInfo != null) {
            UserStoryCurrentInfo maxViewedInfo2 = userStory.getMaxViewedInfo();
            if (maxViewedInfo2 != null && (aweme = maxViewedInfo2.currentStory) != null && (awemeM199clone = aweme.m199clone()) != null) {
                awemeM199clone.setAuthor(null);
            } else {
                awemeM199clone = null;
            }
            userStoryCurrentInfoCopy2 = maxViewedInfo.copy(maxViewedInfo.currentIndex, awemeM199clone, maxViewedInfo.dispatchCode);
        }
        UserStory userStoryCopy = userStory.copy(arrayList, userStory.totalCount, userStory.currentPosition, userStory.allViewed, userStory.minCursor, userStory.maxCursor, userStory.hasMoreAfter, userStory.hasMoreBefore, userStory.lastStoryCreatedAt, userStory.isPostStyle, userStory.metaDataList, userStory.userFilterStoryInfo, userStory.isStoryGuideCard, userStory.highlightSkylightUser, userStory.originTotalCount, userStoryCurrentInfoCopy, userStory.fakeSelfStoryCollection, userStory.fakeAwemeShell, userStoryCurrentInfoCopy2, userStory.firstUnViewedStoryIdx, userStory.shouldStartFromUnViewedStoryIdx, userStory.totalVV, userStory.unReadStoryAids, userStory.isFromRemote);
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(userStoryCopy);
            if (strLJI != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("userStoryToJson: user=");
                Aweme aweme4 = (Aweme) C13LP.LJJJLL(arrayList);
                if (aweme4 != null && (author3 = aweme4.getAuthor()) != null) {
                    nickname = author3.getNickname();
                } else {
                    nickname = null;
                }
                sbLIZ.append(nickname);
                sbLIZ.append(", metadata=");
                Aweme aweme5 = (Aweme) C13LP.LJJJLL(arrayList);
                if (aweme5 != null && (author2 = aweme5.getAuthor()) != null) {
                    allStoryMetadata = author2.getAllStoryMetadata();
                } else {
                    allStoryMetadata = null;
                }
                sbLIZ.append(allStoryMetadata);
                C2188811AlT.LIZIZ(sbLIZ);
                return strLJI;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i5 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("UserStoryTypeConverter", "userStoryToJson error", e);
            return null;
        }
    }
}
