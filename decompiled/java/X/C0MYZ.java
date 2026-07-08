package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveMonitorEvent;

/* JADX INFO: renamed from: X.0MYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYZ {
    public static final DraftSaveMonitorEvent LIZ(DraftSaveResult draftSaveResult, CreativeInfo creativeInfo) {
        return new DraftSaveMonitorEvent(draftSaveResult.creationId, draftSaveResult.draftScene, draftSaveResult.draftAwemeType, creativeInfo.getVersion(), draftSaveResult.saveDraftTime, draftSaveResult.saveDraftAppVersion, draftSaveResult.fileTreeInfo);
    }
}
