package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969990bLh extends C0J8P<C970010bLj, C970000bLi> {
    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C970010bLj c970010bLj) {
        C970000bLi c970000bLi = (C970000bLi) viewHolder;
        c970000bLi.getAdapterPosition();
        c970000bLi.L5(c970010bLj);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C970000bLi(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.h_t, viewGroup, false));
    }
}
