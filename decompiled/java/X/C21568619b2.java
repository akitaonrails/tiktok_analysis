package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19b2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21568619b2 extends Drawable.ConstantState {
    public final Context LIZ;
    public final C0OVA LIZIZ;
    public final C0OTJ LIZJ;
    public final boolean LIZLLL;
    public final double LJ;
    public final double LJFF;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C21568519b1 c21568519b1 = new C21568519b1(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        c21568519b1.LIZLLL(this.LJ, this.LJFF);
        return c21568519b1;
    }

    public C21568619b2(Context context, C0OVA c0ova, C0OTJ c0otj, boolean z, double d, double d2) {
        this.LIZ = context;
        this.LIZIZ = c0ova;
        this.LIZJ = c0otj;
        this.LIZLLL = z;
        this.LJ = d;
        this.LJFF = d2;
    }
}
