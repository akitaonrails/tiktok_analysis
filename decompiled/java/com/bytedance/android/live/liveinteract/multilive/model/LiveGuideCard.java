package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGuideCard {

    @C09CT("in_room_friend_total_count")
    public long inRoomFriendTotalCount;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("friend_list_top3_avatar")
    public List<String> friendListTop3Avatar = new ArrayList();
}
