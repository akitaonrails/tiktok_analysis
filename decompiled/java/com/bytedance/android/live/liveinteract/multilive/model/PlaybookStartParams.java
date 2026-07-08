package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookStartParams {

    @C09CT("action_type")
    public int actionType;

    @C09CT("exists_custom_content")
    public boolean existsCustomContent;

    @C09CT("flow_str")
    public String flowStr = "";

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("playbook_content_id")
    public long playbookContentId;

    @C09CT("playbook_id")
    public long playbookId;

    @C09CT("room_id")
    public long roomId;
}
