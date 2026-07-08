package com.bytedance.android.live.adminsetting;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchBatchUpdateRequest {

    @C09CT("switch_value_list")
    public final List<Object> modifications;

    @C09CT("room_id")
    public final long roomId;

    public SwitchBatchUpdateRequest(long j, List<Object> list) {
        this.roomId = j;
        this.modifications = list;
    }
}
