package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StageReactionResource {

    @C09CT("resource_groups")
    public List<SingleResource> resourceGroups = new ArrayList();

    @C09CT("type")
    public int type;

    public static final class SingleResource {

        @C09CT("reaction_ids")
        public List<String> reactionIds = new ArrayList();
    }
}
