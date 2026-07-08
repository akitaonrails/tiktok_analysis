package X;

import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19241810Po {
    public static final C19241810Po LIZ = new C19241810Po();

    public static boolean LIZIZ() {
        IPluginService.PluginData next;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        PersonalizedNUJV2Data personalizedNUJV2Data2;
        if (PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null) == null) {
            return false;
        }
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
        if (pluginData != null) {
            IPluginService.PluginDataWrapper pluginDataWrapper = pluginData.configData;
            if (pluginDataWrapper != null && (personalizedNUJV2Data2 = pluginDataWrapper.personalizedNUJV2Data) != null) {
                if (!Intrinsics.LJFF(personalizedNUJV2Data2.shouldTryAgeGate, Boolean.TRUE)) {
                    if (pluginData != null) {
                    }
                }
                return true;
            }
            IPluginService.PluginDataWrapper pluginDataWrapper2 = pluginData.configData;
            if (pluginDataWrapper2 != null && (personalizedNUJV2Data = pluginDataWrapper2.personalizedNUJV2Data) != null && Intrinsics.LJFF(personalizedNUJV2Data.shouldTrySmartLock, Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ() {
        IPluginService.PluginData next;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        if (PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null) == null) {
            return false;
        }
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
            return false;
        }
        return Intrinsics.LJFF(personalizedNUJV2Data.shouldTryAgeGate, Boolean.TRUE);
    }

    public static final int LIZ() {
        boolean zLJIIIZ = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LJIIIZ();
        LIZ.getClass();
        return (LIZIZ() && zLJIIIZ) ? 1 : 0;
    }
}
