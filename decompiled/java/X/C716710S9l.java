package X;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: renamed from: X.0S9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716710S9l extends Scroller {
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
    public final C0STS LIZ;
    public boolean LIZIZ;
    public EnumC311340CIi LIZJ;
    public int LIZLLL;

    public C716710S9l(Context context) {
        C0STS c0sts = new C0STS();
        super(context, c0sts);
        this.LIZ = c0sts;
        this.LIZJ = EnumC311340CIi.IDLE;
        this.LIZLLL = 650;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        int i6;
        EnumC311340CIi enumC311340CIi = this.LIZJ;
        if (enumC311340CIi == EnumC311340CIi.ANIMATING_IN) {
            i6 = 1200;
        } else if (enumC311340CIi == EnumC311340CIi.ANIMATING_OUT) {
            i6 = 400;
        } else if (this.LIZIZ) {
            i6 = this.LIZLLL;
        } else {
            i6 = 600;
        }
        super.startScroll(i, i2, i3, i4, i6);
    }
}
