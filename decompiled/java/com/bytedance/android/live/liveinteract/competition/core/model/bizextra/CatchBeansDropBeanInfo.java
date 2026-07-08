package com.bytedance.android.live.liveinteract.competition.core.model.bizextra;

import X.C01BH;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.BeansArtifacts;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class CatchBeansDropBeanInfo {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("number_comments")
    public long numberComments;

    @C09CT("version")
    public long version;

    @C09CT("gifts")
    public List<BeansArtifacts.AnchorInfo.GiftInfo> gifts = new ArrayList();

    @C09CT("contributors")
    public List<C01BH> contributors = new ArrayList();
}
