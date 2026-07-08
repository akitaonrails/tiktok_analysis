package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Upc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C784260Upc extends C20635915oz {
    public List<InterfaceC784370Upn> LJFF;

    @Override // X.C20635915oz, X.AbstractC20634115oh
    public final View LJFF(RecyclerView.LayoutManager layoutManager) {
        int viewAdapterPosition;
        View viewLJFF = super.LJFF(layoutManager);
        if (viewLJFF != null) {
            viewAdapterPosition = ((RecyclerView.LayoutParams) viewLJFF.getLayoutParams()).getViewAdapterPosition();
            if (viewAdapterPosition == 0) {
                viewLJFF = layoutManager.findViewByPosition(1);
                viewAdapterPosition = 1;
            } else if (viewAdapterPosition == layoutManager.getItemCount() - 1) {
                viewAdapterPosition = layoutManager.getItemCount() - 2;
                viewLJFF = layoutManager.findViewByPosition(viewAdapterPosition);
            }
        } else {
            viewAdapterPosition = -1;
        }
        int i = viewAdapterPosition - 1;
        List<InterfaceC784370Upn> list = this.LJFF;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC784370Upn) it2.next()).LJLJJI(i);
            }
        }
        return viewLJFF;
    }
}
