package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS64S0210000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727100Sfc {
    public static void LIZLLL(UserStory userStory, String str) {
        if (!C596340NaC.LIZIZ().isEnabled || !C596340NaC.LIZIZ().storyCacheEnable) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C610580NxA(str, userStory, null), 3);
    }

    public final void LIZ(String str, UserStory userStory, String str2, String str3) {
        if (str == null || userStory == null || str2 == null) {
            return;
        }
        C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
        c1605650rsx.LJIJ(str2);
        c1605650rsx.LJII(str, str2, new AwS555S0100000_11(userStory, 12));
        c1605650rsx.LJIIJ(EnumC1615506Uf.STORY, str, str2, new C727120Sfe(userStory, str, this, str3));
    }

    public static void LIZIZ(String str, String str2, UserStory userStory, Integer num, Aweme aweme, boolean z) {
        int i;
        int iIntValue;
        Integer num2;
        if (str == null || str2 == null || userStory == null) {
            return;
        }
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            i = currentInfo.dispatchCode;
        } else {
            i = 0;
        }
        UserStoryCurrentInfo userStoryCurrentInfo = new UserStoryCurrentInfo(num, aweme, i);
        if (!Intrinsics.LJFF(currentInfo, userStoryCurrentInfo)) {
            userStory.setCurrentInfo(userStoryCurrentInfo);
            if (num != null) {
                num.intValue();
                UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
                if (maxViewedInfo != null && (num2 = maxViewedInfo.currentIndex) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -1;
                }
                if (iIntValue < num.intValue()) {
                    userStory.setMaxViewedInfo(new UserStoryCurrentInfo(num, aweme, 0));
                }
            }
            if (C729510SjV.LJIILJJIL(str2) && !userStory.getFakeAwemeShell()) {
                C727870Sgr.LIZIZ(new AwS64S0210000_11(z, userStoryCurrentInfo, userStory, 0));
            }
            LIZLLL(userStory, str2);
        }
    }
}
