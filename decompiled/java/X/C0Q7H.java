package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;

/* JADX INFO: renamed from: X.0Q7H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7H extends C653210Pjj {
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.C653210Pjj, X.C1DWH
    public final InterfaceC652740Piy LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC652740Piy> collection) {
        if (i == 1) {
            this.LIZJ = false;
        } else if (i == 0) {
            if (this.LIZJ && this.LIZLLL) {
                this.LIZLLL = false;
                return null;
            }
            this.LIZJ = true;
        }
        return super.LIZIZ(recyclerView, i, collection);
    }
}
