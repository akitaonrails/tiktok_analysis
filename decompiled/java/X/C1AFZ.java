package X;

import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.1AFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFZ {
    public final EnumC1154870g9t LIZ;
    public final C1AFY LIZIZ;
    public final ImageModel LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C1AFZ() {
        this(null, null, null, null, false, false, 127);
    }

    public C1AFZ(EnumC1154870g9t enumC1154870g9t, C1AFY c1afy, ImageModel imageModel, String str, boolean z, boolean z2, int i) {
        enumC1154870g9t = (i & 1) != 0 ? EnumC1154870g9t.UNKNOWN : enumC1154870g9t;
        c1afy = (i & 2) != 0 ? null : c1afy;
        imageModel = (i & 4) != 0 ? null : imageModel;
        str = (i & 8) != 0 ? "" : str;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        boolean z3 = (i & 64) != 0;
        this.LIZ = enumC1154870g9t;
        this.LIZIZ = c1afy;
        this.LIZJ = imageModel;
        this.LIZLLL = str;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
