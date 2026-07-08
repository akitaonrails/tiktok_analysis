package X;

import android.graphics.Color;
import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColor;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorItem;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveTakeTheStageColorListConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982410bfj {
    public static final String LIZ(long j) {
        if (j == 1) {
            return C497740JfY.LJIJI(2131853299);
        }
        if (j == 2) {
            return C497740JfY.LJIJI(2131853300);
        }
        if (j == 3) {
            return C497740JfY.LJIJI(2131853301);
        }
        if (j == 4) {
            return C497740JfY.LJIJI(2131853302);
        }
        return "";
    }

    public static final TakeTheStageBizExtra LIZIZ(AbstractC982800bgM abstractC982800bgM) {
        if (abstractC982800bgM == null) {
            return null;
        }
        InterfaceC952130ast interfaceC952130ast = abstractC982800bgM.LIZLLL;
        if (!(interfaceC952130ast instanceof TakeTheStageBizExtra)) {
            return null;
        }
        return (TakeTheStageBizExtra) interfaceC952130ast;
    }

    public static final TakeTheStageBizExtra LIZJ(AbstractC982860bgS abstractC982860bgS) {
        if (abstractC982860bgS == null) {
            return null;
        }
        InterfaceC952130ast interfaceC952130ast = abstractC982860bgS.LIZLLL;
        if (!(interfaceC952130ast instanceof TakeTheStageBizExtra)) {
            return null;
        }
        return (TakeTheStageBizExtra) interfaceC952130ast;
    }

    public static final String LIZLLL(int i) {
        LiveTakeTheStageColor liveTakeTheStageColor;
        String str;
        LiveTakeTheStageColorItem liveTakeTheStageColorItemLIZ = C983930biB.LIZ(LiveTakeTheStageColorListConfigSetting.INSTANCE.getValue(), i);
        if (liveTakeTheStageColorItemLIZ != null && (liveTakeTheStageColor = liveTakeTheStageColorItemLIZ.ledComponentColor) != null && (str = liveTakeTheStageColor.colorName) != null) {
            return str;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return "Red";
                }
                return "Blue";
            }
            return "Orange";
        }
        return "Purple";
    }

    public static final String LJ(int i) {
        String str;
        boolean z;
        LiveTakeTheStageColor liveTakeTheStageColor;
        LiveTakeTheStageColorItem liveTakeTheStageColorItemLIZ = C983930biB.LIZ(LiveTakeTheStageColorListConfigSetting.INSTANCE.getValue(), i);
        if (liveTakeTheStageColorItemLIZ == null || (liveTakeTheStageColor = liveTakeTheStageColorItemLIZ.switchTurnAnimationColor) == null || (str = liveTakeTheStageColor.bgColorHex) == null) {
            str = "";
        }
        try {
            Color.parseColor(str);
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        if (!z) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return "#00000000";
                        }
                        return "#DA495C";
                    }
                    return "#3388D1";
                }
                return "#E3893F";
            }
            return "#8932FF";
        }
        return str;
    }
}
