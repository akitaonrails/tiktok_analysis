package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0jdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288540jdU implements InterfaceC1288580jdY {
    public final Bitmap LIZ;

    @Override // X.InterfaceC1288580jdY
    public final void close() {
        C786410Ut5.LJJJJ(this.LIZ);
    }

    @Override // X.InterfaceC1288580jdY
    public final boolean isValid() {
        return !this.LIZ.isRecycled();
    }

    @Override // X.InterfaceC1288580jdY
    public final Bitmap get() {
        if (isValid()) {
            return this.LIZ;
        }
        return null;
    }

    public C1288540jdU(Bitmap bitmap) {
        this.LIZ = bitmap;
    }
}
