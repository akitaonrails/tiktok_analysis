package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;

/* JADX INFO: renamed from: X.196X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196X {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final UrlModel LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public float LJI;
    public final boolean LJII;
    public final LivePhotoPreviewMode LJIIIIZZ;
    public final boolean LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C196X() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this((String) null, 0, (int) (0 == true ? 1 : 0), (UrlModel) objArr, (int) (0 == true ? 1 : 0), 0.0f, (boolean) (0 == true ? 1 : 0), (LivePhotoPreviewMode) objArr2, (boolean) (0 == true ? 1 : 0), 1023);
    }

    public /* synthetic */ C196X(String str, int i, int i2, UrlModel urlModel, int i3, float f, boolean z, LivePhotoPreviewMode livePhotoPreviewMode, boolean z2, int i4) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? null : urlModel, (i4 & 16) != 0 ? C12GM.THUMBNAIL.getType() : i3, false, (i4 & 64) != 0 ? 1.0f : f, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? LivePhotoPreviewMode.STATIC : livePhotoPreviewMode, (i4 & 512) != 0 ? false : z2);
    }

    public C196X(String str, int i, int i2, UrlModel urlModel, int i3, boolean z, float f, boolean z2, LivePhotoPreviewMode livePhotoPreviewMode, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = urlModel;
        this.LJ = i3;
        this.LJFF = z;
        this.LJI = f;
        this.LJII = z2;
        this.LJIIIIZZ = livePhotoPreviewMode;
        this.LJIIIZ = z3;
    }
}
