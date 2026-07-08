package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedUser {

    @C09CT("audio_mute_status")
    public int audioMuteStatus;

    @C09CT("link_mic_id")
    public String linkMicId;

    @C09CT("position")
    public int position;

    @C09CT("uid")
    public long uid;

    @C09CT("video_mute_status")
    public int videoMuteStatus;

    public LinkedUser() {
        this(0L, null, 0, 0, 0);
    }

    public LinkedUser(long j, String str, int i, int i2, int i3) {
        this.uid = j;
        this.linkMicId = str;
        this.audioMuteStatus = i;
        this.videoMuteStatus = i2;
        this.position = i3;
    }
}
