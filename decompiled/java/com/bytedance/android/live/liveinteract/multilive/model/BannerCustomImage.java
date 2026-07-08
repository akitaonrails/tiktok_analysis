package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BannerCustomImage {

    @C09CT("background_image")
    public ImageModel backgroundImage;

    @C09CT("height")
    public long height;

    @C09CT("url_list")
    public List<String> urlList = new ArrayList();

    @C09CT("width")
    public long width;
}
