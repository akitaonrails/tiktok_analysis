package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class IconConfig {
    public static final TypeAdapter ADAPTER = new IconConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("icon_name_to_url_map")
    public Map<String, String> iconNameToUrlMap;

    public IconConfig() {
        this(null);
    }

    public IconConfig(Map<String, String> map) {
        this.iconNameToUrlMap = map;
    }
}
