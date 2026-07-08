package com.bytedance.android.live.base.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HashtagResponse {

    @C09CT("game_hashtag")
    public Hashtag gameHashTag;

    @C09CT("game_tag_list")
    public List<GameTag> gameTagList;

    @C09CT("hashtag")
    public List<Hashtag> hashtags;

    @C09CT("live_studio_hashtag")
    public List<Hashtag> liveStudioHashtag;

    @C09CT("live_voice_hashtag")
    public List<Hashtag> liveVoiceHashtag;

    @C09CT("third_party_hashtag")
    public List<Hashtag> obsHashTag;

    public HashtagResponse() {
        this(new ArrayList(), new ArrayList(), null, new ArrayList());
    }

    public HashtagResponse(List<Hashtag> list, List<GameTag> list2, Hashtag hashtag, List<Hashtag> list3) {
        this.hashtags = list;
        this.gameTagList = list2;
        this.gameHashTag = hashtag;
        this.obsHashTag = list3;
        this.liveVoiceHashtag = new ArrayList();
        this.liveStudioHashtag = new ArrayList();
    }
}
