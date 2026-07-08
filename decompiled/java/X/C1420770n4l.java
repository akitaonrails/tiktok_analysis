package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.declaration.DeclarationPayload;
import com.ss.android.ugc.aweme.ogc.declaration.page.DateLocationInfo;
import com.ss.android.ugc.aweme.ogc.declaration.page.LocationInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0n4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420770n4l {
    public static DateLocationInfo LIZ(VideoPublishEditModel videoPublishEditModel) {
        Object c098200Yq;
        DeclarationPayload declarationPayloadLIZ = C1420730n4h.LIZ(videoPublishEditModel);
        Object obj = null;
        if (declarationPayloadLIZ == null) {
            return null;
        }
        try {
            c098200Yq = new DateLocationInfo(declarationPayloadLIZ.createTime, new LocationInfo(declarationPayloadLIZ.poiId, declarationPayloadLIZ.locationName));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (DateLocationInfo) obj;
    }
}
