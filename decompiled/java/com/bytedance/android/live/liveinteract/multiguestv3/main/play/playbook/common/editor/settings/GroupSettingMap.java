package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CT;
import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class GroupSettingMap {
    public static final TypeAdapter ADAPTER = new GroupSettingMap_OptTypeAdapter(NormalGson.singleton());

    @C09CT("groups")
    public List<String> groups;

    @C09CT("setting_map")
    public Map<String, GroupSetting> map;

    public GroupSettingMap() {
        this(C1697810uHb.LJIIJJI("MultiGuest", "Cohost", "Enhance", "Interact", "ServicePlus"), C2097608Jq.LJ());
    }

    public GroupSettingMap(List<String> list, Map<String, GroupSetting> map) {
        this.groups = list;
        this.map = map;
    }
}
