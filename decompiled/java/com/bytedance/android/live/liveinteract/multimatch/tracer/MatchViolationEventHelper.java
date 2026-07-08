package com.bytedance.android.live.liveinteract.multimatch.tracer;

import X.C973660bRc;
import com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper;

/* JADX INFO: loaded from: classes36.dex */
public class MatchViolationEventHelper implements IMatchViolationEventHelper {
    public boolean LL;

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final void resetMatchOnViolation() {
        this.LL = false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final void setMatchOnViolation() {
        this.LL = true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final void clearSceneType() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJJZ = null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final String getSceneType() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        return C973660bRc.LJJZ;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final boolean isMatchOnViolation() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper
    public final /* bridge */ /* synthetic */ void onInit() {
    }
}
