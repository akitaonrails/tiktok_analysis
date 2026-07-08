package X;

import com.ss.android.ugc.aweme.social.sticker.enteredit.streak.ColorMetaData;
import com.ss.android.ugc.aweme.social.sticker.enteredit.streak.GroupChatStreakInfoColorConfig;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20173313wZ {
    public static final GroupChatStreakInfoColorConfig LIZ = new GroupChatStreakInfoColorConfig(null, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(312));

    public static ColorMetaData LIZ(int i) {
        GroupChatStreakInfoColorConfig groupChatStreakInfoColorConfig = (GroupChatStreakInfoColorConfig) LIZIZ.getValue();
        ColorMetaData colorMetaData = groupChatStreakInfoColorConfig.getColorMap().get(String.valueOf(i));
        if (colorMetaData != null) {
            return colorMetaData;
        }
        if (i >= 300) {
            ColorMetaData colorMetaData2 = groupChatStreakInfoColorConfig.getColorMap().get("300");
            if (colorMetaData2 == null) {
                return C20173213wY.LJFF;
            }
            return colorMetaData2;
        }
        if (i >= 200) {
            ColorMetaData colorMetaData3 = groupChatStreakInfoColorConfig.getColorMap().get("200");
            if (colorMetaData3 != null) {
                return colorMetaData3;
            }
            return C20173213wY.LJ;
        }
        if (i >= 100) {
            ColorMetaData colorMetaData4 = groupChatStreakInfoColorConfig.getColorMap().get("100");
            if (colorMetaData4 != null) {
                return colorMetaData4;
            }
            return C20173213wY.LIZLLL;
        }
        if (i >= 30) {
            ColorMetaData colorMetaData5 = groupChatStreakInfoColorConfig.getColorMap().get("30");
            if (colorMetaData5 != null) {
                return colorMetaData5;
            }
            return C20173213wY.LIZJ;
        }
        if (i >= 10) {
            ColorMetaData colorMetaData6 = groupChatStreakInfoColorConfig.getColorMap().get("10");
            if (colorMetaData6 != null) {
                return colorMetaData6;
            }
            return C20173213wY.LIZIZ;
        }
        ColorMetaData colorMetaData7 = groupChatStreakInfoColorConfig.getColorMap().get("3");
        if (colorMetaData7 != null) {
            return colorMetaData7;
        }
        return C20173213wY.LIZ;
    }
}
