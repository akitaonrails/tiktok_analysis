package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C761630TuD extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final View LLILLJJLI;
    public final C20515815Po LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;

    public C761630TuD(int i, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false));
        this.LL = viewGroup;
        this.LLILLJJLI = this.itemView.findViewById(R.id.lf8);
        C20515815Po c20515815Po = (C20515815Po) this.itemView.findViewById(R.id.nl1);
        this.LLILLL = c20515815Po;
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.tv_sound_effect_title);
        this.LLILZIL = this.itemView.findViewById(R.id.by7);
        if (c20515815Po != null) {
            c20515815Po.setBgCircleColor(-1);
            c20515815Po.setProgressColor(-1);
            c20515815Po.setMaxProgress(100);
            c20515815Po.setCircleWidth((int) C497740JfY.LIZIZ(2.0f));
            c20515815Po.setBgCircleWidth((int) C497740JfY.LIZIZ(3.0f));
        }
    }
}
