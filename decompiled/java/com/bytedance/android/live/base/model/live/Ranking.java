package com.bytedance.android.live.base.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ranking {

    @C09CT("background")
    public ImageModel background;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("name")
    public String name;

    @C09CT("url")
    public String url;

    @C09CT("list")
    public List<RankUser> userList;
}
