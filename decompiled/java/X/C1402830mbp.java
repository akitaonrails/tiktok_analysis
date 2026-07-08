package X;

import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402830mbp {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        NowsExtra nowsExtra;
        NowsShootModel nowsShootModel = videoPublishEditModel.creativeModel.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && !nowsExtra.is9To16Ratio) {
            return true;
        }
        return false;
    }
}
