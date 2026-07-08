package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.DMBotAccountInfo;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.DMBotInfoValueFromHttp;

/* JADX INFO: renamed from: X.1Cte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244841Cte {
    public static final IMAIBotInfo LIZ(DMBotInfoValueFromHttp dMBotInfoValueFromHttp) {
        String str;
        String str2;
        int iIntValue;
        long j = dMBotInfoValueFromHttp.botId;
        int i = dMBotInfoValueFromHttp.bizId;
        int i2 = dMBotInfoValueFromHttp.scene;
        int i3 = dMBotInfoValueFromHttp.status;
        long j2 = dMBotInfoValueFromHttp.creatorUid;
        DMBotAccountInfo dMBotAccountInfo = dMBotInfoValueFromHttp.botAccountInfo;
        String str3 = null;
        if (dMBotAccountInfo != null) {
            str3 = dMBotAccountInfo.nickname;
            str = dMBotAccountInfo.uniqueName;
            str2 = dMBotAccountInfo.avatarUrl;
        } else {
            str = null;
            str2 = null;
        }
        double d = dMBotInfoValueFromHttp.progressPercentage;
        String str4 = dMBotInfoValueFromHttp.progressText;
        int i4 = dMBotInfoValueFromHttp.suggestedReplySwitch;
        int i5 = dMBotInfoValueFromHttp.autoReplySwitch;
        String str5 = dMBotInfoValueFromHttp.avoid;
        String str6 = dMBotInfoValueFromHttp.checkFirst;
        Integer num = dMBotInfoValueFromHttp.mode;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new IMAIBotInfo(j, i, i2, i3, j2, str3, str, str2, d, str4, i4, i5, str5, str6, iIntValue, dMBotInfoValueFromHttp.updateTime);
    }

    public static final int LIZIZ(boolean z) {
        if (z) {
            return EnumC2244811Ctb.BOT_SWITCH_STATUS_ON.getValue();
        }
        return EnumC2244811Ctb.BOT_SWITCH_STATUS_OFF.getValue();
    }
}
