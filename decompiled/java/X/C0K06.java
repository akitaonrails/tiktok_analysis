package X;

import X.C0K07;
import X.InterfaceC515600KJy;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0K06, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0K06<ITEM extends InterfaceC515600KJy, VH extends C0K07<ITEM>> extends C0J8P<ITEM, VH> {
    public abstract VH LJIIIIZZ(View view);

    public abstract int LJIIIZ();

    @Override // X.C0J8P
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        ((C0K07) viewHolder).L5();
    }

    @Override // X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        ((C0K07) viewHolder).N5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        ((C0K07) viewHolder).I5((InterfaceC515600KJy) obj);
    }

    @Override // X.C0J8P
    public VH LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (VH) LJIIIIZZ(C786410Ut5.Td(layoutInflater, LJIIIZ(), viewGroup, false));
    }
}
