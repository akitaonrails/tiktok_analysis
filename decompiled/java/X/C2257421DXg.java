package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257421DXg implements C1DYQ, C1DYP {
    public final ViewGroup LIZ;
    public C427480GpW LIZIZ;
    public int LIZJ;

    public final C427480GpW LIZIZ() {
        C427480GpW c427480GpW = this.LIZIZ;
        if (c427480GpW != null) {
            return c427480GpW;
        }
        View viewFindViewById = this.LIZ.findViewById(R.id.ju9);
        C427480GpW c427480GpW2 = viewFindViewById instanceof C427480GpW ? (C427480GpW) viewFindViewById : null;
        this.LIZIZ = c427480GpW2;
        return c427480GpW2;
    }

    @Override // X.C1DYQ
    public final int getVisibility() {
        C427480GpW c427480GpWLIZIZ = LIZIZ();
        if (c427480GpWLIZIZ != null) {
            return c427480GpWLIZIZ.getVisibility();
        }
        return 8;
    }

    @Override // X.C1DYP
    public final int getProgress() {
        return this.LIZJ;
    }

    public C2257421DXg(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.C1DYP
    public final void setProgress(int i) {
        this.LIZJ = i;
        C427480GpW c427480GpWLIZIZ = LIZIZ();
        if (c427480GpWLIZIZ != null) {
            c427480GpWLIZIZ.setProgress(i);
        }
    }

    @Override // X.C1DYQ
    public final void setVisibility(int i) {
        C427480GpW c427480GpWLIZIZ = LIZIZ();
        if (c427480GpWLIZIZ != null) {
            C786410Ut5.LLZIL(c427480GpWLIZIZ, i);
        }
    }
}
