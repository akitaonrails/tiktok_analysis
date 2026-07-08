package X;

import com.bytedance.android.livesdk.game.data.AudienceCommentGiftGuideInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fB2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117140fB2 {
    public int LIZ = 1;
    public C204543151x LIZIZ;
    public AudienceCommentGiftGuideInfo LIZJ;

    public final List<Integer> LIZ() {
        List<Integer> list;
        int i = this.LIZ;
        if (i == 1) {
            C204543151x c204543151x = this.LIZIZ;
            return c204543151x != null ? c204543151x.LIZ() : new ArrayList();
        }
        if (i != 2) {
            return new ArrayList();
        }
        AudienceCommentGiftGuideInfo audienceCommentGiftGuideInfo = this.LIZJ;
        return (audienceCommentGiftGuideInfo == null || (list = audienceCommentGiftGuideInfo.momentEffects) == null) ? new ArrayList() : list;
    }
}
