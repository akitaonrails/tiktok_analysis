package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestReportDataReq {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("report_display_id_params")
    public MultiGuestReportDisplayIdParams reportDisplayIdParams;

    @C09CT("report_scene")
    public int reportScene;

    @C09CT("room_id")
    public long roomId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.reportScene);
        sbLIZ.append(' ');
        sbLIZ.append(this.roomId);
        sbLIZ.append(' ');
        sbLIZ.append(this.channelId);
        sbLIZ.append(' ');
        sbLIZ.append(this.reportDisplayIdParams);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
