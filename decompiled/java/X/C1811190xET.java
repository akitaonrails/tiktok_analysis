package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811190xET extends AbstractC485930J3v<C1810110xCj, C1811200xEU> {
    public C1811190xET() {
        super(R.layout.hkf, Boolean.FALSE);
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        super.LJII(viewHolder);
        C786410Ut5.LJLLLLLL(4, viewHolder.itemView);
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
        try {
            C418880Gbe c418880Gbe = (C418880Gbe) viewHolder.itemView.findViewById(R.id.g3w);
            if (c418880Gbe != null) {
                c418880Gbe.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL("RankListItemLoadingViewHolder loading view had replace");
        }
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(final View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new RecyclerView.ViewHolder(view) { // from class: X.0xEU
        };
    }
}
