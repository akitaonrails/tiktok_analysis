package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0klC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331760klC implements C0I7N {
    public final /* synthetic */ AbstractC1301670jyf LIZ;

    public C1331760klC(AbstractC1301670jyf abstractC1301670jyf) {
        this.LIZ = abstractC1301670jyf;
    }

    public final C1331870klN LIZIZ(Bitmap bitmap) {
        return new C1331870klN(this.LIZ.LIZJ(bitmap));
    }

    public final C1331870klN LIZ(int i, int i2, Bitmap.Config config) {
        return new C1331870klN(this.LIZ.LIZIZ(i, i2, config, null));
    }
}
