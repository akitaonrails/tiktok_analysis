package com.bytedance.android.live.uikit.uisetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComponentAvoidRule implements Serializable {
    public static final TypeAdapter ADAPTER = new MsgNotifyComponentAvoidRule_OptTypeAdapter(NormalGson.singleton());

    @C09CT("component_type")
    public int componentType;

    @C09CT("exclusive_queue")
    public List<String> exclusiveQueue;

    @C09CT("max_recover_remain_ms")
    public long maxRecoverRemainMs;

    @C09CT("recover_threshold_ms")
    public long recoverThresholdMs;

    @C09CT("timeline_queue")
    public List<String> timelineQueue;

    public MsgNotifyComponentAvoidRule() {
        this(0, null, null, -1L, -1L);
    }

    public final int getComponentType() {
        return this.componentType;
    }

    public final List<String> getExclusiveQueue() {
        return this.exclusiveQueue;
    }

    public final long getMaxRecoverRemainMs() {
        return this.maxRecoverRemainMs;
    }

    public final long getRecoverThresholdMs() {
        return this.recoverThresholdMs;
    }

    public final List<String> getTimelineQueue() {
        return this.timelineQueue;
    }

    public final void setComponentType(int i) {
        this.componentType = i;
    }

    public final void setExclusiveQueue(List<String> list) {
        this.exclusiveQueue = list;
    }

    public final void setMaxRecoverRemainMs(long j) {
        this.maxRecoverRemainMs = j;
    }

    public final void setRecoverThresholdMs(long j) {
        this.recoverThresholdMs = j;
    }

    public final void setTimelineQueue(List<String> list) {
        this.timelineQueue = list;
    }

    public MsgNotifyComponentAvoidRule(int i, List<String> list, List<String> list2, long j, long j2) {
        this.componentType = i;
        this.exclusiveQueue = list;
        this.timelineQueue = list2;
        this.recoverThresholdMs = j;
        this.maxRecoverRemainMs = j2;
    }
}
