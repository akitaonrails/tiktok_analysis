package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.10xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19413510xJ extends AbstractC214823195h {
    public RecyclerView LJ;
    public GridLayoutManager LJFF;
    public AbstractC214823195h LJI;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        if (i < this.LJ.getAdapter().getItemCount() - 1) {
            return this.LJI.LJFF(i);
        }
        return this.LJFF.LLILLJJLI;
    }
}
