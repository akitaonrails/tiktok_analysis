package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14sP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402314sP extends AbstractC960460b6K<C20407814tI, C20402414sQ> {
    public final InterfaceC20408314tN LIZIZ;
    public final boolean LIZJ;

    public C20402314sP(InterfaceC20406714t7 interfaceC20406714t7, boolean z) {
        this.LIZIZ = interfaceC20406714t7;
        this.LIZJ = z;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (this.LIZJ) {
            i = R.layout.h_e;
        } else {
            i = R.layout.h_m;
        }
        return new C20402414sQ(C786410Ut5.Td(layoutInflater, i, viewGroup, false), this.LIZIZ);
    }
}
