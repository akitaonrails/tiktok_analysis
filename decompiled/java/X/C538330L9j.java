package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;

/* JADX INFO: renamed from: X.0L9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538330L9j {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final EditPreviewInfo LIZ(EditVideoSegment editVideoSegment) {
        return new EditPreviewInfo(C1697810uHb.LJIILJJIL(editVideoSegment), this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, "");
    }

    public C538330L9j(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
    }
}
