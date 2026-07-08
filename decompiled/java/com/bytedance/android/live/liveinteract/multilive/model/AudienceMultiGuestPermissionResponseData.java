package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class AudienceMultiGuestPermissionResponseData {

    @C09CT("permission_info")
    public MultiGuestPermissionInfo permissionInfo;

    public AudienceMultiGuestPermissionResponseData() {
        this(null);
    }

    public final boolean LIZ() {
        MultiGuestPermissionInfo multiGuestPermissionInfo = this.permissionInfo;
        return (multiGuestPermissionInfo == null || multiGuestPermissionInfo.errCode != 0 || multiGuestPermissionInfo.linkPermissionType == null) ? false : true;
    }

    public AudienceMultiGuestPermissionResponseData(MultiGuestPermissionInfo multiGuestPermissionInfo) {
        this.permissionInfo = multiGuestPermissionInfo;
    }
}
