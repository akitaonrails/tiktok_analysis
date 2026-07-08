package X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.129M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129M extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final View LLILLJJLI;
    public final RelativeLayout LLILLL;

    public C129M(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.unlimited_music_tip_item_title);
        this.LLILLJJLI = view.findViewById(R.id.unlimited_divider);
        this.LLILLL = (RelativeLayout) view.findViewById(R.id.tps);
    }

    public final void I5(MusicModel musicModel) {
        int i = 8;
        if (musicModel instanceof C129P) {
            C786410Ut5.LLIIL(this.LLILLL, 0);
            TuxTextView tuxTextView = this.LL;
            String tipDescription = null;
            C129P c129p = (C129P) musicModel;
            if (c129p != null) {
                tipDescription = c129p.getTipDescription();
            }
            tuxTextView.setText(tipDescription);
            View view = this.LLILLJJLI;
            C129P c129p2 = (C129P) musicModel;
            if (c129p2 != null && c129p2.getHasDivider()) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
            return;
        }
        C786410Ut5.LLIIL(this.LLILLL, 8);
    }
}
