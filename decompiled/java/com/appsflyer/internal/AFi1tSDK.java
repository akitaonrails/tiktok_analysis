package com.appsflyer.internal;

import X.C2097608Jq;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class AFi1tSDK implements AFi1sSDK {
    public PluginInfo valueOf = new PluginInfo(Plugin.NATIVE, "6.14.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1sSDK
    public final Map<String, Object> values() {
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("platform", this.valueOf.getPlugin().getPluginName()), new Pair("version", this.valueOf.getVersion()));
        if (true ^ this.valueOf.getAdditionalParams().isEmpty()) {
            mapLJIIJ.put("extras", this.valueOf.getAdditionalParams());
        }
        return mapLJIIJ;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    public final void AFKeystoreWrapper(PluginInfo pluginInfo) {
        this.valueOf = pluginInfo;
    }
}
