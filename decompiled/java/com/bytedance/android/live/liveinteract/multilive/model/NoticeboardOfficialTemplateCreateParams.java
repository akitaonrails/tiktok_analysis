package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.SubOfficialMaterialInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardOfficialTemplateCreateParams {

    @C09CT("noticeboard_template_id")
    public long noticeboardTemplateId;

    @C09CT("official_material_type")
    public int officialMaterialType;

    @C09CT("private_status")
    public int privateStatus;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sub_official_material_info_list")
    public List<SubOfficialMaterialInfo> subOfficialMaterialInfoList = new ArrayList();
}
