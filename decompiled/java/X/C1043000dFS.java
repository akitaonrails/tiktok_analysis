package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043000dFS extends AbstractC1067810dtT {
    public View LIZ;
    public C427480GpW LIZIZ;
    public boolean LIZJ = true;
    public boolean LIZLLL;

    @Override // X.InterfaceC1542250qEh
    public final void LIZ(boolean z) {
        this.LIZLLL = z;
        int i = 8;
        if (!this.LIZJ) {
            View view = this.LIZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        View view2 = this.LIZ;
        if (view2 == null) {
            return;
        }
        if (z) {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view2);
    }

    @Override // X.InterfaceC1542250qEh
    public final View LIZIZ(Context context) {
        C427480GpW c427480GpW = null;
        int i = 0;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_d, null, false);
        this.LIZ = viewTd;
        if (viewTd != null) {
            c427480GpW = (C427480GpW) viewTd.findViewById(R.id.s8q);
        }
        this.LIZIZ = c427480GpW;
        if (c427480GpW != null) {
            if (!this.LIZJ) {
                i = 8;
            }
            C786410Ut5.LLZIL(c427480GpW, i);
        }
        View view = this.LIZ;
        if (view == null) {
            return new View(context);
        }
        return view;
    }

    public final void LIZJ(boolean z) {
        View view;
        this.LIZJ = z;
        if (z && this.LIZLLL && (view = this.LIZ) != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.InterfaceC1542250qEh
    public final void setProgress(int i) {
        C427480GpW c427480GpW = this.LIZIZ;
        if (c427480GpW != null) {
            c427480GpW.setProgress(i);
        }
    }
}
