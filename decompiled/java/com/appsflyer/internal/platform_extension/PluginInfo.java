package com.appsflyer.internal.platform_extension;

import X.C2097608Jq;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PluginInfo {
    public final Plugin AFInAppEventParameterName;
    public final Map<String, String> AFInAppEventType;
    public final String valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.AFInAppEventParameterName == pluginInfo.AFInAppEventParameterName && Intrinsics.LJFF(this.valueOf, pluginInfo.valueOf) && Intrinsics.LJFF(this.AFInAppEventType, pluginInfo.AFInAppEventType);
    }

    public final int hashCode() {
        return (((this.AFInAppEventParameterName.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }

    public final String toString() {
        return "PluginInfo(plugin=" + this.AFInAppEventParameterName + ", version=" + this.valueOf + ", additionalParams=" + this.AFInAppEventType + ')';
    }

    public final Map<String, String> getAdditionalParams() {
        return this.AFInAppEventType;
    }

    public final Plugin getPlugin() {
        return this.AFInAppEventParameterName;
    }

    public final String getVersion() {
        return this.valueOf;
    }

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        this.AFInAppEventParameterName = plugin;
        this.valueOf = str;
        this.AFInAppEventType = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i & 4) != 0 ? C2097608Jq.LJ() : map);
    }
}
