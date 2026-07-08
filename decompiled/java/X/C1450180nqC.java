package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;

/* JADX INFO: renamed from: X.0nqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450180nqC {
    public final SingleImageData LIZ;
    public final ImageAlbumData LIZIZ;
    public final CreativeModel LIZJ;
    public final int LIZLLL;
    public final InterfaceC1452170ntP LJ;
    public final C1450090nq3 LJFF;
    public final C1450230nqH LJI;

    public C1450180nqC(SingleImageData singleImageData, ImageAlbumData imageAlbumData, CreativeModel creativeModel, int i, InterfaceC1452170ntP interfaceC1452170ntP, C1450090nq3 c1450090nq3, int i2) {
        i = (i2 & 8) != 0 ? -1 : i;
        c1450090nq3 = (i2 & 32) != 0 ? null : c1450090nq3;
        C1450230nqH c1450230nqH = (i2 & 64) != 0 ? new C1450230nqH(0) : null;
        this.LIZ = singleImageData;
        this.LIZIZ = imageAlbumData;
        this.LIZJ = creativeModel;
        this.LIZLLL = i;
        this.LJ = interfaceC1452170ntP;
        this.LJFF = c1450090nq3;
        this.LJI = c1450230nqH;
    }
}
