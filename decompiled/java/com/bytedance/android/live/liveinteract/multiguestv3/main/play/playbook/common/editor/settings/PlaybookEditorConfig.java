package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class PlaybookEditorConfig {
    public static final TypeAdapter ADAPTER = new PlaybookEditorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cover_uri")
    public List<String> defaultCoverUri;

    @C09CT("cover_url")
    public List<String> defaultCoverUrl;

    @C09CT("max_steps")
    public int maxSteps;

    public PlaybookEditorConfig() {
        this(null, null, 0, 7, null);
    }

    public PlaybookEditorConfig(List<String> list, List<String> list2, int i) {
        this.defaultCoverUri = list;
        this.defaultCoverUrl = list2;
        this.maxSteps = i;
    }

    public PlaybookEditorConfig(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Collections.singletonList("tos-alisg-i-yyebeh8z3m-sg/fd77e7c431c383cff02baacc2bd75ae3.png") : list, (i2 & 2) != 0 ? Collections.singletonList("https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/playbook_default.png~0x0.png") : list2, (i2 & 4) != 0 ? 30 : i);
    }
}
