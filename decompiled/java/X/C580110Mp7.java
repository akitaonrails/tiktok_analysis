package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0Mp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580110Mp7 {
    public final ShortVideoContext LIZ;
    public final boolean LIZIZ;
    public final MultiEditVideoStatusRecordData LIZJ;
    public final C1441190nbh LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C580110Mp7(ShortVideoContext shortVideoContext, boolean z, boolean z2, int i) {
        int i2;
        boolean z3 = z;
        if ((i & 32) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(shortVideoContext, true, null, null, false, i2, (i & 64) != 0 ? false : z3);
    }

    public C580110Mp7(ShortVideoContext shortVideoContext, boolean z, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, C1441190nbh c1441190nbh, boolean z2, int i, boolean z3) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = z;
        this.LIZJ = multiEditVideoStatusRecordData;
        this.LIZLLL = c1441190nbh;
        this.LJ = z2;
        this.LJFF = i;
        this.LJI = z3;
    }
}
