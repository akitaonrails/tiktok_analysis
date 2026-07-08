package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xE0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810900xE0 extends RecyclerView.ViewHolder {
    public final C16FV LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public CountDownTimerC1811820xFU LLILZLL;

    public C1810900xE0(View view) {
        super(view);
        this.LL = (C16FV) view.findViewById(R.id.lsq);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_rank_league_locked_stage_title);
        this.LLILLL = (TextView) view.findViewById(R.id.tv_rank_league_locked_stage_subtitle);
    }
}
