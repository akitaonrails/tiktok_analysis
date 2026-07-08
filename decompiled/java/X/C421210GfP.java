package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421210GfP extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final TextView LLILLJJLI;
    public final View LLILLL;

    public C421210GfP(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gwd, viewGroup, false));
        this.LL = viewGroup;
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.tv_sound_effect_title);
        this.LLILLL = this.itemView.findViewById(R.id.by7);
    }
}
