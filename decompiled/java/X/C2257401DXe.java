package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.1DXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257401DXe implements C1DYO {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;

    @Override // X.C1DYO
    public final float LIZ() {
        if (this.LIZLLL) {
            return this.LIZIZ.getAlpha();
        }
        View view = this.LIZJ;
        if (view != null) {
            return view.getAlpha();
        }
        return 0.0f;
    }

    @Override // X.C1DYO
    public final void setAlpha(float f) {
        if (this.LIZLLL) {
            C786410Ut5.T4(this.LIZIZ, f);
            return;
        }
        View view = this.LIZJ;
        if (view == null) {
            return;
        }
        C786410Ut5.T4(view, f);
    }

    public C2257401DXe(View view, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
    }
}
