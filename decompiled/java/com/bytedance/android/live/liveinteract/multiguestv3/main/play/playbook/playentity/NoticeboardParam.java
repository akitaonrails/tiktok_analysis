package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardParam {

    @C09CT("node_id")
    public final String nodeId;

    @C09CT("official_material_type")
    public final Integer officialMaterialType;

    @C09CT("template_id")
    public final long templateId;

    public NoticeboardParam(Integer num, String str, long j) {
        this.officialMaterialType = num;
        this.nodeId = str;
        this.templateId = j;
    }
}
