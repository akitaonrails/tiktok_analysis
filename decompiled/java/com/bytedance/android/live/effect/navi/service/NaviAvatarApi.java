package com.bytedance.android.live.effect.navi.service;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCandidatesResponse;
import com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface NaviAvatarApi {
    @InterfaceC1501160pAQ("/tiktok/v1/navi/candidates/")
    C11NZ<ProfileNaviCandidatesResponse> getCandidateList(@InterfaceC1501070pAH("transparent_candidates_required") boolean z, @InterfaceC1501070pAH("scenario") int i, @InterfaceC1501070pAH("category") int i2);

    @InterfaceC1501160pAQ("/tiktok/v1/navi/list/")
    C11NZ<ProfileNaviListResponse> getNaviList(@InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("category") int i3);
}
