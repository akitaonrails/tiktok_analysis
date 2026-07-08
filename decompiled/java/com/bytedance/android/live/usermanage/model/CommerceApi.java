package com.bytedance.android.live.usermanage.model;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface CommerceApi {
    @InterfaceC1501160pAQ("/webcast/user/admin/check/e-commerce")
    Object checkAdminECommercePermission(@InterfaceC1501070pAH("to_user_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("sec_to_user_id") String str2, @InterfaceC1501070pAH("permission_type") Integer num, InterfaceC1364105Vn<? super C470590Icr<CheckAdminECommercePermissionData>> interfaceC1364105Vn);
}
