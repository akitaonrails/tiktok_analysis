package X;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: renamed from: X.15Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20481215Cg extends Scroller {
    public int LIZ;

    public C20481215Cg(Context context) {
        super(context);
        this.LIZ = 2000;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.LIZ);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.LIZ);
    }
}
