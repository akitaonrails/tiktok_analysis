package X;

import android.widget.ImageView;

/* JADX INFO: renamed from: X.0fG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120280fG6 implements InterfaceC20015613Te<ImageView> {
    public final int LIZ;
    public final ImageView[] LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC20015613Te
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final ImageView LIZIZ() {
        int i;
        int i2 = this.LIZJ;
        if (i2 <= 0 || i2 - 1 >= this.LIZ) {
            return null;
        }
        ImageView[] imageViewArr = this.LIZIZ;
        ImageView imageView = imageViewArr[i];
        imageViewArr[i] = null;
        this.LIZJ = i2 - 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maxSize: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", acquire: ");
        sbLIZ.append(imageView != null);
        sbLIZ.append(", size: ");
        sbLIZ.append(this.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return imageView;
    }

    public C1120280fG6(int i) {
        this.LIZ = i;
        this.LIZIZ = new ImageView[i];
    }

    @Override // X.InterfaceC20015613Te
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final boolean LIZ(ImageView imageView) {
        int i = this.LIZJ;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LIZIZ[i2] == imageView) {
                return false;
            }
        }
        if (this.LIZJ >= this.LIZ) {
            return false;
        }
        C786410Ut5.LJZI(4, imageView);
        ImageView[] imageViewArr = this.LIZIZ;
        int i3 = this.LIZJ;
        imageViewArr[i3] = imageView;
        this.LIZJ = i3 + 1;
        return true;
    }
}
