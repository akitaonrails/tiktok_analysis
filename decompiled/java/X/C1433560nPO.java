package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;

/* JADX INFO: renamed from: X.0nPO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433560nPO {
    public final C1433500nPI LIZ;

    public C1433560nPO(C1433500nPI c1433500nPI) {
        this.LIZ = c1433500nPI;
    }

    public final void LIZ(boolean z) {
        BaseShortVideoContext baseShortVideoContext = this.LIZ.LLILZIL.LIZ.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModelKt videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
            videoPublishEditModelKt.setOpenForegroundPublish(true);
            videoPublishEditModelKt.setBackgroundPublish(z);
        }
    }
}
