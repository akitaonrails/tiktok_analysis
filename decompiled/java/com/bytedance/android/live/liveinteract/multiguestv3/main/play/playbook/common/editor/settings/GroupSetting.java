package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class GroupSetting {
    public static final TypeAdapter ADAPTER = new GroupSetting_OptTypeAdapter(NormalGson.singleton());

    @C09CT("end_color")
    public String endColor;

    @C09CT("abilities")
    public List<String> list;

    @C09CT("start_color")
    public String startColor;

    public GroupSetting() {
        this(null, null, null, 7, null);
    }

    public GroupSetting(List<String> list, String str, String str2) {
        this.list = list;
        this.startColor = str;
        this.endColor = str2;
    }

    public GroupSetting(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "100,1,1" : str, (i & 4) != 0 ? "100,1,1" : str2);
    }
}
