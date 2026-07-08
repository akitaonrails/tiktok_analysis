package X;

import android.graphics.Color;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColor;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorItem;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorListConfigSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982420bfk {
    public static C985000bju LIZ(C981480beE c981480beE) {
        String str;
        int color;
        LiveTakeTheStageColor liveTakeTheStageColor;
        String str2;
        LiveTakeTheStageColor liveTakeTheStageColor2;
        if (c981480beE == null) {
            C20441214yg.LIZLLL("competitionModel is null. Return empty color meta data.");
            return C985000bju.LIZJ;
        }
        int iLIZJ = (int) c981480beE.LJJIJIIJI.LIZJ(c981480beE.LJFF);
        LiveTakeTheStageColorListConfigSetting liveTakeTheStageColorListConfigSetting = LiveTakeTheStageColorListConfigSetting.INSTANCE;
        LiveTakeTheStageColorItem liveTakeTheStageColorItemLIZ = C983930biB.LIZ(liveTakeTheStageColorListConfigSetting.getValue(), iLIZJ);
        String str3 = "";
        if (liveTakeTheStageColorItemLIZ == null || (liveTakeTheStageColor2 = liveTakeTheStageColorItemLIZ.contributeListColor) == null || (str = liveTakeTheStageColor2.colorName) == null) {
            if (iLIZJ != 0) {
                if (iLIZJ != 1) {
                    if (iLIZJ != 2) {
                        if (iLIZJ != 3) {
                            str = "";
                        } else {
                            str = "Red";
                        }
                    } else {
                        str = "Blue";
                    }
                } else {
                    str = "Orange";
                }
            } else {
                str = "Purple";
            }
        }
        LiveTakeTheStageColorItem liveTakeTheStageColorItemLIZ2 = C983930biB.LIZ(liveTakeTheStageColorListConfigSetting.getValue(), iLIZJ);
        if (liveTakeTheStageColorItemLIZ2 != null && (liveTakeTheStageColor = liveTakeTheStageColorItemLIZ2.contributeListColor) != null && (str2 = liveTakeTheStageColor.itemBgColor) != null) {
            str3 = str2;
        }
        try {
            color = Color.parseColor(str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (iLIZJ != 0) {
                if (iLIZJ != 1) {
                    if (iLIZJ != 2) {
                        if (iLIZJ != 3) {
                            color = 0;
                        } else {
                            color = ColorProtector.parseColor("#FF89B9");
                        }
                    } else {
                        color = ColorProtector.parseColor("#22A9F2");
                    }
                } else {
                    color = ColorProtector.parseColor("#F28430");
                }
            } else {
                color = ColorProtector.parseColor("#8B38FF");
            }
        }
        return new C985000bju(str, new int[]{color, color});
    }
}
