package com.bytedance.android.live.uikit.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_panel_framework")
public final class LivePanelFrameworkSetting {
    public static final PanelFrameworkConfig DEFAULT;
    public static final LivePanelFrameworkSetting INSTANCE = new LivePanelFrameworkSetting();
    public static final PanelFrameworkConfig value;

    public static final class AllowItem {
        public static final TypeAdapter ADAPTER = new LivePanelFrameworkSetting_AllowItem_OptTypeAdapter(NormalGson.singleton());

        @C09CT("panel_page")
        public String panelPage = "";

        @C09CT("url")
        public String url = "";

        @C09CT("params")
        public Map<String, String> params = new LinkedHashMap();

        @C09CT("enable")
        public String enable = "";

        @C09CT("extra")
        public Map<String, String> extra = new LinkedHashMap();
    }

    public static final class PanelFrameworkConfig {
        public static final TypeAdapter ADAPTER = new LivePanelFrameworkSetting_PanelFrameworkConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("allow_list")
        public List<AllowItem> allowList;

        @C09CT("block_list")
        public List<String> blockList;

        @C09CT("enable_default")
        public boolean enableLivePanelFramework;

        @C09CT("guide_page")
        public String guidePage;

        public PanelFrameworkConfig() {
            this(new ArrayList(), new ArrayList(), false, "");
        }

        public PanelFrameworkConfig(List<AllowItem> list, List<String> list2, boolean z, String str) {
            this.allowList = list;
            this.blockList = list2;
            this.enableLivePanelFramework = z;
            this.guidePage = str;
        }
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        PanelFrameworkConfig panelFrameworkConfig = new PanelFrameworkConfig(new ArrayList(), new ArrayList(), false, "");
        DEFAULT = panelFrameworkConfig;
        PanelFrameworkConfig panelFrameworkConfig2 = (PanelFrameworkConfig) SettingsManager.INSTANCE.getValueSafely("live_panel_framework", panelFrameworkConfig);
        if (panelFrameworkConfig2 != null) {
            panelFrameworkConfig = panelFrameworkConfig2;
        }
        value = panelFrameworkConfig;
    }

    public static final PanelFrameworkConfig getValue() {
        return value;
    }
}
