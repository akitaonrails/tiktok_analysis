package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BotShareInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS396S0200000_30;

/* JADX INFO: renamed from: X.14Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20231914Ej implements C14EH {
    public static final C20231914Ej LIZ = new C20231914Ej();

    public static void LIZJ() {
        if (((Number) C07IK.LIZ.getValue()).intValue() != 1) {
            AnonymousClass1426.LIZ.getClass();
            if (!AnonymousClass1426.LIZ()) {
                return;
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20040113b5(null), 3);
    }

    public static AIBotInfo LIZLLL(TakoBotInfo takoBotInfo) {
        String str;
        List<String> list;
        long j = takoBotInfo.botId;
        int i = takoBotInfo.botSource;
        String str2 = takoBotInfo.botName;
        String str3 = takoBotInfo.botAvatar;
        int i2 = takoBotInfo.botType;
        int i3 = takoBotInfo.botMode;
        String str4 = takoBotInfo.botDescripton;
        boolean z = takoBotInfo.disableHistory;
        boolean z2 = takoBotInfo.useIndependentDomain;
        String str5 = takoBotInfo.creator;
        List<String> list2 = takoBotInfo.bgUrls;
        String str6 = takoBotInfo.bgUrl;
        String str7 = takoBotInfo.bgBasicColor;
        BotShareInfo botShareInfo = takoBotInfo.shareInfo;
        String str8 = null;
        if (botShareInfo != null) {
            str8 = botShareInfo.shareTitle;
            str = botShareInfo.shareText;
            list = botShareInfo.shareHashtag;
        } else {
            str = null;
            list = null;
        }
        return new AIBotInfo(j, str2, str3, i, i2, i3, str4, takoBotInfo.openingSugs, false, z, z2, null, str5, list2, str6, takoBotInfo.bubbleColor, takoBotInfo.hintContentColor, takoBotInfo.newCategoryLabels, takoBotInfo.isPlay, str7, str8, str, list, 2304, null);
    }

    @Override // X.C14EH
    public final void LIZ(AwS396S0200000_30 awS396S0200000_30) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1860700yWK(88872960259L, 0, true, awS396S0200000_30, null), 3);
    }

    public static final void LIZIZ(Function0 function0, Function0 function02, boolean z) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1860670yWH(z, function0, function02, null), 3);
    }
}
