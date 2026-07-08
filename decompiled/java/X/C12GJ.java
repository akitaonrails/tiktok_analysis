package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.12GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12GJ extends C12GK {
    public final boolean LLJJJIL;

    public C12GJ() {
        this(false, false, null, 15);
    }

    @Override // X.C12GK, X.AbstractC21673619ry
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // X.C12GK, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    @Override // X.C12GK, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!this.LLJJJIL && (viewHolder instanceof C421030Gf7)) {
            C786410Ut5.LJLLLLLL(4, viewHolder.itemView);
            C421030Gf7 c421030Gf7 = (C421030Gf7) viewHolder;
            C368610Ecl.LIZ(c421030Gf7.LL);
            C786410Ut5.a9(c421030Gf7.LL, null);
            c421030Gf7.LL.setClickable(false);
            c421030Gf7.LL.setEnabled(false);
            C786410Ut5.I7(null, viewHolder.itemView);
            viewHolder.itemView.setOnLongClickListener(null);
            viewHolder.itemView.setClickable(false);
            viewHolder.itemView.setEnabled(false);
            return;
        }
        super.onBindViewHolder(viewHolder, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12GJ(boolean z, boolean z2, VideoPublishEditModel videoPublishEditModel, int i) {
        int iLIZIZ;
        if ((i & 1) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        } else {
            iLIZIZ = 0;
        }
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        super(iLIZIZ, (i & 8) != 0 ? null : videoPublishEditModel, z);
        this.LLJJJIL = z2;
    }
}
