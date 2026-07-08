package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileNaviCandidatesResponse {

    @C09CT("initial_navis")
    public final List<ProfileNaviCandidate> initialNavis;

    public ProfileNaviCandidatesResponse(List<ProfileNaviCandidate> list) {
        this.initialNavis = list;
    }
}
