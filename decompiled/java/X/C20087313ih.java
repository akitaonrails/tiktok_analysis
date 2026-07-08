package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: X.13ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087313ih extends EdgeEffect {
    public final float LIZ;
    public float LIZIZ;

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.LIZIZ = 0.0f;
        super.onRelease();
    }

    public C20087313ih(Context context) {
        super(context);
        this.LIZ = 1 * C786410Ut5.LJLJLLL(context).LL;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.LIZIZ = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.LIZIZ = 0.0f;
        super.onPull(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.LIZIZ = 0.0f;
        super.onPull(f, f2);
    }
}
