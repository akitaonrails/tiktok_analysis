package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2356009La {
    public static final C2356009La LIZ = new C2356009La();
    public static final ConcurrentHashMap<String, VEUtils.VEVideoFileInfo> LIZIZ = new ConcurrentHashMap<>();

    public static VEUtils.VEVideoFileInfo LIZ(String str) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null) || str == null || a0.LJJJIL(str)) {
            return null;
        }
        ConcurrentHashMap<String, VEUtils.VEVideoFileInfo> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str);
        }
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return null;
        }
        concurrentHashMap.put(str, videoFileInfo);
        return videoFileInfo;
    }
}
