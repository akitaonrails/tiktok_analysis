package com.bytedance.android.live.effect.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ModificationUploadRequest {

    @C09CT("modifications")
    public List<webcast.api.room.Modification> modifications;

    @C09CT("room_id")
    public long roomId;

    public ModificationUploadRequest(long j, List<webcast.api.room.Modification> list) {
        this.roomId = j;
        this.modifications = list;
    }
}
