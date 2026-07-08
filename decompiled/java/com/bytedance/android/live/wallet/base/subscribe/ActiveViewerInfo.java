package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ActiveViewerInfo {

    @C09CT("active_viewers")
    public List<User> activeViewers = new ArrayList();

    @C09CT("online_active_viewers")
    public List<Long> onlineActiveViewers = new ArrayList();

    @C09CT("recommend_type_desc")
    public String recommendTypeDesc = "";

    @C09CT("recommend_type_desc_en")
    public String recommendTypeDescEn = "";
}
