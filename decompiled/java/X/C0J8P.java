package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* JADX INFO: renamed from: X.0J8P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0J8P<T, VH extends RecyclerView.ViewHolder> {
    public C1117360fBO LIZ;

    public long LIZIZ(T t) {
        return -1L;
    }

    public abstract void LIZJ(VH vh, T t);

    public abstract VH LJ(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void LJFF(VH vh) {
    }

    public void LJI(VH vh) {
    }

    public void LJII(VH vh) {
    }

    public void LIZLLL(VH vh, T t, List<Object> list) {
        LIZJ(vh, t);
    }
}
