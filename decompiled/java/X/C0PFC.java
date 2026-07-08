package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0PFC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFC extends C0PFI {
    public final /* synthetic */ C0PFA LJ;
    public final /* synthetic */ int LJFF;

    @Override // X.C0PFI
    public final RecyclerView.ViewHolder LIZ() {
        C0PFA c0pfa = this.LJ;
        ViewGroup viewGroup = c0pfa.LIZ;
        if (viewGroup == null) {
            return null;
        }
        int i = this.LJFF;
        C0PFE c0pfe = c0pfa.LIZIZ;
        if (c0pfe != null) {
            return c0pfe.LJJL(i, viewGroup);
        }
        return null;
    }

    public C0PFC(C0PFA c0pfa, int i) {
        this.LJ = c0pfa;
        this.LJFF = i;
    }
}
