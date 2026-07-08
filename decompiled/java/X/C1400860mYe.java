package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400860mYe {
    public final /* synthetic */ MusicDetailAwemeListFragment LIZ;

    public final void LIZ() {
        AbstractC683510QrV abstractC683510QrV;
        View view = this.LIZ.LLLLLLL;
        if (view != null) {
            C786410Ut5.LLIIL((RelativeLayout) view.findViewById(R.id.nnq), 8);
        }
        C1261230ivR c1261230ivR = this.LIZ.LLJJJJ;
        if (c1261230ivR != null) {
            c1261230ivR.setShowFooter(true);
        }
        RecyclerView recyclerView = this.LIZ.LLJJIJIIJIL;
        AbstractC21673619ry adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (!(adapter instanceof AbstractC654930PmV) || (abstractC683510QrV = (AbstractC683510QrV) adapter) == null) {
            return;
        }
        abstractC683510QrV.resetLoadMoreState();
    }

    public C1400860mYe(MusicDetailAwemeListFragment musicDetailAwemeListFragment) {
        this.LIZ = musicDetailAwemeListFragment;
    }
}
