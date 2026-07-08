package X;

import Y.ACListenerS165S0100000_31;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.153p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204587153p extends C0J8P<C979060baK, C204588153q> {
    public final InterfaceC204589153r LIZIZ;

    public C204587153p(InterfaceC204589153r interfaceC204589153r) {
        this.LIZIZ = interfaceC204589153r;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C979060baK c979060baK) {
        C204588153q c204588153q = (C204588153q) viewHolder;
        c204588153q.getClass();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        ((ImageView) c204588153q.LL.getValue()).setImageDrawable(c0hti.LIZ(((View) c204588153q.LL.getValue()).getContext()));
        ((C16FS) c204588153q.LLILLJJLI.getValue()).j0(R.style.ajp);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C204588153q c204588153q = new C204588153q(C786410Ut5.Td(layoutInflater, R.layout.gh2, viewGroup, false));
        C786410Ut5.h8((C16FS) c204588153q.LLILLJJLI.getValue(), new ACListenerS165S0100000_31(this, 238));
        return c204588153q;
    }
}
