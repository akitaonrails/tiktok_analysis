package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578110Mlt {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        AutoSelectedAnchorInfos autoSelectedAnchorInfos;
        String str;
        if (shortVideoContext == null) {
            return false;
        }
        try {
            CreativeFlowData creativeFlowData = shortVideoContext.creativeFlowData;
            if (creativeFlowData == null || (autoSelectedAnchorInfos = creativeFlowData.getAutoSelectedAnchorInfos()) == null || (str = autoSelectedAnchorInfos.openPlatFormExtra) == null || str.length() == 0) {
                return false;
            }
            if (new JSONObject(str).optInt("ttg_post_page_mode", 0) != 1) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Object obj = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = obj;
            }
            return ((Boolean) c098200Yq).booleanValue();
        }
    }

    public static final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        if (C1443960ngA.LJ(shortVideoContext) || shortVideoContext.LJJLL() || shortVideoContext.LJJJJLL() || shortVideoContext.creativeModel.paidContentModel.getCollectionId().length() != 0 || LIZ(shortVideoContext)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(ShortVideoContext shortVideoContext) {
        if (C1443960ngA.LJ(shortVideoContext) || !C305260Bxs.LIZ() || shortVideoContext.LJJJJLL() || shortVideoContext.isDuetMode || shortVideoContext.creativeModel.paidContentModel.getCollectionId().length() != 0 || LIZ(shortVideoContext)) {
            return false;
        }
        return true;
    }
}
