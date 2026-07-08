package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.12Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19751512Pp extends Drawable.ConstantState {
    public final float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final Rect LJFF;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C19751612Pq(this);
    }

    public C19751512Pp(float f, float f2, float f3, float f4, int i, Rect rect) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = i;
        this.LJFF = rect;
    }
}
