package X;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: renamed from: X.0cRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011960cRO extends Scroller {
    public int LIZ;

    public C1011960cRO(Context context) {
        super(context, C1619980sG4.LJIIJJI());
        this.LIZ = 800;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.LIZ);
    }
}
