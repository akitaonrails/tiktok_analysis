package X;

import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;

/* JADX INFO: renamed from: X.14Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20227614Cs {
    public static final boolean LIZ(AIBotInfo aIBotInfo) {
        if (aIBotInfo.botSource == 2 && aIBotInfo.botId != 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(TakoEnterParams takoEnterParams) {
        return LIZ(takoEnterParams.botInfo);
    }

    public static final boolean LIZJ(TakoEnterParams takoEnterParams) {
        if (LIZ(takoEnterParams.botInfo) && takoEnterParams.botInfo.isCsiBot()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(TakoEnterParams takoEnterParams) {
        if (LIZ(takoEnterParams.botInfo) && takoEnterParams.botInfo.isPlay()) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(AIBotInfo aIBotInfo) {
        if (aIBotInfo.bgUrl.length() > 0 && aIBotInfo.bgBasicColor.length() > 0) {
            return true;
        }
        return false;
    }
}
