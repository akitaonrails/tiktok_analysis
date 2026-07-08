package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.118c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194512118c extends AnonymousClass1194<String, C194513118d> {
    public C194514118e LIZLLL;

    public C194512118c(AnonymousClass1192 anonymousClass1192) {
        super(anonymousClass1192);
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        ((C194513118d) viewHolder).LL.setText((String) obj);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C194513118d(this, C786410Ut5.Td(layoutInflater, R.layout.cur, viewGroup, false));
    }
}
