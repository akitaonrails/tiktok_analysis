package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0mJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391730mJv extends Drawable.ConstantState {
    public EnumC1235690iGF LIZ = null;
    public Boolean LIZIZ = null;
    public Boolean LIZJ = null;
    public float LIZLLL = 0.0f;
    public float LJ = 0.0f;
    public int LJFF = 0;
    public int LJI = 0;
    public int LJII;

    public final void LIZ() {
        this.LJII |= 1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1391750mJx(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.LJII;
    }
}
