package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class UnifiedBannerData {

    @C09CT("frequency_key")
    public String frequencyKey = "";

    @C09CT("image")
    public ImageModel image;

    @C09CT("metrics_map")
    public Map<String, String> metrics;

    @C09CT("jump_link")
    public String schema;

    @C09CT("sub_title")
    public String subTitle;

    @C09CT("title")
    public String title;
}
