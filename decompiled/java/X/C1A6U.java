package X;

import android.view.Window;

/* JADX INFO: renamed from: X.1A6U, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1A6U extends C1A6T {
    @Override // X.C1A6X
    public final boolean LIZIZ() {
        return (this.LIZ.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // X.C1A6X
    public final void LIZLLL(boolean z) {
        if (z) {
            this.LIZ.clearFlags(67108864);
            this.LIZ.addFlags(Integer.MIN_VALUE);
            LJI(8192);
            return;
        }
        LJII(8192);
    }

    public C1A6U(Window window, C1A6Q c1a6q) {
        super(window, c1a6q);
    }
}
