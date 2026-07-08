package com.bytedance.android.live.liveinteract.multiguestv3.tool.helper;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public final class FaqConfig {
    public static final TypeAdapter ADAPTER = new FaqConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("FAQ_uri")
    public String faqUri;

    @C09CT("show_region_list")
    public List<String> showRegionList;

    public FaqConfig() {
        this(null, null, 3, null);
    }

    public FaqConfig(List<String> list, String str) {
        this.showRegionList = list;
        this.faqUri = str;
    }

    public FaqConfig(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList("US") : list, (i & 2) != 0 ? "sslocal://webcast_webview_popup?url=https%3A%2F%2Fsf-mis.ttwstatic.com%2Fobj%2Fmis-draft-sg%2Ftiktok-live-faq%2F75529fe3-ff0a-40b5-bc61-2955bbffd702.html&height=60%25" : str);
    }
}
