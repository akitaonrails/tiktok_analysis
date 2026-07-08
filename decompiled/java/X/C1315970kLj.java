package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315970kLj implements InterfaceC1316400kMQ {
    public final C1323050kX9<AbstractC1327750kej> LIZ;
    public final Bitmap LIZIZ;
    public final Drawable LIZJ;

    public C1315970kLj(C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        AbstractC1327750kej abstractC1327750kej;
        this.LIZ = c1323050kX9;
        if (c1323050kX9 != null) {
            abstractC1327750kej = c1323050kX9.get();
        } else {
            abstractC1327750kej = null;
        }
        if (abstractC1327750kej instanceof AbstractC1325130kaV) {
            this.LIZIZ = ((AbstractC1325130kaV) abstractC1327750kej).getUnderlyingBitmap();
        } else {
            this.LIZIZ = null;
        }
        this.LIZJ = null;
    }

    public C1315970kLj(Drawable drawable, C1323050kX9<AbstractC1327750kej> c1323050kX9) {
        this.LIZ = c1323050kX9;
        this.LIZJ = drawable;
    }
}
