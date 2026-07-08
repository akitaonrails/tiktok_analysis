package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.FeedLoginConfig;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;

/* JADX INFO: renamed from: X.10Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19242310Pt {
    public static final C19242310Pt LIZ = new C19242310Pt();
    public static boolean LIZIZ;

    public static FeedLoginConfig LIZ() {
        IPluginService.PluginData next;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                break;
            }
        }
        IPluginService.PluginData pluginData = next;
        if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null) {
            return null;
        }
        return personalizedNUJV2Data.feedLoginConfig;
    }
}
