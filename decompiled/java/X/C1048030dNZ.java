package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048030dNZ extends AbstractC1067810dtT {
    public View LIZ;
    public C427480GpW LIZIZ;

    @Override // X.InterfaceC1542250qEh
    public final void LIZ(boolean z) {
        int i;
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.InterfaceC1542250qEh
    public final View LIZIZ(Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f_d, null, false);
        this.LIZ = viewTd;
        if (viewTd == null) {
            viewTd = null;
        }
        this.LIZIZ = (C427480GpW) viewTd.findViewById(R.id.s8q);
        View view = this.LIZ;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // X.InterfaceC1542250qEh
    public final void setProgress(int i) {
        C427480GpW c427480GpW = this.LIZIZ;
        if (c427480GpW != null) {
            c427480GpW.setProgress(i);
        }
    }
}
