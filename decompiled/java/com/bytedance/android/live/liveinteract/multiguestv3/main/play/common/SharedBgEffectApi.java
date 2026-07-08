package com.bytedance.android.live.liveinteract.multiguestv3.main.play.common;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import tikcast.api.anchor_tool.EffectGetResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface SharedBgEffectApi {
    @InterfaceC1501160pAQ("/webcast/anchor/effect/get/")
    Object fetchEffectByResourceId(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("resource_id") String str3, @InterfaceC1501070pAH("platform_sdk_version") String str4, InterfaceC1364105Vn<? super EffectGetResponse> interfaceC1364105Vn);
}
