package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429680Gt4 implements InterfaceC429730Gt9 {
    public C418640GbG LIZ;

    @Override // X.InterfaceC429730Gt9
    public final void LJJJJL() {
        C418640GbG c418640GbG = this.LIZ;
        if (c418640GbG != null) {
            c418640GbG.LIZIZ();
        }
        C418640GbG c418640GbG2 = this.LIZ;
        if (c418640GbG2 != null) {
            C0H0N.LJII(c418640GbG2);
        }
    }

    @Override // X.InterfaceC429730Gt9
    public final void LJLJLJ() {
        C418640GbG c418640GbG = this.LIZ;
        if (c418640GbG != null) {
            C0H0N.LJIILJJIL(c418640GbG);
        }
        C418640GbG c418640GbG2 = this.LIZ;
        if (c418640GbG2 != null) {
            c418640GbG2.LIZ();
        }
    }

    public final C418640GbG LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C418640GbG c418640GbG = (C418640GbG) ((ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.afb, viewGroup, true)).getChildAt(r1.getChildCount() - 1);
        this.LIZ = c418640GbG;
        return c418640GbG;
    }
}
