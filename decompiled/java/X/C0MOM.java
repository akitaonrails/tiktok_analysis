package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;

/* JADX INFO: renamed from: X.0MOM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOM {
    public final int LIZ;
    public final int LIZIZ;

    public final EditPreviewInfo LIZ(MvCreateVideoData mvCreateVideoData) {
        C538330L9j c538330L9j = new C538330L9j(this.LIZ, this.LIZIZ, 12);
        String str = mvCreateVideoData.contactVideoPath;
        str.toString();
        return c538330L9j.LIZ(new EditVideoSegment(str, null, new VideoFileInfo(this.LIZ, this.LIZIZ, 0L, 30, 0, 0, 0, 0, 0.0f, 496, null), 2, null));
    }

    public C0MOM(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
