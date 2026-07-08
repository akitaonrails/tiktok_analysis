package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.16GE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16GE extends C16GC {
    public boolean LLILLJJLI;

    public C16GE(Drawable drawable) {
        super(drawable);
        this.LLILLJJLI = true;
    }

    @Override // X.C16GC, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LLILLJJLI) {
            super.draw(canvas);
        }
    }

    @Override // X.C16GC, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.LLILLJJLI) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // X.C16GC, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.LLILLJJLI) {
            super.setHotspot(f, f2);
        }
    }

    @Override // X.C16GC, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.LLILLJJLI) {
            return super.setVisible(z, z2);
        }
        return false;
    }

    @Override // X.C16GC, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.LLILLJJLI) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }
}
