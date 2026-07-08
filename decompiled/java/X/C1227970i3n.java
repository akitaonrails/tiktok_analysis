package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.exp.EntranceHeaderConfig;
import com.ss.android.ugc.aweme.exp.GroupChatCreationConfig;
import com.ss.android.ugc.aweme.exp.ImGroupChatCreationConfigModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227970i3n {
    public static final ImGroupChatCreationConfigModel LIZ;

    static {
        EnumC913760Zt0 enumC913760Zt0 = EnumC913760Zt0.CAMPUS_GROUP;
        EnumC913760Zt0 enumC913760Zt02 = EnumC913760Zt0.FAN_GROUP;
        LIZ = new ImGroupChatCreationConfigModel(C2097608Jq.LJIIIIZZ(new Pair(enumC913760Zt0.getValue(), new GroupChatCreationConfig(LIZ().getString(2131831361), LIZ().getString(2131831360))), new Pair(enumC913760Zt02.getValue(), new GroupChatCreationConfig(LIZ().getString(2131827497), LIZ().getString(2131827496)))), C2097608Jq.LJIIIIZZ(new Pair(enumC913760Zt0.getValue(), new EntranceHeaderConfig(LIZ().getString(2131831363), LIZ().getString(2131831362))), new Pair(enumC913760Zt02.getValue(), new EntranceHeaderConfig(LIZ().getString(2131827492), LIZ().getString(2131827491)))));
    }

    public static Context LIZ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        return (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null) ? C1383370m6R.LIZ : activityLIZIZ;
    }

    public static EntranceHeaderConfig LIZIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ImGroupChatCreationConfigModel imGroupChatCreationConfigModel = LIZ;
        ImGroupChatCreationConfigModel imGroupChatCreationConfigModel2 = (ImGroupChatCreationConfigModel) settingsManagerLIZLLL.LJIIIIZZ("im_group_chat_creation_config", ImGroupChatCreationConfigModel.class, imGroupChatCreationConfigModel);
        if (imGroupChatCreationConfigModel2 != null) {
            imGroupChatCreationConfigModel = imGroupChatCreationConfigModel2;
        }
        Map<String, EntranceHeaderConfig> map = imGroupChatCreationConfigModel.entranceConfig;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static GroupChatCreationConfig LIZJ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ImGroupChatCreationConfigModel imGroupChatCreationConfigModel = LIZ;
        ImGroupChatCreationConfigModel imGroupChatCreationConfigModel2 = (ImGroupChatCreationConfigModel) settingsManagerLIZLLL.LJIIIIZZ("im_group_chat_creation_config", ImGroupChatCreationConfigModel.class, imGroupChatCreationConfigModel);
        if (imGroupChatCreationConfigModel2 != null) {
            imGroupChatCreationConfigModel = imGroupChatCreationConfigModel2;
        }
        Map<String, GroupChatCreationConfig> map = imGroupChatCreationConfigModel.creationPanelConfig;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
